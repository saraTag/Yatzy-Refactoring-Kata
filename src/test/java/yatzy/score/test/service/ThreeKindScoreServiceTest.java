package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.ThreeKindScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test of {@link ThreeKindScoreService.java}.
 * @author stagziria
 *
 */
class ThreeKindScoreServiceTest {

    /** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
    void setUp() {
    	scoreObserverStrategyService = new ThreeKindScoreServiceImpl();
    }

    /** 
	 * Test case for {@link SmallStraightScoreService#updateScore(int[])} method.
	 */
    @Test
    void testUpdateScore_MultiplesCases() {
    	
    	int[] dice1 = {3, 3, 3, 4, 5};
        assertEquals(9, scoreObserverStrategyService.updateScore(dice1));

        int[] dice2 = {5, 3, 5, 4, 5};
        assertEquals(15, scoreObserverStrategyService.updateScore(dice2));

        int[] dice3 = {3, 3, 3, 3, 5};
        assertEquals(9, scoreObserverStrategyService.updateScore(dice3));

        int[] dice4 = {1, 2, 3, 4, 4};
        assertEquals(0, scoreObserverStrategyService.updateScore(dice4));
    }
}