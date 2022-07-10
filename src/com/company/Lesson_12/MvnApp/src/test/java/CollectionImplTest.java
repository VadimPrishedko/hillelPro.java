import com.company.Lesson_8.Collection;
import com.company.Lesson_8.CollectionImpl;
import org.junit.jupiter.api.Test;

import static com.company.Lesson_8.CollectionImpl.array;
import static org.junit.jupiter.api.Assertions.*;

class CollectionImplTest {

    Collection servise = new CollectionImpl<String>();

    @Test
    void add() {
        assertEquals(servise.add("test"), servise.get(0).equals("test"));
    }

    @Test
    void testAdd() {
        assertEquals(servise.add(1, "test2"), servise.get(1).equals("test2"));
    }

    @Test
    void delete() {
        servise.add("test");
        servise.add("test2");
        servise.delete("test2");
        assertEquals(1,servise.size());
    }

    @Test
    void get() {
        servise.add("test");
        assertEquals("test",servise.get(0));
    }

    @Test
    void contain() {
        servise.add("test");
        assertEquals(servise.contain("test"), true);

    }

    @Test
    void testEquals() {
        assertEquals(servise.equals(array), true);
    }

    @Test
    void clear() {
        servise.add("test");
        servise.add("test2");
        servise.clear();

        assertEquals(0, servise.size());

    }

    @Test
    void size() {
        servise.add("test");
        servise.add("test2");
        assertEquals(2, servise.size());

    }


}