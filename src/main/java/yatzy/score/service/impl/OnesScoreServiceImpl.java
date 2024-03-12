package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService} 
 * It counts the occurrences of the number one in the dice values.
 * 
 * @author stagziria
 */
public class OnesScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		// Count the occurrences of 1 dice
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_ONE);
	}
}
