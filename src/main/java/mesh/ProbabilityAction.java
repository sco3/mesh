/**
 * 
 */
package mesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import javax.swing.JOptionPane;

final class ProbabilityAction implements ActionListener {
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
		int size = mForm.getDataModel().getSize();
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				String str = mForm.getDataModel().matrix[row][col];
				try {
					int numMines = Integer.parseInt(str);
					Cell cell = new Cell();
					cell.setRow(row);
					cell.setCol(col);
					cell.setNumm(numMines);
					openCells.add(cell);
				} catch (Exception e) {
					// ok this is not a number
				}
			}
		}

		Board board = new Board(size, size);
		board.setMines(11);

		Accomodator a = new Accomodator(openCells, board);

		long begin = (new Date()).getTime();
		a.accomodate();
		long end = (new Date()).getTime();
		System.out.println("Done in " + ((end - begin) / 1000) + " seconds.");

		List<Cell> cands = a.getCandidates();
		int idx = 0;
		for (Cell cand : cands) {
			long prob = 100 * a.getStats()[idx] / a.getAccomNumber();
			mForm.getDataModel().matrix[cand.getRow()][cand.getCol()] = prob
					+ "%";
			idx++;
		}

		mForm.getDataModel().fireTableDataChanged();

		// JOptionPane.showMessageDialog(mForm, "Done in "
		// + ((end - begin) / 1000) + " seconds.", "Info",
		// JOptionPane.INFORMATION_MESSAGE);

	}
}