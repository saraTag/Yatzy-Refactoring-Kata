package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService} 
 * It checks if there are five dice with the same value and 
 * returns 50 if so, otherwise returns 0.
 * 
 * @author stagziria
 */
public class YatziScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the Yatzi category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the Yatzi category.
	 */
	public int calculScore(int[] dice) {

		// Count occurrences of each dice value
		int[] diceOccurences = CalculScoreUtils.countOccurrences(dice);

		// Check if any die has occurred 5 times
		boolean FiveOccurrence = Arrays.stream(diceOccurences)
				.anyMatch(count -> count == 5);
		
		if (FiveOccurrence) 
		{
			return Constants.YATZY_SCORE_50;
		} 
		else 
		{
			return Constants.YATZY_SCORE_0;
		}	
	}
}
