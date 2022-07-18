package service;

public class GameResults {
    final String[][] RESULT = {{"Draw", "Player Win", "Computer Win"},
            {"Computer Win", "Draw", "Player Win"},
            {"Player Win", "Computer Win", "Draw"}};

    public String getRESULT(int playerBet, int computerBet) {
        return RESULT[playerBet-1][computerBet-1];
    }
}
