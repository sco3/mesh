package mesh;

public class AccomTmp {
	private static final String LABELS = "abcdefghijk";
	private static final String EMPTY = "_";
	
	public static int SIZE = 6;
	public static int NUM = 3;
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
			System.out.print(matrix[i]);
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

	public void accomodate() {

		for (int i = 0; i < SIZE - NUM + 1; i++) {
			matrix[i] = LABELS.substring(0,1);
			if (NUM > 1) {
				for (int j = i + 1; j < SIZE - NUM + 2; j++) {
					matrix[j] = LABELS.substring(1,2);;;
					if (NUM > 2) {

						for (int k = j + 1; k < SIZE - NUM + 3; k++) {
							matrix[k] = LABELS.substring(2,3);;
							print();
							matrix[k] = EMPTY;
						}
					} else {
						print();
					}

					matrix[j] = EMPTY;
				}
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
