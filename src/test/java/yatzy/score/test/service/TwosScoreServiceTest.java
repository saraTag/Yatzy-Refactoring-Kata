package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.TwosScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link TwosScoreService.java}.
 * @author stagziria
 *
 */
class TwosScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {
		scoreObserverStrategyService = new TwosScoreServiceImpl();
	}

	/** 
	 * Test case for {@link TwosScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCases() {

		int[] dice1 = {1, 2, 3, 2, 6};
		assertEquals(4, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {2, 2, 2, 2, 2};
		assertEquals(10, scoreObserverStrategyService.updateScore(dice2));
	}
}