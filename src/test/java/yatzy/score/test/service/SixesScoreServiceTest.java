package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.SixesScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SixesScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new SixesScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultiplesCases() {
    	
        int[] dice1 = {4, 4, 4, 5, 5};
        assertEquals(0, scoreObserverService.updateScore(dice1));

        int[] dice2 = {4, 4, 6, 5, 5};
        assertEquals(6, scoreObserverService.updateScore(dice2));

        int[] dice3 = {6, 5, 6, 6, 5};
        assertEquals(18, scoreObserverService.updateScore(dice3));

        int[] dice4 = {5, 3, 6, 6, 5};
        assertEquals(12, scoreObserverService.updateScore(dice4));
    }
}