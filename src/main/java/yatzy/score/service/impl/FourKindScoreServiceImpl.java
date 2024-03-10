package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the score by checking if there are four dice with the same value 
 * and returns the sum of those four dice.
 * 
 * @author stagziria
 */
public class FourKindScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the four of a kind category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the four of a kind category.
	 */
	public int calculScore(int[] dice) {

		// Count occurrences of each dice value
		int[] diceOccurrences = CalculScoreUtils.countOccurrences(dice);

		// Check for four of a kind
		return CalculScoreUtils.checkDiceOfKind(diceOccurrences, Constants.FOUR_OCCURRENCES);
	}

	
}
