package mesh;

public class Accomodations {
    public static final int MAX_SIZE = 81;
    public static final int MAX_NUM = 11;
    public static final long[][] accnum = new long[MAX_SIZE + 1][MAX_NUM + 1];
    public static final long[][] single = new long[MAX_SIZE + 1][MAX_NUM + 1];
    static {
        // accomodations # in 0 places, 0 items. (0.0000 vs 0.0000)
        // accomodations # in 1 places, 0 items. (0.0000 vs 0.0000)
        accnum[0][0]=0L;
        accnum[1][0]=0L;
        single[0][0]=0L;
        single[1][0]=0L;
        // accomodations # in 2 places, 0 items. (0.0000 vs 0.0000)
        accnum[2][0]=0L;
        single[2][0]=0L;
        // accomodations # in 1 places, 2 items. (2.0000 vs 0.0000)
        // accomodations # in 1 places, 7 items. (7.0000 vs 0.0000)
        // accomodations # in 0 places, 11 items. (11.0000 vs 0.0000)
        // accomodations # in 1 places, 1 items. (1.0000 vs 1.0000)
        // accomodations # in 2 places, 2 items. (1.0000 vs 1.0000)
        // accomodations # in 2 places, 1 items. (0.5000 vs 0.5000)
        // accomodations # in 1 places, 8 items. (8.0000 vs 0.0000)
        // accomodations # in 1 places, 9 items. (9.0000 vs 0.0000)
        // accomodations # in 1 places, 10 items. (10.0000 vs 0.0000)
        // accomodations # in 1 places, 11 items. (11.0000 vs 0.0000)
        accnum[1][10]=0L;
        accnum[1][9]=0L;
        single[1][9]=0L;
        accnum[1][8]=0L;
        accnum[2][1]=2L;
        accnum[2][2]=1L;
        // accomodations # in 2 places, 5 items. (2.5000 vs 0.0000)
        accnum[2][5]=0L;
        accnum[1][1]=1L;
        // accomodations # in 2 places, 4 items. (2.0000 vs 0.0000)
        // accomodations # in 2 places, 3 items. (1.5000 vs 0.0000)
        accnum[2][3]=0L;
        accnum[0][11]=0L;
        // accomodations # in 0 places, 2 items. (2.0000 vs 0.0000)
        // accomodations # in 0 places, 3 items. (3.0000 vs 0.0000)
        accnum[0][3]=0L;
        single[0][3]=0L;
        // accomodations # in 1 places, 3 items. (3.0000 vs 0.0000)
        accnum[1][3]=0L;
        // accomodations # in 0 places, 6 items. (6.0000 vs 0.0000)
        // accomodations # in 0 places, 9 items. (9.0000 vs 0.0000)
        accnum[1][7]=0L;
        // accomodations # in 0 places, 7 items. (7.0000 vs 0.0000)
        // accomodations # in 0 places, 8 items. (8.0000 vs 0.0000)
        // accomodations # in 0 places, 1 items. (1.0000 vs 0.0000)
        // accomodations # in 0 places, 4 items. (4.0000 vs 0.0000)
        accnum[0][4]=0L;
        single[0][4]=0L;
        // accomodations # in 0 places, 10 items. (10.0000 vs 0.0000)
        // accomodations # in 1 places, 4 items. (4.0000 vs 0.0000)
        // accomodations # in 1 places, 5 items. (5.0000 vs 0.0000)
        accnum[1][5]=0L;
        single[1][5]=0L;
        // accomodations # in 3 places, 5 items. (1.6667 vs 0.0000)
        accnum[3][5]=0L;
        single[3][5]=0L;
        // accomodations # in 0 places, 5 items. (5.0000 vs 0.0000)
        accnum[1][2]=0L;
        // accomodations # in 1 places, 6 items. (6.0000 vs 0.0000)
        single[1][2]=0L;
        accnum[0][5]=0L;
        // accomodations # in 3 places, 6 items. (2.0000 vs 0.0000)
        accnum[1][4]=0L;
        accnum[0][10]=0L;
        single[0][10]=0L;
        accnum[0][1]=0L;
        accnum[0][8]=0L;
        single[0][8]=0L;
        accnum[0][7]=0L;
        single[1][7]=0L;
        // accomodations # in 3 places, 4 items. (1.3333 vs 0.0000)
        accnum[3][4]=0L;
        single[3][4]=0L;
        // accomodations # in 3 places, 11 items. (3.6667 vs 0.0000)
        accnum[0][9]=0L;
        single[0][9]=0L;
        accnum[0][6]=0L;
        single[1][3]=0L;
        // accomodations # in 4 places, 0 items. (0.0000 vs 0.0000)
        accnum[0][2]=0L;
        single[0][2]=0L;
        single[0][11]=0L;
        single[2][3]=0L;
        // accomodations # in 3 places, 0 items. (0.0000 vs 0.0000)
        accnum[2][4]=0L;
        // accomodations # in 3 places, 2 items. (0.6667 vs 0.6667)
        accnum[3][2]=3L;
        single[3][2]=2L;
        single[1][1]=1L;
        // accomodations # in 3 places, 3 items. (1.0000 vs 1.0000)
        single[2][5]=0L;
        // accomodations # in 3 places, 1 items. (0.3333 vs 0.3333)
        // accomodations # in 2 places, 11 items. (5.5000 vs 0.0000)
        single[2][2]=1L;
        // accomodations # in 2 places, 10 items. (5.0000 vs 0.0000)
        // accomodations # in 2 places, 9 items. (4.5000 vs 0.0000)
        accnum[2][9]=0L;
        single[2][9]=0L;
        single[2][1]=1L;
        single[1][8]=0L;
        // accomodations # in 2 places, 8 items. (4.0000 vs 0.0000)
        // accomodations # in 2 places, 7 items. (3.5000 vs 0.0000)
        accnum[2][7]=0L;
        single[2][7]=0L;
        // accomodations # in 2 places, 6 items. (3.0000 vs 0.0000)
        accnum[2][6]=0L;
        single[2][6]=0L;
        single[1][10]=0L;
        accnum[1][11]=0L;
        // accomodations # in 5 places, 1 items. (0.2000 vs 0.2000)
        accnum[5][1]=5L;
        // accomodations # in 5 places, 0 items. (0.0000 vs 0.0000)
        // accomodations # in 4 places, 10 items. (2.5000 vs 0.0000)
        accnum[2][8]=0L;
        single[2][8]=0L;
        // accomodations # in 4 places, 9 items. (2.2500 vs 0.0000)
        // accomodations # in 4 places, 8 items. (2.0000 vs 0.0000)
        accnum[4][8]=0L;
        accnum[2][10]=0L;
        single[2][10]=0L;
        accnum[2][11]=0L;
        single[2][11]=0L;
        // accomodations # in 4 places, 7 items. (1.7500 vs 0.0000)
        accnum[4][7]=0L;
        // accomodations # in 4 places, 6 items. (1.5000 vs 0.0000)
        accnum[3][1]=3L;
        single[3][1]=1L;
        accnum[3][3]=1L;
        single[3][3]=1L;
        // accomodations # in 4 places, 5 items. (1.2500 vs 0.0000)
        accnum[4][5]=0L;
        single[4][5]=0L;
        // accomodations # in 4 places, 4 items. (1.0000 vs 1.0000)
        single[2][4]=0L;
        accnum[3][0]=0L;
        // accomodations # in 4 places, 3 items. (0.7500 vs 0.7500)
        accnum[4][3]=4L;
        single[4][3]=3L;
        // accomodations # in 4 places, 2 items. (0.5000 vs 0.5000)
        accnum[4][0]=0L;
        single[4][0]=0L;
        single[0][6]=0L;
        // accomodations # in 4 places, 1 items. (0.2500 vs 0.2500)
        accnum[4][1]=4L;
        single[4][1]=1L;
        // accomodations # in 6 places, 0 items. (0.0000 vs 0.0000)
        accnum[3][11]=0L;
        // accomodations # in 3 places, 10 items. (3.3333 vs 0.0000)
        single[0][7]=0L;
        // accomodations # in 3 places, 9 items. (3.0000 vs 0.0000)
        single[0][1]=0L;
        // accomodations # in 3 places, 8 items. (2.6667 vs 0.0000)
        single[1][4]=0L;
        accnum[3][6]=0L;
        single[3][6]=0L;
        // accomodations # in 6 places, 4 items. (0.6667 vs 0.6667)
        accnum[6][4]=15L;
        single[6][4]=10L;
        single[0][5]=0L;
        // accomodations # in 6 places, 5 items. (0.8333 vs 0.8333)
        // accomodations # in 3 places, 7 items. (2.3333 vs 0.0000)
        accnum[3][7]=0L;
        single[3][7]=0L;
        accnum[1][6]=0L;
        // accomodations # in 6 places, 8 items. (1.3333 vs 0.0000)
        accnum[6][8]=0L;
        single[6][8]=0L;
        // accomodations # in 6 places, 6 items. (1.0000 vs 1.0000)
        // accomodations # in 6 places, 7 items. (1.1667 vs 0.0000)
        accnum[6][5]=6L;
        // accomodations # in 6 places, 3 items. (0.5000 vs 0.5000)
        accnum[6][3]=20L;
        single[6][3]=10L;
        accnum[3][8]=0L;
        accnum[3][9]=0L;
        // accomodations # in 6 places, 2 items. (0.3333 vs 0.3333)
        accnum[3][10]=0L;
        single[3][10]=0L;
        // accomodations # in 6 places, 1 items. (0.1667 vs 0.1667)
        single[3][11]=0L;
        accnum[6][0]=0L;
        single[6][0]=0L;
        // accomodations # in 5 places, 11 items. (2.2000 vs 0.0000)
        accnum[4][2]=6L;
        single[4][2]=3L;
        // accomodations # in 5 places, 10 items. (2.0000 vs 0.0000)
        accnum[5][10]=0L;
        single[3][0]=0L;
        // accomodations # in 5 places, 9 items. (1.8000 vs 0.0000)
        accnum[4][4]=1L;
        // accomodations # in 5 places, 8 items. (1.6000 vs 0.0000)
        // accomodations # in 5 places, 7 items. (1.4000 vs 0.0000)
        accnum[5][7]=0L;
        single[5][7]=0L;
        // accomodations # in 5 places, 6 items. (1.2000 vs 0.0000)
        accnum[5][6]=0L;
        single[5][6]=0L;
        accnum[4][6]=0L;
        // accomodations # in 5 places, 5 items. (1.0000 vs 1.0000)
        single[4][7]=0L;
        // accomodations # in 4 places, 11 items. (2.7500 vs 0.0000)
        // accomodations # in 5 places, 4 items. (0.8000 vs 0.8000)
        single[4][8]=0L;
        accnum[4][9]=0L;
        // accomodations # in 5 places, 2 items. (0.4000 vs 0.4000)
        accnum[5][2]=10L;
        single[5][2]=4L;
        // accomodations # in 5 places, 3 items. (0.6000 vs 0.6000)
        accnum[4][10]=0L;
        accnum[5][0]=0L;
        single[5][1]=1L;
        single[1][11]=0L;
        // accomodations # in 7 places, 9 items. (1.2857 vs 0.0000)
        single[5][0]=0L;
        // accomodations # in 7 places, 8 items. (1.1429 vs 0.0000)
        accnum[7][8]=0L;
        single[4][10]=0L;
        accnum[5][3]=10L;
        single[4][9]=0L;
        // accomodations # in 7 places, 11 items. (1.5714 vs 0.0000)
        // accomodations # in 7 places, 7 items. (1.0000 vs 1.0000)
        accnum[5][4]=5L;
        // accomodations # in 7 places, 6 items. (0.8571 vs 0.8571)
        accnum[4][11]=0L;
        // accomodations # in 8 places, 2 items. (0.2500 vs 0.2500)
        // accomodations # in 7 places, 5 items. (0.7143 vs 0.7143)
        accnum[5][5]=1L;
        single[4][6]=0L;
        // accomodations # in 7 places, 4 items. (0.5714 vs 0.5714)
        accnum[5][8]=0L;
        single[5][8]=0L;
        single[4][4]=1L;
        // accomodations # in 7 places, 3 items. (0.4286 vs 0.4286)
        accnum[5][9]=0L;
        single[5][9]=0L;
        // accomodations # in 7 places, 2 items. (0.2857 vs 0.2857)
        accnum[7][2]=21L;
        single[7][2]=6L;
        single[5][10]=0L;
        // accomodations # in 7 places, 1 items. (0.1429 vs 0.1429)
        accnum[5][11]=0L;
        // accomodations # in 7 places, 0 items. (0.0000 vs 0.0000)
        accnum[7][0]=0L;
        // accomodations # in 8 places, 7 items. (0.8750 vs 0.8750)
        accnum[6][1]=6L;
        single[6][1]=1L;
        // accomodations # in 6 places, 11 items. (1.8333 vs 0.0000)
        accnum[6][11]=0L;
        single[6][11]=0L;
        accnum[6][2]=15L;
        single[3][9]=0L;
        single[3][8]=0L;
        // accomodations # in 6 places, 10 items. (1.6667 vs 0.0000)
        accnum[6][10]=0L;
        single[6][5]=5L;
        accnum[6][7]=0L;
        accnum[6][6]=1L;
        single[6][6]=1L;
        // accomodations # in 6 places, 9 items. (1.5000 vs 0.0000)
        accnum[6][9]=0L;
        single[6][9]=0L;
        single[1][6]=0L;
        // accomodations # in 9 places, 1 items. (0.1111 vs 0.1111)
        // accomodations # in 9 places, 0 items. (0.0000 vs 0.0000)
        single[6][7]=0L;
        // accomodations # in 8 places, 11 items. (1.3750 vs 0.0000)
        accnum[8][11]=0L;
        single[8][11]=0L;
        // accomodations # in 8 places, 9 items. (1.1250 vs 0.0000)
        single[6][10]=0L;
        // accomodations # in 8 places, 10 items. (1.2500 vs 0.0000)
        // accomodations # in 9 places, 6 items. (0.6667 vs 0.6667)
        single[6][2]=5L;
        // accomodations # in 8 places, 8 items. (1.0000 vs 1.0000)
        accnum[8][8]=1L;
        single[8][8]=1L;
        accnum[8][7]=8L;
        single[8][7]=7L;
        single[7][0]=0L;
        single[5][11]=0L;
        // accomodations # in 8 places, 6 items. (0.7500 vs 0.7500)
        accnum[7][1]=7L;
        single[7][1]=1L;
        // accomodations # in 8 places, 5 items. (0.6250 vs 0.6250)
        accnum[8][5]=56L;
        single[8][5]=35L;
        // accomodations # in 8 places, 4 items. (0.5000 vs 0.5000)
        accnum[7][3]=35L;
        single[7][3]=15L;
        // accomodations # in 8 places, 3 items. (0.3750 vs 0.3750)
        accnum[7][4]=35L;
        single[7][4]=20L;
        single[5][5]=1L;
        accnum[7][5]=21L;
        single[7][5]=15L;
        // accomodations # in 8 places, 1 items. (0.1250 vs 0.1250)
        accnum[8][1]=8L;
        single[8][1]=1L;
        accnum[8][2]=28L;
        single[4][11]=0L;
        accnum[7][6]=7L;
        single[7][6]=6L;
        accnum[7][11]=0L;
        single[7][11]=0L;
        single[5][4]=4L;
        accnum[7][7]=1L;
        // accomodations # in 10 places, 7 items. (0.7000 vs 0.7000)
        // accomodations # in 8 places, 0 items. (0.0000 vs 0.0000)
        accnum[8][0]=0L;
        single[8][0]=0L;
        single[5][3]=6L;
        // accomodations # in 10 places, 11 items. (1.1000 vs 0.0000)
        accnum[10][11]=0L;
        single[10][11]=0L;
        // accomodations # in 7 places, 10 items. (1.4286 vs 0.0000)
        accnum[7][10]=0L;
        single[7][8]=0L;
        accnum[7][9]=0L;
        // accomodations # in 11 places, 2 items. (0.1818 vs 0.1818)
        accnum[11][2]=55L;
        single[11][2]=10L;
        single[7][10]=0L;
        // accomodations # in 11 places, 0 items. (0.0000 vs 0.0000)
        // accomodations # in 11 places, 3 items. (0.2727 vs 0.2727)
        accnum[11][3]=165L;
        single[11][3]=45L;
        // accomodations # in 10 places, 10 items. (1.0000 vs 1.0000)
        accnum[10][10]=1L;
        single[10][10]=1L;
        // accomodations # in 10 places, 9 items. (0.9000 vs 0.9000)
        accnum[10][9]=10L;
        single[10][9]=9L;
        accnum[10][7]=120L;
        single[10][7]=84L;
        single[7][7]=1L;
        // accomodations # in 11 places, 7 items. (0.6364 vs 0.6364)
        accnum[11][7]=330L;
        single[11][7]=210L;
        // accomodations # in 10 places, 8 items. (0.8000 vs 0.8000)
        // accomodations # in 10 places, 6 items. (0.6000 vs 0.6000)
        accnum[10][6]=210L;
        single[10][6]=126L;
        single[8][2]=7L;
        // accomodations # in 10 places, 5 items. (0.5000 vs 0.5000)
        accnum[10][5]=252L;
        single[10][5]=126L;
        // accomodations # in 12 places, 0 items. (0.0000 vs 0.0000)
        // accomodations # in 10 places, 4 items. (0.4000 vs 0.4000)
        accnum[10][4]=210L;
        // accomodations # in 10 places, 3 items. (0.3000 vs 0.3000)
        accnum[10][3]=120L;
        single[10][3]=36L;
        // accomodations # in 10 places, 2 items. (0.2000 vs 0.2000)
        accnum[8][3]=56L;
        single[8][3]=21L;
        // accomodations # in 10 places, 1 items. (0.1000 vs 0.1000)
        accnum[10][1]=10L;
        single[10][1]=1L;
        accnum[8][4]=70L;
        single[8][4]=35L;
        // accomodations # in 10 places, 0 items. (0.0000 vs 0.0000)
        accnum[10][0]=0L;
        single[10][0]=0L;
        // accomodations # in 9 places, 11 items. (1.2222 vs 0.0000)
        accnum[9][11]=0L;
        single[9][11]=0L;
        // accomodations # in 9 places, 10 items. (1.1111 vs 0.0000)
        accnum[9][10]=0L;
        single[9][10]=0L;
        accnum[8][6]=28L;
        single[8][6]=21L;
        // accomodations # in 9 places, 9 items. (1.0000 vs 1.0000)
        accnum[9][9]=1L;
        single[9][9]=1L;
        // accomodations # in 12 places, 9 items. (0.7500 vs 0.7500)
        // accomodations # in 9 places, 8 items. (0.8889 vs 0.8889)
        accnum[9][6]=84L;
        // accomodations # in 12 places, 6 items. (0.5000 vs 0.5000)
        accnum[12][6]=924L;
        single[12][6]=462L;
        // accomodations # in 9 places, 5 items. (0.5556 vs 0.5556)
        accnum[9][5]=126L;
        single[9][5]=70L;
        accnum[8][10]=0L;
        single[8][10]=0L;
        accnum[8][9]=0L;
        // accomodations # in 9 places, 4 items. (0.4444 vs 0.4444)
        accnum[9][4]=126L;
        single[9][4]=56L;
        // accomodations # in 9 places, 3 items. (0.3333 vs 0.3333)
        accnum[9][3]=84L;
        // accomodations # in 13 places, 2 items. (0.1538 vs 0.1538)
        accnum[13][2]=78L;
        single[13][2]=12L;
        accnum[9][0]=0L;
        single[9][0]=0L;
        // accomodations # in 9 places, 2 items. (0.2222 vs 0.2222)
        accnum[9][2]=36L;
        single[9][2]=8L;
        accnum[9][1]=9L;
        single[9][1]=1L;
        // accomodations # in 13 places, 4 items. (0.3077 vs 0.3077)
        accnum[13][4]=715L;
        single[13][4]=220L;
        // accomodations # in 13 places, 3 items. (0.2308 vs 0.2308)
        // accomodations # in 13 places, 6 items. (0.4615 vs 0.4615)
        accnum[13][6]=1716L;
        single[13][6]=792L;
        single[9][3]=28L;
        // accomodations # in 13 places, 1 items. (0.0769 vs 0.0769)
        single[8][9]=0L;
        // accomodations # in 13 places, 0 items. (0.0000 vs 0.0000)
        accnum[13][0]=0L;
        single[13][0]=0L;
        // accomodations # in 13 places, 9 items. (0.6923 vs 0.6923)
        accnum[13][9]=715L;
        single[13][9]=495L;
        // accomodations # in 12 places, 11 items. (0.9167 vs 0.9167)
        // accomodations # in 13 places, 10 items. (0.7692 vs 0.7692)
        // accomodations # in 14 places, 0 items. (0.0000 vs 0.0000)
        accnum[14][0]=0L;
        single[14][0]=0L;
        single[9][6]=56L;
        // accomodations # in 12 places, 10 items. (0.8333 vs 0.8333)
        accnum[9][8]=9L;
        single[9][8]=8L;
        accnum[12][9]=220L;
        // accomodations # in 14 places, 2 items. (0.1429 vs 0.1429)
        accnum[14][2]=91L;
        // accomodations # in 12 places, 3 items. (0.2500 vs 0.2500)
        accnum[12][3]=220L;
        single[12][3]=55L;
        // accomodations # in 12 places, 8 items. (0.6667 vs 0.6667)
        // accomodations # in 14 places, 4 items. (0.2857 vs 0.2857)
        // accomodations # in 12 places, 7 items. (0.5833 vs 0.5833)
        accnum[12][7]=792L;
        single[12][7]=462L;
        // accomodations # in 12 places, 5 items. (0.4167 vs 0.4167)
        accnum[12][5]=792L;
        single[12][5]=330L;
        // accomodations # in 12 places, 4 items. (0.3333 vs 0.3333)
        accnum[12][4]=495L;
        single[12][4]=165L;
        // accomodations # in 12 places, 2 items. (0.1667 vs 0.1667)
        accnum[12][2]=66L;
        single[12][2]=11L;
        accnum[10][2]=45L;
        single[10][2]=9L;
        // accomodations # in 12 places, 1 items. (0.0833 vs 0.0833)
        accnum[12][1]=12L;
        single[12][1]=1L;
        single[10][4]=84L;
        accnum[12][0]=0L;
        // accomodations # in 9 places, 7 items. (0.7778 vs 0.7778)
        accnum[9][7]=36L;
        single[9][7]=28L;
        // accomodations # in 11 places, 11 items. (1.0000 vs 1.0000)
        accnum[11][11]=1L;
        // accomodations # in 15 places, 0 items. (0.0000 vs 0.0000)
        accnum[15][0]=0L;
        single[15][0]=0L;
        // accomodations # in 11 places, 10 items. (0.9091 vs 0.9091)
        accnum[10][8]=45L;
        single[10][8]=36L;
        // accomodations # in 11 places, 8 items. (0.7273 vs 0.7273)
        // accomodations # in 14 places, 7 items. (0.5000 vs 0.5000)
        // accomodations # in 11 places, 5 items. (0.4545 vs 0.4545)
        accnum[11][5]=462L;
        single[11][5]=210L;
        // accomodations # in 11 places, 6 items. (0.5455 vs 0.5455)
        // accomodations # in 11 places, 4 items. (0.3636 vs 0.3636)
        accnum[11][0]=0L;
        // accomodations # in 15 places, 3 items. (0.2000 vs 0.2000)
        accnum[15][3]=455L;
        // accomodations # in 11 places, 1 items. (0.0909 vs 0.0909)
        accnum[11][1]=11L;
        single[11][1]=1L;
        // accomodations # in 15 places, 4 items. (0.2667 vs 0.2667)
        accnum[15][4]=1365L;
        single[15][4]=364L;
        single[7][9]=0L;
        // accomodations # in 15 places, 2 items. (0.1333 vs 0.1333)
        accnum[15][2]=105L;
        single[15][3]=91L;
        single[11][0]=0L;
        accnum[11][4]=330L;
        single[11][4]=120L;
        // accomodations # in 14 places, 10 items. (0.7143 vs 0.7143)
        accnum[14][10]=1001L;
        single[14][10]=715L;
        accnum[11][6]=462L;
        single[11][6]=252L;
        // accomodations # in 14 places, 11 items. (0.7857 vs 0.7857)
        accnum[14][11]=364L;
        single[14][11]=286L;
        // accomodations # in 14 places, 9 items. (0.6429 vs 0.6429)
        accnum[14][9]=2002L;
        single[14][9]=1287L;
        accnum[14][7]=3432L;
        single[14][7]=1716L;
        // accomodations # in 14 places, 8 items. (0.5714 vs 0.5714)
        // accomodations # in 16 places, 1 items. (0.0625 vs 0.0625)
        accnum[11][8]=165L;
        single[11][8]=120L;
        // accomodations # in 15 places, 1 items. (0.0667 vs 0.0667)
        accnum[15][1]=15L;
        single[15][1]=1L;
        accnum[11][10]=11L;
        single[11][10]=10L;
        // accomodations # in 14 places, 6 items. (0.4286 vs 0.4286)
        // accomodations # in 11 places, 9 items. (0.8182 vs 0.8182)
        // accomodations # in 16 places, 5 items. (0.3125 vs 0.3125)
        accnum[16][5]=4368L;
        single[16][5]=1365L;
        single[11][11]=1L;
        single[12][0]=0L;
        // accomodations # in 14 places, 5 items. (0.3571 vs 0.3571)
        accnum[14][4]=1001L;
        single[14][4]=286L;
        accnum[12][8]=495L;
        single[12][8]=330L;
        single[14][2]=13L;
        // accomodations # in 14 places, 3 items. (0.2143 vs 0.2143)
        accnum[14][3]=364L;
        single[14][3]=78L;
        single[12][9]=165L;
        accnum[12][10]=66L;
        single[12][10]=55L;
        // accomodations # in 14 places, 1 items. (0.0714 vs 0.0714)
        // accomodations # in 16 places, 11 items. (0.6875 vs 0.6875)
        accnum[13][10]=286L;
        accnum[16][11]=4368L;
        accnum[12][11]=12L;
        single[12][11]=11L;
        // accomodations # in 13 places, 11 items. (0.8462 vs 0.8462)
        accnum[13][11]=78L;
        single[13][11]=66L;
        // accomodations # in 13 places, 8 items. (0.6154 vs 0.6154)
        // accomodations # in 13 places, 7 items. (0.5385 vs 0.5385)
        accnum[13][7]=1716L;
        single[13][7]=924L;
        accnum[13][1]=13L;
        single[13][1]=1L;
        // accomodations # in 17 places, 5 items. (0.2941 vs 0.2941)
        accnum[13][3]=286L;
        single[13][3]=66L;
        // accomodations # in 13 places, 5 items. (0.3846 vs 0.3846)
        accnum[13][5]=1287L;
        accnum[17][5]=6188L;
        single[13][5]=495L;
        // accomodations # in 17 places, 4 items. (0.2353 vs 0.2353)
        accnum[17][4]=2380L;
        single[17][4]=560L;
        accnum[13][8]=1287L;
        single[13][8]=792L;
        // accomodations # in 17 places, 3 items. (0.1765 vs 0.1765)
        accnum[17][3]=680L;
        single[17][3]=120L;
        single[16][11]=3003L;
        single[13][10]=220L;
        // accomodations # in 17 places, 2 items. (0.1176 vs 0.1176)
        accnum[17][2]=136L;
        single[17][2]=16L;
        accnum[14][1]=14L;
        // accomodations # in 17 places, 1 items. (0.0588 vs 0.0588)
        accnum[17][1]=17L;
        // accomodations # in 17 places, 9 items. (0.5294 vs 0.5294)
        accnum[17][9]=24310L;
        single[17][9]=12870L;
        // accomodations # in 16 places, 10 items. (0.6250 vs 0.6250)
        // accomodations # in 16 places, 9 items. (0.5625 vs 0.5625)
        accnum[16][9]=11440L;
        // accomodations # in 17 places, 11 items. (0.6471 vs 0.6471)
        // accomodations # in 17 places, 0 items. (0.0000 vs 0.0000)
        accnum[17][0]=0L;
        // accomodations # in 18 places, 4 items. (0.2222 vs 0.2222)
        accnum[18][4]=3060L;
        single[18][4]=680L;
        // accomodations # in 16 places, 8 items. (0.5000 vs 0.5000)
        // accomodations # in 16 places, 7 items. (0.4375 vs 0.4375)
        accnum[14][5]=2002L;
        single[14][5]=715L;
        // accomodations # in 16 places, 6 items. (0.3750 vs 0.3750)
        // accomodations # in 18 places, 5 items. (0.2778 vs 0.2778)
        accnum[11][9]=55L;
        single[11][9]=45L;
        accnum[14][6]=3003L;
        single[14][6]=1287L;
        // accomodations # in 16 places, 4 items. (0.2500 vs 0.2500)
        // accomodations # in 18 places, 6 items. (0.3333 vs 0.3333)
        accnum[18][6]=18564L;
        single[18][6]=6188L;
        // accomodations # in 16 places, 3 items. (0.1875 vs 0.1875)
        accnum[16][3]=560L;
        single[16][3]=105L;
        // accomodations # in 16 places, 2 items. (0.1250 vs 0.1250)
        accnum[16][2]=120L;
        single[16][2]=15L;
        accnum[16][1]=16L;
        single[16][1]=1L;
        accnum[14][8]=3003L;
        single[14][8]=1716L;
        // accomodations # in 15 places, 11 items. (0.7333 vs 0.7333)
        accnum[15][11]=1365L;
        // accomodations # in 16 places, 0 items. (0.0000 vs 0.0000)
        accnum[16][0]=0L;
        single[16][0]=0L;
        // accomodations # in 15 places, 8 items. (0.5333 vs 0.5333)
        // accomodations # in 19 places, 1 items. (0.0526 vs 0.0526)
        // accomodations # in 15 places, 10 items. (0.6667 vs 0.6667)
        // accomodations # in 15 places, 9 items. (0.6000 vs 0.6000)
        accnum[15][9]=5005L;
        single[15][9]=3003L;
        // accomodations # in 19 places, 2 items. (0.1053 vs 0.1053)
        accnum[19][2]=171L;
        single[19][2]=18L;
        // accomodations # in 15 places, 7 items. (0.4667 vs 0.4667)
        accnum[15][7]=6435L;
        single[15][7]=3003L;
        // accomodations # in 15 places, 6 items. (0.4000 vs 0.4000)
        // accomodations # in 19 places, 3 items. (0.1579 vs 0.1579)
        single[15][2]=14L;
        // accomodations # in 19 places, 4 items. (0.2105 vs 0.2105)
        accnum[19][4]=3876L;
        single[19][4]=816L;
        // accomodations # in 15 places, 5 items. (0.3333 vs 0.3333)
        accnum[19][3]=969L;
        accnum[15][6]=5005L;
        single[15][6]=2002L;
        accnum[15][10]=3003L;
        // accomodations # in 19 places, 5 items. (0.2632 vs 0.2632)
        // accomodations # in 18 places, 11 items. (0.6111 vs 0.6111)
        accnum[18][11]=31824L;
        single[18][11]=19448L;
        accnum[19][1]=19L;
        // accomodations # in 18 places, 9 items. (0.5000 vs 0.5000)
        // accomodations # in 18 places, 10 items. (0.5556 vs 0.5556)
        accnum[18][10]=43758L;
        single[18][10]=24310L;
        accnum[15][8]=6435L;
        single[15][11]=1001L;
        // accomodations # in 19 places, 0 items. (0.0000 vs 0.0000)
        accnum[19][0]=0L;
        single[19][0]=0L;
        // accomodations # in 18 places, 7 items. (0.3889 vs 0.3889)
        // accomodations # in 18 places, 8 items. (0.4444 vs 0.4444)
        accnum[18][8]=43758L;
        single[18][8]=19448L;
        accnum[16][4]=1820L;
        single[16][4]=455L;
        accnum[18][5]=8568L;
        single[18][5]=2380L;
        accnum[16][6]=8008L;
        accnum[16][7]=11440L;
        single[16][7]=5005L;
        accnum[16][8]=12870L;
        single[16][8]=6435L;
        single[17][0]=0L;
        // accomodations # in 20 places, 3 items. (0.1500 vs 0.1500)
        accnum[20][3]=1140L;
        single[20][3]=171L;
        accnum[17][11]=12376L;
        // accomodations # in 18 places, 2 items. (0.1111 vs 0.1111)
        // accomodations # in 19 places, 10 items. (0.5263 vs 0.5263)
        single[16][9]=6435L;
        // accomodations # in 20 places, 5 items. (0.2500 vs 0.2500)
        accnum[16][10]=8008L;
        single[16][10]=5005L;
        // accomodations # in 18 places, 3 items. (0.1667 vs 0.1667)
        accnum[18][3]=816L;
        // accomodations # in 17 places, 10 items. (0.5882 vs 0.5882)
        accnum[17][10]=19448L;
        // accomodations # in 18 places, 1 items. (0.0556 vs 0.0556)
        single[17][1]=1L;
        // accomodations # in 18 places, 0 items. (0.0000 vs 0.0000)
        accnum[18][0]=0L;
        single[18][0]=0L;
        single[14][1]=1L;
        // accomodations # in 17 places, 8 items. (0.4706 vs 0.4706)
        // accomodations # in 20 places, 7 items. (0.3500 vs 0.3500)
        accnum[20][7]=77520L;
        single[20][7]=27132L;
        // accomodations # in 17 places, 7 items. (0.4118 vs 0.4118)
        single[17][5]=1820L;
        // accomodations # in 17 places, 6 items. (0.3529 vs 0.3529)
        accnum[17][6]=12376L;
        // accomodations # in 21 places, 1 items. (0.0476 vs 0.0476)
        // accomodations # in 20 places, 8 items. (0.4000 vs 0.4000)
        accnum[17][7]=19448L;
        // accomodations # in 21 places, 2 items. (0.0952 vs 0.0952)
        accnum[21][2]=210L;
        single[21][2]=20L;
        // accomodations # in 21 places, 0 items. (0.0000 vs 0.0000)
        accnum[21][0]=0L;
        single[21][0]=0L;
        accnum[17][8]=24310L;
        // accomodations # in 20 places, 6 items. (0.3000 vs 0.3000)
        accnum[18][1]=18L;
        // accomodations # in 21 places, 3 items. (0.1429 vs 0.1429)
        accnum[21][3]=1330L;
        single[21][3]=190L;
        single[17][10]=11440L;
        single[18][3]=136L;
        // accomodations # in 19 places, 9 items. (0.4737 vs 0.4737)
        accnum[19][9]=92378L;
        single[19][9]=43758L;
        // accomodations # in 19 places, 11 items. (0.5789 vs 0.5789)
        accnum[19][11]=75582L;
        single[19][11]=43758L;
        accnum[20][5]=15504L;
        accnum[19][10]=92378L;
        single[19][10]=48620L;
        accnum[18][2]=153L;
        single[18][2]=17L;
        // accomodations # in 20 places, 9 items. (0.4500 vs 0.4500)
        accnum[20][9]=167960L;
        single[20][9]=75582L;
        single[17][11]=8008L;
        // accomodations # in 20 places, 4 items. (0.2000 vs 0.2000)
        accnum[20][4]=4845L;
        // accomodations # in 22 places, 0 items. (0.0000 vs 0.0000)
        accnum[22][0]=0L;
        single[22][0]=0L;
        // accomodations # in 20 places, 2 items. (0.1000 vs 0.1000)
        accnum[20][2]=190L;
        single[20][2]=19L;
        // accomodations # in 19 places, 8 items. (0.4211 vs 0.4211)
        accnum[19][8]=75582L;
        // accomodations # in 22 places, 2 items. (0.0909 vs 0.0909)
        accnum[22][2]=231L;
        single[22][2]=21L;
        single[16][6]=3003L;
        // accomodations # in 20 places, 1 items. (0.0500 vs 0.0500)
        accnum[20][1]=20L;
        single[20][1]=1L;
        // accomodations # in 22 places, 4 items. (0.1818 vs 0.1818)
        accnum[22][4]=7315L;
        single[22][4]=1330L;
        // accomodations # in 19 places, 7 items. (0.3684 vs 0.3684)
        accnum[19][7]=50388L;
        single[19][7]=18564L;
        // accomodations # in 20 places, 0 items. (0.0000 vs 0.0000)
        // accomodations # in 21 places, 8 items. (0.3810 vs 0.3810)
        accnum[18][7]=31824L;
        single[18][7]=12376L;
        single[15][8]=3432L;
        accnum[18][9]=48620L;
        single[18][9]=24310L;
        single[19][1]=1L;
        accnum[19][5]=11628L;
        single[19][5]=3060L;
        // accomodations # in 19 places, 6 items. (0.3158 vs 0.3158)
        single[15][10]=2002L;
        // accomodations # in 23 places, 0 items. (0.0000 vs 0.0000)
        accnum[23][0]=0L;
        single[23][0]=0L;
        single[19][3]=153L;
        accnum[15][5]=3003L;
        // accomodations # in 23 places, 2 items. (0.0870 vs 0.0870)
        accnum[23][2]=253L;
        single[23][2]=22L;
        // accomodations # in 23 places, 1 items. (0.0435 vs 0.0435)
        // accomodations # in 23 places, 4 items. (0.1739 vs 0.1739)
        accnum[23][1]=23L;
        accnum[19][6]=27132L;
        // accomodations # in 22 places, 6 items. (0.2727 vs 0.2727)
        accnum[22][6]=74613L;
        single[22][6]=20349L;
        // accomodations # in 22 places, 7 items. (0.3182 vs 0.3182)
        accnum[22][7]=170544L;
        single[22][7]=54264L;
        // accomodations # in 22 places, 5 items. (0.2273 vs 0.2273)
        accnum[21][8]=203490L;
        accnum[20][0]=0L;
        single[20][0]=0L;
        // accomodations # in 20 places, 11 items. (0.5500 vs 0.5500)
        // accomodations # in 20 places, 10 items. (0.5000 vs 0.5000)
        accnum[20][10]=184756L;
        single[20][10]=92378L;
        // accomodations # in 22 places, 3 items. (0.1364 vs 0.1364)
        // accomodations # in 21 places, 7 items. (0.3333 vs 0.3333)
        single[19][8]=31824L;
        // accomodations # in 22 places, 1 items. (0.0455 vs 0.0455)
        // accomodations # in 21 places, 6 items. (0.2857 vs 0.2857)
        // accomodations # in 21 places, 10 items. (0.4762 vs 0.4762)
        accnum[21][10]=352716L;
        single[21][10]=167960L;
        single[20][4]=969L;
        single[20][5]=3876L;
        // accomodations # in 21 places, 5 items. (0.2381 vs 0.2381)
        // accomodations # in 21 places, 4 items. (0.1905 vs 0.1905)
        accnum[21][4]=5985L;
        single[21][4]=1140L;
        single[18][1]=1L;
        accnum[20][6]=38760L;
        single[20][6]=11628L;
        single[17][8]=11440L;
        // accomodations # in 24 places, 0 items. (0.0000 vs 0.0000)
        single[17][7]=8008L;
        accnum[20][8]=125970L;
        // accomodations # in 24 places, 3 items. (0.1250 vs 0.1250)
        accnum[24][3]=2024L;
        accnum[21][1]=21L;
        single[17][6]=4368L;
        single[21][1]=1L;
        // accomodations # in 24 places, 4 items. (0.1667 vs 0.1667)
        single[24][3]=253L;
        single[20][8]=50388L;
        accnum[24][0]=0L;
        single[24][0]=0L;
        // accomodations # in 21 places, 9 items. (0.4286 vs 0.4286)
        accnum[21][9]=293930L;
        // accomodations # in 24 places, 1 items. (0.0417 vs 0.0417)
        accnum[24][1]=24L;
        single[24][1]=1L;
        accnum[21][5]=20349L;
        single[21][5]=4845L;
        accnum[21][6]=54264L;
        // accomodations # in 25 places, 0 items. (0.0000 vs 0.0000)
        accnum[25][0]=0L;
        single[25][0]=0L;
        accnum[22][1]=22L;
        // accomodations # in 25 places, 1 items. (0.0400 vs 0.0400)
        accnum[21][7]=116280L;
        single[21][7]=38760L;
        accnum[22][3]=1540L;
        single[22][3]=210L;
        accnum[20][11]=167960L;
        single[21][8]=77520L;
        accnum[22][5]=26334L;
        single[22][5]=5985L;
        single[19][6]=8568L;
        // accomodations # in 25 places, 4 items. (0.1600 vs 0.1600)
        accnum[25][4]=12650L;
        single[25][4]=2024L;
        single[23][1]=1L;
        // accomodations # in 25 places, 5 items. (0.2000 vs 0.2000)
        accnum[25][5]=53130L;
        single[25][5]=10626L;
        // accomodations # in 23 places, 8 items. (0.3478 vs 0.3478)
        accnum[23][8]=490314L;
        single[23][8]=170544L;
        // accomodations # in 23 places, 5 items. (0.2174 vs 0.2174)
        accnum[23][5]=33649L;
        single[23][5]=7315L;
        // accomodations # in 25 places, 6 items. (0.2400 vs 0.2400)
        accnum[25][6]=177100L;
        single[25][6]=42504L;
        // accomodations # in 23 places, 6 items. (0.2609 vs 0.2609)
        accnum[23][6]=100947L;
        single[23][6]=26334L;
        // accomodations # in 26 places, 0 items. (0.0000 vs 0.0000)
        accnum[26][0]=0L;
        single[26][0]=0L;
        // accomodations # in 26 places, 2 items. (0.0769 vs 0.0769)
        accnum[26][2]=325L;
        single[26][2]=25L;
        // accomodations # in 26 places, 3 items. (0.1154 vs 0.1154)
        accnum[26][3]=2600L;
        single[26][3]=300L;
        // accomodations # in 26 places, 4 items. (0.1538 vs 0.1538)
        accnum[26][4]=14950L;
        single[26][4]=2300L;
        // accomodations # in 23 places, 3 items. (0.1304 vs 0.1304)
        accnum[23][4]=8855L;
        single[15][5]=1001L;
        single[23][4]=1540L;
        // accomodations # in 24 places, 7 items. (0.2917 vs 0.2917)
        accnum[24][7]=346104L;
        single[24][7]=100947L;
        // accomodations # in 26 places, 5 items. (0.1923 vs 0.1923)
        accnum[26][5]=65780L;
        single[26][5]=12650L;
        // accomodations # in 25 places, 7 items. (0.2800 vs 0.2800)
        accnum[25][7]=480700L;
        single[25][7]=134596L;
        // accomodations # in 26 places, 6 items. (0.2308 vs 0.2308)
        accnum[26][6]=230230L;
        single[26][6]=53130L;
        // accomodations # in 27 places, 0 items. (0.0000 vs 0.0000)
        accnum[27][0]=0L;
        single[27][0]=0L;
        accnum[23][3]=1771L;
        single[23][3]=231L;
        // accomodations # in 22 places, 10 items. (0.4545 vs 0.4545)
        accnum[22][10]=646646L;
        single[22][10]=293930L;
        // accomodations # in 22 places, 9 items. (0.4091 vs 0.4091)
        accnum[22][9]=497420L;
        single[22][9]=203490L;
        // accomodations # in 27 places, 2 items. (0.0741 vs 0.0741)
        // accomodations # in 27 places, 3 items. (0.1111 vs 0.1111)
        // accomodations # in 26 places, 1 items. (0.0385 vs 0.0385)
        accnum[26][1]=26L;
        single[26][1]=1L;
        // accomodations # in 27 places, 4 items. (0.1481 vs 0.1481)
        accnum[27][4]=17550L;
        single[27][4]=2600L;
        // accomodations # in 24 places, 2 items. (0.0833 vs 0.0833)
        accnum[24][2]=276L;
        // accomodations # in 22 places, 8 items. (0.3636 vs 0.3636)
        accnum[22][8]=319770L;
        single[22][8]=116280L;
        // accomodations # in 25 places, 3 items. (0.1200 vs 0.1200)
        accnum[25][3]=2300L;
        single[25][3]=276L;
        single[20][11]=92378L;
        // accomodations # in 25 places, 2 items. (0.0800 vs 0.0800)
        accnum[25][2]=300L;
        accnum[25][1]=25L;
        single[25][1]=1L;
        // accomodations # in 27 places, 5 items. (0.1852 vs 0.1852)
        accnum[27][5]=80730L;
        single[27][5]=14950L;
        // accomodations # in 25 places, 8 items. (0.3200 vs 0.3200)
        accnum[25][8]=1081575L;
        single[25][8]=346104L;
        // accomodations # in 28 places, 0 items. (0.0000 vs 0.0000)
        accnum[28][0]=0L;
        single[28][0]=0L;
        // accomodations # in 28 places, 1 items. (0.0357 vs 0.0357)
        accnum[28][1]=28L;
        single[28][1]=1L;
        // accomodations # in 28 places, 2 items. (0.0714 vs 0.0714)
        accnum[28][2]=378L;
        single[28][2]=27L;
        // accomodations # in 22 places, 11 items. (0.5000 vs 0.5000)
        accnum[22][11]=705432L;
        single[22][11]=352716L;
        // accomodations # in 28 places, 3 items. (0.1071 vs 0.1071)
        accnum[28][3]=3276L;
        single[28][3]=351L;
        // accomodations # in 28 places, 4 items. (0.1429 vs 0.1429)
        accnum[28][4]=20475L;
        single[28][4]=2925L;
        single[22][1]=1L;
        single[21][6]=15504L;
        // accomodations # in 24 places, 6 items. (0.2500 vs 0.2500)
        accnum[24][6]=134596L;
        single[24][6]=33649L;
        // accomodations # in 28 places, 5 items. (0.1786 vs 0.1786)
        accnum[28][5]=98280L;
        single[28][5]=17550L;
        // accomodations # in 28 places, 6 items. (0.2143 vs 0.2143)
        accnum[28][6]=376740L;
        single[28][6]=80730L;
        // accomodations # in 24 places, 9 items. (0.3750 vs 0.3750)
        accnum[24][9]=1307504L;
        single[24][9]=490314L;
        // accomodations # in 29 places, 0 items. (0.0000 vs 0.0000)
        accnum[29][0]=0L;
        single[29][0]=0L;
        // accomodations # in 29 places, 1 items. (0.0345 vs 0.0345)
        accnum[29][1]=29L;
        single[29][1]=1L;
        // accomodations # in 29 places, 2 items. (0.0690 vs 0.0690)
        accnum[29][2]=406L;
        single[29][2]=28L;
        // accomodations # in 21 places, 11 items. (0.5238 vs 0.5238)
        // accomodations # in 29 places, 3 items. (0.1034 vs 0.1034)
        accnum[21][11]=352716L;
        single[21][11]=184756L;
        single[21][9]=125970L;
        // accomodations # in 27 places, 7 items. (0.2593 vs 0.2593)
        accnum[27][7]=888030L;
        single[27][7]=230230L;
        // accomodations # in 29 places, 4 items. (0.1379 vs 0.1379)
        accnum[29][4]=23751L;
        single[29][4]=3276L;
        // accomodations # in 29 places, 5 items. (0.1724 vs 0.1724)
        accnum[29][5]=118755L;
        single[29][5]=20475L;
        // accomodations # in 26 places, 8 items. (0.3077 vs 0.3077)
        accnum[26][8]=1562275L;
        single[26][8]=480700L;
        // accomodations # in 29 places, 6 items. (0.2069 vs 0.2069)
        accnum[29][6]=475020L;
        single[29][6]=98280L;
        // accomodations # in 24 places, 5 items. (0.2083 vs 0.2083)
        accnum[24][5]=42504L;
        // accomodations # in 23 places, 11 items. (0.4783 vs 0.4783)
        // accomodations # in 23 places, 7 items. (0.3043 vs 0.3043)
        accnum[23][7]=245157L;
        single[23][7]=74613L;
        accnum[24][4]=10626L;
        accnum[23][11]=1352078L;
        single[23][11]=646646L;
        single[24][5]=8855L;
        // accomodations # in 30 places, 0 items. (0.0000 vs 0.0000)
        accnum[30][0]=0L;
        single[30][0]=0L;
        // accomodations # in 30 places, 1 items. (0.0333 vs 0.0333)
        accnum[30][1]=30L;
        single[30][1]=1L;
        accnum[29][3]=3654L;
        single[29][3]=378L;
        // accomodations # in 26 places, 7 items. (0.2692 vs 0.2692)
        accnum[26][7]=657800L;
        single[26][7]=177100L;
        // accomodations # in 23 places, 10 items. (0.4348 vs 0.4348)
        accnum[23][10]=1144066L;
        single[23][10]=497420L;
        // accomodations # in 27 places, 6 items. (0.2222 vs 0.2222)
        accnum[27][6]=296010L;
        single[27][6]=65780L;
        // accomodations # in 24 places, 8 items. (0.3333 vs 0.3333)
        accnum[24][8]=735471L;
        single[24][8]=245157L;
        single[25][2]=24L;
        single[24][2]=23L;
        // accomodations # in 30 places, 5 items. (0.1667 vs 0.1667)
        accnum[30][5]=142506L;
        single[30][5]=23751L;
        // accomodations # in 28 places, 7 items. (0.2500 vs 0.2500)
        accnum[28][7]=1184040L;
        single[28][7]=296010L;
        // accomodations # in 31 places, 0 items. (0.0000 vs 0.0000)
        accnum[31][0]=0L;
        single[31][0]=0L;
        // accomodations # in 31 places, 1 items. (0.0323 vs 0.0323)
        accnum[31][1]=31L;
        single[31][1]=1L;
        // accomodations # in 31 places, 2 items. (0.0645 vs 0.0645)
        accnum[31][2]=465L;
        single[31][2]=30L;
        // accomodations # in 31 places, 3 items. (0.0968 vs 0.0968)
        accnum[31][3]=4495L;
        single[31][3]=435L;
        // accomodations # in 23 places, 9 items. (0.3913 vs 0.3913)
        accnum[23][9]=817190L;
        single[23][9]=319770L;
        accnum[27][3]=2925L;
        // accomodations # in 31 places, 4 items. (0.1290 vs 0.1290)
        accnum[31][4]=31465L;
        single[31][4]=4060L;
        accnum[27][2]=351L;
        // accomodations # in 27 places, 1 items. (0.0370 vs 0.0370)
        single[27][2]=26L;
        single[27][3]=325L;
        // accomodations # in 30 places, 4 items. (0.1333 vs 0.1333)
        accnum[30][4]=27405L;
        single[30][4]=3654L;
        // accomodations # in 30 places, 6 items. (0.2000 vs 0.2000)
        accnum[30][6]=593775L;
        single[30][6]=118755L;
        // accomodations # in 31 places, 5 items. (0.1613 vs 0.1613)
        accnum[31][5]=169911L;
        single[31][5]=27405L;
        // accomodations # in 24 places, 10 items. (0.4167 vs 0.4167)
        accnum[24][10]=1961256L;
        single[24][10]=817190L;
        // accomodations # in 32 places, 0 items. (0.0000 vs 0.0000)
        accnum[32][0]=0L;
        single[32][0]=0L;
        // accomodations # in 32 places, 1 items. (0.0313 vs 0.0313)
        accnum[32][1]=32L;
        single[32][1]=1L;
        // accomodations # in 32 places, 2 items. (0.0625 vs 0.0625)
        accnum[32][2]=496L;
        single[32][2]=31L;
        // accomodations # in 32 places, 3 items. (0.0938 vs 0.0938)
        accnum[32][3]=4960L;
        single[32][3]=465L;
        // accomodations # in 31 places, 6 items. (0.1935 vs 0.1935)
        accnum[31][6]=736281L;
        single[31][6]=142506L;
        // accomodations # in 32 places, 4 items. (0.1250 vs 0.1250)
        accnum[32][4]=35960L;
        single[32][4]=4495L;
        // accomodations # in 27 places, 8 items. (0.2963 vs 0.2963)
        accnum[27][8]=2220075L;
        single[27][8]=657800L;
        // accomodations # in 30 places, 3 items. (0.1000 vs 0.1000)
        accnum[30][3]=4060L;
        single[30][3]=406L;
        // accomodations # in 30 places, 2 items. (0.0667 vs 0.0667)
        single[24][4]=1771L;
        accnum[30][2]=435L;
        single[30][2]=29L;
        // accomodations # in 25 places, 9 items. (0.3600 vs 0.3600)
        accnum[25][9]=2042975L;
        single[25][9]=735471L;
        // accomodations # in 32 places, 5 items. (0.1563 vs 0.1563)
        accnum[32][5]=201376L;
        single[32][5]=31465L;
        accnum[27][1]=27L;
        single[27][1]=1L;
        // accomodations # in 33 places, 0 items. (0.0000 vs 0.0000)
        accnum[33][0]=0L;
        single[33][0]=0L;
        // accomodations # in 33 places, 1 items. (0.0303 vs 0.0303)
        accnum[33][1]=33L;
        single[33][1]=1L;
        // accomodations # in 33 places, 2 items. (0.0606 vs 0.0606)
        accnum[33][2]=528L;
        single[33][2]=32L;
        // accomodations # in 33 places, 3 items. (0.0909 vs 0.0909)
        accnum[33][3]=5456L;
        single[33][3]=496L;
        // accomodations # in 29 places, 7 items. (0.2414 vs 0.2414)
        accnum[29][7]=1560780L;
        single[29][7]=376740L;
        // accomodations # in 33 places, 4 items. (0.1212 vs 0.1212)
        accnum[33][4]=40920L;
        single[33][4]=4960L;
        // accomodations # in 28 places, 8 items. (0.2857 vs 0.2857)
        accnum[28][8]=3108105L;
        single[28][8]=888030L;
        // accomodations # in 33 places, 5 items. (0.1515 vs 0.1515)
        accnum[33][5]=237336L;
        single[33][5]=35960L;
        // accomodations # in 32 places, 6 items. (0.1875 vs 0.1875)
        accnum[32][6]=906192L;
        single[32][6]=169911L;
        // accomodations # in 24 places, 11 items. (0.4583 vs 0.4583)
        accnum[24][11]=2496144L;
        single[24][11]=1144066L;
        // accomodations # in 25 places, 10 items. (0.4000 vs 0.4000)
        accnum[25][10]=3268760L;
        single[25][10]=1307504L;
        // accomodations # in 34 places, 0 items. (0.0000 vs 0.0000)
        accnum[34][0]=0L;
        single[34][0]=0L;
        // accomodations # in 34 places, 1 items. (0.0294 vs 0.0294)
        accnum[34][1]=34L;
        single[34][1]=1L;
        // accomodations # in 34 places, 2 items. (0.0588 vs 0.0588)
        accnum[34][2]=561L;
        single[34][2]=33L;
        // accomodations # in 33 places, 6 items. (0.1818 vs 0.1818)
        accnum[33][6]=1107568L;
        single[33][6]=201376L;
        // accomodations # in 34 places, 3 items. (0.0882 vs 0.0882)
        accnum[34][3]=5984L;
        single[34][3]=528L;
        // accomodations # in 34 places, 4 items. (0.1176 vs 0.1176)
        accnum[34][4]=46376L;
        single[34][4]=5456L;
        // accomodations # in 30 places, 7 items. (0.2333 vs 0.2333)
        accnum[30][7]=2035800L;
        single[30][7]=475020L;
        // accomodations # in 34 places, 5 items. (0.1471 vs 0.1471)
        accnum[34][5]=278256L;
        single[34][5]=40920L;
        // accomodations # in 34 places, 6 items. (0.1765 vs 0.1765)
        accnum[34][6]=1344904L;
        single[34][6]=237336L;
        // accomodations # in 29 places, 8 items. (0.2759 vs 0.2759)
        accnum[29][8]=4292145L;
        single[29][8]=1184040L;
        // accomodations # in 26 places, 9 items. (0.3462 vs 0.3462)
        accnum[26][9]=3124550L;
        single[26][9]=1081575L;
        // accomodations # in 31 places, 7 items. (0.2258 vs 0.2258)
        accnum[31][7]=2629575L;
        single[31][7]=593775L;
        // accomodations # in 35 places, 0 items. (0.0000 vs 0.0000)
        accnum[35][0]=0L;
        single[35][0]=0L;
        // accomodations # in 35 places, 1 items. (0.0286 vs 0.0286)
        accnum[35][1]=35L;
        single[35][1]=1L;
        // accomodations # in 35 places, 2 items. (0.0571 vs 0.0571)
        accnum[35][2]=595L;
        single[35][2]=34L;
        // accomodations # in 35 places, 3 items. (0.0857 vs 0.0857)
        accnum[35][3]=6545L;
        single[35][3]=561L;
        // accomodations # in 35 places, 4 items. (0.1143 vs 0.1143)
        accnum[35][4]=52360L;
        single[35][4]=5984L;
        // accomodations # in 26 places, 10 items. (0.3846 vs 0.3846)
        accnum[26][10]=5311735L;
        single[26][10]=2042975L;
        // accomodations # in 35 places, 5 items. (0.1429 vs 0.1429)
        accnum[35][5]=324632L;
        single[35][5]=46376L;
        // accomodations # in 32 places, 7 items. (0.2188 vs 0.2188)
        accnum[32][7]=3365856L;
        single[32][7]=736281L;
        // accomodations # in 30 places, 8 items. (0.2667 vs 0.2667)
        accnum[30][8]=5852925L;
        single[30][8]=1560780L;
        // accomodations # in 25 places, 11 items. (0.4400 vs 0.4400)
        accnum[25][11]=4457400L;
        single[25][11]=1961256L;
        // accomodations # in 35 places, 6 items. (0.1714 vs 0.1714)
        accnum[35][6]=1623160L;
        single[35][6]=278256L;
        // accomodations # in 27 places, 9 items. (0.3333 vs 0.3333)
        accnum[27][9]=4686825L;
        single[27][9]=1562275L;
        // accomodations # in 36 places, 0 items. (0.0000 vs 0.0000)
        accnum[36][0]=0L;
        single[36][0]=0L;
        // accomodations # in 36 places, 1 items. (0.0278 vs 0.0278)
        accnum[36][1]=36L;
        single[36][1]=1L;
        // accomodations # in 36 places, 2 items. (0.0556 vs 0.0556)
        accnum[36][2]=630L;
        single[36][2]=35L;
        // accomodations # in 36 places, 3 items. (0.0833 vs 0.0833)
        accnum[36][3]=7140L;
        single[36][3]=595L;
        // accomodations # in 36 places, 4 items. (0.1111 vs 0.1111)
        accnum[36][4]=58905L;
        single[36][4]=6545L;
        // accomodations # in 33 places, 7 items. (0.2121 vs 0.2121)
        accnum[33][7]=4272048L;
        single[33][7]=906192L;
        // accomodations # in 36 places, 5 items. (0.1389 vs 0.1389)
        accnum[36][5]=376992L;
        single[36][5]=52360L;
        // accomodations # in 28 places, 9 items. (0.3214 vs 0.3214)
        accnum[28][9]=6906900L;
        single[28][9]=2220075L;
        // accomodations # in 36 places, 6 items. (0.1667 vs 0.1667)
        accnum[36][6]=1947792L;
        single[36][6]=324632L;
        // accomodations # in 31 places, 8 items. (0.2581 vs 0.2581)
        accnum[31][8]=7888725L;
        single[31][8]=2035800L;
        // accomodations # in 34 places, 7 items. (0.2059 vs 0.2059)
        accnum[34][7]=5379616L;
        single[34][7]=1107568L;
        // accomodations # in 27 places, 10 items. (0.3704 vs 0.3704)
        accnum[27][10]=8436285L;
        single[27][10]=3124550L;
        // accomodations # in 37 places, 0 items. (0.0000 vs 0.0000)
        accnum[37][0]=0L;
        single[37][0]=0L;
        // accomodations # in 37 places, 1 items. (0.0270 vs 0.0270)
        accnum[37][1]=37L;
        single[37][1]=1L;
        // accomodations # in 37 places, 2 items. (0.0541 vs 0.0541)
        accnum[37][2]=666L;
        single[37][2]=36L;
        // accomodations # in 37 places, 3 items. (0.0811 vs 0.0811)
        accnum[37][3]=7770L;
        single[37][3]=630L;
        // accomodations # in 37 places, 4 items. (0.1081 vs 0.1081)
        accnum[37][4]=66045L;
        single[37][4]=7140L;
        // accomodations # in 37 places, 5 items. (0.1351 vs 0.1351)
        accnum[37][5]=435897L;
        single[37][5]=58905L;
        // accomodations # in 26 places, 11 items. (0.4231 vs 0.4231)
        accnum[26][11]=7726160L;
        single[26][11]=3268760L;
        // accomodations # in 32 places, 8 items. (0.2500 vs 0.2500)
        accnum[32][8]=10518300L;
        single[32][8]=2629575L;
        // accomodations # in 28 places, 10 items. (0.3571 vs 0.3571)
        accnum[28][10]=13123110L;
        single[28][10]=4686825L;
        // accomodations # in 37 places, 6 items. (0.1622 vs 0.1622)
        accnum[37][6]=2324784L;
        single[37][6]=376992L;
        // accomodations # in 35 places, 7 items. (0.2000 vs 0.2000)
        accnum[35][7]=6724520L;
        single[35][7]=1344904L;
        // accomodations # in 29 places, 9 items. (0.3103 vs 0.3103)
        accnum[29][9]=10015005L;
        single[29][9]=3108105L;
        // accomodations # in 38 places, 0 items. (0.0000 vs 0.0000)
        accnum[38][0]=0L;
        single[38][0]=0L;
        // accomodations # in 38 places, 1 items. (0.0263 vs 0.0263)
        accnum[38][1]=38L;
        single[38][1]=1L;
        // accomodations # in 38 places, 2 items. (0.0526 vs 0.0526)
        accnum[38][2]=703L;
        single[38][2]=37L;
        // accomodations # in 38 places, 3 items. (0.0789 vs 0.0789)
        accnum[38][3]=8436L;
        single[38][3]=666L;
        // accomodations # in 38 places, 4 items. (0.1053 vs 0.1053)
        accnum[38][4]=73815L;
        single[38][4]=7770L;
        // accomodations # in 38 places, 5 items. (0.1316 vs 0.1316)
        accnum[38][5]=501942L;
        single[38][5]=66045L;
        // accomodations # in 33 places, 8 items. (0.2424 vs 0.2424)
        accnum[33][8]=13884156L;
        single[33][8]=3365856L;
        // accomodations # in 36 places, 7 items. (0.1944 vs 0.1944)
        accnum[36][7]=8347680L;
        single[36][7]=1623160L;
        // accomodations # in 38 places, 6 items. (0.1579 vs 0.1579)
        accnum[38][6]=2760681L;
        single[38][6]=435897L;
        // accomodations # in 34 places, 8 items. (0.2353 vs 0.2353)
        accnum[34][8]=18156204L;
        single[34][8]=4272048L;
        // accomodations # in 30 places, 9 items. (0.3000 vs 0.3000)
        accnum[30][9]=14307150L;
        single[30][9]=4292145L;
        // accomodations # in 37 places, 7 items. (0.1892 vs 0.1892)
        accnum[37][7]=10295472L;
        single[37][7]=1947792L;
        // accomodations # in 39 places, 0 items. (0.0000 vs 0.0000)
        accnum[39][0]=0L;
        single[39][0]=0L;
        // accomodations # in 39 places, 1 items. (0.0256 vs 0.0256)
        accnum[39][1]=39L;
        single[39][1]=1L;
        // accomodations # in 39 places, 2 items. (0.0513 vs 0.0513)
        accnum[39][2]=741L;
        single[39][2]=38L;
        // accomodations # in 39 places, 3 items. (0.0769 vs 0.0769)
        accnum[39][3]=9139L;
        single[39][3]=703L;
        // accomodations # in 39 places, 4 items. (0.1026 vs 0.1026)
        accnum[39][4]=82251L;
        single[39][4]=8436L;
        // accomodations # in 39 places, 5 items. (0.1282 vs 0.1282)
        accnum[39][5]=575757L;
        single[39][5]=73815L;
        // accomodations # in 27 places, 11 items. (0.4074 vs 0.4074)
        accnum[27][11]=13037895L;
        single[27][11]=5311735L;
        // accomodations # in 29 places, 10 items. (0.3448 vs 0.3448)
        accnum[29][10]=20030010L;
        single[29][10]=6906900L;
        // accomodations # in 35 places, 8 items. (0.2286 vs 0.2286)
        accnum[35][8]=23535820L;
        single[35][8]=5379616L;
        // accomodations # in 39 places, 6 items. (0.1538 vs 0.1538)
        accnum[39][6]=3262623L;
        single[39][6]=501942L;
        // accomodations # in 38 places, 7 items. (0.1842 vs 0.1842)
        accnum[38][7]=12620256L;
        single[38][7]=2324784L;
        // accomodations # in 31 places, 9 items. (0.2903 vs 0.2903)
        accnum[31][9]=20160075L;
        single[31][9]=5852925L;
        // accomodations # in 40 places, 0 items. (0.0000 vs 0.0000)
        accnum[40][0]=0L;
        single[40][0]=0L;
        // accomodations # in 40 places, 1 items. (0.0250 vs 0.0250)
        accnum[40][1]=40L;
        single[40][1]=1L;
        // accomodations # in 40 places, 2 items. (0.0500 vs 0.0500)
        accnum[40][2]=780L;
        single[40][2]=39L;
        // accomodations # in 40 places, 3 items. (0.0750 vs 0.0750)
        accnum[40][3]=9880L;
        single[40][3]=741L;
        // accomodations # in 40 places, 4 items. (0.1000 vs 0.1000)
        accnum[40][4]=91390L;
        single[40][4]=9139L;
        // accomodations # in 40 places, 5 items. (0.1250 vs 0.1250)
        accnum[40][5]=658008L;
        single[40][5]=82251L;
        // accomodations # in 40 places, 6 items. (0.1500 vs 0.1500)
        accnum[40][6]=3838380L;
        single[40][6]=575757L;
        // accomodations # in 36 places, 8 items. (0.2222 vs 0.2222)
        accnum[36][8]=30260340L;
        single[36][8]=6724520L;
        // accomodations # in 30 places, 10 items. (0.3333 vs 0.3333)
        accnum[30][10]=30045015L;
        single[30][10]=10015005L;
        // accomodations # in 32 places, 9 items. (0.2813 vs 0.2813)
        accnum[32][9]=28048800L;
        single[32][9]=7888725L;
        // accomodations # in 28 places, 11 items. (0.3929 vs 0.3929)
        accnum[28][11]=21474180L;
        single[28][11]=8436285L;
        // accomodations # in 39 places, 7 items. (0.1795 vs 0.1795)
        accnum[39][7]=15380937L;
        single[39][7]=2760681L;
        // accomodations # in 41 places, 0 items. (0.0000 vs 0.0000)
        accnum[41][0]=0L;
        single[41][0]=0L;
        // accomodations # in 41 places, 1 items. (0.0244 vs 0.0244)
        accnum[41][1]=41L;
        single[41][1]=1L;
        // accomodations # in 41 places, 2 items. (0.0488 vs 0.0488)
        accnum[41][2]=820L;
        single[41][2]=40L;
        // accomodations # in 41 places, 3 items. (0.0732 vs 0.0732)
        accnum[41][3]=10660L;
        single[41][3]=780L;
        // accomodations # in 41 places, 4 items. (0.0976 vs 0.0976)
        accnum[41][4]=101270L;
        single[41][4]=9880L;
        // accomodations # in 41 places, 5 items. (0.1220 vs 0.1220)
        accnum[41][5]=749398L;
        single[41][5]=91390L;
        // accomodations # in 41 places, 6 items. (0.1463 vs 0.1463)
        accnum[41][6]=4496388L;
        single[41][6]=658008L;
        // accomodations # in 37 places, 8 items. (0.2162 vs 0.2162)
        accnum[37][8]=38608020L;
        single[37][8]=8347680L;
        // accomodations # in 40 places, 7 items. (0.1750 vs 0.1750)
        accnum[40][7]=18643560L;
        single[40][7]=3262623L;
        // accomodations # in 33 places, 9 items. (0.2727 vs 0.2727)
        accnum[33][9]=38567100L;
        single[33][9]=10518300L;
        // accomodations # in 31 places, 10 items. (0.3226 vs 0.3226)
        accnum[31][10]=44352165L;
        single[31][10]=14307150L;
        // accomodations # in 38 places, 8 items. (0.2105 vs 0.2105)
        accnum[38][8]=48903492L;
        single[38][8]=10295472L;
        // accomodations # in 42 places, 0 items. (0.0000 vs 0.0000)
        accnum[42][0]=0L;
        single[42][0]=0L;
        // accomodations # in 42 places, 1 items. (0.0238 vs 0.0238)
        accnum[42][1]=42L;
        single[42][1]=1L;
        // accomodations # in 42 places, 2 items. (0.0476 vs 0.0476)
        accnum[42][2]=861L;
        single[42][2]=41L;
        // accomodations # in 42 places, 3 items. (0.0714 vs 0.0714)
        accnum[42][3]=11480L;
        single[42][3]=820L;
        // accomodations # in 42 places, 4 items. (0.0952 vs 0.0952)
        accnum[42][4]=111930L;
        single[42][4]=10660L;
        // accomodations # in 42 places, 5 items. (0.1190 vs 0.1190)
        accnum[42][5]=850668L;
        single[42][5]=101270L;
        // accomodations # in 29 places, 11 items. (0.3793 vs 0.3793)
        accnum[29][11]=34597290L;
        single[29][11]=13123110L;
        // accomodations # in 42 places, 6 items. (0.1429 vs 0.1429)
        accnum[42][6]=5245786L;
        single[42][6]=749398L;
        // accomodations # in 41 places, 7 items. (0.1707 vs 0.1707)
        accnum[41][7]=22481940L;
        single[41][7]=3838380L;
        // accomodations # in 34 places, 9 items. (0.2647 vs 0.2647)
        accnum[34][9]=52451256L;
        single[34][9]=13884156L;
        // accomodations # in 32 places, 10 items. (0.3125 vs 0.3125)
        accnum[32][10]=64512240L;
        single[32][10]=20160075L;
        // accomodations # in 39 places, 8 items. (0.2051 vs 0.2051)
        accnum[39][8]=61523748L;
        single[39][8]=12620256L;
        // accomodations # in 43 places, 0 items. (0.0000 vs 0.0000)
        accnum[43][0]=0L;
        single[43][0]=0L;
        // accomodations # in 43 places, 1 items. (0.0233 vs 0.0233)
        accnum[43][1]=43L;
        single[43][1]=1L;
        // accomodations # in 43 places, 2 items. (0.0465 vs 0.0465)
        accnum[43][2]=903L;
        single[43][2]=42L;
        // accomodations # in 43 places, 3 items. (0.0698 vs 0.0698)
        accnum[43][3]=12341L;
        single[43][3]=861L;
        // accomodations # in 43 places, 4 items. (0.0930 vs 0.0930)
        accnum[43][4]=123410L;
        single[43][4]=11480L;
        // accomodations # in 43 places, 5 items. (0.1163 vs 0.1163)
        accnum[43][5]=962598L;
        single[43][5]=111930L;
        // accomodations # in 43 places, 6 items. (0.1395 vs 0.1395)
        accnum[43][6]=6096454L;
        single[43][6]=850668L;
        // accomodations # in 35 places, 9 items. (0.2571 vs 0.2571)
        accnum[35][9]=70607460L;
        single[35][9]=18156204L;
        // accomodations # in 42 places, 7 items. (0.1667 vs 0.1667)
        accnum[42][7]=26978328L;
        single[42][7]=4496388L;
        // accomodations # in 30 places, 11 items. (0.3667 vs 0.3667)
        accnum[30][11]=54627300L;
        single[30][11]=20030010L;
        // accomodations # in 40 places, 8 items. (0.2000 vs 0.2000)
        accnum[40][8]=76904685L;
        single[40][8]=15380937L;
        // accomodations # in 33 places, 10 items. (0.3030 vs 0.3030)
        accnum[33][10]=92561040L;
        single[33][10]=28048800L;
        // accomodations # in 44 places, 0 items. (0.0000 vs 0.0000)
        accnum[44][0]=0L;
        single[44][0]=0L;
        // accomodations # in 44 places, 1 items. (0.0227 vs 0.0227)
        accnum[44][1]=44L;
        single[44][1]=1L;
        // accomodations # in 44 places, 2 items. (0.0455 vs 0.0455)
        accnum[44][2]=946L;
        single[44][2]=43L;
        // accomodations # in 44 places, 3 items. (0.0682 vs 0.0682)
        accnum[44][3]=13244L;
        single[44][3]=903L;
        // accomodations # in 44 places, 4 items. (0.0909 vs 0.0909)
        accnum[44][4]=135751L;
        single[44][4]=12341L;
        // accomodations # in 44 places, 5 items. (0.1136 vs 0.1136)
        accnum[44][5]=1086008L;
        single[44][5]=123410L;
        // accomodations # in 44 places, 6 items. (0.1364 vs 0.1364)
        accnum[44][6]=7059052L;
        single[44][6]=962598L;
        // accomodations # in 43 places, 7 items. (0.1628 vs 0.1628)
        accnum[43][7]=32224114L;
        single[43][7]=5245786L;
        // accomodations # in 36 places, 9 items. (0.2500 vs 0.2500)
        accnum[36][9]=94143280L;
        single[36][9]=23535820L;
        // accomodations # in 41 places, 8 items. (0.1951 vs 0.1951)
        accnum[41][8]=95548245L;
        single[41][8]=18643560L;
        // accomodations # in 31 places, 11 items. (0.3548 vs 0.3548)
        accnum[31][11]=84672315L;
        single[31][11]=30045015L;
        // accomodations # in 44 places, 7 items. (0.1591 vs 0.1591)
        accnum[44][7]=38320568L;
        single[44][7]=6096454L;
        // accomodations # in 45 places, 0 items. (0.0000 vs 0.0000)
        accnum[45][0]=0L;
        single[45][0]=0L;
        // accomodations # in 45 places, 1 items. (0.0222 vs 0.0222)
        accnum[45][1]=45L;
        single[45][1]=1L;
        // accomodations # in 45 places, 2 items. (0.0444 vs 0.0444)
        accnum[45][2]=990L;
        single[45][2]=44L;
        // accomodations # in 45 places, 3 items. (0.0667 vs 0.0667)
        accnum[45][3]=14190L;
        single[45][3]=946L;
        // accomodations # in 45 places, 4 items. (0.0889 vs 0.0889)
        accnum[45][4]=148995L;
        single[45][4]=13244L;
        // accomodations # in 45 places, 5 items. (0.1111 vs 0.1111)
        accnum[45][5]=1221759L;
        single[45][5]=135751L;
        // accomodations # in 45 places, 6 items. (0.1333 vs 0.1333)
        accnum[45][6]=8145060L;
        single[45][6]=1086008L;
        // accomodations # in 34 places, 10 items. (0.2941 vs 0.2941)
        accnum[34][10]=131128140L;
        single[34][10]=38567100L;
        // accomodations # in 42 places, 8 items. (0.1905 vs 0.1905)
        accnum[42][8]=118030185L;
        single[42][8]=22481940L;
        // accomodations # in 37 places, 9 items. (0.2432 vs 0.2432)
        accnum[37][9]=124403620L;
        single[37][9]=30260340L;
        // accomodations # in 45 places, 7 items. (0.1556 vs 0.1556)
        accnum[45][7]=45379620L;
        single[45][7]=7059052L;
        // accomodations # in 35 places, 10 items. (0.2857 vs 0.2857)
        accnum[35][10]=183579396L;
        single[35][10]=52451256L;
        // accomodations # in 46 places, 0 items. (0.0000 vs 0.0000)
        accnum[46][0]=0L;
        single[46][0]=0L;
        // accomodations # in 46 places, 1 items. (0.0217 vs 0.0217)
        accnum[46][1]=46L;
        single[46][1]=1L;
        // accomodations # in 46 places, 2 items. (0.0435 vs 0.0435)
        accnum[46][2]=1035L;
        single[46][2]=45L;
        // accomodations # in 46 places, 3 items. (0.0652 vs 0.0652)
        accnum[46][3]=15180L;
        single[46][3]=990L;
        // accomodations # in 46 places, 4 items. (0.0870 vs 0.0870)
        accnum[46][4]=163185L;
        single[46][4]=14190L;
        // accomodations # in 46 places, 5 items. (0.1087 vs 0.1087)
        accnum[46][5]=1370754L;
        single[46][5]=148995L;
        // accomodations # in 43 places, 8 items. (0.1860 vs 0.1860)
        accnum[43][8]=145008513L;
        single[43][8]=26978328L;
        // accomodations # in 46 places, 6 items. (0.1304 vs 0.1304)
        accnum[46][6]=9366819L;
        single[46][6]=1221759L;
        // accomodations # in 32 places, 11 items. (0.3438 vs 0.3438)
        accnum[32][11]=129024480L;
        single[32][11]=44352165L;
        // accomodations # in 38 places, 9 items. (0.2368 vs 0.2368)
        accnum[38][9]=163011640L;
        single[38][9]=38608020L;
        // accomodations # in 46 places, 7 items. (0.1522 vs 0.1522)
        accnum[46][7]=53524680L;
        single[46][7]=8145060L;
        // accomodations # in 44 places, 8 items. (0.1818 vs 0.1818)
        accnum[44][8]=177232627L;
        single[44][8]=32224114L;
        // accomodations # in 47 places, 0 items. (0.0000 vs 0.0000)
        accnum[47][0]=0L;
        single[47][0]=0L;
        // accomodations # in 47 places, 1 items. (0.0213 vs 0.0213)
        accnum[47][1]=47L;
        single[47][1]=1L;
        // accomodations # in 47 places, 2 items. (0.0426 vs 0.0426)
        accnum[47][2]=1081L;
        single[47][2]=46L;
        // accomodations # in 47 places, 3 items. (0.0638 vs 0.0638)
        accnum[47][3]=16215L;
        single[47][3]=1035L;
        // accomodations # in 47 places, 4 items. (0.0851 vs 0.0851)
        accnum[47][4]=178365L;
        single[47][4]=15180L;
        // accomodations # in 47 places, 5 items. (0.1064 vs 0.1064)
        accnum[47][5]=1533939L;
        single[47][5]=163185L;
        // accomodations # in 47 places, 6 items. (0.1277 vs 0.1277)
        accnum[47][6]=10737573L;
        single[47][6]=1370754L;
        // accomodations # in 36 places, 10 items. (0.2778 vs 0.2778)
        accnum[36][10]=254186856L;
        single[36][10]=70607460L;
        // accomodations # in 39 places, 9 items. (0.2308 vs 0.2308)
        accnum[39][9]=211915132L;
        single[39][9]=48903492L;
        // accomodations # in 45 places, 8 items. (0.1778 vs 0.1778)
        accnum[45][8]=215553195L;
        single[45][8]=38320568L;
        // accomodations # in 33 places, 11 items. (0.3333 vs 0.3333)
        accnum[33][11]=193536720L;
        single[33][11]=64512240L;
        // accomodations # in 47 places, 7 items. (0.1489 vs 0.1489)
        accnum[47][7]=62891499L;
        single[47][7]=9366819L;
        // accomodations # in 48 places, 0 items. (0.0000 vs 0.0000)
        accnum[48][0]=0L;
        single[48][0]=0L;
        // accomodations # in 48 places, 1 items. (0.0208 vs 0.0208)
        accnum[48][1]=48L;
        single[48][1]=1L;
        // accomodations # in 48 places, 2 items. (0.0417 vs 0.0417)
        accnum[48][2]=1128L;
        single[48][2]=47L;
        // accomodations # in 48 places, 3 items. (0.0625 vs 0.0625)
        accnum[48][3]=17296L;
        single[48][3]=1081L;
        // accomodations # in 48 places, 4 items. (0.0833 vs 0.0833)
        accnum[48][4]=194580L;
        single[48][4]=16215L;
        // accomodations # in 48 places, 5 items. (0.1042 vs 0.1042)
        accnum[48][5]=1712304L;
        single[48][5]=178365L;
        // accomodations # in 48 places, 6 items. (0.1250 vs 0.1250)
        accnum[48][6]=12271512L;
        single[48][6]=1533939L;
        // accomodations # in 37 places, 10 items. (0.2703 vs 0.2703)
        accnum[37][10]=348330136L;
        single[37][10]=94143280L;
        // accomodations # in 40 places, 9 items. (0.2250 vs 0.2250)
        accnum[40][9]=273438880L;
        single[40][9]=61523748L;
        // accomodations # in 48 places, 7 items. (0.1458 vs 0.1458)
        accnum[48][7]=73629072L;
        single[48][7]=10737573L;
        // accomodations # in 46 places, 8 items. (0.1739 vs 0.1739)
        accnum[46][8]=260932815L;
        single[46][8]=45379620L;
        // accomodations # in 34 places, 11 items. (0.3235 vs 0.3235)
        accnum[34][11]=286097760L;
        single[34][11]=92561040L;
        // accomodations # in 49 places, 0 items. (0.0000 vs 0.0000)
        accnum[49][0]=0L;
        single[49][0]=0L;
        // accomodations # in 49 places, 1 items. (0.0204 vs 0.0204)
        accnum[49][1]=49L;
        single[49][1]=1L;
        // accomodations # in 49 places, 2 items. (0.0408 vs 0.0408)
        accnum[49][2]=1176L;
        single[49][2]=48L;
        // accomodations # in 49 places, 3 items. (0.0612 vs 0.0612)
        accnum[49][3]=18424L;
        single[49][3]=1128L;
        // accomodations # in 49 places, 4 items. (0.0816 vs 0.0816)
        accnum[49][4]=211876L;
        single[49][4]=17296L;
        // accomodations # in 41 places, 9 items. (0.2195 vs 0.2195)
        accnum[41][9]=350343565L;
        single[41][9]=76904685L;
        // accomodations # in 49 places, 5 items. (0.1020 vs 0.1020)
        accnum[49][5]=1906884L;
        single[49][5]=194580L;
        // accomodations # in 49 places, 6 items. (0.1224 vs 0.1224)
        accnum[49][6]=13983816L;
        single[49][6]=1712304L;
        // accomodations # in 38 places, 10 items. (0.2632 vs 0.2632)
        accnum[38][10]=472733756L;
        single[38][10]=124403620L;
        // accomodations # in 47 places, 8 items. (0.1702 vs 0.1702)
        accnum[47][8]=314457495L;
        single[47][8]=53524680L;
        // accomodations # in 49 places, 7 items. (0.1429 vs 0.1429)
        accnum[49][7]=85900584L;
        single[49][7]=12271512L;
        // accomodations # in 42 places, 9 items. (0.2143 vs 0.2143)
        accnum[42][9]=445891810L;
        single[42][9]=95548245L;
        // accomodations # in 50 places, 0 items. (0.0000 vs 0.0000)
        accnum[50][0]=0L;
        single[50][0]=0L;
        // accomodations # in 50 places, 1 items. (0.0200 vs 0.0200)
        accnum[50][1]=50L;
        single[50][1]=1L;
        // accomodations # in 50 places, 2 items. (0.0400 vs 0.0400)
        accnum[50][2]=1225L;
        single[50][2]=49L;
        // accomodations # in 50 places, 3 items. (0.0600 vs 0.0600)
        accnum[50][3]=19600L;
        single[50][3]=1176L;
        // accomodations # in 50 places, 4 items. (0.0800 vs 0.0800)
        accnum[50][4]=230300L;
        single[50][4]=18424L;
        // accomodations # in 50 places, 5 items. (0.1000 vs 0.1000)
        accnum[50][5]=2118760L;
        single[50][5]=211876L;
        // accomodations # in 50 places, 6 items. (0.1200 vs 0.1200)
        accnum[50][6]=15890700L;
        single[50][6]=1906884L;
        // accomodations # in 35 places, 11 items. (0.3143 vs 0.3143)
        accnum[35][11]=417225900L;
        single[35][11]=131128140L;
        // accomodations # in 48 places, 8 items. (0.1667 vs 0.1667)
        accnum[48][8]=377348994L;
        single[48][8]=62891499L;
        // accomodations # in 39 places, 10 items. (0.2564 vs 0.2564)
        accnum[39][10]=635745396L;
        single[39][10]=163011640L;
        // accomodations # in 50 places, 7 items. (0.1400 vs 0.1400)
        accnum[50][7]=99884400L;
        single[50][7]=13983816L;
        // accomodations # in 43 places, 9 items. (0.2093 vs 0.2093)
        accnum[43][9]=563921995L;
        single[43][9]=118030185L;
        // accomodations # in 51 places, 0 items. (0.0000 vs 0.0000)
        accnum[51][0]=0L;
        single[51][0]=0L;
        // accomodations # in 51 places, 1 items. (0.0196 vs 0.0196)
        accnum[51][1]=51L;
        single[51][1]=1L;
        // accomodations # in 51 places, 2 items. (0.0392 vs 0.0392)
        accnum[51][2]=1275L;
        single[51][2]=50L;
        // accomodations # in 51 places, 3 items. (0.0588 vs 0.0588)
        accnum[51][3]=20825L;
        single[51][3]=1225L;
        // accomodations # in 51 places, 4 items. (0.0784 vs 0.0784)
        accnum[51][4]=249900L;
        single[51][4]=19600L;
        // accomodations # in 51 places, 5 items. (0.0980 vs 0.0980)
        accnum[51][5]=2349060L;
        single[51][5]=230300L;
        // accomodations # in 51 places, 6 items. (0.1176 vs 0.1176)
        accnum[51][6]=18009460L;
        single[51][6]=2118760L;
        // accomodations # in 49 places, 8 items. (0.1633 vs 0.1633)
        accnum[49][8]=450978066L;
        single[49][8]=73629072L;
        // accomodations # in 40 places, 10 items. (0.2500 vs 0.2500)
        accnum[40][10]=847660528L;
        single[40][10]=211915132L;
        // accomodations # in 51 places, 7 items. (0.1373 vs 0.1373)
        accnum[51][7]=115775100L;
        single[51][7]=15890700L;
        // accomodations # in 44 places, 9 items. (0.2045 vs 0.2045)
        accnum[44][9]=708930508L;
        single[44][9]=145008513L;
        // accomodations # in 36 places, 11 items. (0.3056 vs 0.3056)
        accnum[36][11]=600805296L;
        single[36][11]=183579396L;
        // accomodations # in 52 places, 0 items. (0.0000 vs 0.0000)
        accnum[52][0]=0L;
        single[52][0]=0L;
        // accomodations # in 52 places, 1 items. (0.0192 vs 0.0192)
        accnum[52][1]=52L;
        single[52][1]=1L;
        // accomodations # in 52 places, 2 items. (0.0385 vs 0.0385)
        accnum[52][2]=1326L;
        single[52][2]=51L;
        // accomodations # in 52 places, 3 items. (0.0577 vs 0.0577)
        accnum[52][3]=22100L;
        single[52][3]=1275L;
        // accomodations # in 52 places, 4 items. (0.0769 vs 0.0769)
        accnum[52][4]=270725L;
        single[52][4]=20825L;
        // accomodations # in 52 places, 5 items. (0.0962 vs 0.0962)
        accnum[52][5]=2598960L;
        single[52][5]=249900L;
        // accomodations # in 52 places, 6 items. (0.1154 vs 0.1154)
        accnum[52][6]=20358520L;
        single[52][6]=2349060L;
        // accomodations # in 50 places, 8 items. (0.1600 vs 0.1600)
        accnum[50][8]=536878650L;
        single[50][8]=85900584L;
        // accomodations # in 52 places, 7 items. (0.1346 vs 0.1346)
        accnum[52][7]=133784560L;
        single[52][7]=18009460L;
        // accomodations # in 41 places, 10 items. (0.2439 vs 0.2439)
        accnum[41][10]=1121099408L;
        single[41][10]=273438880L;
        // accomodations # in 45 places, 9 items. (0.2000 vs 0.2000)
        accnum[45][9]=886163135L;
        single[45][9]=177232627L;
        // accomodations # in 37 places, 11 items. (0.2973 vs 0.2973)
        accnum[37][11]=854992152L;
        single[37][11]=254186856L;
        // accomodations # in 53 places, 0 items. (0.0000 vs 0.0000)
        accnum[53][0]=0L;
        single[53][0]=0L;
        // accomodations # in 53 places, 1 items. (0.0189 vs 0.0189)
        accnum[53][1]=53L;
        single[53][1]=1L;
        // accomodations # in 53 places, 2 items. (0.0377 vs 0.0377)
        accnum[53][2]=1378L;
        single[53][2]=52L;
        // accomodations # in 53 places, 3 items. (0.0566 vs 0.0566)
        accnum[53][3]=23426L;
        single[53][3]=1326L;
        // accomodations # in 53 places, 4 items. (0.0755 vs 0.0755)
        accnum[53][4]=292825L;
        single[53][4]=22100L;
        // accomodations # in 53 places, 5 items. (0.0943 vs 0.0943)
        accnum[53][5]=2869685L;
        single[53][5]=270725L;
        // accomodations # in 53 places, 6 items. (0.1132 vs 0.1132)
        accnum[53][6]=22957480L;
        single[53][6]=2598960L;
        // accomodations # in 51 places, 8 items. (0.1569 vs 0.1569)
        accnum[51][8]=636763050L;
        single[51][8]=99884400L;
        // accomodations # in 42 places, 10 items. (0.2381 vs 0.2381)
        accnum[42][10]=1471442973L;
        single[42][10]=350343565L;
        // accomodations # in 53 places, 7 items. (0.1321 vs 0.1321)
        accnum[53][7]=154143080L;
        single[53][7]=20358520L;
        // accomodations # in 46 places, 9 items. (0.1957 vs 0.1957)
        accnum[46][9]=1101716330L;
        single[46][9]=215553195L;
        // accomodations # in 52 places, 8 items. (0.1538 vs 0.1538)
        accnum[52][8]=752538150L;
        single[52][8]=115775100L;
        // accomodations # in 54 places, 0 items. (0.0000 vs 0.0000)
        accnum[54][0]=0L;
        single[54][0]=0L;
        // accomodations # in 54 places, 1 items. (0.0185 vs 0.0185)
        accnum[54][1]=54L;
        single[54][1]=1L;
        // accomodations # in 54 places, 2 items. (0.0370 vs 0.0370)
        accnum[54][2]=1431L;
        single[54][2]=53L;
        // accomodations # in 54 places, 3 items. (0.0556 vs 0.0556)
        accnum[54][3]=24804L;
        single[54][3]=1378L;
        // accomodations # in 54 places, 4 items. (0.0741 vs 0.0741)
        accnum[54][4]=316251L;
        single[54][4]=23426L;
        // accomodations # in 54 places, 5 items. (0.0926 vs 0.0926)
        accnum[54][5]=3162510L;
        single[54][5]=292825L;
        // accomodations # in 38 places, 11 items. (0.2895 vs 0.2895)
        accnum[38][11]=1203322288L;
        single[38][11]=348330136L;
        // accomodations # in 54 places, 6 items. (0.1111 vs 0.1111)
        accnum[54][6]=25827165L;
        single[54][6]=2869685L;
        // accomodations # in 47 places, 9 items. (0.1915 vs 0.1915)
        accnum[47][9]=1362649145L;
        single[47][9]=260932815L;
        // accomodations # in 54 places, 7 items. (0.1296 vs 0.1296)
        accnum[54][7]=177100560L;
        single[54][7]=22957480L;
        // accomodations # in 43 places, 10 items. (0.2326 vs 0.2326)
        accnum[43][10]=1917334783L;
        single[43][10]=445891810L;
        // accomodations # in 53 places, 8 items. (0.1509 vs 0.1509)
        accnum[53][8]=886322710L;
        single[53][8]=133784560L;
        // accomodations # in 55 places, 0 items. (0.0000 vs 0.0000)
        accnum[55][0]=0L;
        single[55][0]=0L;
        // accomodations # in 55 places, 1 items. (0.0182 vs 0.0182)
        accnum[55][1]=55L;
        single[55][1]=1L;
        // accomodations # in 55 places, 2 items. (0.0364 vs 0.0364)
        accnum[55][2]=1485L;
        single[55][2]=54L;
        // accomodations # in 55 places, 3 items. (0.0545 vs 0.0545)
        accnum[55][3]=26235L;
        single[55][3]=1431L;
        // accomodations # in 55 places, 4 items. (0.0727 vs 0.0727)
        accnum[55][4]=341055L;
        single[55][4]=24804L;
        // accomodations # in 55 places, 5 items. (0.0909 vs 0.0909)
        accnum[55][5]=3478761L;
        single[55][5]=316251L;
        // accomodations # in 55 places, 6 items. (0.1091 vs 0.1091)
        accnum[55][6]=28989675L;
        single[55][6]=3162510L;
        // accomodations # in 55 places, 7 items. (0.1273 vs 0.1273)
        accnum[55][7]=202927725L;
        single[55][7]=25827165L;
        // accomodations # in 48 places, 9 items. (0.1875 vs 0.1875)
        accnum[48][9]=1677106640L;
        single[48][9]=314457495L;
        // accomodations # in 54 places, 8 items. (0.1481 vs 0.1481)
        accnum[54][8]=1040465790L;
        single[54][8]=154143080L;
        // accomodations # in 39 places, 11 items. (0.2821 vs 0.2821)
        accnum[39][11]=1676056044L;
        single[39][11]=472733756L;
        // accomodations # in 44 places, 10 items. (0.2273 vs 0.2273)
        accnum[44][10]=2481256778L;
        single[44][10]=563921995L;
        // accomodations # in 56 places, 0 items. (0.0000 vs 0.0000)
        accnum[56][0]=0L;
        single[56][0]=0L;
        // accomodations # in 56 places, 1 items. (0.0179 vs 0.0179)
        accnum[56][1]=56L;
        single[56][1]=1L;
        // accomodations # in 56 places, 2 items. (0.0357 vs 0.0357)
        accnum[56][2]=1540L;
        single[56][2]=55L;
        // accomodations # in 56 places, 3 items. (0.0536 vs 0.0536)
        accnum[56][3]=27720L;
        single[56][3]=1485L;
        // accomodations # in 56 places, 4 items. (0.0714 vs 0.0714)
        accnum[56][4]=367290L;
        single[56][4]=26235L;
        // accomodations # in 56 places, 5 items. (0.0893 vs 0.0893)
        accnum[56][5]=3819816L;
        single[56][5]=341055L;
        // accomodations # in 56 places, 6 items. (0.1071 vs 0.1071)
        accnum[56][6]=32468436L;
        single[56][6]=3478761L;
        // accomodations # in 56 places, 7 items. (0.1250 vs 0.1250)
        accnum[56][7]=231917400L;
        single[56][7]=28989675L;
        // accomodations # in 49 places, 9 items. (0.1837 vs 0.1837)
        accnum[49][9]=2054455634L;
        single[49][9]=377348994L;
        // accomodations # in 45 places, 10 items. (0.2222 vs 0.2222)
        accnum[45][10]=3190187286L;
        single[45][10]=708930508L;
        // accomodations # in 55 places, 8 items. (0.1455 vs 0.1455)
        accnum[55][8]=1217566350L;
        single[55][8]=177100560L;
        // accomodations # in 40 places, 11 items. (0.2750 vs 0.2750)
        accnum[40][11]=2311801440L;
        single[40][11]=635745396L;
        // accomodations # in 57 places, 0 items. (0.0000 vs 0.0000)
        accnum[57][0]=0L;
        single[57][0]=0L;
        // accomodations # in 57 places, 1 items. (0.0175 vs 0.0175)
        accnum[57][1]=57L;
        single[57][1]=1L;
        // accomodations # in 57 places, 2 items. (0.0351 vs 0.0351)
        accnum[57][2]=1596L;
        single[57][2]=56L;
        // accomodations # in 57 places, 3 items. (0.0526 vs 0.0526)
        accnum[57][3]=29260L;
        single[57][3]=1540L;
        // accomodations # in 57 places, 4 items. (0.0702 vs 0.0702)
        accnum[57][4]=395010L;
        single[57][4]=27720L;
        // accomodations # in 57 places, 5 items. (0.0877 vs 0.0877)
        accnum[57][5]=4187106L;
        single[57][5]=367290L;
        // accomodations # in 57 places, 6 items. (0.1053 vs 0.1053)
        accnum[57][6]=36288252L;
        single[57][6]=3819816L;
        // accomodations # in 57 places, 7 items. (0.1228 vs 0.1228)
        accnum[57][7]=264385836L;
        single[57][7]=32468436L;
        // accomodations # in 50 places, 9 items. (0.1800 vs 0.1800)
        accnum[50][9]=2505433700L;
        single[50][9]=450978066L;
        // accomodations # in 56 places, 8 items. (0.1429 vs 0.1429)
        accnum[56][8]=1420494075L;
        single[56][8]=202927725L;
        // accomodations # in 46 places, 10 items. (0.2174 vs 0.2174)
        accnum[46][10]=4076350421L;
        single[46][10]=886163135L;
        // accomodations # in 51 places, 9 items. (0.1765 vs 0.1765)
        accnum[51][9]=3042312350L;
        single[51][9]=536878650L;
        // accomodations # in 58 places, 0 items. (0.0000 vs 0.0000)
        accnum[58][0]=0L;
        single[58][0]=0L;
        // accomodations # in 58 places, 1 items. (0.0172 vs 0.0172)
        accnum[58][1]=58L;
        single[58][1]=1L;
        // accomodations # in 58 places, 2 items. (0.0345 vs 0.0345)
        accnum[58][2]=1653L;
        single[58][2]=57L;
        // accomodations # in 58 places, 3 items. (0.0517 vs 0.0517)
        accnum[58][3]=30856L;
        single[58][3]=1596L;
        // accomodations # in 58 places, 4 items. (0.0690 vs 0.0690)
        accnum[58][4]=424270L;
        single[58][4]=29260L;
        // accomodations # in 58 places, 5 items. (0.0862 vs 0.0862)
        accnum[58][5]=4582116L;
        single[58][5]=395010L;
        // accomodations # in 58 places, 6 items. (0.1034 vs 0.1034)
        accnum[58][6]=40475358L;
        single[58][6]=4187106L;
        // accomodations # in 41 places, 11 items. (0.2683 vs 0.2683)
        accnum[41][11]=3159461968L;
        single[41][11]=847660528L;
        // accomodations # in 58 places, 7 items. (0.1207 vs 0.1207)
        accnum[58][7]=300674088L;
        single[58][7]=36288252L;
        // accomodations # in 57 places, 8 items. (0.1404 vs 0.1404)
        accnum[57][8]=1652411475L;
        single[57][8]=231917400L;
        // accomodations # in 47 places, 10 items. (0.2128 vs 0.2128)
        accnum[47][10]=5178066751L;
        single[47][10]=1101716330L;
        // accomodations # in 52 places, 9 items. (0.1731 vs 0.1731)
        accnum[52][9]=3679075400L;
        single[52][9]=636763050L;
        // accomodations # in 59 places, 0 items. (0.0000 vs 0.0000)
        accnum[59][0]=0L;
        single[59][0]=0L;
        // accomodations # in 59 places, 1 items. (0.0169 vs 0.0169)
        accnum[59][1]=59L;
        single[59][1]=1L;
        // accomodations # in 59 places, 2 items. (0.0339 vs 0.0339)
        accnum[59][2]=1711L;
        single[59][2]=58L;
        // accomodations # in 59 places, 3 items. (0.0508 vs 0.0508)
        accnum[59][3]=32509L;
        single[59][3]=1653L;
        // accomodations # in 59 places, 4 items. (0.0678 vs 0.0678)
        accnum[59][4]=455126L;
        single[59][4]=30856L;
        // accomodations # in 59 places, 5 items. (0.0847 vs 0.0847)
        accnum[59][5]=5006386L;
        single[59][5]=424270L;
        // accomodations # in 59 places, 6 items. (0.1017 vs 0.1017)
        accnum[59][6]=45057474L;
        single[59][6]=4582116L;
        // accomodations # in 59 places, 7 items. (0.1186 vs 0.1186)
        accnum[59][7]=341149446L;
        single[59][7]=40475358L;
        // accomodations # in 42 places, 11 items. (0.2619 vs 0.2619)
        accnum[42][11]=4280561376L;
        single[42][11]=1121099408L;
        // accomodations # in 58 places, 8 items. (0.1379 vs 0.1379)
        accnum[58][8]=1916797311L;
        single[58][8]=264385836L;
        // accomodations # in 53 places, 9 items. (0.1698 vs 0.1698)
        accnum[53][9]=4431613550L;
        single[53][9]=752538150L;
        // accomodations # in 48 places, 10 items. (0.2083 vs 0.2083)
        accnum[48][10]=6540715896L;
        single[48][10]=1362649145L;
        // accomodations # in 60 places, 0 items. (0.0000 vs 0.0000)
        accnum[60][0]=0L;
        single[60][0]=0L;
        // accomodations # in 60 places, 1 items. (0.0167 vs 0.0167)
        accnum[60][1]=60L;
        single[60][1]=1L;
        // accomodations # in 60 places, 2 items. (0.0333 vs 0.0333)
        accnum[60][2]=1770L;
        single[60][2]=59L;
        // accomodations # in 60 places, 3 items. (0.0500 vs 0.0500)
        accnum[60][3]=34220L;
        single[60][3]=1711L;
        // accomodations # in 60 places, 4 items. (0.0667 vs 0.0667)
        accnum[60][4]=487635L;
        single[60][4]=32509L;
        // accomodations # in 60 places, 5 items. (0.0833 vs 0.0833)
        accnum[60][5]=5461512L;
        single[60][5]=455126L;
        // accomodations # in 60 places, 6 items. (0.1000 vs 0.1000)
        accnum[60][6]=50063860L;
        single[60][6]=5006386L;
        // accomodations # in 60 places, 7 items. (0.1167 vs 0.1167)
        accnum[60][7]=386206920L;
        single[60][7]=45057474L;
        // accomodations # in 59 places, 8 items. (0.1356 vs 0.1356)
        accnum[59][8]=2217471399L;
        single[59][8]=300674088L;
        // accomodations # in 54 places, 9 items. (0.1667 vs 0.1667)
        accnum[54][9]=5317936260L;
        single[54][9]=886322710L;
        // accomodations # in 43 places, 11 items. (0.2558 vs 0.2558)
        accnum[43][11]=5752004349L;
        single[43][11]=1471442973L;
        // accomodations # in 49 places, 10 items. (0.2041 vs 0.2041)
        accnum[49][10]=8217822536L;
        single[49][10]=1677106640L;
        // accomodations # in 61 places, 0 items. (0.0000 vs 0.0000)
        accnum[61][0]=0L;
        single[61][0]=0L;
        // accomodations # in 61 places, 1 items. (0.0164 vs 0.0164)
        accnum[61][1]=61L;
        single[61][1]=1L;
        // accomodations # in 61 places, 2 items. (0.0328 vs 0.0328)
        accnum[61][2]=1830L;
        single[61][2]=60L;
        // accomodations # in 61 places, 3 items. (0.0492 vs 0.0492)
        accnum[61][3]=35990L;
        single[61][3]=1770L;
        // accomodations # in 61 places, 4 items. (0.0656 vs 0.0656)
        accnum[61][4]=521855L;
        single[61][4]=34220L;
        // accomodations # in 61 places, 5 items. (0.0820 vs 0.0820)
        accnum[61][5]=5949147L;
        single[61][5]=487635L;
        // accomodations # in 61 places, 6 items. (0.0984 vs 0.0984)
        accnum[61][6]=55525372L;
        single[61][6]=5461512L;
        // accomodations # in 61 places, 7 items. (0.1148 vs 0.1148)
        accnum[61][7]=436270780L;
        single[61][7]=50063860L;
        // accomodations # in 60 places, 8 items. (0.1333 vs 0.1333)
        accnum[60][8]=2558620845L;
        single[60][8]=341149446L;
        // accomodations # in 55 places, 9 items. (0.1636 vs 0.1636)
        accnum[55][9]=6358402050L;
        single[55][9]=1040465790L;
        // accomodations # in 50 places, 10 items. (0.2000 vs 0.2000)
        accnum[50][10]=10272278170L;
        single[50][10]=2054455634L;
        // accomodations # in 61 places, 8 items. (0.1311 vs 0.1311)
        accnum[61][8]=2944827765L;
        single[61][8]=386206920L;
        // accomodations # in 62 places, 0 items. (0.0000 vs 0.0000)
        accnum[62][0]=0L;
        single[62][0]=0L;
        // accomodations # in 62 places, 1 items. (0.0161 vs 0.0161)
        accnum[62][1]=62L;
        single[62][1]=1L;
        // accomodations # in 62 places, 2 items. (0.0323 vs 0.0323)
        accnum[62][2]=1891L;
        single[62][2]=61L;
        // accomodations # in 62 places, 3 items. (0.0484 vs 0.0484)
        accnum[62][3]=37820L;
        single[62][3]=1830L;
        // accomodations # in 62 places, 4 items. (0.0645 vs 0.0645)
        accnum[62][4]=557845L;
        single[62][4]=35990L;
        // accomodations # in 62 places, 5 items. (0.0806 vs 0.0806)
        accnum[62][5]=6471002L;
        single[62][5]=521855L;
        // accomodations # in 62 places, 6 items. (0.0968 vs 0.0968)
        accnum[62][6]=61474519L;
        single[62][6]=5949147L;
        // accomodations # in 44 places, 11 items. (0.2500 vs 0.2500)
        accnum[44][11]=7669339132L;
        single[44][11]=1917334783L;
        // accomodations # in 62 places, 7 items. (0.1129 vs 0.1129)
        accnum[62][7]=491796152L;
        single[62][7]=55525372L;
        // accomodations # in 56 places, 9 items. (0.1607 vs 0.1607)
        accnum[56][9]=7575968400L;
        single[56][9]=1217566350L;
        // accomodations # in 51 places, 10 items. (0.1961 vs 0.1961)
        accnum[51][10]=12777711870L;
        single[51][10]=2505433700L;
        // accomodations # in 57 places, 9 items. (0.1579 vs 0.1579)
        accnum[57][9]=8996462475L;
        single[57][9]=1420494075L;
        // accomodations # in 63 places, 0 items. (0.0000 vs 0.0000)
        accnum[63][0]=0L;
        single[63][0]=0L;
        // accomodations # in 63 places, 1 items. (0.0159 vs 0.0159)
        accnum[63][1]=63L;
        single[63][1]=1L;
        // accomodations # in 63 places, 2 items. (0.0317 vs 0.0317)
        accnum[63][2]=1953L;
        single[63][2]=62L;
        // accomodations # in 63 places, 3 items. (0.0476 vs 0.0476)
        accnum[63][3]=39711L;
        single[63][3]=1891L;
        // accomodations # in 63 places, 4 items. (0.0635 vs 0.0635)
        accnum[63][4]=595665L;
        single[63][4]=37820L;
        // accomodations # in 63 places, 5 items. (0.0794 vs 0.0794)
        accnum[63][5]=7028847L;
        single[63][5]=557845L;
        // accomodations # in 63 places, 6 items. (0.0952 vs 0.0952)
        accnum[63][6]=67945521L;
        single[63][6]=6471002L;
        // accomodations # in 62 places, 8 items. (0.1290 vs 0.1290)
        accnum[62][8]=3381098545L;
        single[62][8]=436270780L;
        // accomodations # in 63 places, 7 items. (0.1111 vs 0.1111)
        accnum[63][7]=553270671L;
        single[63][7]=61474519L;
        // accomodations # in 45 places, 11 items. (0.2444 vs 0.2444)
        accnum[45][11]=10150595910L;
        single[45][11]=2481256778L;
        // accomodations # in 52 places, 10 items. (0.1923 vs 0.1923)
        accnum[52][10]=15820024220L;
        single[52][10]=3042312350L;
        // accomodations # in 58 places, 9 items. (0.1552 vs 0.1552)
        accnum[58][9]=10648873950L;
        single[58][9]=1652411475L;
        // accomodations # in 64 places, 0 items. (0.0000 vs 0.0000)
        accnum[64][0]=0L;
        single[64][0]=0L;
        // accomodations # in 64 places, 1 items. (0.0156 vs 0.0156)
        accnum[64][1]=64L;
        single[64][1]=1L;
        // accomodations # in 64 places, 2 items. (0.0313 vs 0.0313)
        accnum[64][2]=2016L;
        single[64][2]=63L;
        // accomodations # in 64 places, 3 items. (0.0469 vs 0.0469)
        accnum[64][3]=41664L;
        single[64][3]=1953L;
        // accomodations # in 64 places, 4 items. (0.0625 vs 0.0625)
        accnum[64][4]=635376L;
        single[64][4]=39711L;
        // accomodations # in 64 places, 5 items. (0.0781 vs 0.0781)
        accnum[64][5]=7624512L;
        single[64][5]=595665L;
        // accomodations # in 64 places, 6 items. (0.0938 vs 0.0938)
        accnum[64][6]=74974368L;
        single[64][6]=7028847L;
        // accomodations # in 63 places, 8 items. (0.1270 vs 0.1270)
        accnum[63][8]=3872894697L;
        single[63][8]=491796152L;
        // accomodations # in 64 places, 7 items. (0.1094 vs 0.1094)
        accnum[64][7]=621216192L;
        single[64][7]=67945521L;
        // accomodations # in 46 places, 11 items. (0.2391 vs 0.2391)
        accnum[46][11]=13340783196L;
        single[46][11]=3190187286L;
        // accomodations # in 59 places, 9 items. (0.1525 vs 0.1525)
        accnum[59][9]=12565671261L;
        single[59][9]=1916797311L;
        // accomodations # in 53 places, 10 items. (0.1887 vs 0.1887)
        accnum[53][10]=19499099620L;
        single[53][10]=3679075400L;
        // accomodations # in 65 places, 0 items. (0.0000 vs 0.0000)
        accnum[65][0]=0L;
        single[65][0]=0L;
        // accomodations # in 65 places, 1 items. (0.0154 vs 0.0154)
        accnum[65][1]=65L;
        single[65][1]=1L;
        // accomodations # in 65 places, 2 items. (0.0308 vs 0.0308)
        accnum[65][2]=2080L;
        single[65][2]=64L;
        // accomodations # in 65 places, 3 items. (0.0462 vs 0.0462)
        accnum[65][3]=43680L;
        single[65][3]=2016L;
        // accomodations # in 65 places, 4 items. (0.0615 vs 0.0615)
        accnum[65][4]=677040L;
        single[65][4]=41664L;
        // accomodations # in 65 places, 5 items. (0.0769 vs 0.0769)
        accnum[65][5]=8259888L;
        single[65][5]=635376L;
        // accomodations # in 65 places, 6 items. (0.0923 vs 0.0923)
        accnum[65][6]=82598880L;
        single[65][6]=7624512L;
        // accomodations # in 65 places, 7 items. (0.1077 vs 0.1077)
        accnum[65][7]=696190560L;
        single[65][7]=74974368L;
        // accomodations # in 64 places, 8 items. (0.1250 vs 0.1250)
        accnum[64][8]=4426165368L;
        single[64][8]=553270671L;
        // accomodations # in 54 places, 10 items. (0.1852 vs 0.1852)
        accnum[54][10]=23930713170L;
        single[54][10]=4431613550L;
        // accomodations # in 60 places, 9 items. (0.1500 vs 0.1500)
        accnum[60][9]=14783142660L;
        single[60][9]=2217471399L;
        // accomodations # in 47 places, 11 items. (0.2340 vs 0.2340)
        accnum[47][11]=17417133617L;
        single[47][11]=4076350421L;
        // accomodations # in 66 places, 0 items. (0.0000 vs 0.0000)
        accnum[66][0]=0L;
        single[66][0]=0L;
        // accomodations # in 66 places, 1 items. (0.0152 vs 0.0152)
        accnum[66][1]=66L;
        single[66][1]=1L;
        // accomodations # in 66 places, 2 items. (0.0303 vs 0.0303)
        accnum[66][2]=2145L;
        single[66][2]=65L;
        // accomodations # in 66 places, 3 items. (0.0455 vs 0.0455)
        accnum[66][3]=45760L;
        single[66][3]=2080L;
        // accomodations # in 66 places, 4 items. (0.0606 vs 0.0606)
        accnum[66][4]=720720L;
        single[66][4]=43680L;
        // accomodations # in 66 places, 5 items. (0.0758 vs 0.0758)
        accnum[66][5]=8936928L;
        single[66][5]=677040L;
        // accomodations # in 66 places, 6 items. (0.0909 vs 0.0909)
        accnum[66][6]=90858768L;
        single[66][6]=8259888L;
        // accomodations # in 65 places, 8 items. (0.1231 vs 0.1231)
        accnum[65][8]=5047381560L;
        single[65][8]=621216192L;
        // accomodations # in 66 places, 7 items. (0.1061 vs 0.1061)
        accnum[66][7]=778789440L;
        single[66][7]=82598880L;
        // accomodations # in 61 places, 9 items. (0.1475 vs 0.1475)
        accnum[61][9]=17341763505L;
        single[61][9]=2558620845L;
        // accomodations # in 66 places, 8 items. (0.1212 vs 0.1212)
        accnum[66][8]=5743572120L;
        single[66][8]=696190560L;
        // accomodations # in 55 places, 10 items. (0.1818 vs 0.1818)
        accnum[55][10]=29248649430L;
        single[55][10]=5317936260L;
        // accomodations # in 67 places, 0 items. (0.0000 vs 0.0000)
        accnum[67][0]=0L;
        single[67][0]=0L;
        // accomodations # in 67 places, 1 items. (0.0149 vs 0.0149)
        accnum[67][1]=67L;
        single[67][1]=1L;
        // accomodations # in 67 places, 2 items. (0.0299 vs 0.0299)
        accnum[67][2]=2211L;
        single[67][2]=66L;
        // accomodations # in 67 places, 3 items. (0.0448 vs 0.0448)
        accnum[67][3]=47905L;
        single[67][3]=2145L;
        // accomodations # in 67 places, 4 items. (0.0597 vs 0.0597)
        accnum[67][4]=766480L;
        single[67][4]=45760L;
        // accomodations # in 67 places, 5 items. (0.0746 vs 0.0746)
        accnum[67][5]=9657648L;
        single[67][5]=720720L;
        // accomodations # in 67 places, 6 items. (0.0896 vs 0.0896)
        accnum[67][6]=99795696L;
        single[67][6]=8936928L;
        // accomodations # in 67 places, 7 items. (0.1045 vs 0.1045)
        accnum[67][7]=869648208L;
        single[67][7]=90858768L;
        // accomodations # in 48 places, 11 items. (0.2292 vs 0.2292)
        accnum[48][11]=22595200368L;
        single[48][11]=5178066751L;
        // accomodations # in 62 places, 9 items. (0.1452 vs 0.1452)
        accnum[62][9]=20286591270L;
        single[62][9]=2944827765L;
        // accomodations # in 67 places, 8 items. (0.1194 vs 0.1194)
        accnum[67][8]=6522361560L;
        single[67][8]=778789440L;
        // accomodations # in 56 places, 10 items. (0.1786 vs 0.1786)
        accnum[56][10]=35607051480L;
        single[56][10]=6358402050L;
        // accomodations # in 68 places, 0 items. (0.0000 vs 0.0000)
        accnum[68][0]=0L;
        single[68][0]=0L;
        // accomodations # in 68 places, 1 items. (0.0147 vs 0.0147)
        accnum[68][1]=68L;
        single[68][1]=1L;
        // accomodations # in 68 places, 2 items. (0.0294 vs 0.0294)
        accnum[68][2]=2278L;
        single[68][2]=67L;
        // accomodations # in 68 places, 3 items. (0.0441 vs 0.0441)
        accnum[68][3]=50116L;
        single[68][3]=2211L;
        // accomodations # in 68 places, 4 items. (0.0588 vs 0.0588)
        accnum[68][4]=814385L;
        single[68][4]=47905L;
        // accomodations # in 68 places, 5 items. (0.0735 vs 0.0735)
        accnum[68][5]=10424128L;
        single[68][5]=766480L;
        // accomodations # in 68 places, 6 items. (0.0882 vs 0.0882)
        accnum[68][6]=109453344L;
        single[68][6]=9657648L;
        // accomodations # in 68 places, 7 items. (0.1029 vs 0.1029)
        accnum[68][7]=969443904L;
        single[68][7]=99795696L;
        // accomodations # in 63 places, 9 items. (0.1429 vs 0.1429)
        accnum[63][9]=23667689815L;
        single[63][9]=3381098545L;
        // accomodations # in 49 places, 11 items. (0.2245 vs 0.2245)
        accnum[49][11]=29135916264L;
        single[49][11]=6540715896L;
        // accomodations # in 68 places, 8 items. (0.1176 vs 0.1176)
        accnum[68][8]=7392009768L;
        single[68][8]=869648208L;
        // accomodations # in 57 places, 10 items. (0.1754 vs 0.1754)
        accnum[57][10]=43183019880L;
        single[57][10]=7575968400L;
        // accomodations # in 69 places, 0 items. (0.0000 vs 0.0000)
        accnum[69][0]=0L;
        single[69][0]=0L;
        // accomodations # in 69 places, 1 items. (0.0145 vs 0.0145)
        accnum[69][1]=69L;
        single[69][1]=1L;
        // accomodations # in 69 places, 2 items. (0.0290 vs 0.0290)
        accnum[69][2]=2346L;
        single[69][2]=68L;
        // accomodations # in 69 places, 3 items. (0.0435 vs 0.0435)
        accnum[69][3]=52394L;
        single[69][3]=2278L;
        // accomodations # in 69 places, 4 items. (0.0580 vs 0.0580)
        accnum[69][4]=864501L;
        single[69][4]=50116L;
        // accomodations # in 69 places, 5 items. (0.0725 vs 0.0725)
        accnum[69][5]=11238513L;
        single[69][5]=814385L;
        // accomodations # in 69 places, 6 items. (0.0870 vs 0.0870)
        accnum[69][6]=119877472L;
        single[69][6]=10424128L;
        // accomodations # in 69 places, 7 items. (0.1014 vs 0.1014)
        accnum[69][7]=1078897248L;
        single[69][7]=109453344L;
        // accomodations # in 64 places, 9 items. (0.1406 vs 0.1406)
        accnum[64][9]=27540584512L;
        single[64][9]=3872894697L;
        // accomodations # in 50 places, 11 items. (0.2200 vs 0.2200)
        accnum[50][11]=37353738800L;
        single[50][11]=8217822536L;
        // accomodations # in 69 places, 8 items. (0.1159 vs 0.1159)
        accnum[69][8]=8361453672L;
        single[69][8]=969443904L;
        // accomodations # in 58 places, 10 items. (0.1724 vs 0.1724)
        accnum[58][10]=52179482355L;
        single[58][10]=8996462475L;
        // accomodations # in 70 places, 0 items. (0.0000 vs 0.0000)
        accnum[70][0]=0L;
        single[70][0]=0L;
        // accomodations # in 70 places, 1 items. (0.0143 vs 0.0143)
        accnum[70][1]=70L;
        single[70][1]=1L;
        // accomodations # in 70 places, 2 items. (0.0286 vs 0.0286)
        accnum[70][2]=2415L;
        single[70][2]=69L;
        // accomodations # in 70 places, 3 items. (0.0429 vs 0.0429)
        accnum[70][3]=54740L;
        single[70][3]=2346L;
        // accomodations # in 70 places, 4 items. (0.0571 vs 0.0571)
        accnum[70][4]=916895L;
        single[70][4]=52394L;
        // accomodations # in 70 places, 5 items. (0.0714 vs 0.0714)
        accnum[70][5]=12103014L;
        single[70][5]=864501L;
        // accomodations # in 70 places, 6 items. (0.0857 vs 0.0857)
        accnum[70][6]=131115985L;
        single[70][6]=11238513L;
        // accomodations # in 70 places, 7 items. (0.1000 vs 0.1000)
        accnum[70][7]=1198774720L;
        single[70][7]=119877472L;
        // accomodations # in 65 places, 9 items. (0.1385 vs 0.1385)
        accnum[65][9]=31966749880L;
        single[65][9]=4426165368L;
        // accomodations # in 70 places, 8 items. (0.1143 vs 0.1143)
        accnum[70][8]=9440350920L;
        single[70][8]=1078897248L;
        // accomodations # in 51 places, 11 items. (0.2157 vs 0.2157)
        accnum[51][11]=47626016970L;
        single[51][11]=10272278170L;
        // accomodations # in 59 places, 10 items. (0.1695 vs 0.1695)
        accnum[59][10]=62828356305L;
        single[59][10]=10648873950L;
        // accomodations # in 71 places, 0 items. (0.0000 vs 0.0000)
        accnum[71][0]=0L;
        single[71][0]=0L;
        // accomodations # in 71 places, 1 items. (0.0141 vs 0.0141)
        accnum[71][1]=71L;
        single[71][1]=1L;
        // accomodations # in 71 places, 2 items. (0.0282 vs 0.0282)
        accnum[71][2]=2485L;
        single[71][2]=70L;
        // accomodations # in 71 places, 3 items. (0.0423 vs 0.0423)
        accnum[71][3]=57155L;
        single[71][3]=2415L;
        // accomodations # in 71 places, 4 items. (0.0563 vs 0.0563)
        accnum[71][4]=971635L;
        single[71][4]=54740L;
        // accomodations # in 71 places, 5 items. (0.0704 vs 0.0704)
        accnum[71][5]=13019909L;
        single[71][5]=916895L;
        // accomodations # in 71 places, 6 items. (0.0845 vs 0.0845)
        accnum[71][6]=143218999L;
        single[71][6]=12103014L;
        // accomodations # in 71 places, 7 items. (0.0986 vs 0.0986)
        accnum[71][7]=1329890705L;
        single[71][7]=131115985L;
        // accomodations # in 66 places, 9 items. (0.1364 vs 0.1364)
        accnum[66][9]=37014131440L;
        single[66][9]=5047381560L;
        // accomodations # in 71 places, 8 items. (0.1127 vs 0.1127)
        accnum[71][8]=10639125640L;
        single[71][8]=1198774720L;
        // accomodations # in 60 places, 10 items. (0.1667 vs 0.1667)
        accnum[60][10]=75394027566L;
        single[60][10]=12565671261L;
        // accomodations # in 67 places, 9 items. (0.1343 vs 0.1343)
        accnum[67][9]=42757703560L;
        single[67][9]=5743572120L;
        // accomodations # in 72 places, 0 items. (0.0000 vs 0.0000)
        accnum[72][0]=0L;
        single[72][0]=0L;
        // accomodations # in 72 places, 1 items. (0.0139 vs 0.0139)
        accnum[72][1]=72L;
        single[72][1]=1L;
        // accomodations # in 72 places, 2 items. (0.0278 vs 0.0278)
        accnum[72][2]=2556L;
        single[72][2]=71L;
        // accomodations # in 72 places, 3 items. (0.0417 vs 0.0417)
        accnum[72][3]=59640L;
        single[72][3]=2485L;
        // accomodations # in 72 places, 4 items. (0.0556 vs 0.0556)
        accnum[72][4]=1028790L;
        single[72][4]=57155L;
        // accomodations # in 72 places, 5 items. (0.0694 vs 0.0694)
        accnum[72][5]=13991544L;
        single[72][5]=971635L;
        // accomodations # in 72 places, 6 items. (0.0833 vs 0.0833)
        accnum[72][6]=156238908L;
        single[72][6]=13019909L;
        // accomodations # in 72 places, 7 items. (0.0972 vs 0.0972)
        accnum[72][7]=1473109704L;
        single[72][7]=143218999L;
        // accomodations # in 52 places, 11 items. (0.2115 vs 0.2115)
        accnum[52][11]=60403728840L;
        single[52][11]=12777711870L;
        // accomodations # in 72 places, 8 items. (0.1111 vs 0.1111)
        accnum[72][8]=11969016345L;
        single[72][8]=1329890705L;
        // accomodations # in 61 places, 10 items. (0.1639 vs 0.1639)
        accnum[61][10]=90177170226L;
        single[61][10]=14783142660L;
        // accomodations # in 68 places, 9 items. (0.1324 vs 0.1324)
        accnum[68][9]=49280065120L;
        single[68][9]=6522361560L;
        // accomodations # in 73 places, 0 items. (0.0000 vs 0.0000)
        accnum[73][0]=0L;
        single[73][0]=0L;
        // accomodations # in 73 places, 1 items. (0.0137 vs 0.0137)
        accnum[73][1]=73L;
        single[73][1]=1L;
        // accomodations # in 73 places, 2 items. (0.0274 vs 0.0274)
        accnum[73][2]=2628L;
        single[73][2]=72L;
        // accomodations # in 73 places, 3 items. (0.0411 vs 0.0411)
        accnum[73][3]=62196L;
        single[73][3]=2556L;
        // accomodations # in 73 places, 4 items. (0.0548 vs 0.0548)
        accnum[73][4]=1088430L;
        single[73][4]=59640L;
        // accomodations # in 73 places, 5 items. (0.0685 vs 0.0685)
        accnum[73][5]=15020334L;
        single[73][5]=1028790L;
        // accomodations # in 73 places, 6 items. (0.0822 vs 0.0822)
        accnum[73][6]=170230452L;
        single[73][6]=13991544L;
        // accomodations # in 73 places, 7 items. (0.0959 vs 0.0959)
        accnum[73][7]=1629348612L;
        single[73][7]=156238908L;
        // accomodations # in 53 places, 11 items. (0.2075 vs 0.2075)
        accnum[53][11]=76223753060L;
        single[53][11]=15820024220L;
        // accomodations # in 73 places, 8 items. (0.1096 vs 0.1096)
        accnum[73][8]=13442126049L;
        single[73][8]=1473109704L;
        // accomodations # in 69 places, 9 items. (0.1304 vs 0.1304)
        accnum[69][9]=56672074888L;
        single[69][9]=7392009768L;
        // accomodations # in 62 places, 10 items. (0.1613 vs 0.1613)
        accnum[62][10]=107518933731L;
        single[62][10]=17341763505L;
        // accomodations # in 74 places, 0 items. (0.0000 vs 0.0000)
        accnum[74][0]=0L;
        single[74][0]=0L;
        // accomodations # in 74 places, 1 items. (0.0135 vs 0.0135)
        accnum[74][1]=74L;
        single[74][1]=1L;
        // accomodations # in 74 places, 2 items. (0.0270 vs 0.0270)
        accnum[74][2]=2701L;
        single[74][2]=73L;
        // accomodations # in 74 places, 3 items. (0.0405 vs 0.0405)
        accnum[74][3]=64824L;
        single[74][3]=2628L;
        // accomodations # in 74 places, 4 items. (0.0541 vs 0.0541)
        accnum[74][4]=1150626L;
        single[74][4]=62196L;
        // accomodations # in 74 places, 5 items. (0.0676 vs 0.0676)
        accnum[74][5]=16108764L;
        single[74][5]=1088430L;
        // accomodations # in 74 places, 6 items. (0.0811 vs 0.0811)
        accnum[74][6]=185250786L;
        single[74][6]=15020334L;
        // accomodations # in 74 places, 7 items. (0.0946 vs 0.0946)
        accnum[74][7]=1799579064L;
        single[74][7]=170230452L;
        // accomodations # in 74 places, 8 items. (0.1081 vs 0.1081)
        accnum[74][8]=15071474661L;
        single[74][8]=1629348612L;
        // accomodations # in 70 places, 9 items. (0.1286 vs 0.1286)
        accnum[70][9]=65033528560L;
        single[70][9]=8361453672L;
        // accomodations # in 54 places, 11 items. (0.2037 vs 0.2037)
        accnum[54][11]=95722852680L;
        single[54][11]=19499099620L;
        // accomodations # in 63 places, 10 items. (0.1587 vs 0.1587)
        accnum[63][10]=127805525001L;
        single[63][10]=20286591270L;
        // accomodations # in 75 places, 0 items. (0.0000 vs 0.0000)
        accnum[75][0]=0L;
        single[75][0]=0L;
        // accomodations # in 75 places, 1 items. (0.0133 vs 0.0133)
        accnum[75][1]=75L;
        single[75][1]=1L;
        // accomodations # in 75 places, 2 items. (0.0267 vs 0.0267)
        accnum[75][2]=2775L;
        single[75][2]=74L;
        // accomodations # in 75 places, 3 items. (0.0400 vs 0.0400)
        accnum[75][3]=67525L;
        single[75][3]=2701L;
        // accomodations # in 75 places, 4 items. (0.0533 vs 0.0533)
        accnum[75][4]=1215450L;
        single[75][4]=64824L;
        // accomodations # in 75 places, 5 items. (0.0667 vs 0.0667)
        accnum[75][5]=17259390L;
        single[75][5]=1150626L;
        // accomodations # in 75 places, 6 items. (0.0800 vs 0.0800)
        accnum[75][6]=201359550L;
        single[75][6]=16108764L;
        // accomodations # in 75 places, 7 items. (0.0933 vs 0.0933)
        accnum[75][7]=1984829850L;
        single[75][7]=185250786L;
        // accomodations # in 71 places, 9 items. (0.1268 vs 0.1268)
        accnum[71][9]=74473879480L;
        single[71][9]=9440350920L;
        // accomodations # in 75 places, 8 items. (0.1067 vs 0.1067)
        accnum[75][8]=16871053725L;
        single[75][8]=1799579064L;
        // accomodations # in 64 places, 10 items. (0.1563 vs 0.1563)
        accnum[64][10]=151473214816L;
        single[64][10]=23667689815L;
        // accomodations # in 55 places, 11 items. (0.2000 vs 0.2000)
        accnum[55][11]=119653565850L;
        single[55][11]=23930713170L;
        // accomodations # in 76 places, 0 items. (0.0000 vs 0.0000)
        accnum[76][0]=0L;
        single[76][0]=0L;
        // accomodations # in 76 places, 1 items. (0.0132 vs 0.0132)
        accnum[76][1]=76L;
        single[76][1]=1L;
        // accomodations # in 76 places, 2 items. (0.0263 vs 0.0263)
        accnum[76][2]=2850L;
        single[76][2]=75L;
        // accomodations # in 76 places, 3 items. (0.0395 vs 0.0395)
        accnum[76][3]=70300L;
        single[76][3]=2775L;
        // accomodations # in 76 places, 4 items. (0.0526 vs 0.0526)
        accnum[76][4]=1282975L;
        single[76][4]=67525L;
        // accomodations # in 76 places, 5 items. (0.0658 vs 0.0658)
        accnum[76][5]=18474840L;
        single[76][5]=1215450L;
        // accomodations # in 76 places, 6 items. (0.0789 vs 0.0789)
        accnum[76][6]=218618940L;
        single[76][6]=17259390L;
        // accomodations # in 76 places, 7 items. (0.0921 vs 0.0921)
        accnum[76][7]=2186189400L;
        single[76][7]=201359550L;
        // accomodations # in 72 places, 9 items. (0.1250 vs 0.1250)
        accnum[72][9]=85113005120L;
        single[72][9]=10639125640L;
        // accomodations # in 76 places, 8 items. (0.1053 vs 0.1053)
        accnum[76][8]=18855883575L;
        single[76][8]=1984829850L;
        // accomodations # in 65 places, 10 items. (0.1538 vs 0.1538)
        accnum[65][10]=179013799328L;
        single[65][10]=27540584512L;
        // accomodations # in 56 places, 11 items. (0.1964 vs 0.1964)
        accnum[56][11]=148902215280L;
        single[56][11]=29248649430L;
        // accomodations # in 77 places, 0 items. (0.0000 vs 0.0000)
        accnum[77][0]=0L;
        single[77][0]=0L;
        // accomodations # in 77 places, 1 items. (0.0130 vs 0.0130)
        accnum[77][1]=77L;
        single[77][1]=1L;
        // accomodations # in 77 places, 2 items. (0.0260 vs 0.0260)
        accnum[77][2]=2926L;
        single[77][2]=76L;
        // accomodations # in 77 places, 3 items. (0.0390 vs 0.0390)
        accnum[77][3]=73150L;
        single[77][3]=2850L;
        // accomodations # in 77 places, 4 items. (0.0519 vs 0.0519)
        accnum[77][4]=1353275L;
        single[77][4]=70300L;
        // accomodations # in 77 places, 5 items. (0.0649 vs 0.0649)
        accnum[77][5]=19757815L;
        single[77][5]=1282975L;
        // accomodations # in 77 places, 6 items. (0.0779 vs 0.0779)
        accnum[77][6]=237093780L;
        single[77][6]=18474840L;
        // accomodations # in 77 places, 7 items. (0.0909 vs 0.0909)
        accnum[77][7]=2404808340L;
        single[77][7]=218618940L;
        // accomodations # in 73 places, 9 items. (0.1233 vs 0.1233)
        accnum[73][9]=97082021465L;
        single[73][9]=11969016345L;
        // accomodations # in 77 places, 8 items. (0.1039 vs 0.1039)
        accnum[77][8]=21042072975L;
        single[77][8]=2186189400L;
        // accomodations # in 66 places, 10 items. (0.1515 vs 0.1515)
        accnum[66][10]=210980549208L;
        single[66][10]=31966749880L;
        // accomodations # in 57 places, 11 items. (0.1930 vs 0.1930)
        accnum[57][11]=184509266760L;
        single[57][11]=35607051480L;
        // accomodations # in 78 places, 0 items. (0.0000 vs 0.0000)
        accnum[78][0]=0L;
        single[78][0]=0L;
        // accomodations # in 78 places, 1 items. (0.0128 vs 0.0128)
        accnum[78][1]=78L;
        single[78][1]=1L;
        // accomodations # in 78 places, 2 items. (0.0256 vs 0.0256)
        accnum[78][2]=3003L;
        single[78][2]=77L;
        // accomodations # in 78 places, 3 items. (0.0385 vs 0.0385)
        accnum[78][3]=76076L;
        single[78][3]=2926L;
        // accomodations # in 78 places, 4 items. (0.0513 vs 0.0513)
        accnum[78][4]=1426425L;
        single[78][4]=73150L;
        // accomodations # in 78 places, 5 items. (0.0641 vs 0.0641)
        accnum[78][5]=21111090L;
        single[78][5]=1353275L;
        // accomodations # in 78 places, 6 items. (0.0769 vs 0.0769)
        accnum[78][6]=256851595L;
        single[78][6]=19757815L;
        // accomodations # in 78 places, 7 items. (0.0897 vs 0.0897)
        accnum[78][7]=2641902120L;
        single[78][7]=237093780L;
        // accomodations # in 74 places, 9 items. (0.1216 vs 0.1216)
        accnum[74][9]=110524147514L;
        single[74][9]=13442126049L;
        // accomodations # in 67 places, 10 items. (0.1493 vs 0.1493)
        accnum[67][10]=247994680648L;
        single[67][10]=37014131440L;
        // accomodations # in 78 places, 8 items. (0.1026 vs 0.1026)
        accnum[78][8]=23446881315L;
        single[78][8]=2404808340L;
        // accomodations # in 75 places, 9 items. (0.1200 vs 0.1200)
        accnum[75][9]=125595622175L;
        single[75][9]=15071474661L;
        // accomodations # in 79 places, 0 items. (0.0000 vs 0.0000)
        accnum[79][0]=0L;
        single[79][0]=0L;
        // accomodations # in 79 places, 1 items. (0.0127 vs 0.0127)
        accnum[79][1]=79L;
        single[79][1]=1L;
        // accomodations # in 79 places, 2 items. (0.0253 vs 0.0253)
        accnum[79][2]=3081L;
        single[79][2]=78L;
        // accomodations # in 79 places, 3 items. (0.0380 vs 0.0380)
        accnum[79][3]=79079L;
        single[79][3]=3003L;
        // accomodations # in 79 places, 4 items. (0.0506 vs 0.0506)
        accnum[79][4]=1502501L;
        single[79][4]=76076L;
        // accomodations # in 79 places, 5 items. (0.0633 vs 0.0633)
        accnum[79][5]=22537515L;
        single[79][5]=1426425L;
        // accomodations # in 79 places, 6 items. (0.0759 vs 0.0759)
        accnum[79][6]=277962685L;
        single[79][6]=21111090L;
        // accomodations # in 79 places, 7 items. (0.0886 vs 0.0886)
        accnum[79][7]=2898753715L;
        single[79][7]=256851595L;
        // accomodations # in 58 places, 11 items. (0.1897 vs 0.1897)
        accnum[58][11]=227692286640L;
        single[58][11]=43183019880L;
        // accomodations # in 68 places, 10 items. (0.1471 vs 0.1471)
        accnum[68][10]=290752384208L;
        single[68][10]=42757703560L;
        // accomodations # in 79 places, 8 items. (0.1013 vs 0.1013)
        accnum[79][8]=26088783435L;
        single[79][8]=2641902120L;
        // accomodations # in 76 places, 9 items. (0.1184 vs 0.1184)
        accnum[76][9]=142466675900L;
        single[76][9]=16871053725L;
        // accomodations # in 80 places, 0 items. (0.0000 vs 0.0000)
        accnum[80][0]=0L;
        single[80][0]=0L;
        // accomodations # in 80 places, 1 items. (0.0125 vs 0.0125)
        accnum[80][1]=80L;
        single[80][1]=1L;
        // accomodations # in 80 places, 2 items. (0.0250 vs 0.0250)
        accnum[80][2]=3160L;
        single[80][2]=79L;
        // accomodations # in 80 places, 3 items. (0.0375 vs 0.0375)
        accnum[80][3]=82160L;
        single[80][3]=3081L;
        // accomodations # in 80 places, 4 items. (0.0500 vs 0.0500)
        accnum[80][4]=1581580L;
        single[80][4]=79079L;
        // accomodations # in 80 places, 5 items. (0.0625 vs 0.0625)
        accnum[80][5]=24040016L;
        single[80][5]=1502501L;
        // accomodations # in 80 places, 6 items. (0.0750 vs 0.0750)
        accnum[80][6]=300500200L;
        single[80][6]=22537515L;
        // accomodations # in 80 places, 7 items. (0.0875 vs 0.0875)
        accnum[80][7]=3176716400L;
        single[80][7]=277962685L;
        // accomodations # in 80 places, 8 items. (0.1000 vs 0.1000)
        accnum[80][8]=28987537150L;
        single[80][8]=2898753715L;
        // accomodations # in 59 places, 11 items. (0.1864 vs 0.1864)
        accnum[59][11]=279871768995L;
        single[59][11]=52179482355L;
        // accomodations # in 69 places, 10 items. (0.1449 vs 0.1449)
        accnum[69][10]=340032449328L;
        single[69][10]=49280065120L;
        // accomodations # in 77 places, 9 items. (0.1169 vs 0.1169)
        accnum[77][9]=161322559475L;
        single[77][9]=18855883575L;
        // accomodations # in 81 places, 0 items. (0.0000 vs 0.0000)
        accnum[81][0]=0L;
        single[81][0]=0L;
        // accomodations # in 81 places, 1 items. (0.0123 vs 0.0123)
        accnum[81][1]=81L;
        single[81][1]=1L;
        // accomodations # in 81 places, 2 items. (0.0247 vs 0.0247)
        accnum[81][2]=3240L;
        single[81][2]=80L;
        // accomodations # in 81 places, 3 items. (0.0370 vs 0.0370)
        accnum[81][3]=85320L;
        single[81][3]=3160L;
        // accomodations # in 81 places, 4 items. (0.0494 vs 0.0494)
        accnum[81][4]=1663740L;
        single[81][4]=82160L;
        // accomodations # in 81 places, 5 items. (0.0617 vs 0.0617)
        accnum[81][5]=25621596L;
        single[81][5]=1581580L;
        // accomodations # in 81 places, 6 items. (0.0741 vs 0.0741)
        accnum[81][6]=324540216L;
        single[81][6]=24040016L;
        // accomodations # in 81 places, 7 items. (0.0864 vs 0.0864)
        accnum[81][7]=3477216600L;
        single[81][7]=300500200L;
        // accomodations # in 81 places, 8 items. (0.0988 vs 0.0988)
        accnum[81][8]=32164253550L;
        single[81][8]=3176716400L;
        // accomodations # in 70 places, 10 items. (0.1429 vs 0.1429)
        accnum[70][10]=396704524216L;
        single[70][10]=56672074888L;
        // accomodations # in 60 places, 11 items. (0.1833 vs 0.1833)
        accnum[60][11]=342700125300L;
        single[60][11]=62828356305L;
    }
}
