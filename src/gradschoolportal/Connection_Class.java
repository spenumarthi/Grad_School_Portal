package gradschoolportal;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connection_Class {

    private Connection conn = null;
    private static final String dbURL = "jdbc:derby://localhost:1527/portal;create=true;user=nbuser;password=nbuser";
    

    protected Connection Connection() {

        try {

            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL);
            conn.setAutoCommit(true);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex + "\nError while trying to create the connection.");
            
        }

        return conn;

    }

}
