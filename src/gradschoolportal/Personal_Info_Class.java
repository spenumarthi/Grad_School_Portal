package gradschoolportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Personal_Info_Class {

    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected ResultSet rs;

    String name;
    String username;
    String password;
    String phone;
    String email;

    public void edit(int id) {
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM users WHERE user_id = " + id + "";
            rs = st.executeQuery(query);
            while (rs.next()) {
                this.name = rs.getString("name");
                this.username = rs.getString("user_name");
                this.password = rs.getString("user_password");
                this.email = rs.getString("user_email");
                this.phone = rs.getString("user_phone");
            }
        } catch (Exception ex) {

        }
    }

    public boolean update(int id, String name, String username, String password, String email, String phone) {

        try {
            st = conn.createStatement();
            String query = "UPDATE users SET user_name = '" + username + "', user_password = '" + password + "', user_email = '" + email + "', user_phone = '" + phone + "', name = '" + name + "' WHERE user_id = " + id + "";
            st.executeUpdate(query);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return false;
    }

}
