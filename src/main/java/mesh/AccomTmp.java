package mesh;

public class AccomTmp {
	//private static final String LABELS = "abcdefghijk";
	private static final String EMPTY = "_";
	
	public static int SIZE = 49;
	public static int NUM = 10;
	public int[] st;
	public int[] st2;
	public long nac;
	private String[] matrix;

	public AccomTmp() {
		st = new int[SIZE];
		st2 = new int[SIZE];
		matrix = new String[SIZE];
		reset();
	}

	public void reset() {
		nac = 0;
		for (int i = 0; i < SIZE; i++) {
			matrix[i] = EMPTY;
			st[i] = 0;
		}
	}

	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			//System.out.print(matrix[i]);
			if (!EMPTY.equals(matrix[i])) {
				st[i]++;
			}
		}
		//System.out.println("\n");
	}

	public void printStat() {
		System.out.println("Accomodations number: " + nac);

		for (int i = 0; i < SIZE; i++) {
			System.out.print(st[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			System.out.print(st2[i] + " ");
		}
		
		System.out.println();
	}

	public void recAccomodate(int pos, int level) {
		int up = SIZE - NUM + 1 + level;
		//System.out.println ("scan: " +(up-pos));
		
		for (int i = pos; i < up; i++) {
			//st2[i]++;
			//matrix[i] = LABELS.substring(level, level+1);
			if (NUM > level + 1) {
				recAccomodate(i + 1, level + 1);
			} else {
				nac++;
				//print();
			}
			//matrix[i] = EMPTY;
			//st2[i]--;
		}
	}


	public static void main(String[] argv) {
		AccomTmp a = new AccomTmp();
		long begin = System.currentTimeMillis();
		a.recAccomodate(0, 0);
		long end = System.currentTimeMillis();
		System.out.println ("Time: "+((end-begin)/1000));
		a.printStat();
		long n1 = a.nac*NUM/SIZE;
		System.out.println (n1);
	}

}
