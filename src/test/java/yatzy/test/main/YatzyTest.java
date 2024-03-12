package yatzy.test.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.main.Yatzy;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Tests for {@link Yatzy.java}
 * @author stagziria
 *
 */
public class YatzyTest {

	/** score observer service **/
	private ScoreObserverStrategyService mockScoreObserver;

	/**
	 * Sets up the test environment before each test method.
	 */
	@BeforeEach
	public void setUp() {
		mockScoreObserver = mock(ScoreObserverStrategyService.class);
	}

	/**
	 * Nominal test case for {@link Yatzy#getInstance(int...)} method.
	 */
	@Test
	public void testGetInstance_NominalCase() {
		
		Yatzy yatzy1 = Yatzy.getInstance(1, 2, 3, 4, 5);
		Yatzy yatzy2 = Yatzy.getInstance(1, 1, 1, 1, 1);
		assertEquals(yatzy1, yatzy2);
	}

	/**
	 * Nominal test case for {@link Yatzy#setScoreObserver(ScoreObserverStrategyService)} method.
	 */
	@Test
	public void testSetScoreObserver_NominalCase() {
		
		Yatzy yatzy = Yatzy.getInstance(1, 2, 3, 4, 5);
		yatzy.setScoreObserver(mockScoreObserver);
		verify(mockScoreObserver).updateScore(new int[]{1, 2, 3, 4, 5});
	}
}