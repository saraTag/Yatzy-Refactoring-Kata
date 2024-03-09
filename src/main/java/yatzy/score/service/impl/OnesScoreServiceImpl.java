package yatzy.score.service.impl;

import java.util.Arrays;
import java.util.stream.Stream;

import yatzy.score.commun.score.utils.Constants;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@link ScoreObserverService} 
 * It counts the occurrences of the number one in the dice values.
 * 
 * @author stagziria
 */
public class OnesScoreServiceImpl implements ScoreObserverService {

	@Override
	public int updateScore(int[] dice) {

		return (int) Stream.of(dice)
				.flatMapToInt(Arrays::stream)
				.filter(die -> die == Constants.NUMBER_ONE_OF_DICE)
				.count();
	}
}
