/**
 * 
 */
package mesh;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

final class OurCellRenderer implements TableCellRenderer {
	public static int DELTA = 95;
	public static int FULL = 0xff;
	public static int LESS = FULL - DELTA;
	/**
	 * 
	 */
	private final MainForm mMainForm;
	private final TableCellRenderer mRndr;
	int h;

	OurCellRenderer(MainForm mainForm, TableCellRenderer rndr) {
		mMainForm = mainForm;
		mRndr = rndr;

	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {

		int height = mMainForm.getGridView().getHeight();
		if ((height != 0) && (h != height)) {
			h = height;

			height = height / mMainForm.getDataModel().getSize();
			table.setRowHeight(height);

		}

		Component cmp = mRndr.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		if (cmp instanceof DefaultTableCellRenderer) {
			DefaultTableCellRenderer dcr = (DefaultTableCellRenderer) cmp;
			dcr.setHorizontalAlignment(SwingConstants.CENTER);
			Font font = dcr.getFont();
			@SuppressWarnings("unchecked")
			Map<TextAttribute, Object> atts = (Map<TextAttribute, Object>) font.getAttributes();
			atts.put(TextAttribute.WEIGHT, new Float(2));
			Font newFont = new Font(atts);

			dcr.setFont(newFont);
			dcr.getFontMetrics(dcr.getFont());

			String[][] matrix = mMainForm.getDataModel().matrix;
			if ("1".equals(matrix[row][column])) {
				dcr.setForeground(Color.BLUE);
			} else if ("2".equals(matrix[row][column])) {
				dcr.setForeground(new Color(0f, 0.5f, 0f));
			} else if ("3".equals(matrix[row][column])) {
				dcr.setForeground(new Color(0.5f, 0.5f, 0.0f));
			} else if ("4".equals(matrix[row][column])) {
				dcr.setForeground(new Color(0.5f, 0.0f, 0.5f));
			} else if ("5".equals(matrix[row][column])) {
				dcr.setForeground(Color.RED);
			} else {
				dcr.setForeground(Color.BLACK);
			}

			if ("0%".equals(matrix[row][column])) {
				dcr.setBackground(new Color(LESS, FULL, LESS));
			} else if ("flag".equalsIgnoreCase(matrix[row][column])) {
				dcr.setBackground(new Color(FULL, LESS, LESS));
			} else {
				if (mMainForm.mGrid.getSelectedColumn() == column //
						&& mMainForm.mGrid.getSelectedRow() == row) {
					// nothing
				} else {
					dcr.setBackground(Color.WHITE);
				}
				if (mMainForm.mLessLikelyCells.size() > 0) {
					for (Cell cell : mMainForm.mLessLikelyCells) {
						if (cell.getRow() == row && cell.getCol() == column) {
							dcr.setBackground(new Color(FULL, FULL, LESS));
							break;
						}
					}
				}

			}
		}

		return cmp;
	}
}