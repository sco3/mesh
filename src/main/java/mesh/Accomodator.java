package mesh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Accomodator {
	private static final String LABELS = "abcdefghijk";
	private static final String EMPTY = "_";

	private int mPlaces;
	private int mMinesLow;
	private int mMinesHigh;
	private int mMinesNumber;
	public long[] mStats;
	public long mAccomNumber;
	private String[] mMatrix;
	private Board mBoard;
	private List<Cell> mOpenCells;
	private List<Cell> mCandidates;
	

	public Accomodator(List<Cell> cells, Board board) {
		mOpenCells = cells;
		mBoard = board;
		reset();
	}

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

		if (mMinesHigh > mMinesNumber) {
			mMinesHigh = mMinesNumber;
		}

		for (int i = 0; i < mPlaces; i++) {
			mMatrix[i] = EMPTY;
			mStats[i] = 0;
		}

		mCandidates = new ArrayList<Cell>();
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
					for (Cell openCell : mOpenCells) {
						int dr = Math.abs(openCell.getRow() - row);
						int dc = Math.abs(openCell.getCol() - col);
						if (dr <= 1 && dc <= 1) {
							Cell closedCell = new Cell(row, col);
							closedCell.setStatus(CellStatus.CLOSED);
							closedCell.getAffected().add(openCell);
							if (mCandidates.contains(closedCell)) {
								int idx = mCandidates.indexOf(closedCell);
								Cell find = mCandidates.get(idx);
								find.getAffected().add(openCell);
							} else {
								mCandidates.add(closedCell);
							}
						}
					}
				}
			}
		}
		mPlaces = mCandidates.size();
		mStats = new long[mPlaces];
		mMatrix = new String[mPlaces];
		for (int i = 0; i < mPlaces; i++) {
			mMatrix[i] = EMPTY;
		}
	}

	public void incrementStat() {
		mAccomNumber++;
		for (int i = 0; i < mMatrix.length; i++) {
			System.out.print(mMatrix[i]);
			if (!EMPTY.equals(mMatrix[i])) {
				mStats[i]++;
			}
		}
		System.out.println();
	}

	public void printStat() {
		System.out.println("Accomodations number: " + mAccomNumber);
		for (int i = 0; i < mPlaces; i++) {
			System.out.print(mStats[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < mPlaces; i++) {
			System.out.print(100*mStats[i]/mAccomNumber+"% ");
		}
		System.out.println();
		
	}

	public void accomodate() {
		for (mMinesNumber = mMinesLow; mMinesNumber <= mMinesHigh; mMinesNumber++) {
			recAccomodate(0, 0);
			printStat();
		}
	}

	public void recAccomodate(int pos, int level) {
		for (int i = pos; i < mPlaces - mMinesNumber + 1 + level; i++) {
			mMatrix[i] = LABELS.substring(level, level + 1);
			incCandidates(i);

			if (mMinesNumber > level + 1) {
				recAccomodate(i + 1, level + 1);
			} else {
				if (check()) {
					incrementStat();
				}
			}
			mMatrix[i] = EMPTY;
			decCandidates(i);
		}
	}

	private void decCandidates(int idx) {
		for (Cell cell : mCandidates.get(idx).getAffected()) {
			cell.decNumm();
		}
	}

	private void incCandidates(int idx) {
		for (Cell cell : mCandidates.get(idx).getAffected()) {
			cell.incNumm();
		}
	}

	private boolean check() {
		boolean result = true;
		for (Cell cell : mOpenCells) {
			if (cell.getNumm() != cell.getPresumable()) {
				result = false;
				break;
			}
		}
		return result;
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
		top.setNumm(2);
		cells.add(left);
		cells.add(top);

		Board board = new Board(4, 4);

		Accomodator a = new Accomodator(cells, board);
		a.setMinesNumber(4);
		
		long begin = (new Date()).getTime();
		a.accomodate();

		long end = (new Date()).getTime();
		System.out.println(((end - begin) / 1000) + " seconds.");
	}

	public void setMinesNumber(int minesNumber) {
		mMinesNumber = minesNumber;
	}

	public int getMinesNumber() {
		return mMinesNumber;
	}

}
