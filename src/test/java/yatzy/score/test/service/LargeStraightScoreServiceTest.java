package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverStrategyService;
import yatzy.score.service.impl.LargeStraightScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link LargeStraightScoreService}.
 * @author stagziria
 *
 */
class LargeStraightScoreServiceTest {

	/** score observer service **/
	private ScoreObserverStrategyService scoreObserverStrategyService;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	void setUp() {
		scoreObserverStrategyService = new LargeStraightScoreServiceImpl();
	}
	
	/** 
	 * Test case for {@link LargeStraightScoreService#updateScore(int[])} method.
	 */
	@Test
	void testUpdateScore_MultiplesCase() {
		int[] dice1 = {6, 2, 3, 4, 5};
		assertEquals(20, scoreObserverStrategyService.updateScore(dice1));

		int[] dice2 = {2, 3, 4, 5, 6};
		assertEquals(20, scoreObserverStrategyService.updateScore(dice2));

		int[] dice3 = {1, 2, 2, 4, 5};
		assertEquals(0, scoreObserverStrategyService.updateScore(dice3));

		int[] dice4 = {1, 2, 3, 4, 4};
		assertEquals(0, scoreObserverStrategyService.updateScore(dice4));
	}
}