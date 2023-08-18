import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //1. get connection
        String url="jdbc:mysql://localhost:3306/practice";
        String username="root";
        String password = "Navin@1312";
        Connection connection = DriverManager.getConnection(url, username, password);

        //2. execute query
        String sqlQuery="SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //3.get result
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String phoneNumber = resultSet.getString("phoneNumber");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            System.out.println(id+"\t"+name+"\t"+phoneNumber+"\t"+email+"\t"+address);
        }
        //4. Close Connection
        connection.close();

    }
}
