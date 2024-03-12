package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService} 
 * It calculates the score by checking if there are four dice with the same value 
 * and returns the sum of those four dice.
 * 
 * @author stagziria
 */
public class FourKindScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
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

		// Find die with more then four occurrences
		Integer dieValue = CalculScoreUtils.findDiceOccurrence(diceOccurrences, 
				Constants.FOUR_OCCURRENCES, Constants.MORE_THEN_OCCURRENCES_OPERATOR);
		
		 // Calculates the score based on the occurrence of die value
		if(dieValue != null)
		{
			return dieValue * Constants.FOUR_OCCURRENCES;
		}
		else
		{
			return Constants.YATZY_SCORE_0;
		}
	}
	
}
