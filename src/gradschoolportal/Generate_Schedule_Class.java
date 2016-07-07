package gradschoolportal;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Generate_Schedule_Class {

    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected Statement st2;
    protected Statement st3;
    protected Statement st4;
    protected Statement st5;
    protected Statement st6;
    protected Statement st7;
    protected Statement st8;
    protected Statement st9;
    protected Statement st10;
    protected Statement st11;
    protected Statement st12;
    protected Statement st13;
    protected Statement st14;
    protected Statement st15;
    protected Statement st16;
    protected ResultSet rs;
    protected ResultSet rs2;
    protected ResultSet rs3;
    protected ResultSet rs4;
    protected ResultSet rs5;
    protected ResultSet rs6;
    protected ResultSet rs7;
    protected ResultSet rs8;
    protected ResultSet rs9;
    protected ResultSet rs10;
    protected ResultSet rs11;
    protected ResultSet rs12;
    protected ResultSet rs13;
    protected ResultSet rs14;
    protected ResultSet rs15;
    protected ResultSet rs16;
    String term;

    public boolean check(String term, String year) {
        try {
            boolean check = false;
            st = conn.createStatement();
            String query = "SELECT * FROM schedule WHERE term = '" + term + " " + year + "'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                check = true;
            }
            return check;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    public boolean add_schedule(String term, String year) {
        boolean taken = false;
        try {
            String load = "";
            switch (term) {
                case "Fall":
                    load = "load_fall";
                    break;
                case "Spring":
                    load = "load_spring";
                    break;
                case "Summer":
                    load = "load_summer";
                    break;
            }

            st9 = conn.createStatement();
            String query9 = "SELECT * FROM faculty WHERE " + load + " != '0'";
            rs9 = st9.executeQuery(query9);
            while (rs9.next()) {
                st10 = conn.createStatement();
                String query10 = "INSERT INTO available_faculty (last_name, first_name, grad_school, degree, title, days, load_fall, load_spring, load_summer) VALUES ('" + rs9.getString("last_name") + "', '" + rs9.getString("first_name") + "', '" + rs9.getString("grad_school") + "', '" + rs9.getString("degree") + "', '" + rs9.getString("title") + "', '" + rs9.getString("days") + "', " + rs9.getInt("load_fall") + ", " + rs9.getInt("load_spring") + ", " + rs9.getInt("load_summer") + ")";
                st10.executeUpdate(query10);
            }
            st = conn.createStatement();
            String query = "SELECT * FROM degree_req";
            rs = st.executeQuery(query);
            while (rs.next()) {
                int dr_req_id = rs.getInt("req_id");
                String dr_degree = rs.getString("degree");
                String dr_type = rs.getString("type");
                String dr_course = rs.getString("Course");
                String dr_description = rs.getString("description");
                try {
                    st2 = conn.createStatement();
                    String query2 = "SELECT * FROM student_info WHERE degree_track = '" + dr_degree + "'";
                    rs2 = st2.executeQuery(query2);
                    while (rs2.next()) {
                        String si_student_info_id = rs2.getString("student_info_id");
                        String si_student_id = rs2.getString("student_id");
                        String si_degree_track = rs2.getString("degree_track");
                        String si_year_of_graduation = rs2.getString("year_of_graduation");
                        String course_year = "";
                        try {
                            st3 = conn.createStatement();
                            String query3 = "SELECT * FROM student_course_info WHERE student_id = '" + si_student_id + "'";
                            rs3 = st3.executeQuery(query3);
                            while (rs3.next()) {
                                taken = false;
                                String sci_student_course_id = rs3.getString("student_course_id");
                                String sci_student_id = rs3.getString("student_id");
                                String sci_course_code = rs3.getString("course_code");
                                String sci_course_name = rs3.getString("course_name");
                                String sci_course_year = rs3.getString("course_year");
                                String sci_course_grade = rs3.getString("course_grade");
                                course_year = sci_course_year;
                                if (sci_course_code.equals(dr_course)) {
                                    taken = true;
                                    break;
                                }
                            }
                            if (taken == true) {
                                st4 = conn.createStatement();
                                String query4 = "INSERT INTO taken_courses (student_id, course_code, degree, course_year, course_type, course_desc) VALUES ('" + si_student_id + "', '" + dr_course + "', '" + dr_degree + "', '" + course_year + "', '" + dr_type + "', '" + dr_description + "')";
                                st4.executeUpdate(query4);
                            } else {
                                st4 = conn.createStatement();
                                String query4 = "INSERT INTO needed_courses (student_id, course_code, degree, course_type, course_desc) VALUES ('" + si_student_id + "', '" + dr_course + "', '" + dr_degree + "', '" + dr_type + "', '" + dr_description + "')";
                                st4.executeUpdate(query4);
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex + "3");
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex + "2");
                }
            }

            if (term.equals("Fall")) {
                this.term = "course_fall";
            } else if (term.equals("Summer")) {
                this.term = "course_summer";
            } else {
                this.term = "course_spring";
            }
            st7 = conn.createStatement();
            String query7 = "SELECT * FROM courses WHERE " + this.term + " = 'N'";
            rs7 = st7.executeQuery(query7);
            while (rs7.next()) {
                int no_of_courses = 0;
                int students = 0;
                int waitlist = 0;
                String code = rs7.getString("course_code");
                st8 = conn.createStatement();
                String query8 = "Select * FROM needed_courses WHERE course_code = '" + code + "'";
                rs8 = st8.executeQuery(query8);
                while (rs8.next()) {
                    String student_id = rs8.getString("student_id");
                    st15 = conn.createStatement();
                    String query15 = "SELECT * FROM no_of_courses WHERE student_id = '" + student_id + "'";
                    rs15 = st15.executeQuery(query15);
                    while (rs15.next()) {
                        no_of_courses++;
                    }
                    if (no_of_courses >= 4) {

                    } else {
                        st16 = conn.createStatement();
                        String query16 = "INSERT INTO no_of_courses (student_id) VALUES ('" + student_id + "')";
                        st16.executeUpdate(query16);
                        students++;
                    }
                }

                if (students > 25) {
                    waitlist = students - 25;
                }

                int fid = 0;
                String fname = "";
                String lname = "";
                String days = "";
                int load_hours = 0;
                int rem_hours = 0;
                st12 = conn.createStatement();
                String query12 = "SELECT * FROM available_faculty WHERE " + load + " >= 3";
                rs12 = st12.executeQuery(query12);
                while (rs12.next()) {
                    fid = rs12.getInt("faculty_id");
                    fname = rs12.getString("first_name");
                    lname = rs12.getString("last_name");
                    days = rs12.getString("days");
                    load_hours = rs12.getInt(load);
                    rem_hours = load_hours - 3;
                    if (fid != 0) {
                        break;
                    }
                }
                if (fid == 0) {

                } else {
                    if (students == 0) {

                    } else {
                        st13 = conn.createStatement();
                        String query13 = "UPDATE available_faculty SET " + load + " = " + rem_hours + " WHERE faculty_id = " + fid + "";
                        st13.executeUpdate(query13);
                        st14 = conn.createStatement();
                        String query14 = "INSERT INTO schedule (term, status, title, meeting, faculty, acw, credits, level) VALUES ('" + term + " " + year + "', 'Open', '" + code + "', '" + days + "', '" + fname + " " + lname + "', '" + students + " / 25 / " + waitlist + "', '3.00', 'Graduate')";
                        st14.executeUpdate(query14);
                    }
                }
            }
            st5 = conn.createStatement();
            String query5 = "DELETE FROM needed_courses";
            st5.executeUpdate(query5);
            st6 = conn.createStatement();
            String query6 = "DELETE FROM taken_courses";
            st6.executeUpdate(query6);
            st11 = conn.createStatement();
            String query11 = "DELETE FROM available_faculty";
            st11.executeUpdate(query11);
            st11 = conn.createStatement();
            String query17 = "DELETE FROM no_of_courses";
            st11.executeUpdate(query17);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + "1");
        }

        return false;
    }

    public DefaultTableModel get_schedule() {
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Term");
        dm.addColumn("Status");
        dm.addColumn("Title");
        dm.addColumn("Meeting");
        dm.addColumn("Faculty");
        dm.addColumn("AV/CAP/WL");
        dm.addColumn("Credits");
        dm.addColumn("Level");
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM schedule";
            rs = st.executeQuery(query);
            while (rs.next()) {
                String aterm = rs.getString("term");
                String status = rs.getString("status");
                String title = rs.getString("title");
                String meeting = rs.getString("meeting");
                String faculty = rs.getString("faculty");
                String acw = rs.getString("acw");
                String credits = rs.getString("credits");
                String level = rs.getString("level");

                dm.addRow(new String[]{aterm, status, title, meeting, faculty, acw, credits, level});
            }
            return dm;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    public boolean delete_schedule(String term, String title) {
        try {
            st = conn.createStatement();
            String query = "DELETE FROM schedule WHERE term = '" + term + "' AND title = '" + title + "'";
            st.executeUpdate(query);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    String faculty;

    public void edit_schedule(String term, String title) {
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM schedule WHERE term = '" + term + "' AND title = '" + title + "'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                this.faculty = rs.getString("faculty");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public boolean update_schedule(String course, String faculty, String term, String title){
        try{
            st = conn.createStatement();
            String query = "UPDATE schedule SET title = '"+course+"', faculty = '"+faculty+"' WHERE term = '"+term+"' AND title = '"+title+"'";
            st.executeUpdate(query);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

}
