package service.impl;

import db.DataService;
import dto.Student;
import service.StudentService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceimpl implements StudentService {
    DataService db = new DataService();

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
    public void getByName(String name) throws SQLException, ClassNotFoundException {
        List<Student> studentName = getAll();
        System.out.println("by name");
        studentName.stream().filter(x -> x.getFio().equals(name)).forEach(x ->
                System.out.println("id: " + x.getId()
                        + " fio: " + x.getFio()
                        + " group: " + x.getGroup()
                        + " hours: " + x.getHours()));
    }

    @Override
    public void getByIds(List<Integer> ids) throws SQLException, ClassNotFoundException {
        List<Student> studentId = getAll();
        System.out.println("by index");
        for (int i = 0; i < studentId.size(); i++) {
            for (int j = 0; j < ids.size(); j++) {
                if (studentId.get(i).getId() == ids.get(j).intValue()) {
                    System.out.println("id: " + studentId.get(i).getId()
                            + " fio: " + studentId.get(i).getFio()
                            + " group: " + studentId.get(i).getGroup()
                            + " hours: " + studentId.get(i).getHours());
                }
            }
        }
    }

    @Override
    public void deleteStudent() throws SQLException, ClassNotFoundException {
        db.delete();
    }
}
