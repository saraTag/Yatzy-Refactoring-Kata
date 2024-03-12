package yatzy.score.commun.score.utils;

/**
 * {@link Constants.java} 
 * Class contains constant values used in Yatzy game.
 * @author stagziria
 * 
 */
public final class Constants {

	//Dice faces
	/** Represents the face value of one on a dice **/
	public static final int DICE_SIDE_ONE = 1;
	/** Represents the face value of two on a dice **/
	public static final int DICE_SIDE_TWO = 2;
	/** Represents the face value of three on a dice **/
	public static final int DICE_SIDE_THREE = 3;
	/** Represents the face value of four on a dice **/
	public static final int DICE_SIDE_FOUR = 4;
	/** Represents the face value of five on a dice **/
	public static final int DICE_SIDE_FIVE = 5;
	/** Represents the face value of six on a dice **/
	public static final int DICE_SIDE_SIX = 6;
	/** Represents the total number of sides on a dice **/
	public static final int DICE_NUMBER_SIDES = 6;

	//Dice score 
	/** Represents a Yatzy score of 0 **/
	public static final int YATZY_SCORE_0 = 0;
	/** Represents a Yatzy score of 15 **/
	public static final int YATZY_SCORE_15 = 15;
	/** Represents a Yatzy score of 50 **/
	public static final int YATZY_SCORE_50 = 50;
	/** Represents a Yatzy score of 20 **/
	public static final int YATZY_SCORE_20 = 20;


	//Dice occurrences
	/** Represents a single occurrence**/
	public static final int ONE_OCCURRENCE = 1;
	/** Represents two occurrences **/
	public static final int TWO_OCCURRENCES = 2;
	/** Rerensents three occurences **/
	public static final int THREE_OCCURRENCES = 3;
	/** Rerensents four occurences **/
	public static final int FOUR_OCCURRENCES = 4;

	//Index
	/** Represents start index on 0 **/
	public static final int INDEX_START_TO_ZERO = 0;
	/** Represents start index on 1 **/
	public static final int INDEX_START_TO_ONE = 1;
	/** Represents end index on 5 **/
	public static final int INDEX_END_TO_FIVE = 5;
	/** Represents end index on 4 **/
	public static final int INDEX_END_TO_FOUR = 4;
	/** Represents end index on 6 **/
	public static final int INDEX_END_TO_SIX = 6;
	
	//Pair count
	/** Represents the number of 2 pairs **/
	public static final int NUMBER_OF_TWO_PAIR = 2;
	/** Represents single pair **/
	public static final int NUMBER_OF_ONE_PAIR = 1;
	
	//Operators
	/** Represents the  more then occurrences operator >= **/
	public static final String MORE_THEN_OCCURRENCES_OPERATOR = ">=";
	/** Represents the equal occurrences operator = **/
	public static final String EQUAL_OCCURRENCES_OPERATOR = "=";
	
	/** Constructor **/
	private Constants() {
		// constructor
	}
	
}
