package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService.java}.
 * It calculates the score by summing up all the dice values that are equal to five.
 * 
 * @author stagziria
 */
public class FivesScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {
		
		return calculScore(dice);
	}
	
	 /**
     * Calculates the score for the fives category.
     * 
     * @param dice An array containing the dice values.
     * @return The total score for the fives category.
     */
	public int calculScore(int[] dice) {

		return Arrays.stream(dice)
				.filter(die -> die == Constants.NUMBER_FIVE_OF_DICE)
				.map(die -> Constants.NUMBER_FIVE_OF_DICE)
				.sum();
	}

}
