package mesh;

public class Rotator extends Transformer {
	void rotate() {
	}

	public static void main(String[] argv) {
		Rotator rotator = new Rotator();
		rotator.populate(5);
		rotator.print();
		rotator.rotate();
		rotator.print();
	}
}
