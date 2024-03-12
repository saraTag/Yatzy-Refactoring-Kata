package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.service.ScoreObserverStrategyService;

/**
 * Implementation of {@link ScoreObserverStrategyService.java} 
 * 
 * This implementation sums up all the dice values.
 * 
 * @author stagziria
 */
public class ChanceScoreServiceImpl implements ScoreObserverStrategyService {

	/**
	 * @see yatzy.score.service.ScoreObserverStrategyService#updateScore(int[])
	 */
	@Override
	public int updateScore(int[] dice) {
		
		return calculateScore(dice);
	}

	/**
	 * Calculates the score based on the sum of all dice values.
	 * 
	 * @param dice An array containing the values of the dice.
	 * @return The calculated score based on the sum of dice values.
	 */
	public int calculateScore(int[] dice) {
		
		// Summing up all the dice values
		return Arrays.stream(dice).sum();
	}
}
