package yatzy.score.test.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.FullHouseScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FullHouseScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
    	
    	scoreObserverService = new FullHouseScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultiplesCases() {
    	
        int[] dice1 = {6, 2, 2, 2, 6};
        assertEquals(18, scoreObserverService.updateScore(dice1));

        int[] dice2 = {2, 3, 4, 5, 6};
        assertEquals(0, scoreObserverService.updateScore(dice2));

        int[] dice3 = {1, 2, 3, 4, 5};
        assertEquals(0, scoreObserverService.updateScore(dice3));

        int[] dice4 = {1, 1, 1, 1, 1};
        assertEquals(0, scoreObserverService.updateScore(dice4));
    }
}