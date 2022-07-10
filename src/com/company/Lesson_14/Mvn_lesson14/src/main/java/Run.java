import java.util.Arrays;

public class Run {
    public static void main(String[] args) throws Exception {
                String number = Arrays.toString(args);
                number = ParsingNumber.checkingForNumbers(number);
                System.out.println(new ParsingNumber(number).toString());
    }
}
