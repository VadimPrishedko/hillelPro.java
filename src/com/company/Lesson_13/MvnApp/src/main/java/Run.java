import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        System.out.println(new ReadyMethodsStream().getAverage(listInt));

        ArrayList<String> listSring = new ArrayList<>();
        listSring.add("one");
        listSring.add("two");
        listSring.add("three");
        listSring.add("four");
        listSring.add("five");
        listSring.add("six");
        listSring.add("seven");

        System.out.println(new ReadyMethodsStream().toUpperCase(listSring));
        System.out.println(new ReadyMethodsStream().filter(listSring));
    }
}
