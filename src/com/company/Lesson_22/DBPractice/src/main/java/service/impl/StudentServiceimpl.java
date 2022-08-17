package service.impl;

import db.DataService;
import dto.Student;
import service.StudentService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceimpl implements StudentService {
    DataService db = new DataService();
    List<Student> students;

    @Override
    public List<Student> getAll() throws SQLException, ClassNotFoundException {
        return db.getStudent();
    }

    @Override
    public void createStudent() throws SQLException, ClassNotFoundException {
        List<Student> studentsCreat = new ArrayList<>();
        int count = db.getId();
        for (int i = 0; i < 7; i++) {
            count++;
            studentsCreat.add(new Student(count, "Ivan", "tt-1", 2020));
        }
        db.createStudent(studentsCreat);
    }

    @Override
    public List<Student> getByName(String name) throws SQLException, ClassNotFoundException {
        System.out.println("by name");
        students = getAll();
      List<Student> studentName = new ArrayList<>();
        for (Student student : students) {
            if (student.getFio().equals(name)) {
                studentName.add(student);
            }
        }
        return studentName;
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) throws SQLException, ClassNotFoundException {
        students = getAll();
        List<Student> studentId = new ArrayList<>();
        System.out.println("by index");
        for (Student student : students) {
            for (int j = 0; j < ids.size(); j++) {
                if (student.getId() == ids.get(j).intValue()) {
                    studentId.add(student);

                }
            }
        }
        return studentId;

    }



    @Override
    public void deleteStudent() throws SQLException, ClassNotFoundException {
        db.delete();
    }
}
