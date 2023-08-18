import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementDemo1 {
    public static void main(String[] args) throws SQLException {
        insertData();

    }
    public static void insertData() throws SQLException {
        String url="jdbc:mysql://localhost:3306/practice";
        String username="root";
        String password="Navin@1312";

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Enter id, name, price");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();
        int price = scanner.nextInt();
        String sqlQuery="INSERT INTO course values("+id+","+"'"+name+"',"+price+")";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlQuery);
        System.out.println("inserted successfully");
        connection.close();

    }
}
