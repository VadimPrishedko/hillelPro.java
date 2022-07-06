import utils.scannerNamber;

public class Run {
    public static void main(String[] args) {

        boolean result = false;

        do {
            try {
                String number = String.valueOf(scannerNamber.getNamber());
                System.out.println(new ParsingNumber(number).toString());
                result = false;
            } catch (Exception e) {
                result = true;
                System.out.println("Enter an integer");
            }
        } while (result);


    }
}
