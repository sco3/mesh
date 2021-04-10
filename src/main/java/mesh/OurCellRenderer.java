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

			if ("1".equals(mMainForm.getDataModel().matrix[row][column])) {
				dcr.setForeground(Color.BLUE);
			} else if ("2".equals(mMainForm.getDataModel().matrix[row][column])) {
				dcr.setForeground(Color.GREEN);
			} else if ("3".equals(mMainForm.getDataModel().matrix[row][column])) {
				dcr.setForeground(new Color(0.5019608f, 0.5019608f, 0.0f));
			} else if ("4".equals(mMainForm.getDataModel().matrix[row][column])) {
				dcr.setForeground(new Color(0.54509807f, 0.0f, 0.54509807f));
			} else if ("5".equals(mMainForm.getDataModel().matrix[row][column])) {
				dcr.setForeground(Color.RED);
			} else {
				dcr.setForeground(Color.BLACK);
			}

			if ("0%".equals(mMainForm.getDataModel().matrix[row][column])) {
				dcr.setBackground(new Color(0xa0, 0xff, 0xa0));
			} else if ("flag".equals(mMainForm.getDataModel().matrix[row][column])) {
				dcr.setBackground(Color.RED);
			} else {
				dcr.setBackground(Color.WHITE);
			}
		}

		return cmp;
	}
}