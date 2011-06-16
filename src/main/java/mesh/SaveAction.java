/**
 * 
 */
package mesh;

import static mesh.Db.getEm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Query;
import javax.swing.JOptionPane;

final class SaveAction implements ActionListener {
	/**
	 * 
	 */
	private final MainForm mForm;
	

	/**
	 * @param mainForm
	 */
	SaveAction(MainForm mainForm) {
		mForm = mainForm;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		

		int size = mForm.getDataModel().getSize();
		Matrix m = new Matrix();
		MatrixId mid = new MatrixId();
		Class<?> clazz = Matrix.class;
		Class<?> clazzid = MatrixId.class;

		int idx = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int value = 0;
				try {
					String s = mForm.getDataModel().matrix[i][j];
					if (s == null || "".equals(s)) {
						value = 0;
					} else {
						value = Integer.parseInt(s);
						if (value > 1) {
							throw new Exception("Invalid data to save");
						}
					}

					Field field = clazz.getDeclaredField("c" + idx);
					field.setAccessible(true);
					field.set(m, value);
					
					field = clazzid.getDeclaredField("c" + idx);
					field.setAccessible(true);
					field.set(mid, value);
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(mForm, e.getMessage(),
							"Error", JOptionPane.OK_OPTION);
					return;
				}
				idx++;
			}
		}
		try {
			Matrix old = null;
			try {
				old = getEm().find(Matrix.class, mid);
				if (old != null) {
					JOptionPane.showMessageDialog(mForm, "Already saved: "+old.date,
							"Warning", JOptionPane.OK_OPTION);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (old == null) {
				getEm().getTransaction().begin();
				m.date = new Date();
				getEm().persist(m);
				getEm().getTransaction().commit();
				JOptionPane.showMessageDialog(mForm, "Saved", "Info",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(mForm, e.getMessage(), "Error",
					JOptionPane.OK_OPTION);
		}
		exportCsv();
	}


	public void exportCsv() {
		File export = new File("export");
		if (!export.exists()) {
			export.mkdirs();
		}

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss");
		String timestamp = df.format(new Date());
		getEm().getTransaction().begin();
		String sql = "CALL CSVWRITE('" + export.getAbsolutePath() + "/matrix-"
				+ timestamp + ".csv', 'SELECT * FROM MATRIX')";
		Query q;

		q = getEm().createNativeQuery(sql);
		q.executeUpdate();
		sql = "script to '" + export.getAbsolutePath() + "/matrix-" + timestamp
				+ ".sql'";
		q = getEm().createNativeQuery(sql);
		q.getResultList();

		// sql = "alter table matrix add date timestamp";
		// q = getEm().createNativeQuery(sql);
		// q.executeUpdate();

		getEm().getTransaction().rollback();
	}
}
