package service;

public class GameResults {
    final String[][] RESULT = {{"Draw", "Player Win", "Computer Win"},
            {"Computer Win", "Draw", "Player Win"},
            {"Player Win", "Computer Win", "Draw"}};

    int playerCounter = 0;
    int computerCounter = 0;


    public String getRESULT(int playerBet, int computerBet) {
        String result = RESULT[playerBet - 1][computerBet - 1];

        if (result == "Player Win") {
            playerCounter++;
        } else if (result == "Computer Win") {
            computerCounter++;

        }
        return result;
    }

    public int getPlayerCounter() {
        return playerCounter;
    }

    public int getComputerCounter() {
        return computerCounter;
    }
}
