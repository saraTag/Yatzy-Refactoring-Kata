package yatzy.score.commun.score.utils;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * {@link CalculScoreUtils.java} 
 * Class that contains utility methods for calculating the score.
 * @author stagziria
 *
 */
public final class CalculScoreUtils {


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
	 * Finds the occurrence of a given value in an array of dice occurrences based on the specified operator.
	 *
	 * @param diceOccurrences An array representing the occurrences of each dice value.
	 * @param occurrence The target occurrence value to search for.
	 * @param operator The operator specifying the condition for occurrence comparison.
	 * @return The index of the first occurrence matching the condition, plus one, or null if not found.
	 */
	public static Integer findDiceOccurrence(int[] diceOccurrences, int occurrence, String operator) 
	{
		OptionalInt dievalueMinusOne = switch (operator) {

		case Constants.EQUAL_OCCURRENCES_OPERATOR -> IntStream.range(Constants.INDEX_START_TO_ZERO
				, Constants.INDEX_END_TO_SIX)
		.filter(dieValueMinusOne -> diceOccurrences[dieValueMinusOne] == occurrence)
		.findFirst();

		case Constants.MORE_THEN_OCCURRENCES_OPERATOR -> IntStream.range(Constants.INDEX_START_TO_ZERO
				, Constants.INDEX_END_TO_SIX)
		.filter(dieValueMinusOne -> diceOccurrences[dieValueMinusOne] >= occurrence)
		.findFirst();

		default -> OptionalInt.empty(); 
		};

		if(dievalueMinusOne.isPresent())
		{
			return (dievalueMinusOne.getAsInt() + 1);
		}

		return null;
	}

	/**
	 * Checks if all occurrences of dice values within a specified range are equal to 1.
	 *
	 * @param diceOccurrences an array representing the occurrences of dice values
	 * @param startIndexOfOccurrences the starting index of the range to check.
	 * @param lastIndex the ending index of the range to check.
	 * @return true if all occurrences within the specified range are 1, otherwise false
	 */
	public static boolean isOneValueForOccurrences(int[] diceOccurences, int startIndexOfOccurrences, 
			int lastIndexOfOccurrences) {

		//Checks if all occurrences of dice values within the specified range,
		//starting from startIndex to lastIndex are equal to 1.
		return IntStream.rangeClosed(startIndexOfOccurrences, lastIndexOfOccurrences)
				.allMatch(dieMinusUnValue -> diceOccurences[dieMinusUnValue] == Constants.ONE_OCCURRENCE);
	}

	/**
	 * Retrieves the indices of dice values with pairs occurrences.
	 *
	 * @param diceOccurrences an array representing the occurrences of dice values
	 * @param pairsCount the count of dice pair to retrieve
	 * @return an array containing the indices of dice values with pairs occurrences
	 */
	public static int[] getDiceWithPairsOccurrences(int[] diceOccurrences, int pairsCount) {

		// Get dice array with 2 or more occurrences
		int[] diceMinusOneArray = IntStream.range(0, diceOccurrences.length)
				.map(dieValueMinusOne -> diceOccurrences.length - 1 - dieValueMinusOne) 
				.filter(dieValueMinusOne -> diceOccurrences[dieValueMinusOne] >= Constants.TWO_OCCURRENCES) 
				.limit(pairsCount)
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
