package service;

import dto.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    List<Student> getAll() throws SQLException, ClassNotFoundException;
    void createStudent() throws SQLException, ClassNotFoundException;
    void getByName(String name) throws SQLException, ClassNotFoundException;
    void getByIds(List<Integer> ids) throws SQLException, ClassNotFoundException;
    void deleteStudent() throws SQLException, ClassNotFoundException;
}
