package yatzy.score.service.impl;

import java.util.Arrays;

import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It calculates the score by summing up all the dice with the value four.
 * 
 * @author stagziria
 */
public class FoursScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return calculScore(dice);
	}

	/**
	 * Calculates the score for the fours category.
	 * 
	 * @param dice An array containing the dice values.
	 * @return The total score for the fours category.
	 */
	public int calculScore(int[] dice) {

		return Arrays.stream(dice)
				.filter(face -> face == Constants.NUMBER_FOUR_OF_DICE)
				.map(face -> Constants.NUMBER_FOUR_OF_DICE)
				.sum();
	}
}
