package mesh;

public class AccomTmp {
	private static final String LABELS = "abcdefghijk";

	private static final String EMPTY = "_";
	//public static int SIDE=7;
	public static int SIZE = 20;
	public static int NUM = 4 ;
	public long[] st;
	public long nac;
	private String[] matrix;
	
	

	public AccomTmp() {
		st = new long[SIZE];
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
		nac++;

		for (int i = 0; i < matrix.length; i++) {
			/*
			if (EMPTY.equals(matrix[i])) {
				int row = i / SIDE;
				int col = i - SIDE*row;
			}
			*/
			System.out.print(matrix[i]);
			/*
			if ((i+1) % SIDE == 0) {
				System.out.println();
			}
			*/
			if (!EMPTY.equals(matrix[i])) {
				st[i]++;
			}
		}
		System.out.println("\n");
	}

	public void printStat() {
		System.out.println("Accomodations number: " + nac);

		for (int i = 0; i < SIZE; i++) {
			System.out.print(st[i] + " ");
		}
		System.out.println();
	}

	public void recAccomodate(int pos, int level) {
		for (int i = pos; i < SIZE - NUM + 1 + level; i++) {
			matrix[i] = LABELS.substring(level, level+1);
			if (NUM > level + 1) {
				recAccomodate(i + 1, level + 1);
			} else {
				print();
			}
			matrix[i] = EMPTY;
		}

	}


	public static void main(String[] argv) {
		AccomTmp a = new AccomTmp();

		a.recAccomodate(0, 0);
		a.printStat();

	}

}
