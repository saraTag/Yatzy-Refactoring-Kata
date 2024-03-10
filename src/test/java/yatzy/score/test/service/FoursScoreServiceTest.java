package yatzy.score.test.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.FoursScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoursScoreServiceTest {

	private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	
    	scoreObserverService = new FoursScoreServiceImpl();
    }

    @Test
    void testUpdateScore() {
    	
        int[] dice1 = {1, 2, 3, 4, 5};
        assertEquals(4, scoreObserverService.updateScore(dice1));

        int[] dice2 = {4, 4, 4, 4, 4};
        assertEquals(20, scoreObserverService.updateScore(dice2));

        int[] dice3 = {1, 3, 5, 6, 6};
        assertEquals(0, scoreObserverService.updateScore(dice3));
    }
}