package yatzy.score.service.impl;

import java.util.OptionalInt;
import java.util.stream.IntStream;

import yatzy.score.commun.score.utils.CalculScoreUtils;
import yatzy.score.service.ScoreObserverService;

/**
 * Implementation of {@linkScoreObserverService} 
 * It calculates the score based on whether the dice values form a full house.
 * 
 * @author stagziria
 */
public class FullHouseScoreServiceImpl implements ScoreObserverService {

	/**
	 * @see yatzy.score.service.ScoreObserverService#updateScore(int[])
	 */
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

		// Count occurrences of each dice value
		int[] diceOccurrences = CalculScoreUtils.countOccurrences(dice);

		// Find the index of the first value with exactly two occurrences
		OptionalInt twoOccurrencesIndex = IntStream.range(0, diceOccurrences.length)
				.filter(i -> diceOccurrences[i] == 2)
				.findFirst();

		// Find the index of the first value with exactly three occurrences
		OptionalInt threeOccurrencesIndex = IntStream.range(0, diceOccurrences.length)
				.filter(i -> diceOccurrences[i] == 3)
				.findFirst();

		if(twoOccurrencesIndex.isPresent() && threeOccurrencesIndex.isPresent())
		{
			return (twoOccurrencesIndex.getAsInt() + 1) * 2 + 
					(threeOccurrencesIndex.getAsInt() + 1) * 3;
		}
		else
		{
			return 0;
		}

	}
}
