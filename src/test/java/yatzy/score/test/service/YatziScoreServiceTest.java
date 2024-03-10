package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.YatziScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YatziScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new YatziScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultiplesCases() {
    	
    	int[] dice1 = {4, 4, 4, 4, 4};
        assertEquals(50, scoreObserverService.updateScore(dice1));

        int[] dice2 = {6, 6, 6, 6, 6};
        assertEquals(50, scoreObserverService.updateScore(dice2));
        
        int[] dice3 = {6, 6, 6, 6, 3};
        assertEquals(0, scoreObserverService.updateScore(dice3));
    }
}