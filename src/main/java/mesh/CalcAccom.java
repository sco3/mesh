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
		int placesNum = 81; // 9x9 field
		int minesNum = 11; // 11 mines
		CalcAccom a = new CalcAccom();

		PrintStream out = new PrintStream(new File("Accomodations.java"));
		out.println("package mesh;");
		out.println("");
		out.println("public class Accomodations {");
		out.println("    public static final int MAX_SIZE = " + placesNum + ";");
		out.println("    public static final int MAX_NUM = " + minesNum + ";");
		out.println("    public static final long[][] accnum = new long[MAX_SIZE + 1][MAX_NUM + 1];");
		out.println("    public static final long[][] single = new long[MAX_SIZE + 1][MAX_NUM + 1];");
		out.println("    static {");

		a.mOut = out;
		try {

			for (a.mSize = 0; a.mSize <= placesNum; a.mSize++) {

				for (a.mNum = 0; a.mNum <= minesNum; a.mNum++) {
					a.mResult = 0;

					long begin = System.currentTimeMillis();
					a.recAccomodate(0, 0);
					long end = System.currentTimeMillis();
					System.out.println("" //
							+ "// size: " + a.mSize + " items: " + a.mNum //
							+ " time: " + ((end - begin) / 1000)//
					);
					a.printResults();
				}
			}
			out.println("    }");
			out.println("}");
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
		mOut.println(String.format("        " //
				+ "// accomodations # in " //
				+ mSize //
				+ " places, " //
				+ mNum + " items. (" //
				+ "%#.4f vs %#.4f" //
				+ ")", ratio, ratio2) //
		);

		mOut.println("        accnum[" + mSize + "][" + mNum + "]=" + mResult + "L;");
		mOut.println("        single[" + mSize + "][" + mNum + "]=" + single + "L;");
	}
}
