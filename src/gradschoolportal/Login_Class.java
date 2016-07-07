package gradschoolportal;

import java.sql.*;
import javax.swing.JOptionPane;

public class Login_Class {

    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected ResultSet rs;
    protected int id;
    protected String name;
    protected String type;

    public void login_method(String username, String password) {

        try {

            st = conn.createStatement();
            String query = "SELECT * FROM users WHERE user_name = '" + username + "' AND user_password = '" + password + "' OR user_email = '" + username + "' AND user_password = '" + password + "'";
            rs = st.executeQuery(query);

            while (rs.next()) {

                id = rs.getInt("user_id");
                name = rs.getString("user_name");
                type = rs.getString("user_type");

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex + "\nError while trying to fetch data from database.");

        }

    }
    
    public void verify(int id){
        try{
            st = conn.createStatement();
            String query = "SELECT * FROM users WHERE user_id = "+id+"";
            rs = st.executeQuery(query);
            while(rs.next()){
                type = rs.getString("user_type");
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex + "\nError while trying to fetch user info.");
        }
    }

}
