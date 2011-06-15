package mesh;

public class Mirrorer extends Transformer {

	public static void main(String[] argv) {
		Mirrorer mirrorer = new Mirrorer();
		mirrorer.populate(5);
		mirrorer.print();
		mirrorer.mirror();
		mirrorer.print();

	}

	private void mirror() {
		int n = matrix.length;
		int p = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {
				int t = matrix[i][j];
				matrix[i][j] = matrix[i][n - j - 1];
				matrix[i][n - j - 1] = t;
			}
		}
	}
}
