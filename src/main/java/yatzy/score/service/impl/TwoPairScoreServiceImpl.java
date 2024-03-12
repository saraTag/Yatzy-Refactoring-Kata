package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService} 
 * It calculates the total score by summing up the values of 
 * the two pairs.
 * 
 * @author stagziria
 */
public class TwoPairScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the two pairs category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the two pairs category.
	 */
	public int calculScore(int[] dice) {

		// Count occurrences of each dice value
		int[] diceOccurrences = CalculScoreUtils.countOccurrences(dice);
        
		// Find dice with 2 occurrences from the right side of the diceOccurrences array
		int[] diceArray = CalculScoreUtils.getDiceWithPairsOccurrences(diceOccurrences, 
				Constants.NUMBER_OF_TWO_PAIR);
		
		// If diceArray contains 2 dice pair
		if(diceArray.length == Constants.TWO_OCCURRENCES)
		{
			return (diceArray[0] + diceArray[1]) * Constants.TWO_OCCURRENCES ;
		}
		else
		{
			return Constants.YATZY_SCORE_0;
		}
	}
}
