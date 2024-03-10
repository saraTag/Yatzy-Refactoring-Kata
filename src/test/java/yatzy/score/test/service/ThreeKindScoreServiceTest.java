package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.ThreeKindScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeKindScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	scoreObserverService = new ThreeKindScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultiplesCases() {
    	
    	int[] dice1 = {3, 3, 3, 4, 5};
        assertEquals(9, scoreObserverService.updateScore(dice1));

        int[] dice2 = {5, 3, 5, 4, 5};
        assertEquals(15, scoreObserverService.updateScore(dice2));

        int[] dice3 = {3, 3, 3, 3, 5};
        assertEquals(9, scoreObserverService.updateScore(dice3));

        int[] dice4 = {1, 2, 3, 4, 4};
        assertEquals(0, scoreObserverService.updateScore(dice4));
    }
}