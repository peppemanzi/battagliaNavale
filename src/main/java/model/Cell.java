/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package model;

import model.CellContent;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Cell.
 * 
 * @author giuseppe
 */
public class Cell {
	/**
	 * Description of the property content.
	 */
	public CellContent content = null;
	
	/**
	 * Description of the property isHit.
	 */
	public boolean isHit = false;
	
	// Start of user code (user defined attributes for Cell)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Cell() {
		// Start of user code constructor for Cell)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Cell)
	
	// End of user code
	/**
	 * Returns content.
	 * @return content 
	 */
	public CellContent getContent() {
		return this.content;
	}
	
	/**
	 * Sets a value to attribute content. 
	 * @param newContent 
	 */
	public void setContent(CellContent newContent) {
	    this.content = newContent;
	}

	/**
	 * Returns isHit.
	 * @return isHit 
	 */
	public boolean getIsHit() {
		return this.isHit;
	}
	
	/**
	 * Sets a value to attribute isHit. 
	 * @param newIsHit 
	 */
	public void setIsHit(boolean newIsHit) {
	    this.isHit = newIsHit;
	}



}
