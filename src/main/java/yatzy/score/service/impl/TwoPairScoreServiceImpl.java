package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the total score by summing up the values of 
 * the two pairs.
 * 
 * @author stagziria
 */
public class TwoPairScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
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
        
		// Find the indices of the two largest values in the diceOccurences array
		int[] diceArray = CalculScoreUtils.getDiceWithPairsOccurrences(diceOccurrences, 
				Constants.NUMBER_OF_TWO_PAIR);
		
		// If lastIndex contains exactly two indices, return the sum of the indices plus 2, 
		//multiplied by 2, otherwise return 0
		return diceArray.length == Constants.NUMBER_OF_TWO_PAIR  ? (diceArray[0] + 
				diceArray[1]) * Constants.NUMBER_OF_TWO_PAIR : Constants.YATZY_SCORE_0;
	}

	

}
