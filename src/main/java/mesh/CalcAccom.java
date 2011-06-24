package mesh;

import java.io.File;
import java.io.PrintStream;

public class CalcAccom {
	public int mNum;
	public int mSize;
	public long mResult;
	public PrintStream mOut;

	public CalcAccom() {
	}

	public void recAccomodate(int pos, int level) {
		if (mNum == 0 || mSize == 0) {
			return;
		}
		int level1 = 1 + level;
		int up = mSize - mNum + level1;
		for (int i = pos; i < up; i++) {
			if (mNum > level1) {
				recAccomodate(i + 1, level1);
			} else {
				mResult++;
			}
		}
	}

	public static void main(String[] argv) throws Exception {
		CalcAccom a = new CalcAccom();

		PrintStream out = new PrintStream(new File("array.ajava"));
		a.mOut = out;
		try {
			for (a.mSize = 0; a.mSize <= 49; a.mSize++) {
				for (a.mNum = 0; a.mNum <= 11; a.mNum++) {
					a.mResult = 0;

					long begin = System.currentTimeMillis();
					a.recAccomodate(0, 0);
					long end = System.currentTimeMillis();
					System.out.println("// Time: " + ((end - begin) / 1000));
					System.out.println("// size: " + a.mSize + " items: "
							+ a.mNum);
					a.printResults();
				}
			}
		} finally {
			out.flush();
			out.close();
		}
	}

	private long nz(long n) {
		if (n == 0) {
			return 1;
		}
		return n;

	}

	private void printResults() {

		long single = mResult * mNum / nz(mSize);
		double ratio = (double) mNum / nz(mSize);
		double ratio2 = (double) single / nz(mResult);
		mOut.println("" //
				+ "// accomodations # in " //
				+ mSize //
				+ " places, " //
				+ mNum + " items. (" //
				+ ratio + " vs " + ratio2 //
				+ ")" //
		);

		mOut.println("accnum[" + mSize + "][" + mNum + "]=" + mResult + ";");
		mOut.println("single[" + mSize + "][" + mNum + "]=" + single + ";");
	}
}
