package gradschoolportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Faculty_Info_Class {

    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected ResultSet rs;

    public DefaultTableModel get_faculty() {
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Last Name");
        dm.addColumn("First Name");
        dm.addColumn("Grad School");
        dm.addColumn("Title");
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM faculty";
            rs = st.executeQuery(query);
            while(rs.next()){
                String lname = rs.getString("last_name");
                String fname = rs.getString("first_name");
                String school = rs.getString("grad_school");
                String title = rs.getString("title");
                dm.addRow(new String[]{lname, fname, school, title});
            }
            return dm;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return null;
    }
    
    public boolean add_faculty(String lname, String fname, String school, String degree, String title, String days, String fall, String spring, String summer){
        
        try{
            st = conn.createStatement();
            String query = "INSERT INTO faculty (last_name, first_name, grad_school, degree, title, days, load_fall, load_spring, load_summer) VALUES ('"+lname+"', '"+fname+"', '"+school+"', '"+degree+"', '"+title+"', '"+days+"', '"+fall+"', '"+spring+"', '"+summer+"')";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
    
    int id = 0;
    String fname = "";
    String lname = "";
    String school = "";
    String degree = "";
    String title = "";
    String days = "";
    String fall = "";
    String spring = "";
    String summer = "";
    
    
    public boolean edit_faculty(String lname, String fname, String school, String title){
        
        try{
            st = conn.createStatement();
            String query = "SELECT * FROM faculty WHERE last_name = '"+lname+"' AND first_name = '"+fname+"' AND grad_school = '"+school+"'";
            rs = st.executeQuery(query);
            while(rs.next()){
                this.id = rs.getInt("faculty_id");
                this.lname = rs.getString("last_name");
                this.fname = rs.getString("first_name");
                this.school = rs.getString("grad_school");
                this.degree = rs.getString("degree");
                this.title = rs.getString("title");
                this.days = rs.getString("days");
                this.fall = rs.getString("load_fall");
                this.spring = rs.getString("load_spring");
                this.summer = rs.getString("load_summer");
            }
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
    
    public boolean update_faculty(int id, String lname, String fname, String school, String degree, String title, String days, String fall, String spring, String summer){
        
        try{
            st = conn.createStatement();
            String query = "UPDATE faculty SET last_name = '"+lname+"', first_name = '"+fname+"', grad_school = '"+school+"', degree = '"+degree+"', title = '"+title+"', days = '"+days+"', load_fall = '"+fall+"', load_spring = '"+spring+"', load_summer = '"+summer+"' WHERE faculty_id = "+id+"";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }
    
    public boolean delete_faculty(String lname, String fname, String school){
        
        try{
            st = conn.createStatement();
            String query = "DELETE FROM faculty WHERE last_name = '"+lname+"' AND first_name = '"+fname+"' AND grad_school = '"+school+"'";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }

}
