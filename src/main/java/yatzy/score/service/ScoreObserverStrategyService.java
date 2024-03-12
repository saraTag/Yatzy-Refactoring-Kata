package yatzy.score.service;

/**
 * {@link ScoreObserverStrategyService} service defines the contract for classes
 * implementing the score observer and strategy service in Yatzy game.
 * 
 * This interface provides a method to update the score according to different scoring 
 * rules based on the dice values.
 * 
 * @author stagziria
 */
public interface ScoreObserverStrategyService {
	
	/**
     * Updates the score based on the provided dice values.
     * 
     * @param dice An array containing the values of the dice.
     * @return The updated score.
     */
	public int updateScore(int[] dice);
}
