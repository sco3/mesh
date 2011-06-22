package mesh;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	private int mRow;
	private int mCol;
	private List<Cell> mAffected;
	private int mMineNumber;
	private int mPresumable;
	private String mLabel;
	private CellStatus mStatus;

	public Cell(int row, int col) {
		mRow = row;
		mCol = col;
		mAffected = new ArrayList<Cell>(8);
	}

	public void incNumm() {
		mPresumable++;
	}

	public void decNumm() {
		mPresumable--;
	}

	public Cell() {
		this(0, 0);
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

	public void setAffected(List<Cell> adjacent) {
		this.mAffected = adjacent;
	}

	public List<Cell> getAffected() {
		return mAffected;
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

	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && (obj instanceof Cell)) {
			Cell other = (Cell) obj;
			if (other.getRow() == mRow && other.getCol() == mCol) {
				result = true;
			}
		}
		return result;
	}

	public String toString() {
		return "(" + mRow + "," + mCol + ")";
	}

	public int hashCode() {
		return mRow << 15 + mCol;
	}

	public void setStatus(CellStatus status) {
		mStatus = status;
	}

	public CellStatus getStatus() {
		return mStatus;
	}

	public void setPresumable(int presumable) {
		mPresumable = presumable;
	}

	public int getPresumable() {
		return mPresumable;
	}
}
