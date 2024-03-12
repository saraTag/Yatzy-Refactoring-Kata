package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService} 
 * It calculates the score by summing up all the dice with the value four.
 * 
 * @author stagziria
 */
public class FoursScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
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

		// Sum dice with value 4
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_FOUR);
	}
}
