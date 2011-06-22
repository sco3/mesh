package mesh;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Accomodator {
	private static final String LABELS = "abcdefghijk";
	private static final String EMPTY = "_";

	private int mPlaces;
	private int mMinesLow;
	private int mMinesHigh;
	private int mMnNumber;
	public long[] mStats;
	public long mAccomNumber;
	private String[] mMtrx;
	private Board mBoard;
	private List<Cell> mOpenCells;

	public Accomodator(List<Cell> cells, Board board, int mnNumber) {
		mOpenCells = cells;
		mMnNumber = mnNumber;
		mBoard = board;
		reset();
	}

	@SuppressWarnings("unchecked")
	public void reset() {
		mAccomNumber = 0;

		mMinesHigh = 0;
		mMinesLow = Integer.MIN_VALUE;
		for (Cell cell : mOpenCells) {
			mMinesHigh += cell.getNumm();
			if (mMinesLow < cell.getNumm()) {
				mMinesLow = cell.getNumm();
			}
		}

		if (mMinesHigh > mMnNumber) {
			mMinesHigh = mMnNumber;
		}

		for (int i = 0; i < mPlaces; i++) {
			mMtrx[i] = EMPTY;
			mStats[i] = 0;
		}

		Set<Cell> candidates = new HashSet<Cell>();
		for (int row = 0; row < mBoard.getRows(); row++) {
			for (int col = 0; col < mBoard.getCols(); col++) {
				boolean open = false;
				for (Cell cell : mOpenCells) {
					if (cell.getRow() == row && cell.getCol() == col) {
						open = true;
						break;
					}
				}
				if (!open) {
					for (Cell cell : mOpenCells) {
						int dr = Math.abs(cell.getRow() - row);
						int dc = Math.abs(cell.getCol() - col);
						if (dr <= 1 && dc <=1) {
							candidates.add(new Cell(row, col));	
						}
					}
				}

			}
		}
		mPlaces = candidates.size();
		mStats = new long[mPlaces];
		mMtrx = new String[mPlaces];

	}

	public void incrementStat() {
		mAccomNumber++;
		for (int i = 0; i < mMtrx.length; i++) {
			if (!EMPTY.equals(mMtrx[i])) {
				mStats[i]++;
			}
		}
	}

	public void printStat() {
		System.out.println("Accomodations number: " + mAccomNumber);

		for (int i = 0; i < mPlaces; i++) {
			System.out.print(mStats[i] + " ");
		}
		System.out.println();
	}

	public void accomodate() {
		for (mMnNumber = mMinesLow; mMnNumber <= mMinesHigh; mMnNumber++) {
			recAccomodate(0, 0);
		}
	}

	public void recAccomodate(int pos, int level) {
		for (int i = pos; i < mPlaces - mMnNumber + 1 + level; i++) {
			mMtrx[i] = LABELS.substring(level, level + 1);
			if (mMnNumber > level + 1) {
				recAccomodate(i + 1, level + 1);
			} else {
				if (check()) {
					incrementStat();
				}
			}
			mMtrx[i] = EMPTY;
		}
	}

	private boolean check() {
		return true;
	}

	public static void main(String[] argv) {
		List<Cell> cells = new ArrayList<Cell>();

		Cell left = new Cell();
		left.setRow(1);
		left.setCol(0);

		left.setNumm(1);

		Cell top = new Cell();
		top.setRow(0);
		top.setCol(1);
		top.setNumm(3);
		cells.add(left);
		cells.add(top);

		Board board = new Board(4, 4);

		Accomodator a = new Accomodator(cells, board, 4);
		long begin = (new Date()).getTime();
		a.accomodate();
		a.printStat();
		long end = (new Date()).getTime();
		System.out.println((end - begin) / 1000);
	}

}
