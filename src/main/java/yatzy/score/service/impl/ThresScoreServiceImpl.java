package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService}
 * It calculates the total score by summing up the 
 * values of all dice with a value of three.
 * 
 * @author stagziria
 */
public class ThresScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the threes category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the threes category.
	 */
	public int calculScore(int[] dice) {

		return Arrays.stream(dice)
				.filter(die -> die == Constants.NUMBER_THREE_OF_DICE)
				.map(die -> Constants.NUMBER_THREE_OF_DICE)
				.sum();
	}
}
