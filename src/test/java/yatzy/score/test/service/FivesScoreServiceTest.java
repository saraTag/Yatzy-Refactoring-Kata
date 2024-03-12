package yatzy.score.test.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import yatzy.score.service.impl.FivesScoreServiceImpl;
import yatzy.score.service.ScoreObserverStrategyService;


/**
 * Tests for {@link FivesScoreService.java}.
 * 
 * @author stagziria
 */
public class FivesScoreServiceTest {

    /**
     * Test case for {@link ChanceScoreService#updateScore(int[])} method.
     * Calculating the score when no fives are rolled.
     */
    @Test
    public void testUpdateScore_TwoFivesRolled() {
    	
        // Variable declaration
        int[] dice = {4, 4, 4, 5, 5};
        ScoreObserverStrategyService fivesScoreService = new FivesScoreServiceImpl();

        // Service call
        int score = fivesScoreService.updateScore(dice);

        // Assertion
        assertEquals(10, score);
    }

    /**
     * Test case for {@link ChanceScoreService#updateScore(... int)} method.
     * Calculating the score when one five is rolled.
     */
    @Test
    public void testUpdateScore_ThreeFiveRolled() {
    	
        // Variable declaration
        int[] dice = {4, 4, 5, 5, 5};
        FivesScoreServiceImpl fivesScoreService = new FivesScoreServiceImpl();

        // Service call
        int score = fivesScoreService.updateScore(dice);

        // Assertion
        assertEquals(15, score);
    }

    /**
     * Test case for {@link ChanceScoreService#updateScore(int[])} method.
     * Calculating the score when multiple fives are rolled.
     */
    @Test
    public void testUpdateScore_FourFivesRolled() {
    	
        // Variable declaration
        int[] dice = {4, 5, 5, 5, 5};
        FivesScoreServiceImpl fivesScoreService = new FivesScoreServiceImpl();

        // Call service
        int score = fivesScoreService.updateScore(dice);

        // Assertion
        assertEquals(20, score);
    }
}