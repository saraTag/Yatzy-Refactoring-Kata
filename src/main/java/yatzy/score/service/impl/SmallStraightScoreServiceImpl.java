package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It checks if the dice values form a small straight and calculates the score accordingly.
 * 
 * @author stagziria
 */
public class SmallStraightScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the small straight category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the small straight category.
	 */
	public int calculScore(int[] dice) {

		// Count occurrences of each dice value
		int[] diceOccurences = CalculScoreUtils.countOccurrences(dice);

		// Checking if all dice occurences was 1
		boolean allOnes = CalculScoreUtils.isOneValueForOccurrences(diceOccurences, 
				Constants.INDEX_START_TO_ZERO, Constants.INDEX_END_TO_FOUR);

		return allOnes ? Constants.YATZY_SCORE_15 : Constants.YATZY_SCORE_0;

	}
}