package db;

import dto.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // driver registration
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Student?"
                        + "useSSL=false&user=root&password=rootroot&serverTimezone=UTC");
        return connection;
    }

    public List<Student> getStudent() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from Student");
        List<Student> student = new ArrayList<>();

        while (rs.next()) {

            int id = rs.getInt("id");
            String fio = rs.getString("fio");
            String group = rs.getString("class");
            int hours = rs.getInt("hours");
            student.add(new Student(id, fio, group, hours));
        }
        return student;
    }

    public boolean createStudent(List<Student> students) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();

        for (Student s : students) {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Student(id,fio, class, hours) VALUES(?,?,?,?)");
        preparedStatement.setInt(1, s.getId());
        preparedStatement.setString(2, s.getFio());
        preparedStatement.setString(3, s.getGroup());
        preparedStatement.setInt(4, s.getHours());


        preparedStatement.executeUpdate();

        }
        return true;
    }

    public void delete() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String query = "Truncate table Student";
        statement.execute(query);
    }

    public int getId() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from Student");
        int columnCount = rs.getMetaData().getColumnCount();
        return columnCount;
    }
}
