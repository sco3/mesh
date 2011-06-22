package mesh;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	private int mRow;
	private int mCol;
	private List<Cell> mAdj;
	private int mMineNumber;
	private String mLabel;
	
	public Cell (int row, int col) {
		mRow = row;
		mCol = col;
		mAdj = new ArrayList<Cell>(8);
	}
	
	public Cell () {
		this(0,0);
	}
	public void setRow(int row) {
		this.mRow = row;
	}
	public int getRow() {
		return mRow;
	}
	public void setCol(int col) {
		this.mCol = col;
	}
	public int getCol() {
		return mCol;
	}
	public void setAdjacent(List<Cell> adjacent) {
		this.mAdj = adjacent;
	}
	public List<Cell> getAdjacent() {
		return mAdj;
	}
	public void setNumm(int numm) {
		this.mMineNumber = numm;
	}
	public int getNumm() {
		return mMineNumber;
	}
	public void setLabel(String label) {
		this.mLabel = label;
	}
	public String getLabel() {
		return mLabel;
	}
	
	public boolean equals (Object obj) {
		boolean result = false;
		if (obj != null && (obj instanceof Cell)) {
			Cell other = (Cell)obj;
			if (other.getRow() == mRow && other.getCol() == mCol) {
				result = true;
			}
		}
		return result;
	}
	
	public String toString () {
	   return "("+mRow+","+mCol+")";	
	}
	
	public int hashCode() {
		return 1000*mRow+mCol;
	}
}
