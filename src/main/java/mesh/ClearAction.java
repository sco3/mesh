/**
 * 
 */
package mesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class ClearAction implements ActionListener {
	/**
	 * 
	 */
	private final MainForm mForm;

	/**
	 * @param mainForm
	 */
	ClearAction(MainForm mainForm) {
		mForm = mainForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		e.getModifiers();
		int size = mForm.getDataModel().getSize();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mForm.getDataModel().matrix[i][j]="";
			}
		}
		mForm.getDataModel().fireTableDataChanged();
		
	}
}