package mesh;

import static java.lang.String.format;
import static java.lang.System.out;

import java.io.File;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

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
		int poolSize = 8;
		if (argv.length > 0) {
			try {
				poolSize = Integer.parseInt(argv[0]);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int placesNum = 81; // 9x9 field
		int minesNum = 11; // 11 mines

		System.out.println(format("Pool: %d Field: %d mines: %d", poolSize, placesNum, minesNum));

		ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(poolSize);
		System.out.println(pool);

		PrintStream outStream = new PrintStream(new File("Accomodations.java"));
		outStream.println("package mesh;");
		outStream.println("");
		outStream.println("public class Accomodations {");
		outStream.println("    public static final int MAX_SIZE = " + placesNum + ";");
		outStream.println("    public static final int MAX_NUM = " + minesNum + ";");
		outStream.println("    public static final long[][] accnum = new long[MAX_SIZE + 1][MAX_NUM + 1];");
		outStream.println("    public static final long[][] single = new long[MAX_SIZE + 1][MAX_NUM + 1];");
		outStream.println("    static {");
		final AtomicInteger running = new AtomicInteger(0);

		try {

			for (int fieldSize = 0; fieldSize <= placesNum; fieldSize++) {

				for (int mines = 0; mines <= minesNum; mines++) {
					CalcAccom a = new CalcAccom();
					a.mResult = 0;
					a.mOut = outStream;
					a.mSize = fieldSize;
					a.mNum = mines;
					pool.execute(new Runnable() {
						@Override
						public void run() {
							running.incrementAndGet();
							try {
								long begin = System.currentTimeMillis();
								a.recAccomodate(0, 0);
								long end = System.currentTimeMillis();
								System.out.println("" //
										+ "// size: " + a.mSize + " items: " + a.mNum //
										+ " time: " + ((end - begin) / 1000)//
								);
								a.printResults();
							} finally {
								running.decrementAndGet();
							}
						}
					});
				}
			}

			while (pool.getActiveCount() > 0 && running.intValue() > 0) {
				Thread.sleep(10000);
				out.println(format("" //
						+ "Wait tasks to complete: pool queue: %d, running: %d, active: %d", //
						pool.getQueue().size(), running.intValue(), pool.getActiveCount() //
				));
			}
			pool.shutdown();
			pool.shutdownNow();
			outStream.println("    }");
			outStream.println("}");
		} finally {

			outStream.flush();
			outStream.close();
		}
	}

	private long nz(long n) {
		if (n == 0) {
			return 1;
		}
		return n;

	}

	private synchronized void printResults() {

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
