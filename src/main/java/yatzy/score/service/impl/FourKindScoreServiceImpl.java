package yatzy.score.service.impl;

import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the score by checking if there are four dice with the same value and returns the sum of those four dice.
 * 
 * @author stagziria
 */
public class FourKindScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {
		
		return calculScore(dice);
	}
	
	 /**
     * Calculates the score for the four of a kind category.
     * 
     * @param dice An array containing the dice values.
     * @return The total score for the four of a kind category.
     */
	public int calculScore(int[] dice) {

		int[] tallies = new int[6];
		for (int die : dice) {
			tallies[die - 1]++;
		}
		for (int i = 0; i < 6; i++) {
			if (tallies[i] >= 4) {
				return (i + 1) * 4;
			}
		}
		return 0;
	}

}
