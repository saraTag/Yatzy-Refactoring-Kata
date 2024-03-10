package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService.java} 
 * 
 * This implementation sums up all the dice values.
 * 
 * @author stagziria
 */
public class ChanceScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
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
		
		// Summing up all the dice values using Java Streams API
		return Arrays.stream(dice).sum();
	}
}
