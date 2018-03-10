/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package model;

/**
 * Description of Player.
 * 
 * @author giuseppe
 */
public class Player {
	/**
	 * Description of the property name.
	 */
	public String name = null;
	
	/**
	 * The constructor.
	 */
	public Player() {
		// Start of user code constructor for Player)
		super();
		// End of user code
	}
	
	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
	    this.name = newName;
	}



}
