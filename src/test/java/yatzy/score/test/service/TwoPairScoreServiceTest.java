package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.TwoPairScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link TwoPairScoreService.java}.
 * @author stagziria
 *
 */
class TwoPairScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {
		scoreObserverStrategyService = new TwoPairScoreServiceImpl();
	}

	/** 
	 * Test case for {@link TwoPairScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCases() {

		int[] dice1 = {3, 3, 5, 4, 5};
		assertEquals(16, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {3, 3, 5, 5, 5};
		assertEquals(16, scoreObserverStrategyService.updateScore(dice2));
	}
}