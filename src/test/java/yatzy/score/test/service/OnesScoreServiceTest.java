package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.OnesScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OnesScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new OnesScoreServiceImpl();
    }

    @Test
    void testUpdateScore() {
    	
        int[] dice1 = {1, 2, 3, 4, 5};
        assertEquals(1, scoreObserverService.updateScore(dice1));

        int[] dice2 = {1, 2, 1, 1, 1};
        assertEquals(4, scoreObserverService.updateScore(dice2));

        int[] dice3 = {6, 2, 2, 4, 5};
        assertEquals(0, scoreObserverService.updateScore(dice3));

        int[] dice4 = {1, 2, 1, 4, 5};
        assertEquals(2, scoreObserverService.updateScore(dice4));
    }
}