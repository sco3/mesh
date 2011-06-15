/**
 * 
 */
package mesh;

import javax.swing.table.AbstractTableModel;

final class PlayGroundModel extends  AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private static final int SIZE = 7;
	String[][] matrix = new String[SIZE][SIZE];
	int h = 0;
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private final MainForm mForm;
	
	@Override
	 public String getColumnName(int columnIndex) {
		 return null;
	 }
	
	public int getSize () {
		return SIZE;
	}

	/**
	 * @param mainForm
	 */
	PlayGroundModel(MainForm mainForm) {
		mForm = mainForm;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0 ; j < SIZE; j++) {
				matrix[i][j]="";
			}
		}
	}

	
	


	@Override
	public Object getValueAt(int rowIndex, int colIndex) {

		String value = matrix[rowIndex][colIndex];
		if (value==null) {
			value="";
		}
		return value;
	}

	@Override
	public int getRowCount() {
		
		
//		int height = mForm.getGridView().getHeight();
//		if (h != height) {
//			h = height;
//			if (height != 0) {
//				height = height / mForm.getDataModel().getSize();
//				mForm.mGrid.setRowHeight(height);
//			}		
//			
//		}
		
		return SIZE;
	}


	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return SIZE;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

}