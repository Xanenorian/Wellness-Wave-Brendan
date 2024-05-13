package junit_cases;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;

public class DatabaseConnectionTest {

    @Test
    public void testGetConnection() {
        try {
            // Attempt to get a connection
            Connection connection = DatabaseConnection.getConnection();
            
            // Check if connection is not null
            assertNotNull(connection);
            
            // Close the connection
            connection.close();
        } catch (SQLException e) {
            // If an exception occurs, fail the test
            fail("Exception occurred while getting connection: " + e.getMessage());
        }
    }
}