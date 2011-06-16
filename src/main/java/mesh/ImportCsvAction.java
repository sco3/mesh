/**
 * 
 */
package mesh;

import static mesh.Db.getEm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import org.apache.commons.beanutils.BeanUtils;

final class ImportCsvAction implements ActionListener {
	/**
	 * 
	 */
	private final MainForm mForm;

	/**
	 * @param mainForm
	 */
	ImportCsvAction(MainForm mainForm) {
		mForm = mainForm;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JFileChooser c = new JFileChooser();

		File dir = new File("./export");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		c.setCurrentDirectory(dir);
		c.setFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "csv";
			}

			@Override
			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				} else if (f.getAbsolutePath().endsWith(".csv")) {
					return true;
				}
				return false;
			}
		});
		int result = c.showOpenDialog(mForm);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = c.getSelectedFile();
			getEm().getTransaction().begin();
			Query q = getEm().createNativeQuery("delete from tmp");
			q.executeUpdate();
			
			String insert = "" //
					+ " Insert into TMP " // 
					+ " SELECT * FROM CSVREAD('"
					+ file.getAbsolutePath()
					+ "')";
			q=getEm().createNativeQuery(insert);
			q.executeUpdate();
			
			CriteriaBuilder qb = getEm().getCriteriaBuilder();
			CriteriaQuery<Tmp> cq = qb.createQuery(Tmp.class);
			//Root<Tmp> p = cq.from(Tmp.class);
			
			TypedQuery<Tmp> tq = getEm().createQuery(cq); 
			List<Tmp> tmps = tq.getResultList();
			MatrixId id = new MatrixId();
			for (Tmp tmp: tmps) {
				try {
					BeanUtils.copyProperties(id, tmp);
					Matrix matrix = getEm().find(Matrix.class, id);
					if (matrix == null) {
						matrix = new Matrix();
						BeanUtils.copyProperties(matrix, tmp);
						getEm().persist (matrix);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} 				
			}
			getEm().getTransaction().commit();
		}

	}
}