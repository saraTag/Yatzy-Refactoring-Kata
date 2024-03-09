package yatzy.score.service.impl;

import java.util.stream.IntStream;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@linkScoreObserverService} 
 * It calculates the score based on whether the dice values form a full house.
 * 
 * @author stagziria
 */
public class FullHouseScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the full house category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the full house category.
	 */
	public int calculScore(int[] dice) {

		int[] tallies = new int[6];
		for (int die : dice) {
			tallies[die - 1]++;
		}

		boolean hasTwo = IntStream.range(0, 6).anyMatch(i -> tallies[i] == 2);
		boolean hasThree = IntStream.range(0, 6).anyMatch(i -> tallies[i] == 3);

		if (hasTwo && hasThree) {
			int _2_at = IntStream.range(0, 6).filter(i -> tallies[i] == 2).findFirst().orElse(-1) + 1;
			int _3_at = IntStream.range(0, 6).filter(i -> tallies[i] == 3).findFirst().orElse(-1) + 1;
			return _2_at * 2 + _3_at * 3;
		} else {
			return 0;
		}
	}
}
