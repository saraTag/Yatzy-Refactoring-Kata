package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.TwosScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwosScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new TwosScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultiplesCases() {
    	
    	int[] dice1 = {1, 2, 3, 2, 6};
        assertEquals(4, scoreObserverService.updateScore(dice1));

        int[] dice2 = {2, 2, 2, 2, 2};
        assertEquals(10, scoreObserverService.updateScore(dice2));
    }
}