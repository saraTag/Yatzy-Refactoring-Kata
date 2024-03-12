package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService}
 * It counts the occurrences of each dice value and calculates the score for the pair category.
 * 
 * @author stagziria
 */
public class PairScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the pair category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the pair category.
	 */
	public int calculScore(int[] dice) {

	    // Count occurrences of each dice value
		int[] diceOccurrences = CalculScoreUtils.countOccurrences(dice);

		// Find dice with 2 occurrences from the right side of the diceOccurrences array
		int[] diceArray = CalculScoreUtils.getDiceWithPairsOccurrences(diceOccurrences, 
				Constants.NUMBER_OF_ONE_PAIR);
		
		if(diceArray.length != 0)
		{
			// The dice with the highest value are in the the first index of diceArray
			return diceArray[0] * Constants.TWO_OCCURRENCES;
		}
		
		return Constants.YATZY_SCORE_0;
	}

}
