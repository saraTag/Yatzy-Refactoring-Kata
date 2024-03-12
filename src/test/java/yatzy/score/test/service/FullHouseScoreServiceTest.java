package yatzy.score.test.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.FullHouseScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link FullHouseScoreService}.
 */
class FullHouseScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {

		scoreObserverStrategyService = new FullHouseScoreServiceImpl();
	}

	/** 
	 * Test case for {@link FullHouseScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCases() {

		int[] dice1 = {6, 2, 2, 2, 6};
		assertEquals(18, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {2, 3, 4, 5, 6};
		assertEquals(0, scoreObserverStrategyService.updateScore(dice2));

		int[] dice3 = {1, 2, 3, 4, 5};
		assertEquals(0, scoreObserverStrategyService.updateScore(dice3));

		int[] dice4 = {1, 1, 1, 1, 1};
		assertEquals(0, scoreObserverStrategyService.updateScore(dice4));
	}
}