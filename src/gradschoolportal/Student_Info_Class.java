package gradschoolportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Student_Info_Class {

    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected ResultSet rs;

    public void add_student_info(String id, String degree, String year) {
        try{
            st = conn.createStatement();
            String query = "INSERT INTO student_info (student_id, degree_track, year_of_graduation) VALUES ('"+id+"', '"+degree+"', '"+year+"')";
            st.executeUpdate(query);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void add_student_course(String id, String code, String name, String year, String grade){
        try{
            st = conn.createStatement();
            String query = "INSERT INTO student_course_info (student_id, course_code, course_name, course_year, course_grade) VALUES ('"+id+"', '"+code+"', '"+name+"', '"+year+"', '"+grade+"')";
            st.executeUpdate(query);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
