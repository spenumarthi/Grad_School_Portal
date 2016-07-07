
package gradschoolportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Courses_Info_Class {
    
    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected ResultSet rs;
    
    public DefaultTableModel get_courses(){
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Course Code");
        dm.addColumn("Course Name");
        try{
            st = conn.createStatement();
            String query = "SELECT * FROM courses";
            rs = st.executeQuery(query);
            while(rs.next()){
                String code = rs.getString("course_code");
                String name = rs.getString("course_name");
                
                dm.addRow(new String[]{code, name});
            }
            
            return dm;
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
    public boolean add_course(String code, String name, String desc, String hours, String capacity, String prereq, String fall, String spring, String summer, String teachers){
        
        try{
            st = conn.createStatement();
            String query = "INSERT INTO courses (course_code, course_name, course_description, course_hours, course_capacity, course_fall, course_spring, course_summer, course_prereq, course_teachers) VALUES ('"+code+"', '"+name+"', '"+desc+"', '"+hours+"', '"+capacity+"', '"+fall+"', '"+spring+"', '"+summer+"', '"+prereq+"', '"+teachers+"')";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
    
    protected String id;
    protected String code;
    protected String name;
    protected String desc;
    protected String hours;
    protected String capacity;
    protected String fall;
    protected String spring;
    protected String summer;
    protected String prereq;
    
    public void edit_course(String code){
        try{
            st = conn.createStatement();
            String query = "SELECT * FROM courses WHERE course_code = '"+code+"'";
            rs = st.executeQuery(query);
            while(rs.next()){
                id = rs.getString("course_id");
                this.code = rs.getString("course_code");
                name = rs.getString("course_name");
                desc = rs.getString("course_description");
                hours = rs.getString("course_hours");
                capacity = rs.getString("course_capacity");
                fall = rs.getString("course_fall");
                spring = rs.getString("course_spring");
                summer = rs.getString("course_summer");
                prereq = rs.getString("course_prereq");
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public boolean update_course(int id, String code, String name, String desc, String hours, String capacity, String prereq, String fall, String spring, String summer, String teachers){
        try{
            st = conn.createStatement();
            String query = "UPDATE courses SET course_code = '"+code+"', course_name = '"+name+"', course_description = '"+desc+"', course_hours = '"+hours+"', course_capacity = '"+capacity+"', course_prereq = '"+prereq+"', course_fall = '"+fall+"', course_spring = '"+spring+"', course_summer = '"+summer+"', course_teachers = '"+teachers+"' WHERE course_id = "+id+"";
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
            String query = "DELETE FROM courses WHERE course_code = '"+code+"'";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
    
    public void add_faculty(String lname, String fname, String school, String degree, String title, String days, String fall, String spring, String summer){
        try{
            st = conn.createStatement();
            String query = "INSERT INTO faculty (last_name, first_name, grad_school, degree, title, days, load_fall, load_spring, load_summer) VALUES ('"+lname+"', '"+fname+"', '"+school+"', '"+degree+"', '"+title+"', '"+days+"', '"+fall+"', '"+spring+"', '"+summer+"')";
            st.executeUpdate(query);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
