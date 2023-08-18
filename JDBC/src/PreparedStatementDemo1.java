import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo1 {
    public static void main(String[] args) throws SQLException {
        insertIntoTable();

    }
    public static void insertIntoTable() throws SQLException {
        String url="jdbc:mysql://localhost:3306/practice";
        String username="root";
        String password="Navin@1312";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("enter id, name, phoneNumber, email, address");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();
        String phone = scanner.next();
        String email = scanner.next();
        String address = scanner.next();
        String sqlQuery="INSERT INTO student VALUES(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,phone);
        preparedStatement.setString(4,email);
        preparedStatement.setString(5,address);
        preparedStatement.executeUpdate();
        System.out.println("data inserted");
        connection.close();
    }
}
