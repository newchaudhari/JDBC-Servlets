import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/practice";
        String username="root";
        String password="Navin@1312";

        Connection connection = DriverManager.getConnection(url, username, password);
        String sqlQuery="SELECT * FROM student WHERE ID='13'";
        String sqlQuery1="UPDATE student SET address='Padalse' WHERE id=13";
        Statement statement = connection.createStatement();
//        ResultSet resultSet1 = statement.executeUpdate(sqlQuery1);
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String phoneNumber = resultSet.getString("phoneNumber");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            System.out.println(id+"\t"+name+"\t"+phoneNumber+"\t"+email+"\t"+address);
        }

        connection.close();
    }
}
