package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.YatziScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link YatziScoreService.java}.
 * @author stagziria
 *
 */
class YatziScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {
		scoreObserverStrategyService = new YatziScoreServiceImpl();
	}

	/** 
	 * Test case for {@link YatziScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCases() {

		int[] dice1 = {4, 4, 4, 4, 4};
		assertEquals(50, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {6, 6, 6, 6, 6};
		assertEquals(50, scoreObserverStrategyService.updateScore(dice2));

		int[] dice3 = {6, 6, 6, 6, 3};
		assertEquals(0, scoreObserverStrategyService.updateScore(dice3));
	}
}