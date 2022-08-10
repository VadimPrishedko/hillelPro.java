
import service.impl.StudentServiceimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Run {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentServiceimpl sti = new StudentServiceimpl();
        sti.getAll().stream();
        sti.createStudent();
        sti.getByName("Ivan");
        List<Integer> ids = new ArrayList<>();
        ids.add(5);
        ids.add(7);
        sti.getByIds(ids);
        sti.deleteStudent();
    }
}
