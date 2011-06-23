package mesh;

public class CalcAccom {
	private static final int NUM = 0;
	private static final int SIZE = 0;
	private long nac;

	public void recAccomodate(int pos, int level) {
		int up = SIZE - NUM + 1 + level;
		for (int i = pos; i < up; i++) {
			if (NUM > level + 1) {
				recAccomodate(i + 1, level + 1);
			} else {
				nac++;
			}
		}
	}
	
	public static void main (String[] argv) {
		CalcAccom a = new CalcAccom();
		long begin = System.currentTimeMillis();
		a.recAccomodate(0, 0);
		long end = System.currentTimeMillis();
		System.out.println ("Time: "+((end-begin)/1000));
		System.out.println (a.nac);
	}
}
