package yatzy.score.service.impl;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the score based on whether the dice values form a large straight.
 * 
 * @author stagziria
 */
public class LargeStraightScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the large straight category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the large straight category.
	 */
	public int calculScore(int[] dice) {

		int[] tallies = new int[6];
		for (int die : dice) {
			tallies[die - 1]++;
		}

		boolean isLargeStraight = java.util.stream.Stream.iterate(1, i -> i + 1).limit(5)
				.allMatch(i -> tallies[i] == 1);

		return isLargeStraight ? 20 : 0;
	}

}
