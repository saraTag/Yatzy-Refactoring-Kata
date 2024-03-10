package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the score based on whether the dice values form a large straight.
 * 
 * @author stagziria
 */
public class LargeStraightScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the large straight category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the large straight category.
	 */
	public int calculScore(int[] dice) {

		int[] diceOccurences = CalculScoreUtils.countOccurrences(dice);

	    // Checking if all dice occurences was 1
		boolean isLargeStraight = CalculScoreUtils.isOneValueForOccurrences(diceOccurences, 
				Constants.INDEX_START_TO_ONE, Constants.INDEX_END_TO_FIVE);

		return isLargeStraight ? Constants.YATZY_SCORE_20 : Constants.YATZY_SCORE_0;
	}

	

}
