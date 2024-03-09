package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It checks if the dice values form a small straight and calculates the score accordingly.
 * 
 * @author stagziria
 */
public class SmallStraightScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the small straight category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the small straight category.
	 */
	public int calculScore(int[] dice) {

		int[] tallies = new int[6];
		for (int die : dice) {
			tallies[die - 1]++;
		}
		if (Arrays.stream(tallies).allMatch(count -> count == 1)) {
			return 15;
		}
		return 0;
	}
}