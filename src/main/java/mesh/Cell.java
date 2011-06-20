package mesh;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	private int row;
	private int col;
	private List<Cell> adjacent;
	private int numm;
	private String label;
	
	public Cell () {
		adjacent = new ArrayList<Cell>(8);
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getRow() {
		return row;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getCol() {
		return col;
	}
	public void setAdjacent(List<Cell> adjacent) {
		this.adjacent = adjacent;
	}
	public List<Cell> getAdjacent() {
		return adjacent;
	}
	public void setNumm(int numm) {
		this.numm = numm;
	}
	public int getNumm() {
		return numm;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLabel() {
		return label;
	}
}
