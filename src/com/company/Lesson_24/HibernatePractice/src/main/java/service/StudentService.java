package service;

import entity.Student;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);
    List<Student> getAll();
    List<Student> getByName(String name);
    List<Student> getByIds(List<Integer> ids);
}
