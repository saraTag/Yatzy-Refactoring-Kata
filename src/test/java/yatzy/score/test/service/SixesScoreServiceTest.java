package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.SixesScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link SixesScoreService.java}.
 * @author stagziria
 *
 */
class SixesScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {
		scoreObserverStrategyService = new SixesScoreServiceImpl();
	}

	/** 
	 * Test case for {@link SixesScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCases() {

		int[] dice1 = {4, 4, 4, 5, 5};
		assertEquals(0, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {4, 4, 6, 5, 5};
		assertEquals(6, scoreObserverStrategyService.updateScore(dice2));

		int[] dice3 = {6, 5, 6, 6, 5};
		assertEquals(18, scoreObserverStrategyService.updateScore(dice3));

		int[] dice4 = {5, 3, 6, 6, 5};
		assertEquals(12, scoreObserverStrategyService.updateScore(dice4));
	}
}