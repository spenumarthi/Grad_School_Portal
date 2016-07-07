
package gradschoolportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Degree_Info_Class {
    
    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected ResultSet rs;
    
    public DefaultTableModel get_degrees(){
        
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Degree Code");
        dm.addColumn("Grad School");
        dm.addColumn("Degree Name");
        dm.addColumn("Forecast");
        
        try{
            st = conn.createStatement();
            String query = "SELECT * FROM degrees";
            rs = st.executeQuery(query);
            while(rs.next()){
                String code = rs.getString("degree_code");
                String school = rs.getString("grad_school");
                String name = rs.getString("degree_name");
                String forecast = rs.getString("forecast");
                
                dm.addRow(new String[]{code, school, name, forecast});
            }
            return dm;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return null;
    }
    
    public boolean add_degree(String code, String school, String name, String forecast){
        
        try{
            st = conn.createStatement();
            String query = "INSERT INTO degrees (degree_code, grad_school, degree_name, forecast) VALUES ('"+code+"', '"+school+"', '"+name+"', '"+forecast+"')";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }
    
    int id;
    String code;
    String school;
    String name;
    String forecast;
    
    public void edit_degree(String code){
        try{
            st = conn.createStatement();
            String query = "SELECT * FROM degrees WHERE degree_code = '"+code+"'";
            rs = st.executeQuery(query);
            while(rs.next()){
                this.id = rs.getInt("degree_id");
                this.code = rs.getString("degree_code");
                this.school = rs.getString("grad_school");
                this.name = rs.getString("degree_name");
                this.forecast = rs.getString("forecast");
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public boolean update_degree(int id, String code, String school, String name, String forecast){
        
        try{
            st = conn.createStatement();
            String query = "UPDATE degrees SET degree_code = '"+code+"', grad_school = '"+school+"', degree_name = '"+name+"', forecast = '"+forecast+"' WHERE degree_id = "+id+"";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }
    
    public boolean delete_course(String code){
        
        try{
            st = conn.createStatement();
            String query = "DELETE FROM degrees WHERE degree_code = '"+code+"'";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }
    
    public void add_req(String deg, String type, String course, String desc){
        try{
            st = conn.createStatement();
            String query = "INSERT INTO degree_req (degree, type, course, description) VALUES ('"+deg+"', '"+type+"', '"+course+"', '"+desc+"')";
            st.executeUpdate(query);
        } catch(Exception Ex){
            JOptionPane.showMessageDialog(null, Ex);
        }
    }
    
}
