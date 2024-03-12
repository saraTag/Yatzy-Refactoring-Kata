package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService}
 * It calculates the total score by summing up the 
 * values of all dice with a value of three.
 * 
 * @author stagziria
 */
public class ThresScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
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

		// Sum dice with value 3
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_THREE);
	}
}
