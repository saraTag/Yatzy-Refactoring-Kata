package yatzy.score.test.service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import yatzy.score.service.impl.FourKindScoreServiceImpl;
import yatzy.score.service.ScoreObserverService;


class FourKindScoreServiceTest {

    private ScoreObserverService scoreObserverService;

    @BeforeEach
    void setUp() {
        scoreObserverService = new FourKindScoreServiceImpl();
    }

    @Test
    void testUpdateScore_MultipleCases() {
  
        int[] dice1 = {3, 3, 3, 3, 5};
        assertEquals(12, scoreObserverService.updateScore(dice1));

        int[] dice3 = {5, 5, 5, 4, 5};
        assertEquals(20, scoreObserverService.updateScore(dice3));

        int[] dice4 = {3, 3, 3, 3, 3};
        assertEquals(12, scoreObserverService.updateScore(dice4));
    }
   
}