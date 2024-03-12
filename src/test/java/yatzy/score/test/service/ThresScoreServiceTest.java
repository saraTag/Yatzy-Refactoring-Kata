package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.ThresScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** 
 * Tests for {@link ThresScoreService.java}.
 * @author stagziria
 *
 */
class ThresScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {
		scoreObserverStrategyService = new ThresScoreServiceImpl();
	}

	/** 
	 * Test case for {@link SmallStraightScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCases() {

		int[] dice1 = {1, 2, 3, 2, 3};
		assertEquals(6, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {2, 3, 3, 3, 3};
		assertEquals(12, scoreObserverStrategyService.updateScore(dice2));
	}
}