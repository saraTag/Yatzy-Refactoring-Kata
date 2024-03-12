package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService} 
 * It checks if there are at least three dice with the same 
 * value and calculates the score accordingly.
 * 
 * @author stagziria
 */
public class ThreeKindScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
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

		// Find die with more then four occurrences
	    Integer dieValue = CalculScoreUtils.findDiceOccurrence(diceOccurrences, 
	    		Constants.THREE_OCCURRENCES, Constants.MORE_THEN_OCCURRENCES_OPERATOR);
	    
	    // Calculates the score based on the occurrence of of die value
		if(dieValue != null)
		{
			return dieValue * Constants.THREE_OCCURRENCES;
		}
		else
		{
			return Constants.YATZY_SCORE_0;
		}
	}

}
