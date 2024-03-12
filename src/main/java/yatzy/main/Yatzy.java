package yatzy.main;

import yatzy.score.service.ScoreObserverStrategyService;

/**
 * {@link Yatzy.java}
 * This class represents a Yatzy game instance.
 * It keeps track of the dice values and notifies
 * a score observer service to update score by calculating according to
 * different strategies.
 * 
 * @author stagziria
 */
public class Yatzy {

    /** Array to store dice values **/
	private int[] dice; 
	
	/** Observer service to notify for calculing score **/
    private ScoreObserverStrategyService scoreObserver; 

    /** Singleton instance **/
    private static Yatzy instance;

    /**
     * Private constructor to prevent direct instantiation
     * @param dice The array containing the dice values.
     */
    private Yatzy(int... dice) {
    	
        this.dice = dice;
        this.scoreObserver = null;
    }

    /**
     * Singleton getInstance method to ensure only one instance exists
     * @param dice The array containing the dice values.
     * @return The singleton instance of Yatzy
     */
    public static Yatzy getInstance(int... dice) {
        
    	if (instance == null) 
    	{
            instance = new Yatzy(dice);
        }
        
    	instance.setDice(dice);
        
        return instance;
    }

    /**
     * Setter for the score observer service
     * @param scoreObserver The score observer service to be set
     */
    public void setScoreObserver(ScoreObserverStrategyService scoreObserver) {
        
    	this.scoreObserver = scoreObserver;
        notifyScoreObserver(); 
    }

    /**
     * Method to notify the score observer service.
     */
    public void notifyScoreObserver() {
        
    	if (scoreObserver != null) 
    	{
            scoreObserver.updateScore(dice);
        }
    }

    /**
     * Getter for dice values.
     * @return The array containing the dice values.
     */
    public int[] getDice() {
        return dice;
    }

    /**
     * Setter for dice values
     * @param dice The array containing the dice values.
     */
    public void setDice(int[] dice) {
        this.dice = dice;
    }
}