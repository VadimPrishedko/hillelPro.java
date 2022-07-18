package service;

import dto.Symbols;
import java.util.Random;

public class Game {
    private int handComputer;

    public String gamePay(int handPlayer, String player) {
        handComputer = random();
        return player + " bet: " + nameHend(handPlayer) + "\n" +
                "computer: " + nameHend(handComputer) + "\n" +
                new GameResults().getRESULT(handPlayer, handComputer) + "\n";
    }

    private int random() {
        final Random random = new Random();
        handComputer = random.nextInt(1, 4);
        return handComputer;
    }

    private String nameHend(int number) {
        return switch (number) {
            case 1 -> Symbols.Rock + " " + Symbols.Rock.getValue();
            case 2 -> Symbols.Scissors + " " + Symbols.Scissors.getValue();
            case 3 -> Symbols.Paper + " " + Symbols.Paper.getValue();
            default -> null;
        };
    }


}
