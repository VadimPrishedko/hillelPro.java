package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameResultsTest extends GameResults {

    @Test
    void getRESULT() {
        assertEquals(new GameResults().getRESULT(2, 2),"Draw");
        assertEquals(new GameResults().getRESULT(3, 2), "Computer Win");
        assertEquals(new GameResults().getRESULT(1, 2), "Player Win");
    }
}