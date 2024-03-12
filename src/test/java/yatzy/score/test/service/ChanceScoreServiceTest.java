package yatzy.score.test.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import yatzy.score.service.impl.ChanceScoreServiceImpl;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Tests de la class {@link ChanceScoreService.java}.
 * @author stagziria
 *
 */
public class ChanceScoreServiceTest {

    /**
     * Nominal test case for {@link ChanceScoreService#updateScore(int[])} method.
     */
	@Test
    public void testUpdateScore_NominalCase() {
		
    	// Variable declaration
		ScoreObserverStrategyService chanceScoreService = new ChanceScoreServiceImpl();
        int[] testDice = {2, 3, 4, 5, 1};

        // Call service
        int result = chanceScoreService.updateScore(testDice);

        // Assertion
        assertEquals(15, result, "Sum of test dice values should be 15");
    }
}