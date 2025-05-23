package Application.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The ConnectionUtil class will be utilized to create an active connection to our database. This class utilizes the
 * singleton design pattern. We will be utilizing an in-memory called h2database. In-memory means that the database
 * is dissolved when the program ends - it is only for use in testing. Do not change anything in this class.
 */
public class ConnectionUtil {
    
    //url will represent our connection string. Since this is an in-memory db, we will represent a file location to store the data
    private static String url = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
    private static String username = "sa";
    private static String password = "";

    private static Connection connection = null;

    /**
     * @return active connection to the database
     */
    public static Connection getConnection(){
        if(connection == null){
            try {
                // ✅ Validate Driver Loading
                Class.forName("org.h2.Driver"); // Ensure the H2 driver is loaded
                
                // ✅ Establish the database connection
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                System.err.println("H2 Driver not found: " + e.getMessage());
            } catch (SQLException e) {
                System.err.println("Failed to connect to the database: " + e.getMessage());
            }
        }
        return connection;
    }
}
