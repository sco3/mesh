/**
 * 
 */
package mesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class RandomAction implements ActionListener {
	private final MainForm mMainForm;
	List<Integer> mMarks = new ArrayList<Integer>();
	Random rnd = new Random();

	/**
	 * @param mainForm
	 */
	RandomAction(MainForm mainForm) {
		mMainForm = mainForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int size = mMainForm.mDataModel.getSize();
		
		if (isMarked(size)) {
			pickMarked(size);
		} else {
			pickFromAll(size);	
		}
	}

	private void pickMarked(int size) {
		//int idx = (int) Math.round(Math.random()*(mMarks.size()-1));
		int idx = rnd.nextInt(mMarks.size());
		idx = mMarks.get(idx);
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++ ) {
				int cur = i*size+j;
				if (cur == idx) {
					mMainForm.mGrid.addColumnSelectionInterval(j, j);
					mMainForm.mGrid.addRowSelectionInterval(i,i);
					return;
				}
			}
		}
	}

	private boolean isMarked(int size) {
		int idx = 0;
		mMarks.clear();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ("Random".equals(mMainForm.getDataModel().matrix[i][j])) {
					mMarks.add(new Integer(idx));
				}
				idx++;
			}
		}
		return mMarks.size() > 0;
	}

	private void pickFromAll(int size) {
		//long idx = (long) Math.round(Math.random()*(size*size - 1));
		long idx = rnd.nextInt(size*size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++ ) {
				int cur = i*size+j;
				if (cur == idx) {
					mMainForm.mGrid.addColumnSelectionInterval(j, j);
					mMainForm.mGrid.addRowSelectionInterval(i,i);
					return;
				} else {
					//mDataModel.matrix[i][j]="";	
				}
			}
		}
	}
}