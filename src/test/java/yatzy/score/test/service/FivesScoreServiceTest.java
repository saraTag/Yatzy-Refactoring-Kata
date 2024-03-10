package yatzy.score.test.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import yatzy.score.service.impl.FivesScoreServiceImpl;
import yatzy.score.service.ScoreObserverService;


/**
 * Test class for {@link FivesScoreServiceImpl}.
 * 
 * @author stagziria
 */
public class FivesScoreServiceTest {

    /**
     * Test case for calculating the score when no fives are rolled.
     */
    @Test
    public void testUpdateScore_TwoFivesRolled() {
    	
        // Arrange
        int[] dice = {4, 4, 4, 5, 5};
        ScoreObserverService fivesScoreService = new FivesScoreServiceImpl();

        // Act
        int score = fivesScoreService.updateScore(dice);

        // Assert
        assertEquals(10, score);
    }

    /**
     * Test case for calculating the score when one five is rolled.
     */
    @Test
    public void testUpdateScore_ThreeFiveRolled() {
        // Arrange
        int[] dice = {4, 4, 5, 5, 5};
        FivesScoreServiceImpl fivesScoreService = new FivesScoreServiceImpl();

        // Act
        int score = fivesScoreService.updateScore(dice);

        // Assert
        assertEquals(15, score);
    }

    /**
     * Test case for calculating the score when multiple fives are rolled.
     */
    @Test
    public void testUpdateScore_FourFivesRolled() {
        // Arrange
        int[] dice = {4, 5, 5, 5, 5};
        FivesScoreServiceImpl fivesScoreService = new FivesScoreServiceImpl();

        // Act
        int score = fivesScoreService.updateScore(dice);

        // Assert
        assertEquals(20, score);
    }
}