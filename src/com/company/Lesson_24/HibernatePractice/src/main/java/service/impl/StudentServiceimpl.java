package service.impl;

import db.HibernateUtil;
import entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceimpl implements StudentService {

    private Session session = HibernateUtil.getSessionFactory().openSession();
    List<Student> students;
    @Override
    public void createStudent(Student student)  {
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }


    @Override
    public List<Student> getAll()  {
        session.beginTransaction();
        Query query = session.createQuery("From Student");
        students = new ArrayList<>();
        List allStudent = query.list();
        students = allStudent;
        return allStudent;
    }


    @Override
    public  List<Student> getByName (String name) {
        List<Student> studentName = new ArrayList<>();
        for (Student student : students) {
            if (student.getFio().equals(name)) {
                studentName.add(student);
            }
        }
        return studentName;
    }

    @Override
    public List<Student> getByIds(List<Integer> ids)  {
        List<Student> studentId = new ArrayList<>();

        System.out.println("by index");
        int i = 0;
        for (Student student : students) {

            for (int j = 0; j < ids.size(); j++) {
                if (students.get(i).getId() == ids.get(j)) {
                    studentId.add(student);
                }
            }
            i++;
        }
        return studentId;
    }

}
