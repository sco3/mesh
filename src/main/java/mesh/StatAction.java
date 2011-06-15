/**
 * 
 */
package mesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

final class StatAction implements ActionListener {
	/**
	 * 
	 */
	private final MainForm mForm;

	/**
	 * @param mainForm
	 */
	StatAction(MainForm mainForm) {
		mForm = mainForm;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		EntityManager em = Db.getEm();
		Query q = em.createQuery("select count(m.c0) from Matrix m");
		Object obj = q.getSingleResult();
		mForm.setTitle(obj.toString());
		Integer n = Integer.parseInt(obj.toString());
		
		
		int size = mForm.mDataModel.getSize();
		String hql = " select ";
		for (int i = 0; i < size*size; i++) {
			if (i > 0) {
				hql += ",";
			}
			hql += " sum (m.c"+i+")";
			
		}
		hql += " from Matrix m";
		q = em.createQuery(hql);
		List<Object[]> list = q.getResultList();
		for (Object[] fields: list) {
		    int idx = 0;
		    for (int i = 0; i < size; i++) {
		    	for (int j = 0; j < size; j++) {
		    		Long value = (Long)fields[idx];
		    		value *= 100;
		    		value /= n;
		    		mForm.mDataModel.matrix[i][j]= Long.toString(value);
		    		idx++;
		    	}
		    }
		}
		mForm.mDataModel.fireTableDataChanged();
		

//		Date date = new Date(111, 05, 12);
//		long ts = date.getTime();
//		em.getTransaction().begin();
//		q = em.createQuery("select m from Matrix m");
//		List<Matrix> rs = q.getResultList();
//		for (Matrix m: rs) {
//			//System.out.println (m.date.getMonth());
//			if (m.date.getMonth() == 6) {
//				ts += 2*3600*1000;
//				Date newdate = new Date (ts); 
//				System.out.println (newdate);
//				m.date = newdate;
//				em.persist(m);
//			}
//			
//			
//		}
//		em.getTransaction().commit();
//		SaveAction action = new SaveAction(mForm);
//		action.exportCsv();
		
		
		
	}
}