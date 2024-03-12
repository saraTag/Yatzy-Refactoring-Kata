package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.OnesScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link OnesScoreService.java}.
 * @author stagziria
 *
 */
class OnesScoreServiceTest{

    /** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
    void setUp() {
    	scoreObserverStrategyService = new OnesScoreServiceImpl();
    }

    /** 
	 * Test case for {@link OnesScoreService#updateScore(int[])} method.
	 */
    @Test
    void testUpdateScore_MultiplesCases() {
    	
        int[] dice1 = {1, 2, 3, 4, 5};
        assertEquals(1, scoreObserverStrategyService.updateScore(dice1));

        int[] dice2 = {1, 2, 1, 1, 1};
        assertEquals(4, scoreObserverStrategyService.updateScore(dice2));

        int[] dice3 = {6, 2, 2, 4, 5};
        assertEquals(0, scoreObserverStrategyService.updateScore(dice3));

        int[] dice4 = {1, 2, 1, 4, 5};
        assertEquals(2, scoreObserverStrategyService.updateScore(dice4));
    }
}