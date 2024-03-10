package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It checks if there are at least three dice with the same 
 * value and calculates the score accordingly.
 * 
 * @author stagziria
 */
public class ThreeKindScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the three of a kind category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the three of a kind category.
	 */
	public int calculScore(int[] dice) {

		// Count occurrences of each dice value
		int[] diceOccurrences = CalculScoreUtils.countOccurrences(dice);

		// Check for three of a kind
	    return CalculScoreUtils.checkDiceOfKind(diceOccurrences, Constants.THREE_OCCURRENCES);
	}

}
