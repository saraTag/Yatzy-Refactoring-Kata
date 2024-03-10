package yatzy.score.commun.score.utils;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * {@link CalculScoreUtils.java} 
 * Class that contains utility methods for calculating the score
 * @author stagziria
 *
 */
public class CalculScoreUtils {


	/**
	 * Counts the occurrences of each dice value in the given array.
	 *
	 * @param dice An array containing the dice values.
	 * @return An array representing the occurrences of each dice value.
	 */
	public static int[] countOccurrences(int[] dice) {

		int[] diceOccurrences = new int[Constants.DICE_NUMBER_SIDES];

		// Count occurrences of each dice value
		Arrays.stream(dice).forEach(die -> {

			diceOccurrences[die - 1]++;
		});

		return diceOccurrences;
	}


	/**
	 * Sums the values of dice that are equal to a specific constant.
	 *
	 * @param dice the array of dice values
	 * @return the sum of dice values equal to the constant
	 */
	public static int sumDiceValues(int[] dice, int dieValue) {

		return Arrays.stream(dice)
				.filter(die -> die == dieValue)
				.sum();
	}

	/**
	 * Checks if there are dice of a particular occurrence and calculates the score accordingly.
	 * 
	 * @param diceOccurrences an array representing the occurrences of each dice value
	 * @param occurrence the desired occurrence of a dice value to check
	 * @return the calculated score based on the occurrence of dice values, or 0 if no occurrence is found
	 */
	public static int checkDiceOfKind(int[] diceOccurrences, int occurrence) {

	    //Filter dice values by occurrence.
		OptionalInt score = IntStream.range(Constants.DICE_START_INDEX , Constants.DICE_END_INDEX)
				.filter(dieValueMinusOne -> diceOccurrences[dieValueMinusOne] >= occurrence)
				.findFirst();

        // If a score is present, calculates the score based on the occurrence of dice values
		if(score.isPresent())
		{
			return (score.getAsInt() + 1) * occurrence;
		}
		else
		{
			return Constants.YATZY_SCORE_0;
		}
	}

	/**
	 * Checks if all occurrences of dice values within a specified range are equal to 1.
	 *
	 * @param diceOccurrences an array representing the occurrences of dice values
	 * @param startIndex the starting index of the range to check (inclusive)
	 * @param lastIndex the ending index of the range to check (inclusive)
	 * @return true if all occurrences within the specified range are 1, otherwise false
	 */
	public static boolean isOneValueForOccurrences(int[] diceOccurences, int startIndex, int lastIndex) {

		//Checks if all occurrences of dice values within the specified range,
		//starting from startIndex to lastIndex are equal to 1.
		return IntStream.rangeClosed(startIndex, lastIndex)
				.allMatch(dieMinusUnValue -> diceOccurences[dieMinusUnValue] == Constants.ONE_OCCURRENCE);
	}

	/**
	 * Retrieves the indices of dice values with pairs occurrences.
	 *
	 * @param diceOccurrences an array representing the occurrences of dice values
	 * @param pairsNumber the number of pairs to retrieve
	 * @return an array containing the indices of dice values with pairs occurrences
	 */
	public static int[] getDiceWithPairsOccurrences(int[] diceOccurrences, int pairsNumber) {

		// Get dice array with 2 or more occurrences
		int[] diceMinusOneArray = IntStream.range(0, diceOccurrences.length)
				.map(index -> diceOccurrences.length - 1 - index) 
				.filter(index -> diceOccurrences[index] >= Constants.TWO_OCCURRENCES) 
				.limit(pairsNumber)
				.toArray();

		return getDiceValues(diceMinusOneArray, new int[diceMinusOneArray.length]);

	}


	/**
	 * Increments each element of the input array by 1 and returns the reel dice value.
	 *
	 * @param diceMinusOneArray the indice value minus 1
	 * @param diceArray the array to store the reel dice value
	 * @return the modified array containing the incremented values
	 */
	private static int[] getDiceValues(int[] diceMinusOneArray, int[] diceArray) {

		diceArray = Arrays.stream(diceMinusOneArray)
				.map(dice -> dice + 1)
				.toArray();

		return diceArray;
	}

}    
