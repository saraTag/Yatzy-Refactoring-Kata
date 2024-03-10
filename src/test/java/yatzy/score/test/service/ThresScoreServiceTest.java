package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.ThresScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThresScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new ThresScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultiplesCases() {
    	
    	int[] dice1 = {1, 2, 3, 2, 3};
        assertEquals(6, scoreObserverService.updateScore(dice1));

        int[] dice2 = {2, 3, 3, 3, 3};
        assertEquals(12, scoreObserverService.updateScore(dice2));
    }
}