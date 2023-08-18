import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo2 {
    public static void main(String[] args) {
        getDetails();
    }

    public static void getDetails() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Enter Student id");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();

            String sqlQuery = "SELECT * FROM student WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                System.out.println(id1 + "\t" + name + "\t" + phoneNumber + "\t" + email + "\t" + address);
            }

        } catch (SQLException e) {
            System.out.println("Error in connecting server " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("error in closing connection " + e.getMessage());
            }
        }
    }
}
