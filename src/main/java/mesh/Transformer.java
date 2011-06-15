package mesh;

public class Transformer {

	protected int[][] matrix;

	protected void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(" ");
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		for (int j = 0; j < matrix.length; j++) {
			System.out.print("---");
		}
		System.out.println();
	}

	public void setMatrix(int[][] m) {
		matrix = m;
	}

	public int get(int i, int j) {
		// System.out.print (" "+i+","+j+" ");
		return matrix[i][j];
	}

	public void set(int i, int j, int value) {
		// System.out.println (" -> "+i+","+j+" ");
		matrix[i][j] = value;
	}

	public int[][] generate(int n) {
		int[][] m = new int[n][n];
		int k = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = k;
				k++;
			}
		}
		return m;
	}
	
	public void populate (int n) {
	   setMatrix(generate(n));	
	}
	
	
}
