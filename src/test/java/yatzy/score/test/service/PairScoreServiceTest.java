package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.PairScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link PairScoreService.java}.
 * @author stagziria
 *
 */
class PairScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {
		scoreObserverStrategyService = new PairScoreServiceImpl();
	}

	/** 
	 * Test case for {@link PairScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCases() {

		int[] dice1 = {3, 4, 3, 5, 6};
		assertEquals(6, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {5, 3, 3, 3, 5};
		assertEquals(10, scoreObserverStrategyService.updateScore(dice2));

		int[] dice3 = {6, 2, 2, 4, 5};
		assertEquals(4, scoreObserverStrategyService.updateScore(dice3));

		int[] dice4 = {5, 3, 6, 6, 5};
		assertEquals(12, scoreObserverStrategyService.updateScore(dice4));
	}
}