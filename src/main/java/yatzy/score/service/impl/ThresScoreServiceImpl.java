package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
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

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
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

		// Count the occurrences of 3 dice
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_THREE);
	}
}
