package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@linkScoreObserverService} 
 * It calculates the score based on whether the dice values form a full house.
 * 
 * @author stagziria
 */
public class FullHouseScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the full house category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the full house category.
	 */
	public int calculScore(int[] dice) {

		// Count occurrences of each dice value
		int[] diceOccurrences = CalculScoreUtils.countOccurrences(dice);

		// Find the first die with exactly two occurrences
		Integer dieWithTwoOccurrences = CalculScoreUtils.findDiceOccurrence(diceOccurrences, 
				Constants.TWO_OCCURRENCES, Constants.EQUAL_OCCURRENCES_OPERATOR);

		// Find the first die with exactly three occurrences
		Integer dieWithThreeOccurrences = CalculScoreUtils.findDiceOccurrence(diceOccurrences, 
				Constants.THREE_OCCURRENCES, Constants.EQUAL_OCCURRENCES_OPERATOR);

		if(dieWithTwoOccurrences != null && dieWithThreeOccurrences != null)
		{
			return dieWithTwoOccurrences * Constants.TWO_OCCURRENCES + 
					dieWithThreeOccurrences * Constants.THREE_OCCURRENCES;
		}
		else
		{
			return Constants.YATZY_SCORE_0;
		}

	}

}
