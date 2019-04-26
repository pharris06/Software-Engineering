/**
 * 
 */
package technopoly;
/**
 * @author matthew
 *
 */
public class PlayerClass {
	
	/**
	 * player name variable of type String
	 */
	private String playerName;
	
	/**
	 * default constructor
	 */
	public PlayerClass() {
		
	}
	
	/**
	 * constructor with arguments for playerName type String
	 * @param playerName
	 */
	public PlayerClass(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * gets playerName
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * sets playerName
	 * playerName cannot be null
	 * playerName must be at least 1 character
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) throws IllegalArgumentException {
		if((playerName == null) || (playerName.trim().length()==0)) {
			throw new IllegalArgumentException("playerName cannot be null and must be atleast one character");
		} else {
			this.playerName = playerName;
		}
	}
	
	
}
