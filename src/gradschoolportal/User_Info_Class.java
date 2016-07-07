package gradschoolportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class User_Info_Class {

    Connection_Class connObj = new Connection_Class();
    Connection conn = connObj.Connection();
    protected Statement st;
    protected ResultSet rs;

    String name;
    String username;
    String email;
    String phone;
    String role;
    String password;
    int id;

    public DefaultTableModel get_users() {
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Name");
        dm.addColumn("Username");
        dm.addColumn("Email");
        dm.addColumn("Phone");
        dm.addColumn("Role");
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM users";
            rs = st.executeQuery(query);
            while (rs.next()) {
                this.name = rs.getString("name");
                this.username = rs.getString("user_name");
                this.email = rs.getString("user_email");
                this.phone = rs.getString("user_phone");
                this.role = rs.getString("user_type");

                dm.addRow(new String[]{name, username, email, phone, role});
            }
            return dm;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    public boolean add_user(String name, String username, String password, String email, String phone, String role) {
        try {
            st = conn.createStatement();
            String query = "INSERT INTO users (user_name, user_password, user_email, user_phone, user_type, name) VALUES ('" + username + "', '" + password + "', '" + email + "', '" + phone + "', '" + role + "', '" + name + "')";
            st.executeUpdate(query);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    public void edit_user(String username) {
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM users WHERE user_name = '" + username + "'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                this.name = rs.getString("name");
                this.username = rs.getString("user_name");
                this.email = rs.getString("user_email");
                this.phone = rs.getString("user_phone");
                this.role = rs.getString("user_type");
                this.password = rs.getString("user_password");
                this.id = rs.getInt("user_id");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public boolean update_user(int id, String name, String username, String password, String email, String phone, String role) {
        try {
            st = conn.createStatement();
            String query = "UPDATE users SET user_name = '" + username + "', user_password = '" + password + "', user_email = '" + email + "', user_phone = '" + phone + "', user_type = '" + role + "', name = '" + name + "' WHERE user_id = " + id + "";
            st.executeUpdate(query);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    public boolean delete_user(String username) {
        try {
            st = conn.createStatement();
            String query = "DELETE FROM users WHERE user_name = '" + username + "'";
            st.executeUpdate(query);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

}
