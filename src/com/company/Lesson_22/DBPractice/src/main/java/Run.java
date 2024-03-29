
import dto.Student;
import service.impl.StudentServiceimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Run {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentServiceimpl sti = new StudentServiceimpl();
        sti.getAll().stream();
        sti.createStudent();

        List<Student> studentName =  sti.getByName("Ivan");
        for(Student s : studentName) {
            System.out.println("id: " + s.getId()
                        + " fio: " + s.getFio()
                        + " group: " + s.getGroup()
                        + " hours: " + s.getHours());
        }

        List<Integer> ids = new ArrayList<>();
        ids.add(5);
        ids.add(7);

        List<Student> studentId =  sti.getByIds(ids);
        for(Student s : studentId) {
            System.out.println("id: " + s.getId()
                    + " fio: " + s.getFio()
                    + " group: " + s.getGroup()
                    + " hours: " + s.getHours());
        }
        sti.deleteStudent();
    }
}
