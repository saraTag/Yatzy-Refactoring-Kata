package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService}
 * It counts the occurrences of each dice value and calculates the score for the pair category.
 * 
 * @author stagziria
 */
public class PairScoreServiceImpl implements ScoreObserverService {

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

		int[] counts = new int[6];
		for (int i = 0; i < dice.length; i++) {
			counts[dice[i] - 1]++;
		}

		return Arrays.stream(counts)
				.mapToObj(count -> count >= 2 ? count : 0)
				.filter(count -> count != 0)
				.map(count -> (6 - count) * 2)
				.findFirst()
				.orElse(0);
	}

}
