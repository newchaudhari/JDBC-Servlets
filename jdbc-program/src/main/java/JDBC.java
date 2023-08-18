import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("enter id, courseName, Price");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            String courseName = scanner.next();
            int price = scanner.nextInt();
            String sqlQuery = "INSERT INTO course VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, courseName);
            preparedStatement.setInt(3, price);

            preparedStatement.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
