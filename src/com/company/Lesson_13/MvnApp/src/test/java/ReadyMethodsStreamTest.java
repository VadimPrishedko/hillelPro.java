import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadyMethodsStreamTest {

    @Test
    void testGetAverage() {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        assertEquals(3.5, new ReadyMethodsStream().getAverage(listInt));
    }

    @Test
    void testToUpperCase() {
        ArrayList<String> listSring = new ArrayList<>();

        listSring.add("one");
        listSring.add("two");
        listSring.add("three");
        assertEquals("[Pair{\"one\" : \"ONE\"}, Pair{\"two\" : \"TWO\"}, Pair{\"three\" : \"THREE\"}]", new ReadyMethodsStream().toUpperCase(listSring).toString());
     }

    @Test
    void testFilter() {
        ArrayList<String> listSring = new ArrayList<>();
        listSring.add("one");
        listSring.add("two");
        listSring.add("three");
        listSring.add("four");
        listSring.add("five");
        listSring.add("six");
        listSring.add("seven");
        assertEquals("[four, five]", new ReadyMethodsStream().filter(listSring).toString());

    }
}