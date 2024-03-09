package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It checks if there are five dice with the same value and 
 * returns 50 if so, otherwise returns 0.
 * 
 * @author stagziria
 */
public class YatziScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the Yatzi category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the Yatzi category.
	 */
	public int calculScore(int[] dice) {

		// Count occurrences of each dice value
		int[] counts = new int[6];
		Arrays.stream(dice)
		.forEach(die -> counts[die-1]++);

		// Check if any value has occurred 5 times
		if (Arrays.stream(counts)
				.anyMatch(count -> count == 5)) 
		{
			return 50; // Yatzy! Return 50
		} else 
		{
			return 0; // Not a Yatzy. Return 0
		}
	}
}
