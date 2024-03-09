package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the total score by summing up the values of the two pairs.
 * 
 * @author stagziria
 */
public class TwoPairScoreServiceImpl implements ScoreObserverService {

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

		int[] counts = new int[6];

		for (int i = 0; i < dice.length; i++) {
			counts[dice[i] - 1]++;
		}

		int n = (int) Arrays.stream(counts)
				.filter(count -> count >= 2)
				.count();

		int score = Arrays.stream(counts)
				.filter(count -> count >= 2)
				.map(count -> 6 - count)
				.limit(2)
				.sum();

		return n == 2 ? score * 2 : 0;
	}

}
