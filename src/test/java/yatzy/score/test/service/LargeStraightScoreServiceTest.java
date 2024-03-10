package yatzy.score.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.ScoreObserverService;
import yatzy.score.service.impl.LargeStraightScoreServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeStraightScoreServiceTest {

	private ScoreObserverService scoreObserverService;

	@BeforeEach
	void setUp() {
		scoreObserverService = new LargeStraightScoreServiceImpl();
	}

	@Test
	void testUpdateScore_MultiplesCase() {
		int[] dice1 = {6, 2, 3, 4, 5};
		assertEquals(20, scoreObserverService.updateScore(dice1));

		int[] dice2 = {2, 3, 4, 5, 6};
		assertEquals(20, scoreObserverService.updateScore(dice2));

		int[] dice3 = {1, 2, 2, 4, 5};
		assertEquals(0, scoreObserverService.updateScore(dice3));

		int[] dice4 = {1, 2, 3, 4, 4};
		assertEquals(0, scoreObserverService.updateScore(dice4));
	}
}