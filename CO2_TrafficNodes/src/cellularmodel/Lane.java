package cellularmodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lane {
		
	private List<Cell> cells = new ArrayList<Cell>();
	
	public List<Cell> getCells() {
		return cells;
	}

	public Lane(int numberOfCells, int invert) {
		createCells(numberOfCells);
		
		if(invert == 0){
			this.reverse();
		}
	}

	public Cell getHead() {
		return cells.get(0);
	}
	
	public Cell getTail() {
		return cells.get(cells.size()-1);
	}
	
	
	private void createCells(int numberOfCells) {
		if(cells.isEmpty()){
			cells.add(new Cell());				
		}
		
		for(int i = 1; i < numberOfCells; i++){
			System.out.println("new Cell: " + i);
			
			Cell newCell = new Cell();
			newCell.setPreviousCell(cells.get(i-1));
			cells.add(newCell);
			cells.get(i-1).setNextCell(newCell);
		}
		System.out.println("# of cells: " + cells.size());
	}
	
	public void  reverse() {
		Collections.reverse(this.cells);
		for(Cell cell : cells){
			if(cell.getClass() == Cell.class){
				((Cell)cell).flip();
			}
			
		}
	}
	
	
	@Override
	public String toString() {
		String s = "0";
		
		for(Cell cell : cells){
			s += cell.toString();
		}
		return s;
	}
	
}
