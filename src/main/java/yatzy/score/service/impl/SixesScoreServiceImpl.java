package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It counts the occurrences of sixes in the dice values 
 * and calculates the score for the sixes category.
 * 
 * @author stagziria
 */
public class SixesScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the sixes category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the sixes category.
	 */
	public int calculScore(int[] dice) {

		// Count the occurrences of 6 dice
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_SIX);
	}

}
