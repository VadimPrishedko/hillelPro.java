import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReadyMethodsStream {

    public double getAverage(ArrayList<Integer> listInt) {
        return listInt.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public List<Pair> toUpperCase(List<String> listSring) {
        return listSring.stream().map(Pair::new).collect(Collectors.toList());
    }

    public List<String> filter(List<String> listSring) {
        Predicate<String> lowerCase = str -> str.equals(str.toLowerCase());
        Predicate<String> length = str -> (str.length() == 4);
        List<String> colect = listSring.stream().filter(lowerCase.and(length)).collect(Collectors.toList());
        return colect;
    }
}
