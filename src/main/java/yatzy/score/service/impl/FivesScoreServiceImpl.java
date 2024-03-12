package yatzy.score.service.impl;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService.java}.
 * It calculates the score by summing up all the dice values that are equal to five.
 * 
 * @author stagziria
 */
public class FivesScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {
		
		return calculScore(dice);
	}
	
	 /**
     * Calculates the score for the fives category.
     * 
     * @param dice An array containing the dice values.
     * @return The total score for the fives category.
     */
	public int calculScore(int[] dice) {

		// Sum dice with value 5
		return CalculScoreUtils.sumDiceValues(dice, Constants.DICE_SIDE_FIVE);

	}

}
