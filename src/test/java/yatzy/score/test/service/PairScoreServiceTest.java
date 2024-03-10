package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.PairScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new PairScoreServiceImpl();
    }

    @Test
    void testUpdateScore() {
    	
        int[] dice1 = {3, 4, 3, 5, 6};
        assertEquals(6, scoreObserverService.updateScore(dice1));

        int[] dice2 = {5, 3, 3, 3, 5};
        assertEquals(10, scoreObserverService.updateScore(dice2));

        int[] dice3 = {6, 2, 2, 4, 5};
        assertEquals(4, scoreObserverService.updateScore(dice3));

        int[] dice4 = {5, 3, 6, 6, 5};
        assertEquals(12, scoreObserverService.updateScore(dice4));
    }
}