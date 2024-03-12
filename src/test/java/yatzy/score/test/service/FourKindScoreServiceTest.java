package yatzy.score.test.service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.impl.FourKindScoreServiceImpl;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Tests for class {@link FourKindScoreService.java}.
 * @author stagziria
 *
 */
class FourKindScoreServiceTest {

    /** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
    void setUp() {
        scoreObserverStrategyService = new FourKindScoreServiceImpl();
    }

    /** 
     * Test case for {@link FourKindScoreService#updateScore(int[])} method.
     */
    @Test
    void testUpdateScore_MultipleCases() {
  
        int[] dice1 = {3, 3, 3, 3, 5};
        assertEquals(12, scoreObserverStrategyService.updateScore(dice1));

        int[] dice3 = {5, 5, 5, 4, 5};
        assertEquals(20, scoreObserverStrategyService.updateScore(dice3));

        int[] dice4 = {3, 3, 3, 3, 3};
        assertEquals(12, scoreObserverStrategyService.updateScore(dice4));
    }
   
}