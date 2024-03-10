package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.TwoPairScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPairScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new TwoPairScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultiplesCases() {
    	
    	int[] dice1 = {3, 3, 5, 4, 5};
        assertEquals(16, scoreObserverService.updateScore(dice1));

        int[] dice2 = {3, 3, 5, 5, 5};
        assertEquals(16, scoreObserverService.updateScore(dice2));
    }
}