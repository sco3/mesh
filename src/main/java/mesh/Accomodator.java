package mesh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Accomodator {
	private static final String LABELS = "abcdefghijk";
	private static final String EMPTY = ".";

	private int mPlaces;
	private int mMinesLow;
	private int mMinesHigh;
	private int mMinesNumber;
	private long[] mStats;
	private long mAccomNumber;
	private String[] mMatrix;
	private Board mBoard;
	private List<Cell> mOpenCells;
	private List<Cell> mKnownCells;
	private List<Cell> mCandidates;
	// unopened cells count per cell
	private long mOtherSingle;
	// unopened cell count for all
	private long mOtherAll;

	public long getOtherProbability() {
		return Math.round(100.0 * mOtherSingle / mOtherAll);
	}

	private int getAllCellSize() {
		return mBoard.getCols() * mBoard.getRows();
	}

	public Accomodator(List<Cell> cells, List<Cell> knownCells, Board board) {
		mOpenCells = cells;
		mKnownCells = knownCells;
		mBoard = board;
		mMinesNumber = board.getMines();
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
				boolean known = false;
				for (Cell cell : mKnownCells) {
					if (cell.getRow() == row && cell.getCol() == col) {
						known = true;
					}
				}
				if (known) {
					continue;
				}
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
						Cell closedCell = new Cell(row, col);
						closedCell.setStatus(CellStatus.CLOSED);
						if (dr <= 1 && dc <= 1) {
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
		System.out.println("Cells to check: " + mCandidates.size());
		System.out.println("Accomodations number: " + mAccomNumber);
		for (int i = 0; i < mPlaces; i++) {
			System.out.print(mStats[i] + " ");
		}
		System.out.println();

		if (mAccomNumber != 0) {
			for (int i = 0; i < mPlaces; i++) {
				System.out.print(100 * mStats[i] / mAccomNumber + "% ");
			}
			System.out.println();
		} else {
			System.out.println("None found!");
		}

	}

	public void accomodate() {
		mOtherAll = 0;
		mOtherSingle = 0;

		for (mMinesNumber = mMinesLow; mMinesNumber <= mMinesHigh; mMinesNumber++) {
			long oldAn = getAccomNumber();
			recAccomodate(0, 0);
			long newAn = getAccomNumber();

			if (newAn > oldAn) {
				int otherCount = getAllCellSize() - mCandidates.size()
						- mOpenCells.size() - mKnownCells.size();
				int otherMines = mBoard.getMines() - mMinesNumber;
				mOtherAll += Accomodations.accnum[otherCount][otherMines];
				mOtherSingle += Accomodations.single[otherCount][otherMines];
			}
			printStat();
		}

		if (mAccomNumber == 0) {
			int otherCount = getAllCellSize() - mCandidates.size()
					- mOpenCells.size() - mKnownCells.size();
			int otherMines = mBoard.getMines() - getFlagCount();
			mOtherAll += Accomodations.accnum[otherCount][otherMines];
			mOtherSingle += Accomodations.single[otherCount][otherMines];
		}

		printStat();
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

		Board board = new Board(7, 7);
		board.setMines(11);

		List<Cell> known = new ArrayList<Cell>();

		Accomodator a = new Accomodator(cells, known, board);

		long begin = (new Date()).getTime();
		a.accomodate();

		long end = (new Date()).getTime();
		System.out.println(((end - begin) / 1000) + " seconds.");
	}

	public void setStats(long[] stats) {
		mStats = stats;
	}

	public long[] getStats() {
		return mStats;
	}

	public void setAccomNumber(long accomNumber) {
		mAccomNumber = accomNumber;
	}

	public long getAccomNumber() {
		return mAccomNumber;
	}

	public void setCandidates(List<Cell> candidates) {
		mCandidates = candidates;
	}

	public List<Cell> getCandidates() {
		return mCandidates;
	}

	public int getFlagCount() {
		int result = 0;
		for (Cell cell : mKnownCells) {
			if (CellStatus.FLAG.equals(cell.getStatus())) {
				result++;
			}
		}
		return result;

	}

}
