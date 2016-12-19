package cellularmodel;

import agents.Direction;
import agents.Vehicle;

public class TrafficCell extends Cell {

	private Cell nextCell;

	private Cell previousCell;

	public TrafficCell() {
		// TODO Auto-generated constructor stub
	}

	// Getter Setter
	public Cell getNextCell() {
		return nextCell;
	}

	public void setNextCell(TrafficCell nextCell) {
		this.nextCell = nextCell;
	}

	public Cell getPreviousCell() {
		return previousCell;
	}

	public void setPreviousCell(TrafficCell previousCell) {
		this.previousCell = previousCell;
	}

	protected void flip() {
		Cell temp = nextCell;
		nextCell = previousCell;
		previousCell = temp;
	}

	// methods
	public void AddCO2Emission(double emission) {
		co2Emission += emission;
	}
}
