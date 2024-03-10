package yatzy.score.test.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import yatzy.score.service.impl.ChanceScoreServiceImpl;
import yatzy.score.service.ScoreObserverService;


public class ChanceScoreServiceTest {

    @Test
    public void testUpdateScore_Nominal() {
        // Create an instance of the ChanceScoreServiceImpl
    	ScoreObserverService chanceScoreService = new ChanceScoreServiceImpl();

        // Define some test dice values
        int[] testDice = {2, 3, 4, 5, 1};

        // Call the updateScore method with the test dice values
        int result = chanceScoreService.updateScore(testDice);

        // Assert that the result is the sum of the dice values
        assertEquals(15, result, "Sum of test dice values should be 15");
    }
}