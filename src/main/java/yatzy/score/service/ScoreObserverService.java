package yatzy.score.service;

/**
 * {@link ScoreObserverService} service defines the contract for classes
 * implementing the score observer strategy in Yatzy game.
 * 
 * This interface provides a method to update the score based on the dice values.
 * 
 * @author stagziria
 */
public interface ScoreObserverService {
	
	/**
     * Updates the score based on the provided dice values.
     * 
     * @param dice An array containing the values of the dice.
     * @return The updated score.
     */
	public int updateScore(int[] dice);
}
