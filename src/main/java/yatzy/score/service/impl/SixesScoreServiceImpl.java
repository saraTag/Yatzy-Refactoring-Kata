package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService} 
 * It counts the occurrences of sixes in the dice values 
 * and calculates the score for the sixes category.
 * 
 * @author stagziria
 */
public class SixesScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
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

		// Sum dice with value 6
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_SIX);
	}

}
