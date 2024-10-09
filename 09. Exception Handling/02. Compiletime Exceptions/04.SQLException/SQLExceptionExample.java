import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:8080/mydb";
        String user = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();
            stmt.executeQuery("SELECT * FROM non_existing_table");
        } catch (SQLException e) {
            System.out.println("Error: SQL Operation Failed! " + e.getMessage());
        }
    }
}