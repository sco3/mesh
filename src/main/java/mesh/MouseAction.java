package mesh;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class MouseAction implements MouseWheelListener {
	/**
	 * 
	 */
	private final MainForm mMainForm;

	/**
	 * @param mainForm
	 */
	MouseAction(MainForm mainForm) {
		mMainForm = mainForm;
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		String[] variants = { "", ".", "1", "2", "3", "4", "5", "6", "7", "8", "Flag" };
		int row = mMainForm.mGrid.rowAtPoint(e.getPoint());
		int col = mMainForm.mGrid.columnAtPoint(e.getPoint());

		if (col < 0 || row < 0) {
			return;
		}
		String cur = mMainForm.getDataModel().matrix[row][col];
		boolean found = false;
		int iVar = 0;
		for (; iVar < variants.length; iVar++) {
			if (variants[iVar].equals(cur)) {
				found = true;
				break;
			}
		}
		if (!found) {
			iVar = 1;
		}
		int rotation = e.getWheelRotation();
		boolean inc = false;

		if (rotation < 0) {
			iVar++;
			inc = true;
		} else {
			iVar--;

		}
		if (iVar < 1) {
			iVar = 1;
		} else if (iVar > variants.length - 1) {
			iVar = variants.length - 1;
		}
		if (inc && ".".equals(variants[iVar])) {
			iVar++;
		}

		mMainForm.getDataModel().matrix[row][col] = variants[iVar];
		mMainForm.getDataModel().fireTableCellUpdated(row, col);
	}
}