package mesh;

import javax.persistence.Query;

public class DbUtil {
	
	public static void main (String[] argv) {
		Db.getEm().getTransaction().begin();
		Query q = Db.getEm().createNativeQuery("alter table matrix add won int");
		q.executeUpdate();
		Db.getEm().getTransaction().commit();
	}

}
