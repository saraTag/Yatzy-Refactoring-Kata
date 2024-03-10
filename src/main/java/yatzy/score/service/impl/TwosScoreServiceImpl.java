package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService}
 * It calculates the total score by summing up the values of the twos.
 * 
 * @author stagziria
 */
public class TwosScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the twos category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the twos category.
	 */
	public int calculScore(int[] dice) {

		// Count the occurrences of 2 dice
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_TWO);
	}
}
