package mesh;

public class Accomodations {
	public static final int MAX_SIZE = 49;
	public static final int MAX_NUM = 11;
	public static final long[][] accnum = new long[MAX_SIZE][MAX_NUM];
	public static final long[][] single = new long[MAX_SIZE][MAX_NUM];
	
	static {
		// accomodations # in 0 places, 0 items. (0.0 vs 0.0)
		accnum[0][0] = 0L;
		single[0][0] = 0L;
		// accomodations # in 0 places, 1 items. (1.0 vs 0.0)
		accnum[0][1] = 0L;
		single[0][1] = 0L;
		// accomodations # in 0 places, 2 items. (2.0 vs 0.0)
		accnum[0][2] = 0L;
		single[0][2] = 0L;
		// accomodations # in 0 places, 3 items. (3.0 vs 0.0)
		accnum[0][3] = 0L;
		single[0][3] = 0L;
		// accomodations # in 0 places, 4 items. (4.0 vs 0.0)
		accnum[0][4] = 0L;
		single[0][4] = 0L;
		// accomodations # in 0 places, 5 items. (5.0 vs 0.0)
		accnum[0][5] = 0L;
		single[0][5] = 0L;
		// accomodations # in 0 places, 6 items. (6.0 vs 0.0)
		accnum[0][6] = 0L;
		single[0][6] = 0L;
		// accomodations # in 0 places, 7 items. (7.0 vs 0.0)
		accnum[0][7] = 0L;
		single[0][7] = 0L;
		// accomodations # in 0 places, 8 items. (8.0 vs 0.0)
		accnum[0][8] = 0L;
		single[0][8] = 0L;
		// accomodations # in 0 places, 9 items. (9.0 vs 0.0)
		accnum[0][9] = 0L;
		single[0][9] = 0L;
		// accomodations # in 0 places, 10 items. (10.0 vs 0.0)
		accnum[0][10] = 0L;
		single[0][10] = 0L;
		// accomodations # in 0 places, 11 items. (11.0 vs 0.0)
		accnum[0][11] = 0L;
		single[0][11] = 0L;
		// accomodations # in 1 places, 0 items. (0.0 vs 0.0)
		accnum[1][0] = 0L;
		single[1][0] = 0L;
		// accomodations # in 1 places, 1 items. (1.0 vs 1.0)
		accnum[1][1] = 1L;
		single[1][1] = 1L;
		// accomodations # in 1 places, 2 items. (2.0 vs 0.0)
		accnum[1][2] = 0L;
		single[1][2] = 0L;
		// accomodations # in 1 places, 3 items. (3.0 vs 0.0)
		accnum[1][3] = 0L;
		single[1][3] = 0L;
		// accomodations # in 1 places, 4 items. (4.0 vs 0.0)
		accnum[1][4] = 0L;
		single[1][4] = 0L;
		// accomodations # in 1 places, 5 items. (5.0 vs 0.0)
		accnum[1][5] = 0L;
		single[1][5] = 0L;
		// accomodations # in 1 places, 6 items. (6.0 vs 0.0)
		accnum[1][6] = 0L;
		single[1][6] = 0L;
		// accomodations # in 1 places, 7 items. (7.0 vs 0.0)
		accnum[1][7] = 0L;
		single[1][7] = 0L;
		// accomodations # in 1 places, 8 items. (8.0 vs 0.0)
		accnum[1][8] = 0L;
		single[1][8] = 0L;
		// accomodations # in 1 places, 9 items. (9.0 vs 0.0)
		accnum[1][9] = 0L;
		single[1][9] = 0L;
		// accomodations # in 1 places, 10 items. (10.0 vs 0.0)
		accnum[1][10] = 0L;
		single[1][10] = 0L;
		// accomodations # in 1 places, 11 items. (11.0 vs 0.0)
		accnum[1][11] = 0L;
		single[1][11] = 0L;
		// accomodations # in 2 places, 0 items. (0.0 vs 0.0)
		accnum[2][0] = 0L;
		single[2][0] = 0L;
		// accomodations # in 2 places, 1 items. (0.5 vs 0.5)
		accnum[2][1] = 2L;
		single[2][1] = 1L;
		// accomodations # in 2 places, 2 items. (1.0 vs 1.0)
		accnum[2][2] = 1L;
		single[2][2] = 1L;
		// accomodations # in 2 places, 3 items. (1.5 vs 0.0)
		accnum[2][3] = 0L;
		single[2][3] = 0L;
		// accomodations # in 2 places, 4 items. (2.0 vs 0.0)
		accnum[2][4] = 0L;
		single[2][4] = 0L;
		// accomodations # in 2 places, 5 items. (2.5 vs 0.0)
		accnum[2][5] = 0L;
		single[2][5] = 0L;
		// accomodations # in 2 places, 6 items. (3.0 vs 0.0)
		accnum[2][6] = 0L;
		single[2][6] = 0L;
		// accomodations # in 2 places, 7 items. (3.5 vs 0.0)
		accnum[2][7] = 0L;
		single[2][7] = 0L;
		// accomodations # in 2 places, 8 items. (4.0 vs 0.0)
		accnum[2][8] = 0L;
		single[2][8] = 0L;
		// accomodations # in 2 places, 9 items. (4.5 vs 0.0)
		accnum[2][9] = 0L;
		single[2][9] = 0L;
		// accomodations # in 2 places, 10 items. (5.0 vs 0.0)
		accnum[2][10] = 0L;
		single[2][10] = 0L;
		// accomodations # in 2 places, 11 items. (5.5 vs 0.0)
		accnum[2][11] = 0L;
		single[2][11] = 0L;
		// accomodations # in 3 places, 0 items. (0.0 vs 0.0)
		accnum[3][0] = 0L;
		single[3][0] = 0L;
		// accomodations # in 3 places, 1 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[3][1] = 3L;
		single[3][1] = 1L;
		// accomodations # in 3 places, 2 items. (0.6666666666666666 vs
		// 0.6666666666666666)
		accnum[3][2] = 3L;
		single[3][2] = 2L;
		// accomodations # in 3 places, 3 items. (1.0 vs 1.0)
		accnum[3][3] = 1L;
		single[3][3] = 1L;
		// accomodations # in 3 places, 4 items. (1.3333333333333333 vs 0.0)
		accnum[3][4] = 0L;
		single[3][4] = 0L;
		// accomodations # in 3 places, 5 items. (1.6666666666666667 vs 0.0)
		accnum[3][5] = 0L;
		single[3][5] = 0L;
		// accomodations # in 3 places, 6 items. (2.0 vs 0.0)
		accnum[3][6] = 0L;
		single[3][6] = 0L;
		// accomodations # in 3 places, 7 items. (2.3333333333333335 vs 0.0)
		accnum[3][7] = 0L;
		single[3][7] = 0L;
		// accomodations # in 3 places, 8 items. (2.6666666666666665 vs 0.0)
		accnum[3][8] = 0L;
		single[3][8] = 0L;
		// accomodations # in 3 places, 9 items. (3.0 vs 0.0)
		accnum[3][9] = 0L;
		single[3][9] = 0L;
		// accomodations # in 3 places, 10 items. (3.3333333333333335 vs 0.0)
		accnum[3][10] = 0L;
		single[3][10] = 0L;
		// accomodations # in 3 places, 11 items. (3.6666666666666665 vs 0.0)
		accnum[3][11] = 0L;
		single[3][11] = 0L;
		// accomodations # in 4 places, 0 items. (0.0 vs 0.0)
		accnum[4][0] = 0L;
		single[4][0] = 0L;
		// accomodations # in 4 places, 1 items. (0.25 vs 0.25)
		accnum[4][1] = 4L;
		single[4][1] = 1L;
		// accomodations # in 4 places, 2 items. (0.5 vs 0.5)
		accnum[4][2] = 6L;
		single[4][2] = 3L;
		// accomodations # in 4 places, 3 items. (0.75 vs 0.75)
		accnum[4][3] = 4L;
		single[4][3] = 3L;
		// accomodations # in 4 places, 4 items. (1.0 vs 1.0)
		accnum[4][4] = 1L;
		single[4][4] = 1L;
		// accomodations # in 4 places, 5 items. (1.25 vs 0.0)
		accnum[4][5] = 0L;
		single[4][5] = 0L;
		// accomodations # in 4 places, 6 items. (1.5 vs 0.0)
		accnum[4][6] = 0L;
		single[4][6] = 0L;
		// accomodations # in 4 places, 7 items. (1.75 vs 0.0)
		accnum[4][7] = 0L;
		single[4][7] = 0L;
		// accomodations # in 4 places, 8 items. (2.0 vs 0.0)
		accnum[4][8] = 0L;
		single[4][8] = 0L;
		// accomodations # in 4 places, 9 items. (2.25 vs 0.0)
		accnum[4][9] = 0L;
		single[4][9] = 0L;
		// accomodations # in 4 places, 10 items. (2.5 vs 0.0)
		accnum[4][10] = 0L;
		single[4][10] = 0L;
		// accomodations # in 4 places, 11 items. (2.75 vs 0.0)
		accnum[4][11] = 0L;
		single[4][11] = 0L;
		// accomodations # in 5 places, 0 items. (0.0 vs 0.0)
		accnum[5][0] = 0L;
		single[5][0] = 0L;
		// accomodations # in 5 places, 1 items. (0.2 vs 0.2)
		accnum[5][1] = 5L;
		single[5][1] = 1L;
		// accomodations # in 5 places, 2 items. (0.4 vs 0.4)
		accnum[5][2] = 10L;
		single[5][2] = 4L;
		// accomodations # in 5 places, 3 items. (0.6 vs 0.6)
		accnum[5][3] = 10L;
		single[5][3] = 6L;
		// accomodations # in 5 places, 4 items. (0.8 vs 0.8)
		accnum[5][4] = 5L;
		single[5][4] = 4L;
		// accomodations # in 5 places, 5 items. (1.0 vs 1.0)
		accnum[5][5] = 1L;
		single[5][5] = 1L;
		// accomodations # in 5 places, 6 items. (1.2 vs 0.0)
		accnum[5][6] = 0L;
		single[5][6] = 0L;
		// accomodations # in 5 places, 7 items. (1.4 vs 0.0)
		accnum[5][7] = 0L;
		single[5][7] = 0L;
		// accomodations # in 5 places, 8 items. (1.6 vs 0.0)
		accnum[5][8] = 0L;
		single[5][8] = 0L;
		// accomodations # in 5 places, 9 items. (1.8 vs 0.0)
		accnum[5][9] = 0L;
		single[5][9] = 0L;
		// accomodations # in 5 places, 10 items. (2.0 vs 0.0)
		accnum[5][10] = 0L;
		single[5][10] = 0L;
		// accomodations # in 5 places, 11 items. (2.2 vs 0.0)
		accnum[5][11] = 0L;
		single[5][11] = 0L;
		// accomodations # in 6 places, 0 items. (0.0 vs 0.0)
		accnum[6][0] = 0L;
		single[6][0] = 0L;
		// accomodations # in 6 places, 1 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[6][1] = 6L;
		single[6][1] = 1L;
		// accomodations # in 6 places, 2 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[6][2] = 15L;
		single[6][2] = 5L;
		// accomodations # in 6 places, 3 items. (0.5 vs 0.5)
		accnum[6][3] = 20L;
		single[6][3] = 10L;
		// accomodations # in 6 places, 4 items. (0.6666666666666666 vs
		// 0.6666666666666666)
		accnum[6][4] = 15L;
		single[6][4] = 10L;
		// accomodations # in 6 places, 5 items. (0.8333333333333334 vs
		// 0.8333333333333334)
		accnum[6][5] = 6L;
		single[6][5] = 5L;
		// accomodations # in 6 places, 6 items. (1.0 vs 1.0)
		accnum[6][6] = 1L;
		single[6][6] = 1L;
		// accomodations # in 6 places, 7 items. (1.1666666666666667 vs 0.0)
		accnum[6][7] = 0L;
		single[6][7] = 0L;
		// accomodations # in 6 places, 8 items. (1.3333333333333333 vs 0.0)
		accnum[6][8] = 0L;
		single[6][8] = 0L;
		// accomodations # in 6 places, 9 items. (1.5 vs 0.0)
		accnum[6][9] = 0L;
		single[6][9] = 0L;
		// accomodations # in 6 places, 10 items. (1.6666666666666667 vs 0.0)
		accnum[6][10] = 0L;
		single[6][10] = 0L;
		// accomodations # in 6 places, 11 items. (1.8333333333333333 vs 0.0)
		accnum[6][11] = 0L;
		single[6][11] = 0L;
		// accomodations # in 7 places, 0 items. (0.0 vs 0.0)
		accnum[7][0] = 0L;
		single[7][0] = 0L;
		// accomodations # in 7 places, 1 items. (0.14285714285714285 vs
		// 0.14285714285714285)
		accnum[7][1] = 7L;
		single[7][1] = 1L;
		// accomodations # in 7 places, 2 items. (0.2857142857142857 vs
		// 0.2857142857142857)
		accnum[7][2] = 21L;
		single[7][2] = 6L;
		// accomodations # in 7 places, 3 items. (0.42857142857142855 vs
		// 0.42857142857142855)
		accnum[7][3] = 35L;
		single[7][3] = 15L;
		// accomodations # in 7 places, 4 items. (0.5714285714285714 vs
		// 0.5714285714285714)
		accnum[7][4] = 35L;
		single[7][4] = 20L;
		// accomodations # in 7 places, 5 items. (0.7142857142857143 vs
		// 0.7142857142857143)
		accnum[7][5] = 21L;
		single[7][5] = 15L;
		// accomodations # in 7 places, 6 items. (0.8571428571428571 vs
		// 0.8571428571428571)
		accnum[7][6] = 7L;
		single[7][6] = 6L;
		// accomodations # in 7 places, 7 items. (1.0 vs 1.0)
		accnum[7][7] = 1L;
		single[7][7] = 1L;
		// accomodations # in 7 places, 8 items. (1.1428571428571428 vs 0.0)
		accnum[7][8] = 0L;
		single[7][8] = 0L;
		// accomodations # in 7 places, 9 items. (1.2857142857142858 vs 0.0)
		accnum[7][9] = 0L;
		single[7][9] = 0L;
		// accomodations # in 7 places, 10 items. (1.4285714285714286 vs 0.0)
		accnum[7][10] = 0L;
		single[7][10] = 0L;
		// accomodations # in 7 places, 11 items. (1.5714285714285714 vs 0.0)
		accnum[7][11] = 0L;
		single[7][11] = 0L;
		// accomodations # in 8 places, 0 items. (0.0 vs 0.0)
		accnum[8][0] = 0L;
		single[8][0] = 0L;
		// accomodations # in 8 places, 1 items. (0.125 vs 0.125)
		accnum[8][1] = 8L;
		single[8][1] = 1L;
		// accomodations # in 8 places, 2 items. (0.25 vs 0.25)
		accnum[8][2] = 28L;
		single[8][2] = 7L;
		// accomodations # in 8 places, 3 items. (0.375 vs 0.375)
		accnum[8][3] = 56L;
		single[8][3] = 21L;
		// accomodations # in 8 places, 4 items. (0.5 vs 0.5)
		accnum[8][4] = 70L;
		single[8][4] = 35L;
		// accomodations # in 8 places, 5 items. (0.625 vs 0.625)
		accnum[8][5] = 56L;
		single[8][5] = 35L;
		// accomodations # in 8 places, 6 items. (0.75 vs 0.75)
		accnum[8][6] = 28L;
		single[8][6] = 21L;
		// accomodations # in 8 places, 7 items. (0.875 vs 0.875)
		accnum[8][7] = 8L;
		single[8][7] = 7L;
		// accomodations # in 8 places, 8 items. (1.0 vs 1.0)
		accnum[8][8] = 1L;
		single[8][8] = 1L;
		// accomodations # in 8 places, 9 items. (1.125 vs 0.0)
		accnum[8][9] = 0L;
		single[8][9] = 0L;
		// accomodations # in 8 places, 10 items. (1.25 vs 0.0)
		accnum[8][10] = 0L;
		single[8][10] = 0L;
		// accomodations # in 8 places, 11 items. (1.375 vs 0.0)
		accnum[8][11] = 0L;
		single[8][11] = 0L;
		// accomodations # in 9 places, 0 items. (0.0 vs 0.0)
		accnum[9][0] = 0L;
		single[9][0] = 0L;
		// accomodations # in 9 places, 1 items. (0.1111111111111111 vs
		// 0.1111111111111111)
		accnum[9][1] = 9L;
		single[9][1] = 1L;
		// accomodations # in 9 places, 2 items. (0.2222222222222222 vs
		// 0.2222222222222222)
		accnum[9][2] = 36L;
		single[9][2] = 8L;
		// accomodations # in 9 places, 3 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[9][3] = 84L;
		single[9][3] = 28L;
		// accomodations # in 9 places, 4 items. (0.4444444444444444 vs
		// 0.4444444444444444)
		accnum[9][4] = 126L;
		single[9][4] = 56L;
		// accomodations # in 9 places, 5 items. (0.5555555555555556 vs
		// 0.5555555555555556)
		accnum[9][5] = 126L;
		single[9][5] = 70L;
		// accomodations # in 9 places, 6 items. (0.6666666666666666 vs
		// 0.6666666666666666)
		accnum[9][6] = 84L;
		single[9][6] = 56L;
		// accomodations # in 9 places, 7 items. (0.7777777777777778 vs
		// 0.7777777777777778)
		accnum[9][7] = 36L;
		single[9][7] = 28L;
		// accomodations # in 9 places, 8 items. (0.8888888888888888 vs
		// 0.8888888888888888)
		accnum[9][8] = 9L;
		single[9][8] = 8L;
		// accomodations # in 9 places, 9 items. (1.0 vs 1.0)
		accnum[9][9] = 1L;
		single[9][9] = 1L;
		// accomodations # in 9 places, 10 items. (1.1111111111111112 vs 0.0)
		accnum[9][10] = 0L;
		single[9][10] = 0L;
		// accomodations # in 9 places, 11 items. (1.2222222222222223 vs 0.0)
		accnum[9][11] = 0L;
		single[9][11] = 0L;
		// accomodations # in 10 places, 0 items. (0.0 vs 0.0)
		accnum[10][0] = 0L;
		single[10][0] = 0L;
		// accomodations # in 10 places, 1 items. (0.1 vs 0.1)
		accnum[10][1] = 10L;
		single[10][1] = 1L;
		// accomodations # in 10 places, 2 items. (0.2 vs 0.2)
		accnum[10][2] = 45L;
		single[10][2] = 9L;
		// accomodations # in 10 places, 3 items. (0.3 vs 0.3)
		accnum[10][3] = 120L;
		single[10][3] = 36L;
		// accomodations # in 10 places, 4 items. (0.4 vs 0.4)
		accnum[10][4] = 210L;
		single[10][4] = 84L;
		// accomodations # in 10 places, 5 items. (0.5 vs 0.5)
		accnum[10][5] = 252L;
		single[10][5] = 126L;
		// accomodations # in 10 places, 6 items. (0.6 vs 0.6)
		accnum[10][6] = 210L;
		single[10][6] = 126L;
		// accomodations # in 10 places, 7 items. (0.7 vs 0.7)
		accnum[10][7] = 120L;
		single[10][7] = 84L;
		// accomodations # in 10 places, 8 items. (0.8 vs 0.8)
		accnum[10][8] = 45L;
		single[10][8] = 36L;
		// accomodations # in 10 places, 9 items. (0.9 vs 0.9)
		accnum[10][9] = 10L;
		single[10][9] = 9L;
		// accomodations # in 10 places, 10 items. (1.0 vs 1.0)
		accnum[10][10] = 1L;
		single[10][10] = 1L;
		// accomodations # in 10 places, 11 items. (1.1 vs 0.0)
		accnum[10][11] = 0L;
		single[10][11] = 0L;
		// accomodations # in 11 places, 0 items. (0.0 vs 0.0)
		accnum[11][0] = 0L;
		single[11][0] = 0L;
		// accomodations # in 11 places, 1 items. (0.09090909090909091 vs
		// 0.09090909090909091)
		accnum[11][1] = 11L;
		single[11][1] = 1L;
		// accomodations # in 11 places, 2 items. (0.18181818181818182 vs
		// 0.18181818181818182)
		accnum[11][2] = 55L;
		single[11][2] = 10L;
		// accomodations # in 11 places, 3 items. (0.2727272727272727 vs
		// 0.2727272727272727)
		accnum[11][3] = 165L;
		single[11][3] = 45L;
		// accomodations # in 11 places, 4 items. (0.36363636363636365 vs
		// 0.36363636363636365)
		accnum[11][4] = 330L;
		single[11][4] = 120L;
		// accomodations # in 11 places, 5 items. (0.45454545454545453 vs
		// 0.45454545454545453)
		accnum[11][5] = 462L;
		single[11][5] = 210L;
		// accomodations # in 11 places, 6 items. (0.5454545454545454 vs
		// 0.5454545454545454)
		accnum[11][6] = 462L;
		single[11][6] = 252L;
		// accomodations # in 11 places, 7 items. (0.6363636363636364 vs
		// 0.6363636363636364)
		accnum[11][7] = 330L;
		single[11][7] = 210L;
		// accomodations # in 11 places, 8 items. (0.7272727272727273 vs
		// 0.7272727272727273)
		accnum[11][8] = 165L;
		single[11][8] = 120L;
		// accomodations # in 11 places, 9 items. (0.8181818181818182 vs
		// 0.8181818181818182)
		accnum[11][9] = 55L;
		single[11][9] = 45L;
		// accomodations # in 11 places, 10 items. (0.9090909090909091 vs
		// 0.9090909090909091)
		accnum[11][10] = 11L;
		single[11][10] = 10L;
		// accomodations # in 11 places, 11 items. (1.0 vs 1.0)
		accnum[11][11] = 1L;
		single[11][11] = 1L;
		// accomodations # in 12 places, 0 items. (0.0 vs 0.0)
		accnum[12][0] = 0L;
		single[12][0] = 0L;
		// accomodations # in 12 places, 1 items. (0.08333333333333333 vs
		// 0.08333333333333333)
		accnum[12][1] = 12L;
		single[12][1] = 1L;
		// accomodations # in 12 places, 2 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[12][2] = 66L;
		single[12][2] = 11L;
		// accomodations # in 12 places, 3 items. (0.25 vs 0.25)
		accnum[12][3] = 220L;
		single[12][3] = 55L;
		// accomodations # in 12 places, 4 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[12][4] = 495L;
		single[12][4] = 165L;
		// accomodations # in 12 places, 5 items. (0.4166666666666667 vs
		// 0.4166666666666667)
		accnum[12][5] = 792L;
		single[12][5] = 330L;
		// accomodations # in 12 places, 6 items. (0.5 vs 0.5)
		accnum[12][6] = 924L;
		single[12][6] = 462L;
		// accomodations # in 12 places, 7 items. (0.5833333333333334 vs
		// 0.5833333333333334)
		accnum[12][7] = 792L;
		single[12][7] = 462L;
		// accomodations # in 12 places, 8 items. (0.6666666666666666 vs
		// 0.6666666666666666)
		accnum[12][8] = 495L;
		single[12][8] = 330L;
		// accomodations # in 12 places, 9 items. (0.75 vs 0.75)
		accnum[12][9] = 220L;
		single[12][9] = 165L;
		// accomodations # in 12 places, 10 items. (0.8333333333333334 vs
		// 0.8333333333333334)
		accnum[12][10] = 66L;
		single[12][10] = 55L;
		// accomodations # in 12 places, 11 items. (0.9166666666666666 vs
		// 0.9166666666666666)
		accnum[12][11] = 12L;
		single[12][11] = 11L;
		// accomodations # in 13 places, 0 items. (0.0 vs 0.0)
		accnum[13][0] = 0L;
		single[13][0] = 0L;
		// accomodations # in 13 places, 1 items. (0.07692307692307693 vs
		// 0.07692307692307693)
		accnum[13][1] = 13L;
		single[13][1] = 1L;
		// accomodations # in 13 places, 2 items. (0.15384615384615385 vs
		// 0.15384615384615385)
		accnum[13][2] = 78L;
		single[13][2] = 12L;
		// accomodations # in 13 places, 3 items. (0.23076923076923078 vs
		// 0.23076923076923078)
		accnum[13][3] = 286L;
		single[13][3] = 66L;
		// accomodations # in 13 places, 4 items. (0.3076923076923077 vs
		// 0.3076923076923077)
		accnum[13][4] = 715L;
		single[13][4] = 220L;
		// accomodations # in 13 places, 5 items. (0.38461538461538464 vs
		// 0.38461538461538464)
		accnum[13][5] = 1287L;
		single[13][5] = 495L;
		// accomodations # in 13 places, 6 items. (0.46153846153846156 vs
		// 0.46153846153846156)
		accnum[13][6] = 1716L;
		single[13][6] = 792L;
		// accomodations # in 13 places, 7 items. (0.5384615384615384 vs
		// 0.5384615384615384)
		accnum[13][7] = 1716L;
		single[13][7] = 924L;
		// accomodations # in 13 places, 8 items. (0.6153846153846154 vs
		// 0.6153846153846154)
		accnum[13][8] = 1287L;
		single[13][8] = 792L;
		// accomodations # in 13 places, 9 items. (0.6923076923076923 vs
		// 0.6923076923076923)
		accnum[13][9] = 715L;
		single[13][9] = 495L;
		// accomodations # in 13 places, 10 items. (0.7692307692307693 vs
		// 0.7692307692307693)
		accnum[13][10] = 286L;
		single[13][10] = 220L;
		// accomodations # in 13 places, 11 items. (0.8461538461538461 vs
		// 0.8461538461538461)
		accnum[13][11] = 78L;
		single[13][11] = 66L;
		// accomodations # in 14 places, 0 items. (0.0 vs 0.0)
		accnum[14][0] = 0L;
		single[14][0] = 0L;
		// accomodations # in 14 places, 1 items. (0.07142857142857142 vs
		// 0.07142857142857142)
		accnum[14][1] = 14L;
		single[14][1] = 1L;
		// accomodations # in 14 places, 2 items. (0.14285714285714285 vs
		// 0.14285714285714285)
		accnum[14][2] = 91L;
		single[14][2] = 13L;
		// accomodations # in 14 places, 3 items. (0.21428571428571427 vs
		// 0.21428571428571427)
		accnum[14][3] = 364L;
		single[14][3] = 78L;
		// accomodations # in 14 places, 4 items. (0.2857142857142857 vs
		// 0.2857142857142857)
		accnum[14][4] = 1001L;
		single[14][4] = 286L;
		// accomodations # in 14 places, 5 items. (0.35714285714285715 vs
		// 0.35714285714285715)
		accnum[14][5] = 2002L;
		single[14][5] = 715L;
		// accomodations # in 14 places, 6 items. (0.42857142857142855 vs
		// 0.42857142857142855)
		accnum[14][6] = 3003L;
		single[14][6] = 1287L;
		// accomodations # in 14 places, 7 items. (0.5 vs 0.5)
		accnum[14][7] = 3432L;
		single[14][7] = 1716L;
		// accomodations # in 14 places, 8 items. (0.5714285714285714 vs
		// 0.5714285714285714)
		accnum[14][8] = 3003L;
		single[14][8] = 1716L;
		// accomodations # in 14 places, 9 items. (0.6428571428571429 vs
		// 0.6428571428571429)
		accnum[14][9] = 2002L;
		single[14][9] = 1287L;
		// accomodations # in 14 places, 10 items. (0.7142857142857143 vs
		// 0.7142857142857143)
		accnum[14][10] = 1001L;
		single[14][10] = 715L;
		// accomodations # in 14 places, 11 items. (0.7857142857142857 vs
		// 0.7857142857142857)
		accnum[14][11] = 364L;
		single[14][11] = 286L;
		// accomodations # in 15 places, 0 items. (0.0 vs 0.0)
		accnum[15][0] = 0L;
		single[15][0] = 0L;
		// accomodations # in 15 places, 1 items. (0.06666666666666667 vs
		// 0.06666666666666667)
		accnum[15][1] = 15L;
		single[15][1] = 1L;
		// accomodations # in 15 places, 2 items. (0.13333333333333333 vs
		// 0.13333333333333333)
		accnum[15][2] = 105L;
		single[15][2] = 14L;
		// accomodations # in 15 places, 3 items. (0.2 vs 0.2)
		accnum[15][3] = 455L;
		single[15][3] = 91L;
		// accomodations # in 15 places, 4 items. (0.26666666666666666 vs
		// 0.26666666666666666)
		accnum[15][4] = 1365L;
		single[15][4] = 364L;
		// accomodations # in 15 places, 5 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[15][5] = 3003L;
		single[15][5] = 1001L;
		// accomodations # in 15 places, 6 items. (0.4 vs 0.4)
		accnum[15][6] = 5005L;
		single[15][6] = 2002L;
		// accomodations # in 15 places, 7 items. (0.4666666666666667 vs
		// 0.4666666666666667)
		accnum[15][7] = 6435L;
		single[15][7] = 3003L;
		// accomodations # in 15 places, 8 items. (0.5333333333333333 vs
		// 0.5333333333333333)
		accnum[15][8] = 6435L;
		single[15][8] = 3432L;
		// accomodations # in 15 places, 9 items. (0.6 vs 0.6)
		accnum[15][9] = 5005L;
		single[15][9] = 3003L;
		// accomodations # in 15 places, 10 items. (0.6666666666666666 vs
		// 0.6666666666666666)
		accnum[15][10] = 3003L;
		single[15][10] = 2002L;
		// accomodations # in 15 places, 11 items. (0.7333333333333333 vs
		// 0.7333333333333333)
		accnum[15][11] = 1365L;
		single[15][11] = 1001L;
		// accomodations # in 16 places, 0 items. (0.0 vs 0.0)
		accnum[16][0] = 0L;
		single[16][0] = 0L;
		// accomodations # in 16 places, 1 items. (0.0625 vs 0.0625)
		accnum[16][1] = 16L;
		single[16][1] = 1L;
		// accomodations # in 16 places, 2 items. (0.125 vs 0.125)
		accnum[16][2] = 120L;
		single[16][2] = 15L;
		// accomodations # in 16 places, 3 items. (0.1875 vs 0.1875)
		accnum[16][3] = 560L;
		single[16][3] = 105L;
		// accomodations # in 16 places, 4 items. (0.25 vs 0.25)
		accnum[16][4] = 1820L;
		single[16][4] = 455L;
		// accomodations # in 16 places, 5 items. (0.3125 vs 0.3125)
		accnum[16][5] = 4368L;
		single[16][5] = 1365L;
		// accomodations # in 16 places, 6 items. (0.375 vs 0.375)
		accnum[16][6] = 8008L;
		single[16][6] = 3003L;
		// accomodations # in 16 places, 7 items. (0.4375 vs 0.4375)
		accnum[16][7] = 11440L;
		single[16][7] = 5005L;
		// accomodations # in 16 places, 8 items. (0.5 vs 0.5)
		accnum[16][8] = 12870L;
		single[16][8] = 6435L;
		// accomodations # in 16 places, 9 items. (0.5625 vs 0.5625)
		accnum[16][9] = 11440L;
		single[16][9] = 6435L;
		// accomodations # in 16 places, 10 items. (0.625 vs 0.625)
		accnum[16][10] = 8008L;
		single[16][10] = 5005L;
		// accomodations # in 16 places, 11 items. (0.6875 vs 0.6875)
		accnum[16][11] = 4368L;
		single[16][11] = 3003L;
		// accomodations # in 17 places, 0 items. (0.0 vs 0.0)
		accnum[17][0] = 0L;
		single[17][0] = 0L;
		// accomodations # in 17 places, 1 items. (0.058823529411764705 vs
		// 0.058823529411764705)
		accnum[17][1] = 17L;
		single[17][1] = 1L;
		// accomodations # in 17 places, 2 items. (0.11764705882352941 vs
		// 0.11764705882352941)
		accnum[17][2] = 136L;
		single[17][2] = 16L;
		// accomodations # in 17 places, 3 items. (0.17647058823529413 vs
		// 0.17647058823529413)
		accnum[17][3] = 680L;
		single[17][3] = 120L;
		// accomodations # in 17 places, 4 items. (0.23529411764705882 vs
		// 0.23529411764705882)
		accnum[17][4] = 2380L;
		single[17][4] = 560L;
		// accomodations # in 17 places, 5 items. (0.29411764705882354 vs
		// 0.29411764705882354)
		accnum[17][5] = 6188L;
		single[17][5] = 1820L;
		// accomodations # in 17 places, 6 items. (0.35294117647058826 vs
		// 0.35294117647058826)
		accnum[17][6] = 12376L;
		single[17][6] = 4368L;
		// accomodations # in 17 places, 7 items. (0.4117647058823529 vs
		// 0.4117647058823529)
		accnum[17][7] = 19448L;
		single[17][7] = 8008L;
		// accomodations # in 17 places, 8 items. (0.47058823529411764 vs
		// 0.47058823529411764)
		accnum[17][8] = 24310L;
		single[17][8] = 11440L;
		// accomodations # in 17 places, 9 items. (0.5294117647058824 vs
		// 0.5294117647058824)
		accnum[17][9] = 24310L;
		single[17][9] = 12870L;
		// accomodations # in 17 places, 10 items. (0.5882352941176471 vs
		// 0.5882352941176471)
		accnum[17][10] = 19448L;
		single[17][10] = 11440L;
		// accomodations # in 17 places, 11 items. (0.6470588235294118 vs
		// 0.6470588235294118)
		accnum[17][11] = 12376L;
		single[17][11] = 8008L;
		// accomodations # in 18 places, 0 items. (0.0 vs 0.0)
		accnum[18][0] = 0L;
		single[18][0] = 0L;
		// accomodations # in 18 places, 1 items. (0.05555555555555555 vs
		// 0.05555555555555555)
		accnum[18][1] = 18L;
		single[18][1] = 1L;
		// accomodations # in 18 places, 2 items. (0.1111111111111111 vs
		// 0.1111111111111111)
		accnum[18][2] = 153L;
		single[18][2] = 17L;
		// accomodations # in 18 places, 3 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[18][3] = 816L;
		single[18][3] = 136L;
		// accomodations # in 18 places, 4 items. (0.2222222222222222 vs
		// 0.2222222222222222)
		accnum[18][4] = 3060L;
		single[18][4] = 680L;
		// accomodations # in 18 places, 5 items. (0.2777777777777778 vs
		// 0.2777777777777778)
		accnum[18][5] = 8568L;
		single[18][5] = 2380L;
		// accomodations # in 18 places, 6 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[18][6] = 18564L;
		single[18][6] = 6188L;
		// accomodations # in 18 places, 7 items. (0.3888888888888889 vs
		// 0.3888888888888889)
		accnum[18][7] = 31824L;
		single[18][7] = 12376L;
		// accomodations # in 18 places, 8 items. (0.4444444444444444 vs
		// 0.4444444444444444)
		accnum[18][8] = 43758L;
		single[18][8] = 19448L;
		// accomodations # in 18 places, 9 items. (0.5 vs 0.5)
		accnum[18][9] = 48620L;
		single[18][9] = 24310L;
		// accomodations # in 18 places, 10 items. (0.5555555555555556 vs
		// 0.5555555555555556)
		accnum[18][10] = 43758L;
		single[18][10] = 24310L;
		// accomodations # in 18 places, 11 items. (0.6111111111111112 vs
		// 0.6111111111111112)
		accnum[18][11] = 31824L;
		single[18][11] = 19448L;
		// accomodations # in 19 places, 0 items. (0.0 vs 0.0)
		accnum[19][0] = 0L;
		single[19][0] = 0L;
		// accomodations # in 19 places, 1 items. (0.05263157894736842 vs
		// 0.05263157894736842)
		accnum[19][1] = 19L;
		single[19][1] = 1L;
		// accomodations # in 19 places, 2 items. (0.10526315789473684 vs
		// 0.10526315789473684)
		accnum[19][2] = 171L;
		single[19][2] = 18L;
		// accomodations # in 19 places, 3 items. (0.15789473684210525 vs
		// 0.15789473684210525)
		accnum[19][3] = 969L;
		single[19][3] = 153L;
		// accomodations # in 19 places, 4 items. (0.21052631578947367 vs
		// 0.21052631578947367)
		accnum[19][4] = 3876L;
		single[19][4] = 816L;
		// accomodations # in 19 places, 5 items. (0.2631578947368421 vs
		// 0.2631578947368421)
		accnum[19][5] = 11628L;
		single[19][5] = 3060L;
		// accomodations # in 19 places, 6 items. (0.3157894736842105 vs
		// 0.3157894736842105)
		accnum[19][6] = 27132L;
		single[19][6] = 8568L;
		// accomodations # in 19 places, 7 items. (0.3684210526315789 vs
		// 0.3684210526315789)
		accnum[19][7] = 50388L;
		single[19][7] = 18564L;
		// accomodations # in 19 places, 8 items. (0.42105263157894735 vs
		// 0.42105263157894735)
		accnum[19][8] = 75582L;
		single[19][8] = 31824L;
		// accomodations # in 19 places, 9 items. (0.47368421052631576 vs
		// 0.47368421052631576)
		accnum[19][9] = 92378L;
		single[19][9] = 43758L;
		// accomodations # in 19 places, 10 items. (0.5263157894736842 vs
		// 0.5263157894736842)
		accnum[19][10] = 92378L;
		single[19][10] = 48620L;
		// accomodations # in 19 places, 11 items. (0.5789473684210527 vs
		// 0.5789473684210527)
		accnum[19][11] = 75582L;
		single[19][11] = 43758L;
		// accomodations # in 20 places, 0 items. (0.0 vs 0.0)
		accnum[20][0] = 0L;
		single[20][0] = 0L;
		// accomodations # in 20 places, 1 items. (0.05 vs 0.05)
		accnum[20][1] = 20L;
		single[20][1] = 1L;
		// accomodations # in 20 places, 2 items. (0.1 vs 0.1)
		accnum[20][2] = 190L;
		single[20][2] = 19L;
		// accomodations # in 20 places, 3 items. (0.15 vs 0.15)
		accnum[20][3] = 1140L;
		single[20][3] = 171L;
		// accomodations # in 20 places, 4 items. (0.2 vs 0.2)
		accnum[20][4] = 4845L;
		single[20][4] = 969L;
		// accomodations # in 20 places, 5 items. (0.25 vs 0.25)
		accnum[20][5] = 15504L;
		single[20][5] = 3876L;
		// accomodations # in 20 places, 6 items. (0.3 vs 0.3)
		accnum[20][6] = 38760L;
		single[20][6] = 11628L;
		// accomodations # in 20 places, 7 items. (0.35 vs 0.35)
		accnum[20][7] = 77520L;
		single[20][7] = 27132L;
		// accomodations # in 20 places, 8 items. (0.4 vs 0.4)
		accnum[20][8] = 125970L;
		single[20][8] = 50388L;
		// accomodations # in 20 places, 9 items. (0.45 vs 0.45)
		accnum[20][9] = 167960L;
		single[20][9] = 75582L;
		// accomodations # in 20 places, 10 items. (0.5 vs 0.5)
		accnum[20][10] = 184756L;
		single[20][10] = 92378L;
		// accomodations # in 20 places, 11 items. (0.55 vs 0.55)
		accnum[20][11] = 167960L;
		single[20][11] = 92378L;
		// accomodations # in 21 places, 0 items. (0.0 vs 0.0)
		accnum[21][0] = 0L;
		single[21][0] = 0L;
		// accomodations # in 21 places, 1 items. (0.047619047619047616 vs
		// 0.047619047619047616)
		accnum[21][1] = 21L;
		single[21][1] = 1L;
		// accomodations # in 21 places, 2 items. (0.09523809523809523 vs
		// 0.09523809523809523)
		accnum[21][2] = 210L;
		single[21][2] = 20L;
		// accomodations # in 21 places, 3 items. (0.14285714285714285 vs
		// 0.14285714285714285)
		accnum[21][3] = 1330L;
		single[21][3] = 190L;
		// accomodations # in 21 places, 4 items. (0.19047619047619047 vs
		// 0.19047619047619047)
		accnum[21][4] = 5985L;
		single[21][4] = 1140L;
		// accomodations # in 21 places, 5 items. (0.23809523809523808 vs
		// 0.23809523809523808)
		accnum[21][5] = 20349L;
		single[21][5] = 4845L;
		// accomodations # in 21 places, 6 items. (0.2857142857142857 vs
		// 0.2857142857142857)
		accnum[21][6] = 54264L;
		single[21][6] = 15504L;
		// accomodations # in 21 places, 7 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[21][7] = 116280L;
		single[21][7] = 38760L;
		// accomodations # in 21 places, 8 items. (0.38095238095238093 vs
		// 0.38095238095238093)
		accnum[21][8] = 203490L;
		single[21][8] = 77520L;
		// accomodations # in 21 places, 9 items. (0.42857142857142855 vs
		// 0.42857142857142855)
		accnum[21][9] = 293930L;
		single[21][9] = 125970L;
		// accomodations # in 21 places, 10 items. (0.47619047619047616 vs
		// 0.47619047619047616)
		accnum[21][10] = 352716L;
		single[21][10] = 167960L;
		// accomodations # in 21 places, 11 items. (0.5238095238095238 vs
		// 0.5238095238095238)
		accnum[21][11] = 352716L;
		single[21][11] = 184756L;
		// accomodations # in 22 places, 0 items. (0.0 vs 0.0)
		accnum[22][0] = 0L;
		single[22][0] = 0L;
		// accomodations # in 22 places, 1 items. (0.045454545454545456 vs
		// 0.045454545454545456)
		accnum[22][1] = 22L;
		single[22][1] = 1L;
		// accomodations # in 22 places, 2 items. (0.09090909090909091 vs
		// 0.09090909090909091)
		accnum[22][2] = 231L;
		single[22][2] = 21L;
		// accomodations # in 22 places, 3 items. (0.13636363636363635 vs
		// 0.13636363636363635)
		accnum[22][3] = 1540L;
		single[22][3] = 210L;
		// accomodations # in 22 places, 4 items. (0.18181818181818182 vs
		// 0.18181818181818182)
		accnum[22][4] = 7315L;
		single[22][4] = 1330L;
		// accomodations # in 22 places, 5 items. (0.22727272727272727 vs
		// 0.22727272727272727)
		accnum[22][5] = 26334L;
		single[22][5] = 5985L;
		// accomodations # in 22 places, 6 items. (0.2727272727272727 vs
		// 0.2727272727272727)
		accnum[22][6] = 74613L;
		single[22][6] = 20349L;
		// accomodations # in 22 places, 7 items. (0.3181818181818182 vs
		// 0.3181818181818182)
		accnum[22][7] = 170544L;
		single[22][7] = 54264L;
		// accomodations # in 22 places, 8 items. (0.36363636363636365 vs
		// 0.36363636363636365)
		accnum[22][8] = 319770L;
		single[22][8] = 116280L;
		// accomodations # in 22 places, 9 items. (0.4090909090909091 vs
		// 0.4090909090909091)
		accnum[22][9] = 497420L;
		single[22][9] = 203490L;
		// accomodations # in 22 places, 10 items. (0.45454545454545453 vs
		// 0.45454545454545453)
		accnum[22][10] = 646646L;
		single[22][10] = 293930L;
		// accomodations # in 22 places, 11 items. (0.5 vs 0.5)
		accnum[22][11] = 705432L;
		single[22][11] = 352716L;
		// accomodations # in 23 places, 0 items. (0.0 vs 0.0)
		accnum[23][0] = 0L;
		single[23][0] = 0L;
		// accomodations # in 23 places, 1 items. (0.043478260869565216 vs
		// 0.043478260869565216)
		accnum[23][1] = 23L;
		single[23][1] = 1L;
		// accomodations # in 23 places, 2 items. (0.08695652173913043 vs
		// 0.08695652173913043)
		accnum[23][2] = 253L;
		single[23][2] = 22L;
		// accomodations # in 23 places, 3 items. (0.13043478260869565 vs
		// 0.13043478260869565)
		accnum[23][3] = 1771L;
		single[23][3] = 231L;
		// accomodations # in 23 places, 4 items. (0.17391304347826086 vs
		// 0.17391304347826086)
		accnum[23][4] = 8855L;
		single[23][4] = 1540L;
		// accomodations # in 23 places, 5 items. (0.21739130434782608 vs
		// 0.21739130434782608)
		accnum[23][5] = 33649L;
		single[23][5] = 7315L;
		// accomodations # in 23 places, 6 items. (0.2608695652173913 vs
		// 0.2608695652173913)
		accnum[23][6] = 100947L;
		single[23][6] = 26334L;
		// accomodations # in 23 places, 7 items. (0.30434782608695654 vs
		// 0.30434782608695654)
		accnum[23][7] = 245157L;
		single[23][7] = 74613L;
		// accomodations # in 23 places, 8 items. (0.34782608695652173 vs
		// 0.34782608695652173)
		accnum[23][8] = 490314L;
		single[23][8] = 170544L;
		// accomodations # in 23 places, 9 items. (0.391304347826087 vs
		// 0.391304347826087)
		accnum[23][9] = 817190L;
		single[23][9] = 319770L;
		// accomodations # in 23 places, 10 items. (0.43478260869565216 vs
		// 0.43478260869565216)
		accnum[23][10] = 1144066L;
		single[23][10] = 497420L;
		// accomodations # in 23 places, 11 items. (0.4782608695652174 vs
		// 0.4782608695652174)
		accnum[23][11] = 1352078L;
		single[23][11] = 646646L;
		// accomodations # in 24 places, 0 items. (0.0 vs 0.0)
		accnum[24][0] = 0L;
		single[24][0] = 0L;
		// accomodations # in 24 places, 1 items. (0.041666666666666664 vs
		// 0.041666666666666664)
		accnum[24][1] = 24L;
		single[24][1] = 1L;
		// accomodations # in 24 places, 2 items. (0.08333333333333333 vs
		// 0.08333333333333333)
		accnum[24][2] = 276L;
		single[24][2] = 23L;
		// accomodations # in 24 places, 3 items. (0.125 vs 0.125)
		accnum[24][3] = 2024L;
		single[24][3] = 253L;
		// accomodations # in 24 places, 4 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[24][4] = 10626L;
		single[24][4] = 1771L;
		// accomodations # in 24 places, 5 items. (0.20833333333333334 vs
		// 0.20833333333333334)
		accnum[24][5] = 42504L;
		single[24][5] = 8855L;
		// accomodations # in 24 places, 6 items. (0.25 vs 0.25)
		accnum[24][6] = 134596L;
		single[24][6] = 33649L;
		// accomodations # in 24 places, 7 items. (0.2916666666666667 vs
		// 0.2916666666666667)
		accnum[24][7] = 346104L;
		single[24][7] = 100947L;
		// accomodations # in 24 places, 8 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[24][8] = 735471L;
		single[24][8] = 245157L;
		// accomodations # in 24 places, 9 items. (0.375 vs 0.375)
		accnum[24][9] = 1307504L;
		single[24][9] = 490314L;
		// accomodations # in 24 places, 10 items. (0.4166666666666667 vs
		// 0.4166666666666667)
		accnum[24][10] = 1961256L;
		single[24][10] = 817190L;
		// accomodations # in 24 places, 11 items. (0.4583333333333333 vs
		// 0.4583333333333333)
		accnum[24][11] = 2496144L;
		single[24][11] = 1144066L;
		// accomodations # in 25 places, 0 items. (0.0 vs 0.0)
		accnum[25][0] = 0L;
		single[25][0] = 0L;
		// accomodations # in 25 places, 1 items. (0.04 vs 0.04)
		accnum[25][1] = 25L;
		single[25][1] = 1L;
		// accomodations # in 25 places, 2 items. (0.08 vs 0.08)
		accnum[25][2] = 300L;
		single[25][2] = 24L;
		// accomodations # in 25 places, 3 items. (0.12 vs 0.12)
		accnum[25][3] = 2300L;
		single[25][3] = 276L;
		// accomodations # in 25 places, 4 items. (0.16 vs 0.16)
		accnum[25][4] = 12650L;
		single[25][4] = 2024L;
		// accomodations # in 25 places, 5 items. (0.2 vs 0.2)
		accnum[25][5] = 53130L;
		single[25][5] = 10626L;
		// accomodations # in 25 places, 6 items. (0.24 vs 0.24)
		accnum[25][6] = 177100L;
		single[25][6] = 42504L;
		// accomodations # in 25 places, 7 items. (0.28 vs 0.28)
		accnum[25][7] = 480700L;
		single[25][7] = 134596L;
		// accomodations # in 25 places, 8 items. (0.32 vs 0.32)
		accnum[25][8] = 1081575L;
		single[25][8] = 346104L;
		// accomodations # in 25 places, 9 items. (0.36 vs 0.36)
		accnum[25][9] = 2042975L;
		single[25][9] = 735471L;
		// accomodations # in 25 places, 10 items. (0.4 vs 0.4)
		accnum[25][10] = 3268760L;
		single[25][10] = 1307504L;
		// accomodations # in 25 places, 11 items. (0.44 vs 0.44)
		accnum[25][11] = 4457400L;
		single[25][11] = 1961256L;
		// accomodations # in 26 places, 0 items. (0.0 vs 0.0)
		accnum[26][0] = 0L;
		single[26][0] = 0L;
		// accomodations # in 26 places, 1 items. (0.038461538461538464 vs
		// 0.038461538461538464)
		accnum[26][1] = 26L;
		single[26][1] = 1L;
		// accomodations # in 26 places, 2 items. (0.07692307692307693 vs
		// 0.07692307692307693)
		accnum[26][2] = 325L;
		single[26][2] = 25L;
		// accomodations # in 26 places, 3 items. (0.11538461538461539 vs
		// 0.11538461538461539)
		accnum[26][3] = 2600L;
		single[26][3] = 300L;
		// accomodations # in 26 places, 4 items. (0.15384615384615385 vs
		// 0.15384615384615385)
		accnum[26][4] = 14950L;
		single[26][4] = 2300L;
		// accomodations # in 26 places, 5 items. (0.19230769230769232 vs
		// 0.19230769230769232)
		accnum[26][5] = 65780L;
		single[26][5] = 12650L;
		// accomodations # in 26 places, 6 items. (0.23076923076923078 vs
		// 0.23076923076923078)
		accnum[26][6] = 230230L;
		single[26][6] = 53130L;
		// accomodations # in 26 places, 7 items. (0.2692307692307692 vs
		// 0.2692307692307692)
		accnum[26][7] = 657800L;
		single[26][7] = 177100L;
		// accomodations # in 26 places, 8 items. (0.3076923076923077 vs
		// 0.3076923076923077)
		accnum[26][8] = 1562275L;
		single[26][8] = 480700L;
		// accomodations # in 26 places, 9 items. (0.34615384615384615 vs
		// 0.34615384615384615)
		accnum[26][9] = 3124550L;
		single[26][9] = 1081575L;
		// accomodations # in 26 places, 10 items. (0.38461538461538464 vs
		// 0.38461538461538464)
		accnum[26][10] = 5311735L;
		single[26][10] = 2042975L;
		// accomodations # in 26 places, 11 items. (0.4230769230769231 vs
		// 0.4230769230769231)
		accnum[26][11] = 7726160L;
		single[26][11] = 3268760L;
		// accomodations # in 27 places, 0 items. (0.0 vs 0.0)
		accnum[27][0] = 0L;
		single[27][0] = 0L;
		// accomodations # in 27 places, 1 items. (0.037037037037037035 vs
		// 0.037037037037037035)
		accnum[27][1] = 27L;
		single[27][1] = 1L;
		// accomodations # in 27 places, 2 items. (0.07407407407407407 vs
		// 0.07407407407407407)
		accnum[27][2] = 351L;
		single[27][2] = 26L;
		// accomodations # in 27 places, 3 items. (0.1111111111111111 vs
		// 0.1111111111111111)
		accnum[27][3] = 2925L;
		single[27][3] = 325L;
		// accomodations # in 27 places, 4 items. (0.14814814814814814 vs
		// 0.14814814814814814)
		accnum[27][4] = 17550L;
		single[27][4] = 2600L;
		// accomodations # in 27 places, 5 items. (0.18518518518518517 vs
		// 0.18518518518518517)
		accnum[27][5] = 80730L;
		single[27][5] = 14950L;
		// accomodations # in 27 places, 6 items. (0.2222222222222222 vs
		// 0.2222222222222222)
		accnum[27][6] = 296010L;
		single[27][6] = 65780L;
		// accomodations # in 27 places, 7 items. (0.25925925925925924 vs
		// 0.25925925925925924)
		accnum[27][7] = 888030L;
		single[27][7] = 230230L;
		// accomodations # in 27 places, 8 items. (0.2962962962962963 vs
		// 0.2962962962962963)
		accnum[27][8] = 2220075L;
		single[27][8] = 657800L;
		// accomodations # in 27 places, 9 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[27][9] = 4686825L;
		single[27][9] = 1562275L;
		// accomodations # in 27 places, 10 items. (0.37037037037037035 vs
		// 0.37037037037037035)
		accnum[27][10] = 8436285L;
		single[27][10] = 3124550L;
		// accomodations # in 27 places, 11 items. (0.4074074074074074 vs
		// 0.4074074074074074)
		accnum[27][11] = 13037895L;
		single[27][11] = 5311735L;
		// accomodations # in 28 places, 0 items. (0.0 vs 0.0)
		accnum[28][0] = 0L;
		single[28][0] = 0L;
		// accomodations # in 28 places, 1 items. (0.03571428571428571 vs
		// 0.03571428571428571)
		accnum[28][1] = 28L;
		single[28][1] = 1L;
		// accomodations # in 28 places, 2 items. (0.07142857142857142 vs
		// 0.07142857142857142)
		accnum[28][2] = 378L;
		single[28][2] = 27L;
		// accomodations # in 28 places, 3 items. (0.10714285714285714 vs
		// 0.10714285714285714)
		accnum[28][3] = 3276L;
		single[28][3] = 351L;
		// accomodations # in 28 places, 4 items. (0.14285714285714285 vs
		// 0.14285714285714285)
		accnum[28][4] = 20475L;
		single[28][4] = 2925L;
		// accomodations # in 28 places, 5 items. (0.17857142857142858 vs
		// 0.17857142857142858)
		accnum[28][5] = 98280L;
		single[28][5] = 17550L;
		// accomodations # in 28 places, 6 items. (0.21428571428571427 vs
		// 0.21428571428571427)
		accnum[28][6] = 376740L;
		single[28][6] = 80730L;
		// accomodations # in 28 places, 7 items. (0.25 vs 0.25)
		accnum[28][7] = 1184040L;
		single[28][7] = 296010L;
		// accomodations # in 28 places, 8 items. (0.2857142857142857 vs
		// 0.2857142857142857)
		accnum[28][8] = 3108105L;
		single[28][8] = 888030L;
		// accomodations # in 28 places, 9 items. (0.32142857142857145 vs
		// 0.32142857142857145)
		accnum[28][9] = 6906900L;
		single[28][9] = 2220075L;
		// accomodations # in 28 places, 10 items. (0.35714285714285715 vs
		// 0.35714285714285715)
		accnum[28][10] = 13123110L;
		single[28][10] = 4686825L;
		// accomodations # in 28 places, 11 items. (0.39285714285714285 vs
		// 0.39285714285714285)
		accnum[28][11] = 21474180L;
		single[28][11] = 8436285L;
		// accomodations # in 29 places, 0 items. (0.0 vs 0.0)
		accnum[29][0] = 0L;
		single[29][0] = 0L;
		// accomodations # in 29 places, 1 items. (0.034482758620689655 vs
		// 0.034482758620689655)
		accnum[29][1] = 29L;
		single[29][1] = 1L;
		// accomodations # in 29 places, 2 items. (0.06896551724137931 vs
		// 0.06896551724137931)
		accnum[29][2] = 406L;
		single[29][2] = 28L;
		// accomodations # in 29 places, 3 items. (0.10344827586206896 vs
		// 0.10344827586206896)
		accnum[29][3] = 3654L;
		single[29][3] = 378L;
		// accomodations # in 29 places, 4 items. (0.13793103448275862 vs
		// 0.13793103448275862)
		accnum[29][4] = 23751L;
		single[29][4] = 3276L;
		// accomodations # in 29 places, 5 items. (0.1724137931034483 vs
		// 0.1724137931034483)
		accnum[29][5] = 118755L;
		single[29][5] = 20475L;
		// accomodations # in 29 places, 6 items. (0.20689655172413793 vs
		// 0.20689655172413793)
		accnum[29][6] = 475020L;
		single[29][6] = 98280L;
		// accomodations # in 29 places, 7 items. (0.2413793103448276 vs
		// 0.2413793103448276)
		accnum[29][7] = 1560780L;
		single[29][7] = 376740L;
		// accomodations # in 29 places, 8 items. (0.27586206896551724 vs
		// 0.27586206896551724)
		accnum[29][8] = 4292145L;
		single[29][8] = 1184040L;
		// accomodations # in 29 places, 9 items. (0.3103448275862069 vs
		// 0.3103448275862069)
		accnum[29][9] = 10015005L;
		single[29][9] = 3108105L;
		// accomodations # in 29 places, 10 items. (0.3448275862068966 vs
		// 0.3448275862068966)
		accnum[29][10] = 20030010L;
		single[29][10] = 6906900L;
		// accomodations # in 29 places, 11 items. (0.3793103448275862 vs
		// 0.3793103448275862)
		accnum[29][11] = 34597290L;
		single[29][11] = 13123110L;
		// accomodations # in 30 places, 0 items. (0.0 vs 0.0)
		accnum[30][0] = 0L;
		single[30][0] = 0L;
		// accomodations # in 30 places, 1 items. (0.03333333333333333 vs
		// 0.03333333333333333)
		accnum[30][1] = 30L;
		single[30][1] = 1L;
		// accomodations # in 30 places, 2 items. (0.06666666666666667 vs
		// 0.06666666666666667)
		accnum[30][2] = 435L;
		single[30][2] = 29L;
		// accomodations # in 30 places, 3 items. (0.1 vs 0.1)
		accnum[30][3] = 4060L;
		single[30][3] = 406L;
		// accomodations # in 30 places, 4 items. (0.13333333333333333 vs
		// 0.13333333333333333)
		accnum[30][4] = 27405L;
		single[30][4] = 3654L;
		// accomodations # in 30 places, 5 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[30][5] = 142506L;
		single[30][5] = 23751L;
		// accomodations # in 30 places, 6 items. (0.2 vs 0.2)
		accnum[30][6] = 593775L;
		single[30][6] = 118755L;
		// accomodations # in 30 places, 7 items. (0.23333333333333334 vs
		// 0.23333333333333334)
		accnum[30][7] = 2035800L;
		single[30][7] = 475020L;
		// accomodations # in 30 places, 8 items. (0.26666666666666666 vs
		// 0.26666666666666666)
		accnum[30][8] = 5852925L;
		single[30][8] = 1560780L;
		// accomodations # in 30 places, 9 items. (0.3 vs 0.3)
		accnum[30][9] = 14307150L;
		single[30][9] = 4292145L;
		// accomodations # in 30 places, 10 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[30][10] = 30045015L;
		single[30][10] = 10015005L;
		// accomodations # in 30 places, 11 items. (0.36666666666666664 vs
		// 0.36666666666666664)
		accnum[30][11] = 54627300L;
		single[30][11] = 20030010L;
		// accomodations # in 31 places, 0 items. (0.0 vs 0.0)
		accnum[31][0] = 0L;
		single[31][0] = 0L;
		// accomodations # in 31 places, 1 items. (0.03225806451612903 vs
		// 0.03225806451612903)
		accnum[31][1] = 31L;
		single[31][1] = 1L;
		// accomodations # in 31 places, 2 items. (0.06451612903225806 vs
		// 0.06451612903225806)
		accnum[31][2] = 465L;
		single[31][2] = 30L;
		// accomodations # in 31 places, 3 items. (0.0967741935483871 vs
		// 0.0967741935483871)
		accnum[31][3] = 4495L;
		single[31][3] = 435L;
		// accomodations # in 31 places, 4 items. (0.12903225806451613 vs
		// 0.12903225806451613)
		accnum[31][4] = 31465L;
		single[31][4] = 4060L;
		// accomodations # in 31 places, 5 items. (0.16129032258064516 vs
		// 0.16129032258064516)
		accnum[31][5] = 169911L;
		single[31][5] = 27405L;
		// accomodations # in 31 places, 6 items. (0.1935483870967742 vs
		// 0.1935483870967742)
		accnum[31][6] = 736281L;
		single[31][6] = 142506L;
		// accomodations # in 31 places, 7 items. (0.22580645161290322 vs
		// 0.22580645161290322)
		accnum[31][7] = 2629575L;
		single[31][7] = 593775L;
		// accomodations # in 31 places, 8 items. (0.25806451612903225 vs
		// 0.25806451612903225)
		accnum[31][8] = 7888725L;
		single[31][8] = 2035800L;
		// accomodations # in 31 places, 9 items. (0.2903225806451613 vs
		// 0.2903225806451613)
		accnum[31][9] = 20160075L;
		single[31][9] = 5852925L;
		// accomodations # in 31 places, 10 items. (0.3225806451612903 vs
		// 0.3225806451612903)
		accnum[31][10] = 44352165L;
		single[31][10] = 14307150L;
		// accomodations # in 31 places, 11 items. (0.3548387096774194 vs
		// 0.3548387096774194)
		accnum[31][11] = 84672315L;
		single[31][11] = 30045015L;
		// accomodations # in 32 places, 0 items. (0.0 vs 0.0)
		accnum[32][0] = 0L;
		single[32][0] = 0L;
		// accomodations # in 32 places, 1 items. (0.03125 vs 0.03125)
		accnum[32][1] = 32L;
		single[32][1] = 1L;
		// accomodations # in 32 places, 2 items. (0.0625 vs 0.0625)
		accnum[32][2] = 496L;
		single[32][2] = 31L;
		// accomodations # in 32 places, 3 items. (0.09375 vs 0.09375)
		accnum[32][3] = 4960L;
		single[32][3] = 465L;
		// accomodations # in 32 places, 4 items. (0.125 vs 0.125)
		accnum[32][4] = 35960L;
		single[32][4] = 4495L;
		// accomodations # in 32 places, 5 items. (0.15625 vs 0.15625)
		accnum[32][5] = 201376L;
		single[32][5] = 31465L;
		// accomodations # in 32 places, 6 items. (0.1875 vs 0.1875)
		accnum[32][6] = 906192L;
		single[32][6] = 169911L;
		// accomodations # in 32 places, 7 items. (0.21875 vs 0.21875)
		accnum[32][7] = 3365856L;
		single[32][7] = 736281L;
		// accomodations # in 32 places, 8 items. (0.25 vs 0.25)
		accnum[32][8] = 10518300L;
		single[32][8] = 2629575L;
		// accomodations # in 32 places, 9 items. (0.28125 vs 0.28125)
		accnum[32][9] = 28048800L;
		single[32][9] = 7888725L;
		// accomodations # in 32 places, 10 items. (0.3125 vs 0.3125)
		accnum[32][10] = 64512240L;
		single[32][10] = 20160075L;
		// accomodations # in 32 places, 11 items. (0.34375 vs 0.34375)
		accnum[32][11] = 129024480L;
		single[32][11] = 44352165L;
		// accomodations # in 33 places, 0 items. (0.0 vs 0.0)
		accnum[33][0] = 0L;
		single[33][0] = 0L;
		// accomodations # in 33 places, 1 items. (0.030303030303030304 vs
		// 0.030303030303030304)
		accnum[33][1] = 33L;
		single[33][1] = 1L;
		// accomodations # in 33 places, 2 items. (0.06060606060606061 vs
		// 0.06060606060606061)
		accnum[33][2] = 528L;
		single[33][2] = 32L;
		// accomodations # in 33 places, 3 items. (0.09090909090909091 vs
		// 0.09090909090909091)
		accnum[33][3] = 5456L;
		single[33][3] = 496L;
		// accomodations # in 33 places, 4 items. (0.12121212121212122 vs
		// 0.12121212121212122)
		accnum[33][4] = 40920L;
		single[33][4] = 4960L;
		// accomodations # in 33 places, 5 items. (0.15151515151515152 vs
		// 0.15151515151515152)
		accnum[33][5] = 237336L;
		single[33][5] = 35960L;
		// accomodations # in 33 places, 6 items. (0.18181818181818182 vs
		// 0.18181818181818182)
		accnum[33][6] = 1107568L;
		single[33][6] = 201376L;
		// accomodations # in 33 places, 7 items. (0.21212121212121213 vs
		// 0.21212121212121213)
		accnum[33][7] = 4272048L;
		single[33][7] = 906192L;
		// accomodations # in 33 places, 8 items. (0.24242424242424243 vs
		// 0.24242424242424243)
		accnum[33][8] = 13884156L;
		single[33][8] = 3365856L;
		// accomodations # in 33 places, 9 items. (0.2727272727272727 vs
		// 0.2727272727272727)
		accnum[33][9] = 38567100L;
		single[33][9] = 10518300L;
		// accomodations # in 33 places, 10 items. (0.30303030303030304 vs
		// 0.30303030303030304)
		accnum[33][10] = 92561040L;
		single[33][10] = 28048800L;
		// accomodations # in 33 places, 11 items. (0.3333333333333333 vs
		// 0.3333333333333333)
		accnum[33][11] = 193536720L;
		single[33][11] = 64512240L;
		// accomodations # in 34 places, 0 items. (0.0 vs 0.0)
		accnum[34][0] = 0L;
		single[34][0] = 0L;
		// accomodations # in 34 places, 1 items. (0.029411764705882353 vs
		// 0.029411764705882353)
		accnum[34][1] = 34L;
		single[34][1] = 1L;
		// accomodations # in 34 places, 2 items. (0.058823529411764705 vs
		// 0.058823529411764705)
		accnum[34][2] = 561L;
		single[34][2] = 33L;
		// accomodations # in 34 places, 3 items. (0.08823529411764706 vs
		// 0.08823529411764706)
		accnum[34][3] = 5984L;
		single[34][3] = 528L;
		// accomodations # in 34 places, 4 items. (0.11764705882352941 vs
		// 0.11764705882352941)
		accnum[34][4] = 46376L;
		single[34][4] = 5456L;
		// accomodations # in 34 places, 5 items. (0.14705882352941177 vs
		// 0.14705882352941177)
		accnum[34][5] = 278256L;
		single[34][5] = 40920L;
		// accomodations # in 34 places, 6 items. (0.17647058823529413 vs
		// 0.17647058823529413)
		accnum[34][6] = 1344904L;
		single[34][6] = 237336L;
		// accomodations # in 34 places, 7 items. (0.20588235294117646 vs
		// 0.20588235294117646)
		accnum[34][7] = 5379616L;
		single[34][7] = 1107568L;
		// accomodations # in 34 places, 8 items. (0.23529411764705882 vs
		// 0.23529411764705882)
		accnum[34][8] = 18156204L;
		single[34][8] = 4272048L;
		// accomodations # in 34 places, 9 items. (0.2647058823529412 vs
		// 0.2647058823529412)
		accnum[34][9] = 52451256L;
		single[34][9] = 13884156L;
		// accomodations # in 34 places, 10 items. (0.29411764705882354 vs
		// 0.29411764705882354)
		accnum[34][10] = 131128140L;
		single[34][10] = 38567100L;
		// accomodations # in 34 places, 11 items. (0.3235294117647059 vs
		// 0.3235294117647059)
		accnum[34][11] = 286097760L;
		single[34][11] = 92561040L;
		// accomodations # in 35 places, 0 items. (0.0 vs 0.0)
		accnum[35][0] = 0L;
		single[35][0] = 0L;
		// accomodations # in 35 places, 1 items. (0.02857142857142857 vs
		// 0.02857142857142857)
		accnum[35][1] = 35L;
		single[35][1] = 1L;
		// accomodations # in 35 places, 2 items. (0.05714285714285714 vs
		// 0.05714285714285714)
		accnum[35][2] = 595L;
		single[35][2] = 34L;
		// accomodations # in 35 places, 3 items. (0.08571428571428572 vs
		// 0.08571428571428572)
		accnum[35][3] = 6545L;
		single[35][3] = 561L;
		// accomodations # in 35 places, 4 items. (0.11428571428571428 vs
		// 0.11428571428571428)
		accnum[35][4] = 52360L;
		single[35][4] = 5984L;
		// accomodations # in 35 places, 5 items. (0.14285714285714285 vs
		// 0.14285714285714285)
		accnum[35][5] = 324632L;
		single[35][5] = 46376L;
		// accomodations # in 35 places, 6 items. (0.17142857142857143 vs
		// 0.17142857142857143)
		accnum[35][6] = 1623160L;
		single[35][6] = 278256L;
		// accomodations # in 35 places, 7 items. (0.2 vs 0.2)
		accnum[35][7] = 6724520L;
		single[35][7] = 1344904L;
		// accomodations # in 35 places, 8 items. (0.22857142857142856 vs
		// 0.22857142857142856)
		accnum[35][8] = 23535820L;
		single[35][8] = 5379616L;
		// accomodations # in 35 places, 9 items. (0.2571428571428571 vs
		// 0.2571428571428571)
		accnum[35][9] = 70607460L;
		single[35][9] = 18156204L;
		// accomodations # in 35 places, 10 items. (0.2857142857142857 vs
		// 0.2857142857142857)
		accnum[35][10] = 183579396L;
		single[35][10] = 52451256L;
		// accomodations # in 35 places, 11 items. (0.3142857142857143 vs
		// 0.3142857142857143)
		accnum[35][11] = 417225900L;
		single[35][11] = 131128140L;
		// accomodations # in 36 places, 0 items. (0.0 vs 0.0)
		accnum[36][0] = 0L;
		single[36][0] = 0L;
		// accomodations # in 36 places, 1 items. (0.027777777777777776 vs
		// 0.027777777777777776)
		accnum[36][1] = 36L;
		single[36][1] = 1L;
		// accomodations # in 36 places, 2 items. (0.05555555555555555 vs
		// 0.05555555555555555)
		accnum[36][2] = 630L;
		single[36][2] = 35L;
		// accomodations # in 36 places, 3 items. (0.08333333333333333 vs
		// 0.08333333333333333)
		accnum[36][3] = 7140L;
		single[36][3] = 595L;
		// accomodations # in 36 places, 4 items. (0.1111111111111111 vs
		// 0.1111111111111111)
		accnum[36][4] = 58905L;
		single[36][4] = 6545L;
		// accomodations # in 36 places, 5 items. (0.1388888888888889 vs
		// 0.1388888888888889)
		accnum[36][5] = 376992L;
		single[36][5] = 52360L;
		// accomodations # in 36 places, 6 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[36][6] = 1947792L;
		single[36][6] = 324632L;
		// accomodations # in 36 places, 7 items. (0.19444444444444445 vs
		// 0.19444444444444445)
		accnum[36][7] = 8347680L;
		single[36][7] = 1623160L;
		// accomodations # in 36 places, 8 items. (0.2222222222222222 vs
		// 0.2222222222222222)
		accnum[36][8] = 30260340L;
		single[36][8] = 6724520L;
		// accomodations # in 36 places, 9 items. (0.25 vs 0.25)
		accnum[36][9] = 94143280L;
		single[36][9] = 23535820L;
		// accomodations # in 36 places, 10 items. (0.2777777777777778 vs
		// 0.2777777777777778)
		accnum[36][10] = 254186856L;
		single[36][10] = 70607460L;
		// accomodations # in 36 places, 11 items. (0.3055555555555556 vs
		// 0.3055555555555556)
		accnum[36][11] = 600805296L;
		single[36][11] = 183579396L;
		// accomodations # in 37 places, 0 items. (0.0 vs 0.0)
		accnum[37][0] = 0L;
		single[37][0] = 0L;
		// accomodations # in 37 places, 1 items. (0.02702702702702703 vs
		// 0.02702702702702703)
		accnum[37][1] = 37L;
		single[37][1] = 1L;
		// accomodations # in 37 places, 2 items. (0.05405405405405406 vs
		// 0.05405405405405406)
		accnum[37][2] = 666L;
		single[37][2] = 36L;
		// accomodations # in 37 places, 3 items. (0.08108108108108109 vs
		// 0.08108108108108109)
		accnum[37][3] = 7770L;
		single[37][3] = 630L;
		// accomodations # in 37 places, 4 items. (0.10810810810810811 vs
		// 0.10810810810810811)
		accnum[37][4] = 66045L;
		single[37][4] = 7140L;
		// accomodations # in 37 places, 5 items. (0.13513513513513514 vs
		// 0.13513513513513514)
		accnum[37][5] = 435897L;
		single[37][5] = 58905L;
		// accomodations # in 37 places, 6 items. (0.16216216216216217 vs
		// 0.16216216216216217)
		accnum[37][6] = 2324784L;
		single[37][6] = 376992L;
		// accomodations # in 37 places, 7 items. (0.1891891891891892 vs
		// 0.1891891891891892)
		accnum[37][7] = 10295472L;
		single[37][7] = 1947792L;
		// accomodations # in 37 places, 8 items. (0.21621621621621623 vs
		// 0.21621621621621623)
		accnum[37][8] = 38608020L;
		single[37][8] = 8347680L;
		// accomodations # in 37 places, 9 items. (0.24324324324324326 vs
		// 0.24324324324324326)
		accnum[37][9] = 124403620L;
		single[37][9] = 30260340L;
		// accomodations # in 37 places, 10 items. (0.2702702702702703 vs
		// 0.2702702702702703)
		accnum[37][10] = 348330136L;
		single[37][10] = 94143280L;
		// accomodations # in 37 places, 11 items. (0.2972972972972973 vs
		// 0.2972972972972973)
		accnum[37][11] = 854992152L;
		single[37][11] = 254186856L;
		// accomodations # in 38 places, 0 items. (0.0 vs 0.0)
		accnum[38][0] = 0L;
		single[38][0] = 0L;
		// accomodations # in 38 places, 1 items. (0.02631578947368421 vs
		// 0.02631578947368421)
		accnum[38][1] = 38L;
		single[38][1] = 1L;
		// accomodations # in 38 places, 2 items. (0.05263157894736842 vs
		// 0.05263157894736842)
		accnum[38][2] = 703L;
		single[38][2] = 37L;
		// accomodations # in 38 places, 3 items. (0.07894736842105263 vs
		// 0.07894736842105263)
		accnum[38][3] = 8436L;
		single[38][3] = 666L;
		// accomodations # in 38 places, 4 items. (0.10526315789473684 vs
		// 0.10526315789473684)
		accnum[38][4] = 73815L;
		single[38][4] = 7770L;
		// accomodations # in 38 places, 5 items. (0.13157894736842105 vs
		// 0.13157894736842105)
		accnum[38][5] = 501942L;
		single[38][5] = 66045L;
		// accomodations # in 38 places, 6 items. (0.15789473684210525 vs
		// 0.15789473684210525)
		accnum[38][6] = 2760681L;
		single[38][6] = 435897L;
		// accomodations # in 38 places, 7 items. (0.18421052631578946 vs
		// 0.18421052631578946)
		accnum[38][7] = 12620256L;
		single[38][7] = 2324784L;
		// accomodations # in 38 places, 8 items. (0.21052631578947367 vs
		// 0.21052631578947367)
		accnum[38][8] = 48903492L;
		single[38][8] = 10295472L;
		// accomodations # in 38 places, 9 items. (0.23684210526315788 vs
		// 0.23684210526315788)
		accnum[38][9] = 163011640L;
		single[38][9] = 38608020L;
		// accomodations # in 38 places, 10 items. (0.2631578947368421 vs
		// 0.2631578947368421)
		accnum[38][10] = 472733756L;
		single[38][10] = 124403620L;
		// accomodations # in 38 places, 11 items. (0.2894736842105263 vs
		// 0.2894736842105263)
		accnum[38][11] = 1203322288L;
		single[38][11] = 348330136L;
		// accomodations # in 39 places, 0 items. (0.0 vs 0.0)
		accnum[39][0] = 0L;
		single[39][0] = 0L;
		// accomodations # in 39 places, 1 items. (0.02564102564102564 vs
		// 0.02564102564102564)
		accnum[39][1] = 39L;
		single[39][1] = 1L;
		// accomodations # in 39 places, 2 items. (0.05128205128205128 vs
		// 0.05128205128205128)
		accnum[39][2] = 741L;
		single[39][2] = 38L;
		// accomodations # in 39 places, 3 items. (0.07692307692307693 vs
		// 0.07692307692307693)
		accnum[39][3] = 9139L;
		single[39][3] = 703L;
		// accomodations # in 39 places, 4 items. (0.10256410256410256 vs
		// 0.10256410256410256)
		accnum[39][4] = 82251L;
		single[39][4] = 8436L;
		// accomodations # in 39 places, 5 items. (0.1282051282051282 vs
		// 0.1282051282051282)
		accnum[39][5] = 575757L;
		single[39][5] = 73815L;
		// accomodations # in 39 places, 6 items. (0.15384615384615385 vs
		// 0.15384615384615385)
		accnum[39][6] = 3262623L;
		single[39][6] = 501942L;
		// accomodations # in 39 places, 7 items. (0.1794871794871795 vs
		// 0.1794871794871795)
		accnum[39][7] = 15380937L;
		single[39][7] = 2760681L;
		// accomodations # in 39 places, 8 items. (0.20512820512820512 vs
		// 0.20512820512820512)
		accnum[39][8] = 61523748L;
		single[39][8] = 12620256L;
		// accomodations # in 39 places, 9 items. (0.23076923076923078 vs
		// 0.23076923076923078)
		accnum[39][9] = 211915132L;
		single[39][9] = 48903492L;
		// accomodations # in 39 places, 10 items. (0.2564102564102564 vs
		// 0.2564102564102564)
		accnum[39][10] = 635745396L;
		single[39][10] = 163011640L;
		// accomodations # in 39 places, 11 items. (0.28205128205128205 vs
		// 0.28205128205128205)
		accnum[39][11] = 1676056044L;
		single[39][11] = 472733756L;
		// accomodations # in 40 places, 0 items. (0.0 vs 0.0)
		accnum[40][0] = 0L;
		single[40][0] = 0L;
		// accomodations # in 40 places, 1 items. (0.025 vs 0.025)
		accnum[40][1] = 40L;
		single[40][1] = 1L;
		// accomodations # in 40 places, 2 items. (0.05 vs 0.05)
		accnum[40][2] = 780L;
		single[40][2] = 39L;
		// accomodations # in 40 places, 3 items. (0.075 vs 0.075)
		accnum[40][3] = 9880L;
		single[40][3] = 741L;
		// accomodations # in 40 places, 4 items. (0.1 vs 0.1)
		accnum[40][4] = 91390L;
		single[40][4] = 9139L;
		// accomodations # in 40 places, 5 items. (0.125 vs 0.125)
		accnum[40][5] = 658008L;
		single[40][5] = 82251L;
		// accomodations # in 40 places, 6 items. (0.15 vs 0.15)
		accnum[40][6] = 3838380L;
		single[40][6] = 575757L;
		// accomodations # in 40 places, 7 items. (0.175 vs 0.175)
		accnum[40][7] = 18643560L;
		single[40][7] = 3262623L;
		// accomodations # in 40 places, 8 items. (0.2 vs 0.2)
		accnum[40][8] = 76904685L;
		single[40][8] = 15380937L;
		// accomodations # in 40 places, 9 items. (0.225 vs 0.225)
		accnum[40][9] = 273438880L;
		single[40][9] = 61523748L;
		// accomodations # in 40 places, 10 items. (0.25 vs 0.25)
		accnum[40][10] = 847660528L;
		single[40][10] = 211915132L;
		// accomodations # in 40 places, 11 items. (0.275 vs 0.275)
		accnum[40][11] = 2311801440L;
		single[40][11] = 635745396L;
		// accomodations # in 41 places, 0 items. (0.0 vs 0.0)
		accnum[41][0] = 0L;
		single[41][0] = 0L;
		// accomodations # in 41 places, 1 items. (0.024390243902439025 vs
		// 0.024390243902439025)
		accnum[41][1] = 41L;
		single[41][1] = 1L;
		// accomodations # in 41 places, 2 items. (0.04878048780487805 vs
		// 0.04878048780487805)
		accnum[41][2] = 820L;
		single[41][2] = 40L;
		// accomodations # in 41 places, 3 items. (0.07317073170731707 vs
		// 0.07317073170731707)
		accnum[41][3] = 10660L;
		single[41][3] = 780L;
		// accomodations # in 41 places, 4 items. (0.0975609756097561 vs
		// 0.0975609756097561)
		accnum[41][4] = 101270L;
		single[41][4] = 9880L;
		// accomodations # in 41 places, 5 items. (0.12195121951219512 vs
		// 0.12195121951219512)
		accnum[41][5] = 749398L;
		single[41][5] = 91390L;
		// accomodations # in 41 places, 6 items. (0.14634146341463414 vs
		// 0.14634146341463414)
		accnum[41][6] = 4496388L;
		single[41][6] = 658008L;
		// accomodations # in 41 places, 7 items. (0.17073170731707318 vs
		// 0.17073170731707318)
		accnum[41][7] = 22481940L;
		single[41][7] = 3838380L;
		// accomodations # in 41 places, 8 items. (0.1951219512195122 vs
		// 0.1951219512195122)
		accnum[41][8] = 95548245L;
		single[41][8] = 18643560L;
		// accomodations # in 41 places, 9 items. (0.21951219512195122 vs
		// 0.21951219512195122)
		accnum[41][9] = 350343565L;
		single[41][9] = 76904685L;
		// accomodations # in 41 places, 10 items. (0.24390243902439024 vs
		// 0.24390243902439024)
		accnum[41][10] = 1121099408L;
		single[41][10] = 273438880L;
		// accomodations # in 41 places, 11 items. (0.2682926829268293 vs
		// 0.2682926829268293)
		accnum[41][11] = 3159461968L;
		single[41][11] = 847660528L;
		// accomodations # in 42 places, 0 items. (0.0 vs 0.0)
		accnum[42][0] = 0L;
		single[42][0] = 0L;
		// accomodations # in 42 places, 1 items. (0.023809523809523808 vs
		// 0.023809523809523808)
		accnum[42][1] = 42L;
		single[42][1] = 1L;
		// accomodations # in 42 places, 2 items. (0.047619047619047616 vs
		// 0.047619047619047616)
		accnum[42][2] = 861L;
		single[42][2] = 41L;
		// accomodations # in 42 places, 3 items. (0.07142857142857142 vs
		// 0.07142857142857142)
		accnum[42][3] = 11480L;
		single[42][3] = 820L;
		// accomodations # in 42 places, 4 items. (0.09523809523809523 vs
		// 0.09523809523809523)
		accnum[42][4] = 111930L;
		single[42][4] = 10660L;
		// accomodations # in 42 places, 5 items. (0.11904761904761904 vs
		// 0.11904761904761904)
		accnum[42][5] = 850668L;
		single[42][5] = 101270L;
		// accomodations # in 42 places, 6 items. (0.14285714285714285 vs
		// 0.14285714285714285)
		accnum[42][6] = 5245786L;
		single[42][6] = 749398L;
		// accomodations # in 42 places, 7 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[42][7] = 26978328L;
		single[42][7] = 4496388L;
		// accomodations # in 42 places, 8 items. (0.19047619047619047 vs
		// 0.19047619047619047)
		accnum[42][8] = 118030185L;
		single[42][8] = 22481940L;
		// accomodations # in 42 places, 9 items. (0.21428571428571427 vs
		// 0.21428571428571427)
		accnum[42][9] = 445891810L;
		single[42][9] = 95548245L;
		// accomodations # in 42 places, 10 items. (0.23809523809523808 vs
		// 0.23809523809523808)
		accnum[42][10] = 1471442973L;
		single[42][10] = 350343565L;
		// accomodations # in 42 places, 11 items. (0.2619047619047619 vs
		// 0.2619047619047619)
		accnum[42][11] = 4280561376L;
		single[42][11] = 1121099408L;
		// accomodations # in 43 places, 0 items. (0.0 vs 0.0)
		accnum[43][0] = 0L;
		single[43][0] = 0L;
		// accomodations # in 43 places, 1 items. (0.023255813953488372 vs
		// 0.023255813953488372)
		accnum[43][1] = 43L;
		single[43][1] = 1L;
		// accomodations # in 43 places, 2 items. (0.046511627906976744 vs
		// 0.046511627906976744)
		accnum[43][2] = 903L;
		single[43][2] = 42L;
		// accomodations # in 43 places, 3 items. (0.06976744186046512 vs
		// 0.06976744186046512)
		accnum[43][3] = 12341L;
		single[43][3] = 861L;
		// accomodations # in 43 places, 4 items. (0.09302325581395349 vs
		// 0.09302325581395349)
		accnum[43][4] = 123410L;
		single[43][4] = 11480L;
		// accomodations # in 43 places, 5 items. (0.11627906976744186 vs
		// 0.11627906976744186)
		accnum[43][5] = 962598L;
		single[43][5] = 111930L;
		// accomodations # in 43 places, 6 items. (0.13953488372093023 vs
		// 0.13953488372093023)
		accnum[43][6] = 6096454L;
		single[43][6] = 850668L;
		// accomodations # in 43 places, 7 items. (0.16279069767441862 vs
		// 0.16279069767441862)
		accnum[43][7] = 32224114L;
		single[43][7] = 5245786L;
		// accomodations # in 43 places, 8 items. (0.18604651162790697 vs
		// 0.18604651162790697)
		accnum[43][8] = 145008513L;
		single[43][8] = 26978328L;
		// accomodations # in 43 places, 9 items. (0.20930232558139536 vs
		// 0.20930232558139536)
		accnum[43][9] = 563921995L;
		single[43][9] = 118030185L;
		// accomodations # in 43 places, 10 items. (0.23255813953488372 vs
		// 0.23255813953488372)
		accnum[43][10] = 1917334783L;
		single[43][10] = 445891810L;
		// accomodations # in 43 places, 11 items. (0.2558139534883721 vs
		// 0.2558139534883721)
		accnum[43][11] = 5752004349L;
		single[43][11] = 1471442973L;
		// accomodations # in 44 places, 0 items. (0.0 vs 0.0)
		accnum[44][0] = 0L;
		single[44][0] = 0L;
		// accomodations # in 44 places, 1 items. (0.022727272727272728 vs
		// 0.022727272727272728)
		accnum[44][1] = 44L;
		single[44][1] = 1L;
		// accomodations # in 44 places, 2 items. (0.045454545454545456 vs
		// 0.045454545454545456)
		accnum[44][2] = 946L;
		single[44][2] = 43L;
		// accomodations # in 44 places, 3 items. (0.06818181818181818 vs
		// 0.06818181818181818)
		accnum[44][3] = 13244L;
		single[44][3] = 903L;
		// accomodations # in 44 places, 4 items. (0.09090909090909091 vs
		// 0.09090909090909091)
		accnum[44][4] = 135751L;
		single[44][4] = 12341L;
		// accomodations # in 44 places, 5 items. (0.11363636363636363 vs
		// 0.11363636363636363)
		accnum[44][5] = 1086008L;
		single[44][5] = 123410L;
		// accomodations # in 44 places, 6 items. (0.13636363636363635 vs
		// 0.13636363636363635)
		accnum[44][6] = 7059052L;
		single[44][6] = 962598L;
		// accomodations # in 44 places, 7 items. (0.1590909090909091 vs
		// 0.1590909090909091)
		accnum[44][7] = 38320568L;
		single[44][7] = 6096454L;
		// accomodations # in 44 places, 8 items. (0.18181818181818182 vs
		// 0.18181818181818182)
		accnum[44][8] = 177232627L;
		single[44][8] = 32224114L;
		// accomodations # in 44 places, 9 items. (0.20454545454545456 vs
		// 0.20454545454545456)
		accnum[44][9] = 708930508L;
		single[44][9] = 145008513L;
		// accomodations # in 44 places, 10 items. (0.22727272727272727 vs
		// 0.22727272727272727)
		accnum[44][10] = 2481256778L;
		single[44][10] = 563921995L;
		// accomodations # in 44 places, 11 items. (0.25 vs 0.25)
		accnum[44][11] = 7669339132L;
		single[44][11] = 1917334783L;
		// accomodations # in 45 places, 0 items. (0.0 vs 0.0)
		accnum[45][0] = 0L;
		single[45][0] = 0L;
		// accomodations # in 45 places, 1 items. (0.022222222222222223 vs
		// 0.022222222222222223)
		accnum[45][1] = 45L;
		single[45][1] = 1L;
		// accomodations # in 45 places, 2 items. (0.044444444444444446 vs
		// 0.044444444444444446)
		accnum[45][2] = 990L;
		single[45][2] = 44L;
		// accomodations # in 45 places, 3 items. (0.06666666666666667 vs
		// 0.06666666666666667)
		accnum[45][3] = 14190L;
		single[45][3] = 946L;
		// accomodations # in 45 places, 4 items. (0.08888888888888889 vs
		// 0.08888888888888889)
		accnum[45][4] = 148995L;
		single[45][4] = 13244L;
		// accomodations # in 45 places, 5 items. (0.1111111111111111 vs
		// 0.1111111111111111)
		accnum[45][5] = 1221759L;
		single[45][5] = 135751L;
		// accomodations # in 45 places, 6 items. (0.13333333333333333 vs
		// 0.13333333333333333)
		accnum[45][6] = 8145060L;
		single[45][6] = 1086008L;
		// accomodations # in 45 places, 7 items. (0.15555555555555556 vs
		// 0.15555555555555556)
		accnum[45][7] = 45379620L;
		single[45][7] = 7059052L;
		// accomodations # in 45 places, 8 items. (0.17777777777777778 vs
		// 0.17777777777777778)
		accnum[45][8] = 215553195L;
		single[45][8] = 38320568L;
		// accomodations # in 45 places, 9 items. (0.2 vs 0.2)
		accnum[45][9] = 886163135L;
		single[45][9] = 177232627L;
		// accomodations # in 45 places, 10 items. (0.2222222222222222 vs
		// 0.2222222222222222)
		accnum[45][10] = 3190187286L;
		single[45][10] = 708930508L;
		// accomodations # in 45 places, 11 items. (0.24444444444444444 vs
		// 0.24444444444444444)
		accnum[45][11] = 10150595910L;
		single[45][11] = 2481256778L;
		// accomodations # in 46 places, 0 items. (0.0 vs 0.0)
		accnum[46][0] = 0L;
		single[46][0] = 0L;
		// accomodations # in 46 places, 1 items. (0.021739130434782608 vs
		// 0.021739130434782608)
		accnum[46][1] = 46L;
		single[46][1] = 1L;
		// accomodations # in 46 places, 2 items. (0.043478260869565216 vs
		// 0.043478260869565216)
		accnum[46][2] = 1035L;
		single[46][2] = 45L;
		// accomodations # in 46 places, 3 items. (0.06521739130434782 vs
		// 0.06521739130434782)
		accnum[46][3] = 15180L;
		single[46][3] = 990L;
		// accomodations # in 46 places, 4 items. (0.08695652173913043 vs
		// 0.08695652173913043)
		accnum[46][4] = 163185L;
		single[46][4] = 14190L;
		// accomodations # in 46 places, 5 items. (0.10869565217391304 vs
		// 0.10869565217391304)
		accnum[46][5] = 1370754L;
		single[46][5] = 148995L;
		// accomodations # in 46 places, 6 items. (0.13043478260869565 vs
		// 0.13043478260869565)
		accnum[46][6] = 9366819L;
		single[46][6] = 1221759L;
		// accomodations # in 46 places, 7 items. (0.15217391304347827 vs
		// 0.15217391304347827)
		accnum[46][7] = 53524680L;
		single[46][7] = 8145060L;
		// accomodations # in 46 places, 8 items. (0.17391304347826086 vs
		// 0.17391304347826086)
		accnum[46][8] = 260932815L;
		single[46][8] = 45379620L;
		// accomodations # in 46 places, 9 items. (0.1956521739130435 vs
		// 0.1956521739130435)
		accnum[46][9] = 1101716330L;
		single[46][9] = 215553195L;
		// accomodations # in 46 places, 10 items. (0.21739130434782608 vs
		// 0.21739130434782608)
		accnum[46][10] = 4076350421L;
		single[46][10] = 886163135L;
		// accomodations # in 46 places, 11 items. (0.2391304347826087 vs
		// 0.2391304347826087)
		accnum[46][11] = 13340783196L;
		single[46][11] = 3190187286L;
		// accomodations # in 47 places, 0 items. (0.0 vs 0.0)
		accnum[47][0] = 0L;
		single[47][0] = 0L;
		// accomodations # in 47 places, 1 items. (0.02127659574468085 vs
		// 0.02127659574468085)
		accnum[47][1] = 47L;
		single[47][1] = 1L;
		// accomodations # in 47 places, 2 items. (0.0425531914893617 vs
		// 0.0425531914893617)
		accnum[47][2] = 1081L;
		single[47][2] = 46L;
		// accomodations # in 47 places, 3 items. (0.06382978723404255 vs
		// 0.06382978723404255)
		accnum[47][3] = 16215L;
		single[47][3] = 1035L;
		// accomodations # in 47 places, 4 items. (0.0851063829787234 vs
		// 0.0851063829787234)
		accnum[47][4] = 178365L;
		single[47][4] = 15180L;
		// accomodations # in 47 places, 5 items. (0.10638297872340426 vs
		// 0.10638297872340426)
		accnum[47][5] = 1533939L;
		single[47][5] = 163185L;
		// accomodations # in 47 places, 6 items. (0.1276595744680851 vs
		// 0.1276595744680851)
		accnum[47][6] = 10737573L;
		single[47][6] = 1370754L;
		// accomodations # in 47 places, 7 items. (0.14893617021276595 vs
		// 0.14893617021276595)
		accnum[47][7] = 62891499L;
		single[47][7] = 9366819L;
		// accomodations # in 47 places, 8 items. (0.1702127659574468 vs
		// 0.1702127659574468)
		accnum[47][8] = 314457495L;
		single[47][8] = 53524680L;
		// accomodations # in 47 places, 9 items. (0.19148936170212766 vs
		// 0.19148936170212766)
		accnum[47][9] = 1362649145L;
		single[47][9] = 260932815L;
		// accomodations # in 47 places, 10 items. (0.2127659574468085 vs
		// 0.2127659574468085)
		accnum[47][10] = 5178066751L;
		single[47][10] = 1101716330L;
		// accomodations # in 47 places, 11 items. (0.23404255319148937 vs
		// 0.23404255319148937)
		accnum[47][11] = 17417133617L;
		single[47][11] = 4076350421L;
		// accomodations # in 48 places, 0 items. (0.0 vs 0.0)
		accnum[48][0] = 0L;
		single[48][0] = 0L;
		// accomodations # in 48 places, 1 items. (0.020833333333333332 vs
		// 0.020833333333333332)
		accnum[48][1] = 48L;
		single[48][1] = 1L;
		// accomodations # in 48 places, 2 items. (0.041666666666666664 vs
		// 0.041666666666666664)
		accnum[48][2] = 1128L;
		single[48][2] = 47L;
		// accomodations # in 48 places, 3 items. (0.0625 vs 0.0625)
		accnum[48][3] = 17296L;
		single[48][3] = 1081L;
		// accomodations # in 48 places, 4 items. (0.08333333333333333 vs
		// 0.08333333333333333)
		accnum[48][4] = 194580L;
		single[48][4] = 16215L;
		// accomodations # in 48 places, 5 items. (0.10416666666666667 vs
		// 0.10416666666666667)
		accnum[48][5] = 1712304L;
		single[48][5] = 178365L;
		// accomodations # in 48 places, 6 items. (0.125 vs 0.125)
		accnum[48][6] = 12271512L;
		single[48][6] = 1533939L;
		// accomodations # in 48 places, 7 items. (0.14583333333333334 vs
		// 0.14583333333333334)
		accnum[48][7] = 73629072L;
		single[48][7] = 10737573L;
		// accomodations # in 48 places, 8 items. (0.16666666666666666 vs
		// 0.16666666666666666)
		accnum[48][8] = 377348994L;
		single[48][8] = 62891499L;
		// accomodations # in 48 places, 9 items. (0.1875 vs 0.1875)
		accnum[48][9] = 1677106640L;
		single[48][9] = 314457495L;
		// accomodations # in 48 places, 10 items. (0.20833333333333334 vs
		// 0.20833333333333334)
		accnum[48][10] = 6540715896L;
		single[48][10] = 1362649145L;
		// accomodations # in 48 places, 11 items. (0.22916666666666666 vs
		// 0.22916666666666666)
		accnum[48][11] = 22595200368L;
		single[48][11] = 5178066751L;
		// accomodations # in 49 places, 0 items. (0.0 vs 0.0)
		accnum[49][0] = 0L;
		single[49][0] = 0L;
		// accomodations # in 49 places, 1 items. (0.02040816326530612 vs
		// 0.02040816326530612)
		accnum[49][1] = 49L;
		single[49][1] = 1L;
		// accomodations # in 49 places, 2 items. (0.04081632653061224 vs
		// 0.04081632653061224)
		accnum[49][2] = 1176L;
		single[49][2] = 48L;
		// accomodations # in 49 places, 3 items. (0.061224489795918366 vs
		// 0.061224489795918366)
		accnum[49][3] = 18424L;
		single[49][3] = 1128L;
		// accomodations # in 49 places, 4 items. (0.08163265306122448 vs
		// 0.08163265306122448)
		accnum[49][4] = 211876L;
		single[49][4] = 17296L;
		// accomodations # in 49 places, 5 items. (0.10204081632653061 vs
		// 0.10204081632653061)
		accnum[49][5] = 1906884L;
		single[49][5] = 194580L;
		// accomodations # in 49 places, 6 items. (0.12244897959183673 vs
		// 0.12244897959183673)
		accnum[49][6] = 13983816L;
		single[49][6] = 1712304L;
		// accomodations # in 49 places, 7 items. (0.14285714285714285 vs
		// 0.14285714285714285)
		accnum[49][7] = 85900584L;
		single[49][7] = 12271512L;
		// accomodations # in 49 places, 8 items. (0.16326530612244897 vs
		// 0.16326530612244897)
		accnum[49][8] = 450978066L;
		single[49][8] = 73629072L;
		// accomodations # in 49 places, 9 items. (0.1836734693877551 vs
		// 0.1836734693877551)
		accnum[49][9] = 2054455634L;
		single[49][9] = 377348994L;
		// accomodations # in 49 places, 10 items. (0.20408163265306123 vs
		// 0.20408163265306123)
		accnum[49][10] = 8217822536L;
		single[49][10] = 1677106640L;
		// accomodations # in 49 places, 11 items. (0.22448979591836735 vs
		// 0.22448979591836735)
		accnum[49][11] = 29135916264L;
		single[49][11] = 6540715896L;
	}
}