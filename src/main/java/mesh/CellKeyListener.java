/**
 * 
 */
package mesh;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class CellKeyListener implements KeyListener {
	/**
	 * 
	 */
	private final MainForm inst;

	/**
	 * @param mainForm
	 */
	CellKeyListener(MainForm mainForm) {
		inst = mainForm;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int col = inst.getGrid().getSelectedColumn();
		int row = inst.getGrid().getSelectedRow();
		if (col >= 0 && row >= 0) {
			if (e.getKeyChar() == ' ') {
				inst.getDataModel().matrix[row][col] = "";
			} else if (e.getKeyChar() == '1') {
				inst.getDataModel().matrix[row][col] = "1";
			} else if (e.getKeyChar() == '2') {
				inst.getDataModel().matrix[row][col] = "2";
			} else if (e.getKeyChar() == '3') {
				inst.getDataModel().matrix[row][col] = "3";
			} else if (e.getKeyChar() == '4') {
				inst.getDataModel().matrix[row][col] = "4";
			} else if (e.getKeyChar() == '5') {
				inst.getDataModel().matrix[row][col] = "5";
			} else if (e.getKeyChar() == '6') {
				inst.getDataModel().matrix[row][col] = "6";
			} else if (e.getKeyChar() == '7') {
				inst.getDataModel().matrix[row][col] = "7";
			} else if (e.getKeyChar() == '8') {
				inst.getDataModel().matrix[row][col] = "8";
			} else if (e.getKeyChar() == 'F' || e.getKeyChar() == 'f') {
				inst.getDataModel().matrix[row][col] = "Flag";
			} else if (e.getKeyChar() == 'C' || e.getKeyChar() == 'c') {
				inst.getDataModel().matrix[row][col] = "Closed";
			} else if (e.getKeyChar() == 'B' || e.getKeyChar() == 'b') {
				inst.getDataModel().matrix[row][col] = "Bomb";
			} else if (e.getKeyChar() == 'R' || e.getKeyChar() == 'r') {
				inst.getDataModel().matrix[row][col] = "Random";
			} else if (e.getKeyChar() == '.') {
				inst.getDataModel().matrix[row][col] = ".";
			}
			inst.getDataModel().fireTableCellUpdated(row, col);

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}