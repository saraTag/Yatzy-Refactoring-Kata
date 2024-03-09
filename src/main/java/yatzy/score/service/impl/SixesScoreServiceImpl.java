package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It counts the occurrences of sixes in the dice values 
 * and calculates the score for the sixes category.
 * 
 * @author stagziria
 */
public class SixesScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the sixes category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the sixes category.
	 */
	public int calculScore(int[] dice) {

		return Arrays.stream(dice)
				.filter(die -> die == Constants.NUMBER_SIX_OF_DICE)
				.map(die -> Constants.NUMBER_SIX_OF_DICE)
				.sum();
	}

}
