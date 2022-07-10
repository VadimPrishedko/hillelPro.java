import java.util.Optional;

public class ParsingNumber {

    String[][] arrayGraphic;
    String number;

    public ParsingNumber(String number) {
        this.number = number;
        arrayGraphic = new String[number.length()][5];
        Parsing();
    }

    private void Parsing() {

        for (int i = 0; i < number.length(); i++) {
            String temp = number.substring(i, i + 1);
            for (int j = 0; j < 5; j++) {
                switch (temp) {
                    case "0" -> this.arrayGraphic[i][j] = GraphicNumber.ZERO[j];
                    case "1" -> this.arrayGraphic[i][j] = GraphicNumber.ONE[j];
                    case "2" -> this.arrayGraphic[i][j] = GraphicNumber.TWO[j];
                    case "3" -> this.arrayGraphic[i][j] = GraphicNumber.THREE[j];
                    case "4" -> this.arrayGraphic[i][j] = GraphicNumber.FOUR[j];
                    case "5" -> this.arrayGraphic[i][j] = GraphicNumber.FIVE[j];
                    case "6" -> this.arrayGraphic[i][j] = GraphicNumber.SIX[j];
                    case "7" -> this.arrayGraphic[i][j] = GraphicNumber.SEVEN[j];
                    case "8" -> this.arrayGraphic[i][j] = GraphicNumber.EIGHT[j];
                    case "9" -> this.arrayGraphic[i][j] = GraphicNumber.NINE[j];
                }
            }
        }
    }

    public static String checkingForNumbers(String s) throws Exception {
        String number;
        number = ParsingNumber.removeFirstCharOptional(s);

        try {
            for (int i = 0; i < number.length() - 1; i++) {
                int temp = Integer.parseInt(number.substring(i, i + 1));
            }
            number = ParsingNumber.removeLastCharOptional(number);
        } catch (Exception e) {
            System.out.println("Invalid input! Enter the number");
            throw new Exception("Invalid input! Enter the number");
        }

        return number;
    }


    public static String removeLastCharOptional(String s) {
        return Optional.ofNullable(s)
                .filter(str -> str.length() != 0)
                .map(str -> str.substring(0, str.length() - 1))
                .orElse(s);
    }

    public static String removeFirstCharOptional(String s) {
        return Optional.ofNullable(s)
                .filter(str -> str.length() != 0)
                .map(str -> str.substring(1))
                .orElse(s);
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < number.length(); j++) {
                str.append(arrayGraphic[j][i]).append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
