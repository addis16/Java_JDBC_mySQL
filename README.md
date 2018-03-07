
ALL THIS PROGRAM DOES IS CONNECT TO THE DATABASE, IT PERFORMS NO QUERIES, JUST PRINTS "connected" if successful.

AFTER YOU INCLUDE THE JDBC DRIVER IN YOUR LIBRARIES DIRECTORY, (get it here) :  https://dev.mysql.com/downloads/connector/j/ 
THIS IS ALL YOU NEED TO CONNECT:

package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Java_database {
    
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";
    private static final String CONN_STRING = 
            "jdbc:mysql://localhost/your_database_name";
    
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
