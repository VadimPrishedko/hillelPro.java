
import db.HibernateUtil;
import entity.Student;
import service.impl.StudentServiceimpl;

import java.util.ArrayList;
import java.util.List;


public class Run {
    public static void main(String[] args) {

        Student student = new Student(1, "Ivan", "tt-1", 2022);
        StudentServiceimpl sti = new StudentServiceimpl();
        sti.createStudent(student);
        System.out.println(sti.getAll());
        System.out.println(sti.getByName("Ivan"));
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        System.out.println(sti.getByIds(ids));
        HibernateUtil.shutdown();

    }
}
