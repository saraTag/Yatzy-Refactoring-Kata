package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It counts the occurrences of the number one in the dice values.
 * 
 * @author stagziria
 */
public class OnesScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		// Count the occurrences of 1 dice
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_ONE);
	}
}
