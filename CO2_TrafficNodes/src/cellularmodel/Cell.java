package cellularmodel;

import agents.Vehicle;

public class Cell {

	// parameter
	private double size = Constants.cellSize;	
	private Vehicle vehicle;
	private Cell nextCell;
	private Cell previousCell;
	
	protected double co2Emission = 0;

	// getter
	public Cell getNextCell() {
		return nextCell;
	}

	public Cell getPreviousCell() {
		return previousCell;
	}

	// setter

	public void setNextCell(Cell nextCell) {
		this.nextCell = nextCell;
	}

	public void setPreviousCell(Cell previousCell) {
		this.previousCell = previousCell;
	}

	protected void flip() {
		Cell temp = nextCell;
		nextCell = previousCell;
		previousCell = temp;
	}

}
