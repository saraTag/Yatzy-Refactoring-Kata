package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService}
 * It counts the occurrences of each dice value and calculates the score for the pair category.
 * 
 * @author stagziria
 */
public class PairScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
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
		int[] diceOccurences = CalculScoreUtils.countOccurrences(dice);

		// Find the index of the first value greater than or equal to 2 from the 
		// right side of the diceOccurrences array
		int[] diceArray = CalculScoreUtils.getDiceWithPairsOccurrences(diceOccurences, 
				Constants.NUMBER_OF_ONE_PAIR);
		
		if(diceArray.length != 0)
		{
			return diceArray[0] * 2;
		}
		
		return 0;
	}

}
