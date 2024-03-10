package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the score by summing up all the dice with the value four.
 * 
 * @author stagziria
 */
public class FoursScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the fours category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the fours category.
	 */
	public int calculScore(int[] dice) {

		// Count the occurrences of 4 dice
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_FOUR);
	}
}
