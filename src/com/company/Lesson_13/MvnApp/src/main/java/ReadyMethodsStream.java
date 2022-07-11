import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReadyMethodsStream {

    public double getAverage(ArrayList<Integer> listInt) {
        return listInt.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public List<Pair> register(List<String> listSring) {
        List<Pair> collect = listSring.stream().map(s -> new Pair(s.toLowerCase(), s.toUpperCase())).collect(Collectors.toList());
        return collect;
    }

    public List<String> filter(List<String> listSring) {
        Predicate<String> lowerCase = str -> str.equals(str.toLowerCase());
        Predicate<String> length = str -> (str.length() == 4);
        List<String> collect = listSring.stream().filter(lowerCase.and(length)).collect(Collectors.toList());
        return collect;
    }
}
