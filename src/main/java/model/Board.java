/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package model;

import model.Cell;
/**
 * Description of Board.
 * 
 * @author Giuseppe
 */
public class Board {
	/**
	 * Description of the property cells[][].
	 */
	private Cell cells[][] = null;

	/**
	 * The constructor.
	 */
	public Board() {
		// Start of user code constructor for Board)
		super();
		// End of user code
	}

	/**
	 * Returns cells[][].
	 * @return cells[][] 
	 */
	public Cell getCell(int row, int col) {
		return this.cells[row][col];
	}
	
	/**
	 * Sets a value to attribute cells[][]. 
	 * @param newCells[][] 
	 */
	public void setCells(Cell newCell, int row, int col) {
	    this.cells[row][col] = newCell;
	}



}
