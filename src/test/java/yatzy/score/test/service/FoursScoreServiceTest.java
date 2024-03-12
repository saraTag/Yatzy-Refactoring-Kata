package yatzy.score.test.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.FoursScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link FoursScoreService.java}.
 * @author stagziria
 *
 */
class FoursScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
    void setUp() {
    	
    	scoreObserverStrategyService = new FoursScoreServiceImpl();
    }
    
    /** 
     * Test case for {@link FoursScoreService#updateScore(int[])} method.
     */
    @Test
    void testUpdateScore_MultiplesCases() {
    	
        int[] dice1 = {1, 2, 3, 4, 5};
        assertEquals(4, scoreObserverStrategyService.updateScore(dice1));

        int[] dice2 = {4, 4, 4, 4, 4};
        assertEquals(20, scoreObserverStrategyService.updateScore(dice2));

        int[] dice3 = {1, 3, 5, 6, 6};
        assertEquals(0, scoreObserverStrategyService.updateScore(dice3));
    }
}