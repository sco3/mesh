/**
 * 
 */
package mesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

final class ProbabilityAction //
		implements ActionListener, MeshConstants {
	/**
	 * 
	 */
	private final MainForm mForm;

	/**
	 * @param mainForm
	 */
	ProbabilityAction(MainForm mainForm) {
		mForm = mainForm;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		List<Cell> openCells = new ArrayList<Cell>();
		List<Cell> knownCells = new ArrayList<Cell>();
		int size = mForm.getDataModel().getSize();
		String[][] matrix = mForm.getDataModel().matrix;
		boolean empty = true;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				String str = matrix[row][col];
				if (str.indexOf("%") >= 0) {
					matrix[row][col] = "";
				}
				if (!"".equals(matrix[row][col])) {
				   empty = false;
				}
				try {
					if (".".equals(str)) {
						str = "0";
					}
					if ("Flag".equals(str)) {
						// nothing
					} else {
						int numMines = Integer.parseInt(str);
						Cell cell = new Cell();
						cell.setRow(row);
						cell.setCol(col);
						cell.setNumm(numMines);
						openCells.add(cell);
					}
				} catch (Exception e) {
					// ok this is not a number
				}
			}
		}
		if (empty == true) {
		    System.out.println ("Empty");
		    return;
		}

		mForm.mDataModel.fireTableDataChanged();

		Board board = new Board(size, size);
		board.setMines(MINES_NUM);

		Accomodator a = new Accomodator(openCells, knownCells, board);

		long begin = (new Date()).getTime();
		a.accomodate();
		long end = (new Date()).getTime();
		System.out.println("Done in " + ((end - begin) / 1000) + " seconds.");

		List<Cell> cands = a.getCandidates();
		int idx = 0;
		long min = Long.MAX_VALUE;
		long otherProb = a.getOtherProbability();
		if (otherProb < min /* && otherProb > 0 */) {
			min = otherProb;
		}
		if (a.getAccomNumber() > 0) {
			for (Cell cand : cands) {
				double dProb = 100.0 * a.getStats()[idx] / a.getAccomNumber();
				System.out.println(cand.getRow() + "," + cand.getCol() + ":" + dProb);
				long prob = Math.round(dProb);
				if (prob < min /* && prob > 0 */) {
					min = prob;
				}
				String str = Long.toString(prob);
				if (prob == 100) {
					str = "Flag";
				} else {
					str = Long.toString(prob) + "%";
				}
				matrix[cand.getRow()][cand.getCol()] = str;
				idx++;
			}
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					String str = matrix[i][j];
					if ("".equals(str)) {
//						if (otherProb == 100) {
//							matrix[i][j] = "Flag";
//						} else {
						matrix[i][j] = otherProb + "%";
//						}
					}
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					String str = matrix[i][j];
					if ("".equals(str)) {
						matrix[i][j] = otherProb + "%";
					}
				}
			}
			JOptionPane.showMessageDialog(mForm, "None found.", "Info", JOptionPane.INFORMATION_MESSAGE);

		}
		String minProb = min + "%";
		mForm.mLessLikelyCells.clear();
		int rest = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				String str = matrix[i][j];
				if (str.indexOf('%') >= 0 && ("0%".equals(str) == false)) {
					if (minProb.equals(str)) {
						mForm.mLessLikelyCells.add(new Cell(i, j));
					}
					rest++;
				}
			}
		}
		if (rest == 0) {
			JOptionPane.showMessageDialog(mForm, "Won!", "Info", JOptionPane.INFORMATION_MESSAGE);
		}

		mForm.getDataModel().fireTableDataChanged();

	}
}