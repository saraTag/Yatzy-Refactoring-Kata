package yatzy.score.service.impl;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It checks if there are at least three dice with the same 
 * value and calculates the score accordingly.
 * 
 * @author stagziria
 */
public class ThreeKindScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the three of a kind category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the three of a kind category.
	 */
	public int calculScore(int[] dice) {

		int[] tallies = new int[6];
		for (int die : dice) {
			tallies[die - 1]++;
		}
		for (int i = 0; i < 6; i++) {
			if (tallies[i] >= 3) {
				return (i + 1) * 3;
			}
		}
		return 0;
	}

}
