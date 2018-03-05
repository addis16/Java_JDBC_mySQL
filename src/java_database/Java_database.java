
package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Java_database {
    
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "illusion16";
    private static final String CONN_STRING = 
            "jdbc:mysql://localhost/explorecalifornia";
    
    public static void main(String[] args) throws SQLException {
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected");
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        
        
    }
    
}
