package mesh;

public class Board {
	private int mRows;
	private int mCols;

	public Board(int rows, int cols) {
		mRows = rows;
		mCols = cols;
	}

	public void setRows(int rows) {
		mRows = rows;
	}

	public int getRows() {
		return mRows;
	}

	public void setCols(int cols) {
		mCols = cols;
	}

	public int getCols() {
		return mCols;
	}
}
