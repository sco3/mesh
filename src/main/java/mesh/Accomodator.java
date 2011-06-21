package mesh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Accomodator {
	private static final String LABELS = "abcdefghijk";
	private static final String EMPTY = "_";

	private int mPlaces = 7;
	private int mMnNumber = 4;
	public long[] mStats;
	public long mAccomNumber;
	private String[] mMtrx;
	private Board mBoard;
	private List<Cell> mOpenCells;
	private ArrayList<Cell>[] mAffected;

	public Accomodator(List<Cell> cells, Board board, int mnNumber) {
		mOpenCells = cells;
		mPlaces = 1; //need to be calculated based on given cells
		mMnNumber = mnNumber;
		mStats = new long[mPlaces];
		mMtrx = new String[mPlaces];
		mBoard = board;
		reset();
	}

	@SuppressWarnings("unchecked")
	public void reset() {
		mAccomNumber = 0;

		for (int i = 0; i < mPlaces; i++) {
			mMtrx[i] = EMPTY;
			mStats[i] = 0;

		}

		int allCells = mBoard.getCols() * mBoard.getRows();
		mAffected = new ArrayList[allCells];
		for (int i = 0; i < allCells; i++) {
			mAffected[i] = new ArrayList<Cell>();
		}

		int place = 0;
		for (int row = 0; row < mBoard.getRows(); row++) {
			for (int col = 0; col < mBoard.getCols(); col++) {
				for (Cell cell : mOpenCells) {
					if (Math.abs(cell.getRow() - row) <= 0
							&& Math.abs(cell.getCol() - col) <= 0) {
						mAffected[place].add(cell);
					}
				}
				place++;
			}
		}

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
		recAccomodate(0, 0);
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
