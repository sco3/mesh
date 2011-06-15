package mesh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Db {
	private static final String PERSISTENCE_UNIT_NAME = "mesh";
	private EntityManagerFactory factory;
	private EntityManager mEm;
	private static Db mInst;

	public EntityManager getEmInt() {
		if (mEm == null) {
			factory = Persistence
					.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			mEm = factory.createEntityManager();
		}
		return mEm;
	}

	private Db() {

	}

	public synchronized static EntityManager getEm() {
		if (mInst == null) {
			mInst = new Db();
		}
		return mInst.getEmInt();
	}

}
