import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnet {
    public static void main(String[]args){
        var url = "jdbc:mysql://localhost:3306/mydatabase";
        var user = "root";
        var password = "";
        try(Connection conn = DriverManager.getConnection(url, user, password)){
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
