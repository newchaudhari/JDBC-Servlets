import java.sql.*;

public class CRUDApplication {
    public static void main(String[] args) {
        //1. create table
//        createTable();

        //2. Insert into table
//        insertIntoTable();

        //3. update data
//        updateTable();

        //4. Delete Table
//        deleteTable();

        //5. Read From Table
//        readFromTable();

        //6. Alter Table
//        alterTable();

        //7. Drop Table
//        dropTable();

    }

    public static void createTable() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "CREATE TABLE Course1(id int, name varchar(50), price int)";
            Statement statement = connection.createStatement();
            statement.execute(sqlQuery);
            System.out.println("Table Created");
        } catch (SQLException e) {
            System.out.println("problem in getting connection " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error in closing connection " + e.getMessage());
            }
        }
    }

    public static void insertIntoTable() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "INSERT INTO course VALUES(1,'C#',15000)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQuery);
            System.out.println("Inserted into table");
        } catch (SQLException e) {
            System.out.println("problem in connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection " + e.getMessage());
            }
        }


    }

    public static void updateTable() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "UPDATE course SET name='julia' WHERE ID=1";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQuery);
            System.out.println("Update into table");
        } catch (SQLException e) {
            System.out.println("problem in connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection " + e.getMessage());
            }
        }


    }

    public static void deleteTable() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "DELETE FROM COURSE WHERE name='julia'";
            Statement statement = connection.createStatement();
            statement.execute(sqlQuery);
            System.out.println("table deleted");
        } catch (SQLException e) {
            System.out.println("problem in connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection " + e.getMessage());
            }
        }


    }

    public static void readFromTable() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "SELECT * FROM course";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                System.out.println(id + "\t" + name + "\t" + price);
            }

        } catch (SQLException e) {
            System.out.println("problem in connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection " + e.getMessage());
            }
        }


    }

    public static void alterTable() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "ALTER TABLE course RENAME COLUMN name to courseName ";
            Statement statement = connection.createStatement();
            statement.execute(sqlQuery);
            System.out.println("table Altered");
        } catch (SQLException e) {
            System.out.println("problem in connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection " + e.getMessage());
            }
        }


    }

    public static void dropTable() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "Navin@1312";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "DROP TABLE course1";
            Statement statement = connection.createStatement();
            statement.execute(sqlQuery);
            System.out.println("table droped");
        } catch (SQLException e) {
            System.out.println("problem in connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error in closing the connection " + e.getMessage());
            }
        }


    }
}
