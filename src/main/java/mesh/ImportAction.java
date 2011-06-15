/**
 * 
 */
package mesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class ImportAction implements ActionListener {
	/**
	 * 
	 */
	private final MainForm mMainForm;

	/**
	 * @param mainForm
	 */
	ImportAction(MainForm mainForm) {
		mMainForm = mainForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String mStr = mMainForm.mImportText.getText();
		mStr = mStr.replaceAll(" ", "_");
		String[] toks = mStr.split("_");
		int size = mMainForm.mDataModel.getSize();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int idx = i * size + j;
				if (idx < toks.length) {
					if ("0".equals(toks[idx])) {
						toks[idx] = "";
					}
					mMainForm.mDataModel.matrix[i][j] = toks[idx];
				} else {
					mMainForm.mDataModel.matrix[i][j] = "";
				}
			}
		}
		mMainForm.mDataModel.fireTableDataChanged();
	}
}