package mesh;

public class Accomodations {
    public static final int MAX_SIZE = 81;
    public static final int MAX_NUM = 11;
    public static final long[][] accnum = new long[MAX_SIZE + 1][MAX_NUM + 1];
    public static final long[][] single = new long[MAX_SIZE + 1][MAX_NUM + 1];
    static {
        // accomodations # in 0 places, 0 items. (0.0000 vs 0.0000)
        accnum[0][0]=0;
        single[0][0]=0;
        // accomodations # in 0 places, 1 items. (1.0000 vs 0.0000)
        accnum[0][1]=0;
        single[0][1]=0;
        // accomodations # in 0 places, 2 items. (2.0000 vs 0.0000)
        accnum[0][2]=0;
        single[0][2]=0;
        // accomodations # in 0 places, 3 items. (3.0000 vs 0.0000)
        accnum[0][3]=0;
        single[0][3]=0;
        // accomodations # in 0 places, 4 items. (4.0000 vs 0.0000)
        accnum[0][4]=0;
        single[0][4]=0;
        // accomodations # in 0 places, 5 items. (5.0000 vs 0.0000)
        accnum[0][5]=0;
        single[0][5]=0;
        // accomodations # in 0 places, 6 items. (6.0000 vs 0.0000)
        accnum[0][6]=0;
        single[0][6]=0;
        // accomodations # in 0 places, 7 items. (7.0000 vs 0.0000)
        accnum[0][7]=0;
        single[0][7]=0;
        // accomodations # in 0 places, 8 items. (8.0000 vs 0.0000)
        accnum[0][8]=0;
        single[0][8]=0;
        // accomodations # in 0 places, 9 items. (9.0000 vs 0.0000)
        accnum[0][9]=0;
        single[0][9]=0;
        // accomodations # in 0 places, 10 items. (10.0000 vs 0.0000)
        accnum[0][10]=0;
        single[0][10]=0;
        // accomodations # in 0 places, 11 items. (11.0000 vs 0.0000)
        accnum[0][11]=0;
        single[0][11]=0;
        // accomodations # in 1 places, 0 items. (0.0000 vs 0.0000)
        accnum[1][0]=0;
        single[1][0]=0;
        // accomodations # in 1 places, 1 items. (1.0000 vs 1.0000)
        accnum[1][1]=1;
        single[1][1]=1;
        // accomodations # in 1 places, 2 items. (2.0000 vs 0.0000)
        accnum[1][2]=0;
        single[1][2]=0;
        // accomodations # in 1 places, 3 items. (3.0000 vs 0.0000)
        accnum[1][3]=0;
        single[1][3]=0;
        // accomodations # in 1 places, 4 items. (4.0000 vs 0.0000)
        accnum[1][4]=0;
        single[1][4]=0;
        // accomodations # in 1 places, 5 items. (5.0000 vs 0.0000)
        accnum[1][5]=0;
        single[1][5]=0;
        // accomodations # in 1 places, 6 items. (6.0000 vs 0.0000)
        accnum[1][6]=0;
        single[1][6]=0;
        // accomodations # in 1 places, 7 items. (7.0000 vs 0.0000)
        accnum[1][7]=0;
        single[1][7]=0;
        // accomodations # in 1 places, 8 items. (8.0000 vs 0.0000)
        accnum[1][8]=0;
        single[1][8]=0;
        // accomodations # in 1 places, 9 items. (9.0000 vs 0.0000)
        accnum[1][9]=0;
        single[1][9]=0;
        // accomodations # in 1 places, 10 items. (10.0000 vs 0.0000)
        accnum[1][10]=0;
        single[1][10]=0;
        // accomodations # in 1 places, 11 items. (11.0000 vs 0.0000)
        accnum[1][11]=0;
        single[1][11]=0;
        // accomodations # in 2 places, 0 items. (0.0000 vs 0.0000)
        accnum[2][0]=0;
        single[2][0]=0;
        // accomodations # in 2 places, 1 items. (0.5000 vs 0.5000)
        accnum[2][1]=2;
        single[2][1]=1;
        // accomodations # in 2 places, 2 items. (1.0000 vs 1.0000)
        accnum[2][2]=1;
        single[2][2]=1;
        // accomodations # in 2 places, 3 items. (1.5000 vs 0.0000)
        accnum[2][3]=0;
        single[2][3]=0;
        // accomodations # in 2 places, 4 items. (2.0000 vs 0.0000)
        accnum[2][4]=0;
        single[2][4]=0;
        // accomodations # in 2 places, 5 items. (2.5000 vs 0.0000)
        accnum[2][5]=0;
        single[2][5]=0;
        // accomodations # in 2 places, 6 items. (3.0000 vs 0.0000)
        accnum[2][6]=0;
        single[2][6]=0;
        // accomodations # in 2 places, 7 items. (3.5000 vs 0.0000)
        accnum[2][7]=0;
        single[2][7]=0;
        // accomodations # in 2 places, 8 items. (4.0000 vs 0.0000)
        accnum[2][8]=0;
        single[2][8]=0;
        // accomodations # in 2 places, 9 items. (4.5000 vs 0.0000)
        accnum[2][9]=0;
        single[2][9]=0;
        // accomodations # in 2 places, 10 items. (5.0000 vs 0.0000)
        accnum[2][10]=0;
        single[2][10]=0;
        // accomodations # in 2 places, 11 items. (5.5000 vs 0.0000)
        accnum[2][11]=0;
        single[2][11]=0;
        // accomodations # in 3 places, 0 items. (0.0000 vs 0.0000)
        accnum[3][0]=0;
        single[3][0]=0;
        // accomodations # in 3 places, 1 items. (0.3333 vs 0.3333)
        accnum[3][1]=3;
        single[3][1]=1;
        // accomodations # in 3 places, 2 items. (0.6667 vs 0.6667)
        accnum[3][2]=3;
        single[3][2]=2;
        // accomodations # in 3 places, 3 items. (1.0000 vs 1.0000)
        accnum[3][3]=1;
        single[3][3]=1;
        // accomodations # in 3 places, 4 items. (1.3333 vs 0.0000)
        accnum[3][4]=0;
        single[3][4]=0;
        // accomodations # in 3 places, 5 items. (1.6667 vs 0.0000)
        accnum[3][5]=0;
        single[3][5]=0;
        // accomodations # in 3 places, 6 items. (2.0000 vs 0.0000)
        accnum[3][6]=0;
        single[3][6]=0;
        // accomodations # in 3 places, 7 items. (2.3333 vs 0.0000)
        accnum[3][7]=0;
        single[3][7]=0;
        // accomodations # in 3 places, 8 items. (2.6667 vs 0.0000)
        accnum[3][8]=0;
        single[3][8]=0;
        // accomodations # in 3 places, 9 items. (3.0000 vs 0.0000)
        accnum[3][9]=0;
        single[3][9]=0;
        // accomodations # in 3 places, 10 items. (3.3333 vs 0.0000)
        accnum[3][10]=0;
        single[3][10]=0;
        // accomodations # in 3 places, 11 items. (3.6667 vs 0.0000)
        accnum[3][11]=0;
        single[3][11]=0;
        // accomodations # in 4 places, 0 items. (0.0000 vs 0.0000)
        accnum[4][0]=0;
        single[4][0]=0;
        // accomodations # in 4 places, 1 items. (0.2500 vs 0.2500)
        accnum[4][1]=4;
        single[4][1]=1;
        // accomodations # in 4 places, 2 items. (0.5000 vs 0.5000)
        accnum[4][2]=6;
        single[4][2]=3;
        // accomodations # in 4 places, 3 items. (0.7500 vs 0.7500)
        accnum[4][3]=4;
        single[4][3]=3;
        // accomodations # in 4 places, 4 items. (1.0000 vs 1.0000)
        accnum[4][4]=1;
        single[4][4]=1;
        // accomodations # in 4 places, 5 items. (1.2500 vs 0.0000)
        accnum[4][5]=0;
        single[4][5]=0;
        // accomodations # in 4 places, 6 items. (1.5000 vs 0.0000)
        accnum[4][6]=0;
        single[4][6]=0;
        // accomodations # in 4 places, 7 items. (1.7500 vs 0.0000)
        accnum[4][7]=0;
        single[4][7]=0;
        // accomodations # in 4 places, 8 items. (2.0000 vs 0.0000)
        accnum[4][8]=0;
        single[4][8]=0;
        // accomodations # in 4 places, 9 items. (2.2500 vs 0.0000)
        accnum[4][9]=0;
        single[4][9]=0;
        // accomodations # in 4 places, 10 items. (2.5000 vs 0.0000)
        accnum[4][10]=0;
        single[4][10]=0;
        // accomodations # in 4 places, 11 items. (2.7500 vs 0.0000)
        accnum[4][11]=0;
        single[4][11]=0;
        // accomodations # in 5 places, 0 items. (0.0000 vs 0.0000)
        accnum[5][0]=0;
        single[5][0]=0;
        // accomodations # in 5 places, 1 items. (0.2000 vs 0.2000)
        accnum[5][1]=5;
        single[5][1]=1;
        // accomodations # in 5 places, 2 items. (0.4000 vs 0.4000)
        accnum[5][2]=10;
        single[5][2]=4;
        // accomodations # in 5 places, 3 items. (0.6000 vs 0.6000)
        accnum[5][3]=10;
        single[5][3]=6;
        // accomodations # in 5 places, 4 items. (0.8000 vs 0.8000)
        accnum[5][4]=5;
        single[5][4]=4;
        // accomodations # in 5 places, 5 items. (1.0000 vs 1.0000)
        accnum[5][5]=1;
        single[5][5]=1;
        // accomodations # in 5 places, 6 items. (1.2000 vs 0.0000)
        accnum[5][6]=0;
        single[5][6]=0;
        // accomodations # in 5 places, 7 items. (1.4000 vs 0.0000)
        accnum[5][7]=0;
        single[5][7]=0;
        // accomodations # in 5 places, 8 items. (1.6000 vs 0.0000)
        accnum[5][8]=0;
        single[5][8]=0;
        // accomodations # in 5 places, 9 items. (1.8000 vs 0.0000)
        accnum[5][9]=0;
        single[5][9]=0;
        // accomodations # in 5 places, 10 items. (2.0000 vs 0.0000)
        accnum[5][10]=0;
        single[5][10]=0;
        // accomodations # in 5 places, 11 items. (2.2000 vs 0.0000)
        accnum[5][11]=0;
        single[5][11]=0;
        // accomodations # in 6 places, 0 items. (0.0000 vs 0.0000)
        accnum[6][0]=0;
        single[6][0]=0;
        // accomodations # in 6 places, 1 items. (0.1667 vs 0.1667)
        accnum[6][1]=6;
        single[6][1]=1;
        // accomodations # in 6 places, 2 items. (0.3333 vs 0.3333)
        accnum[6][2]=15;
        single[6][2]=5;
        // accomodations # in 6 places, 3 items. (0.5000 vs 0.5000)
        accnum[6][3]=20;
        single[6][3]=10;
        // accomodations # in 6 places, 4 items. (0.6667 vs 0.6667)
        accnum[6][4]=15;
        single[6][4]=10;
        // accomodations # in 6 places, 5 items. (0.8333 vs 0.8333)
        accnum[6][5]=6;
        single[6][5]=5;
        // accomodations # in 6 places, 6 items. (1.0000 vs 1.0000)
        accnum[6][6]=1;
        single[6][6]=1;
        // accomodations # in 6 places, 7 items. (1.1667 vs 0.0000)
        accnum[6][7]=0;
        single[6][7]=0;
        // accomodations # in 6 places, 8 items. (1.3333 vs 0.0000)
        accnum[6][8]=0;
        single[6][8]=0;
        // accomodations # in 6 places, 9 items. (1.5000 vs 0.0000)
        accnum[6][9]=0;
        single[6][9]=0;
        // accomodations # in 6 places, 10 items. (1.6667 vs 0.0000)
        accnum[6][10]=0;
        single[6][10]=0;
        // accomodations # in 6 places, 11 items. (1.8333 vs 0.0000)
        accnum[6][11]=0;
        single[6][11]=0;
        // accomodations # in 7 places, 0 items. (0.0000 vs 0.0000)
        accnum[7][0]=0;
        single[7][0]=0;
        // accomodations # in 7 places, 1 items. (0.1429 vs 0.1429)
        accnum[7][1]=7;
        single[7][1]=1;
        // accomodations # in 7 places, 2 items. (0.2857 vs 0.2857)
        accnum[7][2]=21;
        single[7][2]=6;
        // accomodations # in 7 places, 3 items. (0.4286 vs 0.4286)
        accnum[7][3]=35;
        single[7][3]=15;
        // accomodations # in 7 places, 4 items. (0.5714 vs 0.5714)
        accnum[7][4]=35;
        single[7][4]=20;
        // accomodations # in 7 places, 5 items. (0.7143 vs 0.7143)
        accnum[7][5]=21;
        single[7][5]=15;
        // accomodations # in 7 places, 6 items. (0.8571 vs 0.8571)
        accnum[7][6]=7;
        single[7][6]=6;
        // accomodations # in 7 places, 7 items. (1.0000 vs 1.0000)
        accnum[7][7]=1;
        single[7][7]=1;
        // accomodations # in 7 places, 8 items. (1.1429 vs 0.0000)
        accnum[7][8]=0;
        single[7][8]=0;
        // accomodations # in 7 places, 9 items. (1.2857 vs 0.0000)
        accnum[7][9]=0;
        single[7][9]=0;
        // accomodations # in 7 places, 10 items. (1.4286 vs 0.0000)
        accnum[7][10]=0;
        single[7][10]=0;
        // accomodations # in 7 places, 11 items. (1.5714 vs 0.0000)
        accnum[7][11]=0;
        single[7][11]=0;
        // accomodations # in 8 places, 0 items. (0.0000 vs 0.0000)
        accnum[8][0]=0;
        single[8][0]=0;
        // accomodations # in 8 places, 1 items. (0.1250 vs 0.1250)
        accnum[8][1]=8;
        single[8][1]=1;
        // accomodations # in 8 places, 2 items. (0.2500 vs 0.2500)
        accnum[8][2]=28;
        single[8][2]=7;
        // accomodations # in 8 places, 3 items. (0.3750 vs 0.3750)
        accnum[8][3]=56;
        single[8][3]=21;
        // accomodations # in 8 places, 4 items. (0.5000 vs 0.5000)
        accnum[8][4]=70;
        single[8][4]=35;
        // accomodations # in 8 places, 5 items. (0.6250 vs 0.6250)
        accnum[8][5]=56;
        single[8][5]=35;
        // accomodations # in 8 places, 6 items. (0.7500 vs 0.7500)
        accnum[8][6]=28;
        single[8][6]=21;
        // accomodations # in 8 places, 7 items. (0.8750 vs 0.8750)
        accnum[8][7]=8;
        single[8][7]=7;
        // accomodations # in 8 places, 8 items. (1.0000 vs 1.0000)
        accnum[8][8]=1;
        single[8][8]=1;
        // accomodations # in 8 places, 9 items. (1.1250 vs 0.0000)
        accnum[8][9]=0;
        single[8][9]=0;
        // accomodations # in 8 places, 10 items. (1.2500 vs 0.0000)
        accnum[8][10]=0;
        single[8][10]=0;
        // accomodations # in 8 places, 11 items. (1.3750 vs 0.0000)
        accnum[8][11]=0;
        single[8][11]=0;
        // accomodations # in 9 places, 0 items. (0.0000 vs 0.0000)
        accnum[9][0]=0;
        single[9][0]=0;
        // accomodations # in 9 places, 1 items. (0.1111 vs 0.1111)
        accnum[9][1]=9;
        single[9][1]=1;
        // accomodations # in 9 places, 2 items. (0.2222 vs 0.2222)
        accnum[9][2]=36;
        single[9][2]=8;
        // accomodations # in 9 places, 3 items. (0.3333 vs 0.3333)
        accnum[9][3]=84;
        single[9][3]=28;
        // accomodations # in 9 places, 4 items. (0.4444 vs 0.4444)
        accnum[9][4]=126;
        single[9][4]=56;
        // accomodations # in 9 places, 5 items. (0.5556 vs 0.5556)
        accnum[9][5]=126;
        single[9][5]=70;
        // accomodations # in 9 places, 6 items. (0.6667 vs 0.6667)
        accnum[9][6]=84;
        single[9][6]=56;
        // accomodations # in 9 places, 7 items. (0.7778 vs 0.7778)
        accnum[9][7]=36;
        single[9][7]=28;
        // accomodations # in 9 places, 8 items. (0.8889 vs 0.8889)
        accnum[9][8]=9;
        single[9][8]=8;
        // accomodations # in 9 places, 9 items. (1.0000 vs 1.0000)
        accnum[9][9]=1;
        single[9][9]=1;
        // accomodations # in 9 places, 10 items. (1.1111 vs 0.0000)
        accnum[9][10]=0;
        single[9][10]=0;
        // accomodations # in 9 places, 11 items. (1.2222 vs 0.0000)
        accnum[9][11]=0;
        single[9][11]=0;
        // accomodations # in 10 places, 0 items. (0.0000 vs 0.0000)
        accnum[10][0]=0;
        single[10][0]=0;
        // accomodations # in 10 places, 1 items. (0.1000 vs 0.1000)
        accnum[10][1]=10;
        single[10][1]=1;
        // accomodations # in 10 places, 2 items. (0.2000 vs 0.2000)
        accnum[10][2]=45;
        single[10][2]=9;
        // accomodations # in 10 places, 3 items. (0.3000 vs 0.3000)
        accnum[10][3]=120;
        single[10][3]=36;
        // accomodations # in 10 places, 4 items. (0.4000 vs 0.4000)
        accnum[10][4]=210;
        single[10][4]=84;
        // accomodations # in 10 places, 5 items. (0.5000 vs 0.5000)
        accnum[10][5]=252;
        single[10][5]=126;
        // accomodations # in 10 places, 6 items. (0.6000 vs 0.6000)
        accnum[10][6]=210;
        single[10][6]=126;
        // accomodations # in 10 places, 7 items. (0.7000 vs 0.7000)
        accnum[10][7]=120;
        single[10][7]=84;
        // accomodations # in 10 places, 8 items. (0.8000 vs 0.8000)
        accnum[10][8]=45;
        single[10][8]=36;
        // accomodations # in 10 places, 9 items. (0.9000 vs 0.9000)
        accnum[10][9]=10;
        single[10][9]=9;
        // accomodations # in 10 places, 10 items. (1.0000 vs 1.0000)
        accnum[10][10]=1;
        single[10][10]=1;
        // accomodations # in 10 places, 11 items. (1.1000 vs 0.0000)
        accnum[10][11]=0;
        single[10][11]=0;
        // accomodations # in 11 places, 0 items. (0.0000 vs 0.0000)
        accnum[11][0]=0;
        single[11][0]=0;
        // accomodations # in 11 places, 1 items. (0.0909 vs 0.0909)
        accnum[11][1]=11;
        single[11][1]=1;
        // accomodations # in 11 places, 2 items. (0.1818 vs 0.1818)
        accnum[11][2]=55;
        single[11][2]=10;
        // accomodations # in 11 places, 3 items. (0.2727 vs 0.2727)
        accnum[11][3]=165;
        single[11][3]=45;
        // accomodations # in 11 places, 4 items. (0.3636 vs 0.3636)
        accnum[11][4]=330;
        single[11][4]=120;
        // accomodations # in 11 places, 5 items. (0.4545 vs 0.4545)
        accnum[11][5]=462;
        single[11][5]=210;
        // accomodations # in 11 places, 6 items. (0.5455 vs 0.5455)
        accnum[11][6]=462;
        single[11][6]=252;
        // accomodations # in 11 places, 7 items. (0.6364 vs 0.6364)
        accnum[11][7]=330;
        single[11][7]=210;
        // accomodations # in 11 places, 8 items. (0.7273 vs 0.7273)
        accnum[11][8]=165;
        single[11][8]=120;
        // accomodations # in 11 places, 9 items. (0.8182 vs 0.8182)
        accnum[11][9]=55;
        single[11][9]=45;
        // accomodations # in 11 places, 10 items. (0.9091 vs 0.9091)
        accnum[11][10]=11;
        single[11][10]=10;
        // accomodations # in 11 places, 11 items. (1.0000 vs 1.0000)
        accnum[11][11]=1;
        single[11][11]=1;
        // accomodations # in 12 places, 0 items. (0.0000 vs 0.0000)
        accnum[12][0]=0;
        single[12][0]=0;
        // accomodations # in 12 places, 1 items. (0.0833 vs 0.0833)
        accnum[12][1]=12;
        single[12][1]=1;
        // accomodations # in 12 places, 2 items. (0.1667 vs 0.1667)
        accnum[12][2]=66;
        single[12][2]=11;
        // accomodations # in 12 places, 3 items. (0.2500 vs 0.2500)
        accnum[12][3]=220;
        single[12][3]=55;
        // accomodations # in 12 places, 4 items. (0.3333 vs 0.3333)
        accnum[12][4]=495;
        single[12][4]=165;
        // accomodations # in 12 places, 5 items. (0.4167 vs 0.4167)
        accnum[12][5]=792;
        single[12][5]=330;
        // accomodations # in 12 places, 6 items. (0.5000 vs 0.5000)
        accnum[12][6]=924;
        single[12][6]=462;
        // accomodations # in 12 places, 7 items. (0.5833 vs 0.5833)
        accnum[12][7]=792;
        single[12][7]=462;
        // accomodations # in 12 places, 8 items. (0.6667 vs 0.6667)
        accnum[12][8]=495;
        single[12][8]=330;
        // accomodations # in 12 places, 9 items. (0.7500 vs 0.7500)
        accnum[12][9]=220;
        single[12][9]=165;
        // accomodations # in 12 places, 10 items. (0.8333 vs 0.8333)
        accnum[12][10]=66;
        single[12][10]=55;
        // accomodations # in 12 places, 11 items. (0.9167 vs 0.9167)
        accnum[12][11]=12;
        single[12][11]=11;
        // accomodations # in 13 places, 0 items. (0.0000 vs 0.0000)
        accnum[13][0]=0;
        single[13][0]=0;
        // accomodations # in 13 places, 1 items. (0.0769 vs 0.0769)
        accnum[13][1]=13;
        single[13][1]=1;
        // accomodations # in 13 places, 2 items. (0.1538 vs 0.1538)
        accnum[13][2]=78;
        single[13][2]=12;
        // accomodations # in 13 places, 3 items. (0.2308 vs 0.2308)
        accnum[13][3]=286;
        single[13][3]=66;
        // accomodations # in 13 places, 4 items. (0.3077 vs 0.3077)
        accnum[13][4]=715;
        single[13][4]=220;
        // accomodations # in 13 places, 5 items. (0.3846 vs 0.3846)
        accnum[13][5]=1287;
        single[13][5]=495;
        // accomodations # in 13 places, 6 items. (0.4615 vs 0.4615)
        accnum[13][6]=1716;
        single[13][6]=792;
        // accomodations # in 13 places, 7 items. (0.5385 vs 0.5385)
        accnum[13][7]=1716;
        single[13][7]=924;
        // accomodations # in 13 places, 8 items. (0.6154 vs 0.6154)
        accnum[13][8]=1287;
        single[13][8]=792;
        // accomodations # in 13 places, 9 items. (0.6923 vs 0.6923)
        accnum[13][9]=715;
        single[13][9]=495;
        // accomodations # in 13 places, 10 items. (0.7692 vs 0.7692)
        accnum[13][10]=286;
        single[13][10]=220;
        // accomodations # in 13 places, 11 items. (0.8462 vs 0.8462)
        accnum[13][11]=78;
        single[13][11]=66;
        // accomodations # in 14 places, 0 items. (0.0000 vs 0.0000)
        accnum[14][0]=0;
        single[14][0]=0;
        // accomodations # in 14 places, 1 items. (0.0714 vs 0.0714)
        accnum[14][1]=14;
        single[14][1]=1;
        // accomodations # in 14 places, 2 items. (0.1429 vs 0.1429)
        accnum[14][2]=91;
        single[14][2]=13;
        // accomodations # in 14 places, 3 items. (0.2143 vs 0.2143)
        accnum[14][3]=364;
        single[14][3]=78;
        // accomodations # in 14 places, 4 items. (0.2857 vs 0.2857)
        accnum[14][4]=1001;
        single[14][4]=286;
        // accomodations # in 14 places, 5 items. (0.3571 vs 0.3571)
        accnum[14][5]=2002;
        single[14][5]=715;
        // accomodations # in 14 places, 6 items. (0.4286 vs 0.4286)
        accnum[14][6]=3003;
        single[14][6]=1287;
        // accomodations # in 14 places, 7 items. (0.5000 vs 0.5000)
        accnum[14][7]=3432;
        single[14][7]=1716;
        // accomodations # in 14 places, 8 items. (0.5714 vs 0.5714)
        accnum[14][8]=3003;
        single[14][8]=1716;
        // accomodations # in 14 places, 9 items. (0.6429 vs 0.6429)
        accnum[14][9]=2002;
        single[14][9]=1287;
        // accomodations # in 14 places, 10 items. (0.7143 vs 0.7143)
        accnum[14][10]=1001;
        single[14][10]=715;
        // accomodations # in 14 places, 11 items. (0.7857 vs 0.7857)
        accnum[14][11]=364;
        single[14][11]=286;
        // accomodations # in 15 places, 0 items. (0.0000 vs 0.0000)
        accnum[15][0]=0;
        single[15][0]=0;
        // accomodations # in 15 places, 1 items. (0.0667 vs 0.0667)
        accnum[15][1]=15;
        single[15][1]=1;
        // accomodations # in 15 places, 2 items. (0.1333 vs 0.1333)
        accnum[15][2]=105;
        single[15][2]=14;
        // accomodations # in 15 places, 3 items. (0.2000 vs 0.2000)
        accnum[15][3]=455;
        single[15][3]=91;
        // accomodations # in 15 places, 4 items. (0.2667 vs 0.2667)
        accnum[15][4]=1365;
        single[15][4]=364;
        // accomodations # in 15 places, 5 items. (0.3333 vs 0.3333)
        accnum[15][5]=3003;
        single[15][5]=1001;
        // accomodations # in 15 places, 6 items. (0.4000 vs 0.4000)
        accnum[15][6]=5005;
        single[15][6]=2002;
        // accomodations # in 15 places, 7 items. (0.4667 vs 0.4667)
        accnum[15][7]=6435;
        single[15][7]=3003;
        // accomodations # in 15 places, 8 items. (0.5333 vs 0.5333)
        accnum[15][8]=6435;
        single[15][8]=3432;
        // accomodations # in 15 places, 9 items. (0.6000 vs 0.6000)
        accnum[15][9]=5005;
        single[15][9]=3003;
        // accomodations # in 15 places, 10 items. (0.6667 vs 0.6667)
        accnum[15][10]=3003;
        single[15][10]=2002;
        // accomodations # in 15 places, 11 items. (0.7333 vs 0.7333)
        accnum[15][11]=1365;
        single[15][11]=1001;
        // accomodations # in 16 places, 0 items. (0.0000 vs 0.0000)
        accnum[16][0]=0;
        single[16][0]=0;
        // accomodations # in 16 places, 1 items. (0.0625 vs 0.0625)
        accnum[16][1]=16;
        single[16][1]=1;
        // accomodations # in 16 places, 2 items. (0.1250 vs 0.1250)
        accnum[16][2]=120;
        single[16][2]=15;
        // accomodations # in 16 places, 3 items. (0.1875 vs 0.1875)
        accnum[16][3]=560;
        single[16][3]=105;
        // accomodations # in 16 places, 4 items. (0.2500 vs 0.2500)
        accnum[16][4]=1820;
        single[16][4]=455;
        // accomodations # in 16 places, 5 items. (0.3125 vs 0.3125)
        accnum[16][5]=4368;
        single[16][5]=1365;
        // accomodations # in 16 places, 6 items. (0.3750 vs 0.3750)
        accnum[16][6]=8008;
        single[16][6]=3003;
        // accomodations # in 16 places, 7 items. (0.4375 vs 0.4375)
        accnum[16][7]=11440;
        single[16][7]=5005;
        // accomodations # in 16 places, 8 items. (0.5000 vs 0.5000)
        accnum[16][8]=12870;
        single[16][8]=6435;
        // accomodations # in 16 places, 9 items. (0.5625 vs 0.5625)
        accnum[16][9]=11440;
        single[16][9]=6435;
        // accomodations # in 16 places, 10 items. (0.6250 vs 0.6250)
        accnum[16][10]=8008;
        single[16][10]=5005;
        // accomodations # in 16 places, 11 items. (0.6875 vs 0.6875)
        accnum[16][11]=4368;
        single[16][11]=3003;
        // accomodations # in 17 places, 0 items. (0.0000 vs 0.0000)
        accnum[17][0]=0;
        single[17][0]=0;
        // accomodations # in 17 places, 1 items. (0.0588 vs 0.0588)
        accnum[17][1]=17;
        single[17][1]=1;
        // accomodations # in 17 places, 2 items. (0.1176 vs 0.1176)
        accnum[17][2]=136;
        single[17][2]=16;
        // accomodations # in 17 places, 3 items. (0.1765 vs 0.1765)
        accnum[17][3]=680;
        single[17][3]=120;
        // accomodations # in 17 places, 4 items. (0.2353 vs 0.2353)
        accnum[17][4]=2380;
        single[17][4]=560;
        // accomodations # in 17 places, 5 items. (0.2941 vs 0.2941)
        accnum[17][5]=6188;
        single[17][5]=1820;
        // accomodations # in 17 places, 6 items. (0.3529 vs 0.3529)
        accnum[17][6]=12376;
        single[17][6]=4368;
        // accomodations # in 17 places, 7 items. (0.4118 vs 0.4118)
        accnum[17][7]=19448;
        single[17][7]=8008;
        // accomodations # in 17 places, 8 items. (0.4706 vs 0.4706)
        accnum[17][8]=24310;
        single[17][8]=11440;
        // accomodations # in 17 places, 9 items. (0.5294 vs 0.5294)
        accnum[17][9]=24310;
        single[17][9]=12870;
        // accomodations # in 17 places, 10 items. (0.5882 vs 0.5882)
        accnum[17][10]=19448;
        single[17][10]=11440;
        // accomodations # in 17 places, 11 items. (0.6471 vs 0.6471)
        accnum[17][11]=12376;
        single[17][11]=8008;
        // accomodations # in 18 places, 0 items. (0.0000 vs 0.0000)
        accnum[18][0]=0;
        single[18][0]=0;
        // accomodations # in 18 places, 1 items. (0.0556 vs 0.0556)
        accnum[18][1]=18;
        single[18][1]=1;
        // accomodations # in 18 places, 2 items. (0.1111 vs 0.1111)
        accnum[18][2]=153;
        single[18][2]=17;
        // accomodations # in 18 places, 3 items. (0.1667 vs 0.1667)
        accnum[18][3]=816;
        single[18][3]=136;
        // accomodations # in 18 places, 4 items. (0.2222 vs 0.2222)
        accnum[18][4]=3060;
        single[18][4]=680;
        // accomodations # in 18 places, 5 items. (0.2778 vs 0.2778)
        accnum[18][5]=8568;
        single[18][5]=2380;
        // accomodations # in 18 places, 6 items. (0.3333 vs 0.3333)
        accnum[18][6]=18564;
        single[18][6]=6188;
        // accomodations # in 18 places, 7 items. (0.3889 vs 0.3889)
        accnum[18][7]=31824;
        single[18][7]=12376;
        // accomodations # in 18 places, 8 items. (0.4444 vs 0.4444)
        accnum[18][8]=43758;
        single[18][8]=19448;
        // accomodations # in 18 places, 9 items. (0.5000 vs 0.5000)
        accnum[18][9]=48620;
        single[18][9]=24310;
        // accomodations # in 18 places, 10 items. (0.5556 vs 0.5556)
        accnum[18][10]=43758;
        single[18][10]=24310;
        // accomodations # in 18 places, 11 items. (0.6111 vs 0.6111)
        accnum[18][11]=31824;
        single[18][11]=19448;
        // accomodations # in 19 places, 0 items. (0.0000 vs 0.0000)
        accnum[19][0]=0;
        single[19][0]=0;
        // accomodations # in 19 places, 1 items. (0.0526 vs 0.0526)
        accnum[19][1]=19;
        single[19][1]=1;
        // accomodations # in 19 places, 2 items. (0.1053 vs 0.1053)
        accnum[19][2]=171;
        single[19][2]=18;
        // accomodations # in 19 places, 3 items. (0.1579 vs 0.1579)
        accnum[19][3]=969;
        single[19][3]=153;
        // accomodations # in 19 places, 4 items. (0.2105 vs 0.2105)
        accnum[19][4]=3876;
        single[19][4]=816;
        // accomodations # in 19 places, 5 items. (0.2632 vs 0.2632)
        accnum[19][5]=11628;
        single[19][5]=3060;
        // accomodations # in 19 places, 6 items. (0.3158 vs 0.3158)
        accnum[19][6]=27132;
        single[19][6]=8568;
        // accomodations # in 19 places, 7 items. (0.3684 vs 0.3684)
        accnum[19][7]=50388;
        single[19][7]=18564;
        // accomodations # in 19 places, 8 items. (0.4211 vs 0.4211)
        accnum[19][8]=75582;
        single[19][8]=31824;
        // accomodations # in 19 places, 9 items. (0.4737 vs 0.4737)
        accnum[19][9]=92378;
        single[19][9]=43758;
        // accomodations # in 19 places, 10 items. (0.5263 vs 0.5263)
        accnum[19][10]=92378;
        single[19][10]=48620;
        // accomodations # in 19 places, 11 items. (0.5789 vs 0.5789)
        accnum[19][11]=75582;
        single[19][11]=43758;
        // accomodations # in 20 places, 0 items. (0.0000 vs 0.0000)
        accnum[20][0]=0;
        single[20][0]=0;
        // accomodations # in 20 places, 1 items. (0.0500 vs 0.0500)
        accnum[20][1]=20;
        single[20][1]=1;
        // accomodations # in 20 places, 2 items. (0.1000 vs 0.1000)
        accnum[20][2]=190;
        single[20][2]=19;
        // accomodations # in 20 places, 3 items. (0.1500 vs 0.1500)
        accnum[20][3]=1140;
        single[20][3]=171;
        // accomodations # in 20 places, 4 items. (0.2000 vs 0.2000)
        accnum[20][4]=4845;
        single[20][4]=969;
        // accomodations # in 20 places, 5 items. (0.2500 vs 0.2500)
        accnum[20][5]=15504;
        single[20][5]=3876;
        // accomodations # in 20 places, 6 items. (0.3000 vs 0.3000)
        accnum[20][6]=38760;
        single[20][6]=11628;
        // accomodations # in 20 places, 7 items. (0.3500 vs 0.3500)
        accnum[20][7]=77520;
        single[20][7]=27132;
        // accomodations # in 20 places, 8 items. (0.4000 vs 0.4000)
        accnum[20][8]=125970;
        single[20][8]=50388;
        // accomodations # in 20 places, 9 items. (0.4500 vs 0.4500)
        accnum[20][9]=167960;
        single[20][9]=75582;
        // accomodations # in 20 places, 10 items. (0.5000 vs 0.5000)
        accnum[20][10]=184756;
        single[20][10]=92378;
        // accomodations # in 20 places, 11 items. (0.5500 vs 0.5500)
        accnum[20][11]=167960;
        single[20][11]=92378;
        // accomodations # in 21 places, 0 items. (0.0000 vs 0.0000)
        accnum[21][0]=0;
        single[21][0]=0;
        // accomodations # in 21 places, 1 items. (0.0476 vs 0.0476)
        accnum[21][1]=21;
        single[21][1]=1;
        // accomodations # in 21 places, 2 items. (0.0952 vs 0.0952)
        accnum[21][2]=210;
        single[21][2]=20;
        // accomodations # in 21 places, 3 items. (0.1429 vs 0.1429)
        accnum[21][3]=1330;
        single[21][3]=190;
        // accomodations # in 21 places, 4 items. (0.1905 vs 0.1905)
        accnum[21][4]=5985;
        single[21][4]=1140;
        // accomodations # in 21 places, 5 items. (0.2381 vs 0.2381)
        accnum[21][5]=20349;
        single[21][5]=4845;
        // accomodations # in 21 places, 6 items. (0.2857 vs 0.2857)
        accnum[21][6]=54264;
        single[21][6]=15504;
        // accomodations # in 21 places, 7 items. (0.3333 vs 0.3333)
        accnum[21][7]=116280;
        single[21][7]=38760;
        // accomodations # in 21 places, 8 items. (0.3810 vs 0.3810)
        accnum[21][8]=203490;
        single[21][8]=77520;
        // accomodations # in 21 places, 9 items. (0.4286 vs 0.4286)
        accnum[21][9]=293930;
        single[21][9]=125970;
        // accomodations # in 21 places, 10 items. (0.4762 vs 0.4762)
        accnum[21][10]=352716;
        single[21][10]=167960;
        // accomodations # in 21 places, 11 items. (0.5238 vs 0.5238)
        accnum[21][11]=352716;
        single[21][11]=184756;
        // accomodations # in 22 places, 0 items. (0.0000 vs 0.0000)
        accnum[22][0]=0;
        single[22][0]=0;
        // accomodations # in 22 places, 1 items. (0.0455 vs 0.0455)
        accnum[22][1]=22;
        single[22][1]=1;
        // accomodations # in 22 places, 2 items. (0.0909 vs 0.0909)
        accnum[22][2]=231;
        single[22][2]=21;
        // accomodations # in 22 places, 3 items. (0.1364 vs 0.1364)
        accnum[22][3]=1540;
        single[22][3]=210;
        // accomodations # in 22 places, 4 items. (0.1818 vs 0.1818)
        accnum[22][4]=7315;
        single[22][4]=1330;
        // accomodations # in 22 places, 5 items. (0.2273 vs 0.2273)
        accnum[22][5]=26334;
        single[22][5]=5985;
        // accomodations # in 22 places, 6 items. (0.2727 vs 0.2727)
        accnum[22][6]=74613;
        single[22][6]=20349;
        // accomodations # in 22 places, 7 items. (0.3182 vs 0.3182)
        accnum[22][7]=170544;
        single[22][7]=54264;
        // accomodations # in 22 places, 8 items. (0.3636 vs 0.3636)
        accnum[22][8]=319770;
        single[22][8]=116280;
        // accomodations # in 22 places, 9 items. (0.4091 vs 0.4091)
        accnum[22][9]=497420;
        single[22][9]=203490;
        // accomodations # in 22 places, 10 items. (0.4545 vs 0.4545)
        accnum[22][10]=646646;
        single[22][10]=293930;
        // accomodations # in 22 places, 11 items. (0.5000 vs 0.5000)
        accnum[22][11]=705432;
        single[22][11]=352716;
        // accomodations # in 23 places, 0 items. (0.0000 vs 0.0000)
        accnum[23][0]=0;
        single[23][0]=0;
        // accomodations # in 23 places, 1 items. (0.0435 vs 0.0435)
        accnum[23][1]=23;
        single[23][1]=1;
        // accomodations # in 23 places, 2 items. (0.0870 vs 0.0870)
        accnum[23][2]=253;
        single[23][2]=22;
        // accomodations # in 23 places, 3 items. (0.1304 vs 0.1304)
        accnum[23][3]=1771;
        single[23][3]=231;
        // accomodations # in 23 places, 4 items. (0.1739 vs 0.1739)
        accnum[23][4]=8855;
        single[23][4]=1540;
        // accomodations # in 23 places, 5 items. (0.2174 vs 0.2174)
        accnum[23][5]=33649;
        single[23][5]=7315;
        // accomodations # in 23 places, 6 items. (0.2609 vs 0.2609)
        accnum[23][6]=100947;
        single[23][6]=26334;
        // accomodations # in 23 places, 7 items. (0.3043 vs 0.3043)
        accnum[23][7]=245157;
        single[23][7]=74613;
        // accomodations # in 23 places, 8 items. (0.3478 vs 0.3478)
        accnum[23][8]=490314;
        single[23][8]=170544;
        // accomodations # in 23 places, 9 items. (0.3913 vs 0.3913)
        accnum[23][9]=817190;
        single[23][9]=319770;
        // accomodations # in 23 places, 10 items. (0.4348 vs 0.4348)
        accnum[23][10]=1144066;
        single[23][10]=497420;
        // accomodations # in 23 places, 11 items. (0.4783 vs 0.4783)
        accnum[23][11]=1352078;
        single[23][11]=646646;
        // accomodations # in 24 places, 0 items. (0.0000 vs 0.0000)
        accnum[24][0]=0;
        single[24][0]=0;
        // accomodations # in 24 places, 1 items. (0.0417 vs 0.0417)
        accnum[24][1]=24;
        single[24][1]=1;
        // accomodations # in 24 places, 2 items. (0.0833 vs 0.0833)
        accnum[24][2]=276;
        single[24][2]=23;
        // accomodations # in 24 places, 3 items. (0.1250 vs 0.1250)
        accnum[24][3]=2024;
        single[24][3]=253;
        // accomodations # in 24 places, 4 items. (0.1667 vs 0.1667)
        accnum[24][4]=10626;
        single[24][4]=1771;
        // accomodations # in 24 places, 5 items. (0.2083 vs 0.2083)
        accnum[24][5]=42504;
        single[24][5]=8855;
        // accomodations # in 24 places, 6 items. (0.2500 vs 0.2500)
        accnum[24][6]=134596;
        single[24][6]=33649;
        // accomodations # in 24 places, 7 items. (0.2917 vs 0.2917)
        accnum[24][7]=346104;
        single[24][7]=100947;
        // accomodations # in 24 places, 8 items. (0.3333 vs 0.3333)
        accnum[24][8]=735471;
        single[24][8]=245157;
        // accomodations # in 24 places, 9 items. (0.3750 vs 0.3750)
        accnum[24][9]=1307504;
        single[24][9]=490314;
        // accomodations # in 24 places, 10 items. (0.4167 vs 0.4167)
        accnum[24][10]=1961256;
        single[24][10]=817190;
        // accomodations # in 24 places, 11 items. (0.4583 vs 0.4583)
        accnum[24][11]=2496144;
        single[24][11]=1144066;
        // accomodations # in 25 places, 0 items. (0.0000 vs 0.0000)
        accnum[25][0]=0;
        single[25][0]=0;
        // accomodations # in 25 places, 1 items. (0.0400 vs 0.0400)
        accnum[25][1]=25;
        single[25][1]=1;
        // accomodations # in 25 places, 2 items. (0.0800 vs 0.0800)
        accnum[25][2]=300;
        single[25][2]=24;
        // accomodations # in 25 places, 3 items. (0.1200 vs 0.1200)
        accnum[25][3]=2300;
        single[25][3]=276;
        // accomodations # in 25 places, 4 items. (0.1600 vs 0.1600)
        accnum[25][4]=12650;
        single[25][4]=2024;
        // accomodations # in 25 places, 5 items. (0.2000 vs 0.2000)
        accnum[25][5]=53130;
        single[25][5]=10626;
        // accomodations # in 25 places, 6 items. (0.2400 vs 0.2400)
        accnum[25][6]=177100;
        single[25][6]=42504;
        // accomodations # in 25 places, 7 items. (0.2800 vs 0.2800)
        accnum[25][7]=480700;
        single[25][7]=134596;
        // accomodations # in 25 places, 8 items. (0.3200 vs 0.3200)
        accnum[25][8]=1081575;
        single[25][8]=346104;
        // accomodations # in 25 places, 9 items. (0.3600 vs 0.3600)
        accnum[25][9]=2042975;
        single[25][9]=735471;
        // accomodations # in 25 places, 10 items. (0.4000 vs 0.4000)
        accnum[25][10]=3268760;
        single[25][10]=1307504;
        // accomodations # in 25 places, 11 items. (0.4400 vs 0.4400)
        accnum[25][11]=4457400;
        single[25][11]=1961256;
        // accomodations # in 26 places, 0 items. (0.0000 vs 0.0000)
        accnum[26][0]=0;
        single[26][0]=0;
        // accomodations # in 26 places, 1 items. (0.0385 vs 0.0385)
        accnum[26][1]=26;
        single[26][1]=1;
        // accomodations # in 26 places, 2 items. (0.0769 vs 0.0769)
        accnum[26][2]=325;
        single[26][2]=25;
        // accomodations # in 26 places, 3 items. (0.1154 vs 0.1154)
        accnum[26][3]=2600;
        single[26][3]=300;
        // accomodations # in 26 places, 4 items. (0.1538 vs 0.1538)
        accnum[26][4]=14950;
        single[26][4]=2300;
        // accomodations # in 26 places, 5 items. (0.1923 vs 0.1923)
        accnum[26][5]=65780;
        single[26][5]=12650;
        // accomodations # in 26 places, 6 items. (0.2308 vs 0.2308)
        accnum[26][6]=230230;
        single[26][6]=53130;
        // accomodations # in 26 places, 7 items. (0.2692 vs 0.2692)
        accnum[26][7]=657800;
        single[26][7]=177100;
        // accomodations # in 26 places, 8 items. (0.3077 vs 0.3077)
        accnum[26][8]=1562275;
        single[26][8]=480700;
        // accomodations # in 26 places, 9 items. (0.3462 vs 0.3462)
        accnum[26][9]=3124550;
        single[26][9]=1081575;
        // accomodations # in 26 places, 10 items. (0.3846 vs 0.3846)
        accnum[26][10]=5311735;
        single[26][10]=2042975;
        // accomodations # in 26 places, 11 items. (0.4231 vs 0.4231)
        accnum[26][11]=7726160;
        single[26][11]=3268760;
        // accomodations # in 27 places, 0 items. (0.0000 vs 0.0000)
        accnum[27][0]=0;
        single[27][0]=0;
        // accomodations # in 27 places, 1 items. (0.0370 vs 0.0370)
        accnum[27][1]=27;
        single[27][1]=1;
        // accomodations # in 27 places, 2 items. (0.0741 vs 0.0741)
        accnum[27][2]=351;
        single[27][2]=26;
        // accomodations # in 27 places, 3 items. (0.1111 vs 0.1111)
        accnum[27][3]=2925;
        single[27][3]=325;
        // accomodations # in 27 places, 4 items. (0.1481 vs 0.1481)
        accnum[27][4]=17550;
        single[27][4]=2600;
        // accomodations # in 27 places, 5 items. (0.1852 vs 0.1852)
        accnum[27][5]=80730;
        single[27][5]=14950;
        // accomodations # in 27 places, 6 items. (0.2222 vs 0.2222)
        accnum[27][6]=296010;
        single[27][6]=65780;
        // accomodations # in 27 places, 7 items. (0.2593 vs 0.2593)
        accnum[27][7]=888030;
        single[27][7]=230230;
        // accomodations # in 27 places, 8 items. (0.2963 vs 0.2963)
        accnum[27][8]=2220075;
        single[27][8]=657800;
        // accomodations # in 27 places, 9 items. (0.3333 vs 0.3333)
        accnum[27][9]=4686825;
        single[27][9]=1562275;
        // accomodations # in 27 places, 10 items. (0.3704 vs 0.3704)
        accnum[27][10]=8436285;
        single[27][10]=3124550;
        // accomodations # in 27 places, 11 items. (0.4074 vs 0.4074)
        accnum[27][11]=13037895;
        single[27][11]=5311735;
        // accomodations # in 28 places, 0 items. (0.0000 vs 0.0000)
        accnum[28][0]=0;
        single[28][0]=0;
        // accomodations # in 28 places, 1 items. (0.0357 vs 0.0357)
        accnum[28][1]=28;
        single[28][1]=1;
        // accomodations # in 28 places, 2 items. (0.0714 vs 0.0714)
        accnum[28][2]=378;
        single[28][2]=27;
        // accomodations # in 28 places, 3 items. (0.1071 vs 0.1071)
        accnum[28][3]=3276;
        single[28][3]=351;
        // accomodations # in 28 places, 4 items. (0.1429 vs 0.1429)
        accnum[28][4]=20475;
        single[28][4]=2925;
        // accomodations # in 28 places, 5 items. (0.1786 vs 0.1786)
        accnum[28][5]=98280;
        single[28][5]=17550;
        // accomodations # in 28 places, 6 items. (0.2143 vs 0.2143)
        accnum[28][6]=376740;
        single[28][6]=80730;
        // accomodations # in 28 places, 7 items. (0.2500 vs 0.2500)
        accnum[28][7]=1184040;
        single[28][7]=296010;
        // accomodations # in 28 places, 8 items. (0.2857 vs 0.2857)
        accnum[28][8]=3108105;
        single[28][8]=888030;
        // accomodations # in 28 places, 9 items. (0.3214 vs 0.3214)
        accnum[28][9]=6906900;
        single[28][9]=2220075;
        // accomodations # in 28 places, 10 items. (0.3571 vs 0.3571)
        accnum[28][10]=13123110;
        single[28][10]=4686825;
        // accomodations # in 28 places, 11 items. (0.3929 vs 0.3929)
        accnum[28][11]=21474180;
        single[28][11]=8436285;
        // accomodations # in 29 places, 0 items. (0.0000 vs 0.0000)
        accnum[29][0]=0;
        single[29][0]=0;
        // accomodations # in 29 places, 1 items. (0.0345 vs 0.0345)
        accnum[29][1]=29;
        single[29][1]=1;
        // accomodations # in 29 places, 2 items. (0.0690 vs 0.0690)
        accnum[29][2]=406;
        single[29][2]=28;
        // accomodations # in 29 places, 3 items. (0.1034 vs 0.1034)
        accnum[29][3]=3654;
        single[29][3]=378;
        // accomodations # in 29 places, 4 items. (0.1379 vs 0.1379)
        accnum[29][4]=23751;
        single[29][4]=3276;
        // accomodations # in 29 places, 5 items. (0.1724 vs 0.1724)
        accnum[29][5]=118755;
        single[29][5]=20475;
        // accomodations # in 29 places, 6 items. (0.2069 vs 0.2069)
        accnum[29][6]=475020;
        single[29][6]=98280;
        // accomodations # in 29 places, 7 items. (0.2414 vs 0.2414)
        accnum[29][7]=1560780;
        single[29][7]=376740;
        // accomodations # in 29 places, 8 items. (0.2759 vs 0.2759)
        accnum[29][8]=4292145;
        single[29][8]=1184040;
        // accomodations # in 29 places, 9 items. (0.3103 vs 0.3103)
        accnum[29][9]=10015005;
        single[29][9]=3108105;
        // accomodations # in 29 places, 10 items. (0.3448 vs 0.3448)
        accnum[29][10]=20030010;
        single[29][10]=6906900;
        // accomodations # in 29 places, 11 items. (0.3793 vs 0.3793)
        accnum[29][11]=34597290;
        single[29][11]=13123110;
        // accomodations # in 30 places, 0 items. (0.0000 vs 0.0000)
        accnum[30][0]=0;
        single[30][0]=0;
        // accomodations # in 30 places, 1 items. (0.0333 vs 0.0333)
        accnum[30][1]=30;
        single[30][1]=1;
        // accomodations # in 30 places, 2 items. (0.0667 vs 0.0667)
        accnum[30][2]=435;
        single[30][2]=29;
        // accomodations # in 30 places, 3 items. (0.1000 vs 0.1000)
        accnum[30][3]=4060;
        single[30][3]=406;
        // accomodations # in 30 places, 4 items. (0.1333 vs 0.1333)
        accnum[30][4]=27405;
        single[30][4]=3654;
        // accomodations # in 30 places, 5 items. (0.1667 vs 0.1667)
        accnum[30][5]=142506;
        single[30][5]=23751;
        // accomodations # in 30 places, 6 items. (0.2000 vs 0.2000)
        accnum[30][6]=593775;
        single[30][6]=118755;
        // accomodations # in 30 places, 7 items. (0.2333 vs 0.2333)
        accnum[30][7]=2035800;
        single[30][7]=475020;
        // accomodations # in 30 places, 8 items. (0.2667 vs 0.2667)
        accnum[30][8]=5852925;
        single[30][8]=1560780;
        // accomodations # in 30 places, 9 items. (0.3000 vs 0.3000)
        accnum[30][9]=14307150;
        single[30][9]=4292145;
        // accomodations # in 30 places, 10 items. (0.3333 vs 0.3333)
        accnum[30][10]=30045015;
        single[30][10]=10015005;
        // accomodations # in 30 places, 11 items. (0.3667 vs 0.3667)
        accnum[30][11]=54627300;
        single[30][11]=20030010;
        // accomodations # in 31 places, 0 items. (0.0000 vs 0.0000)
        accnum[31][0]=0;
        single[31][0]=0;
        // accomodations # in 31 places, 1 items. (0.0323 vs 0.0323)
        accnum[31][1]=31;
        single[31][1]=1;
        // accomodations # in 31 places, 2 items. (0.0645 vs 0.0645)
        accnum[31][2]=465;
        single[31][2]=30;
        // accomodations # in 31 places, 3 items. (0.0968 vs 0.0968)
        accnum[31][3]=4495;
        single[31][3]=435;
        // accomodations # in 31 places, 4 items. (0.1290 vs 0.1290)
        accnum[31][4]=31465;
        single[31][4]=4060;
        // accomodations # in 31 places, 5 items. (0.1613 vs 0.1613)
        accnum[31][5]=169911;
        single[31][5]=27405;
        // accomodations # in 31 places, 6 items. (0.1935 vs 0.1935)
        accnum[31][6]=736281;
        single[31][6]=142506;
        // accomodations # in 31 places, 7 items. (0.2258 vs 0.2258)
        accnum[31][7]=2629575;
        single[31][7]=593775;
        // accomodations # in 31 places, 8 items. (0.2581 vs 0.2581)
        accnum[31][8]=7888725;
        single[31][8]=2035800;
        // accomodations # in 31 places, 9 items. (0.2903 vs 0.2903)
        accnum[31][9]=20160075;
        single[31][9]=5852925;
        // accomodations # in 31 places, 10 items. (0.3226 vs 0.3226)
        accnum[31][10]=44352165;
        single[31][10]=14307150;
        // accomodations # in 31 places, 11 items. (0.3548 vs 0.3548)
        accnum[31][11]=84672315;
        single[31][11]=30045015;
        // accomodations # in 32 places, 0 items. (0.0000 vs 0.0000)
        accnum[32][0]=0;
        single[32][0]=0;
        // accomodations # in 32 places, 1 items. (0.0313 vs 0.0313)
        accnum[32][1]=32;
        single[32][1]=1;
        // accomodations # in 32 places, 2 items. (0.0625 vs 0.0625)
        accnum[32][2]=496;
        single[32][2]=31;
        // accomodations # in 32 places, 3 items. (0.0938 vs 0.0938)
        accnum[32][3]=4960;
        single[32][3]=465;
        // accomodations # in 32 places, 4 items. (0.1250 vs 0.1250)
        accnum[32][4]=35960;
        single[32][4]=4495;
        // accomodations # in 32 places, 5 items. (0.1563 vs 0.1563)
        accnum[32][5]=201376;
        single[32][5]=31465;
        // accomodations # in 32 places, 6 items. (0.1875 vs 0.1875)
        accnum[32][6]=906192;
        single[32][6]=169911;
        // accomodations # in 32 places, 7 items. (0.2188 vs 0.2188)
        accnum[32][7]=3365856;
        single[32][7]=736281;
        // accomodations # in 32 places, 8 items. (0.2500 vs 0.2500)
        accnum[32][8]=10518300;
        single[32][8]=2629575;
        // accomodations # in 32 places, 9 items. (0.2813 vs 0.2813)
        accnum[32][9]=28048800;
        single[32][9]=7888725;
        // accomodations # in 32 places, 10 items. (0.3125 vs 0.3125)
        accnum[32][10]=64512240;
        single[32][10]=20160075;
        // accomodations # in 32 places, 11 items. (0.3438 vs 0.3438)
        accnum[32][11]=129024480;
        single[32][11]=44352165;
        // accomodations # in 33 places, 0 items. (0.0000 vs 0.0000)
        accnum[33][0]=0;
        single[33][0]=0;
        // accomodations # in 33 places, 1 items. (0.0303 vs 0.0303)
        accnum[33][1]=33;
        single[33][1]=1;
        // accomodations # in 33 places, 2 items. (0.0606 vs 0.0606)
        accnum[33][2]=528;
        single[33][2]=32;
        // accomodations # in 33 places, 3 items. (0.0909 vs 0.0909)
        accnum[33][3]=5456;
        single[33][3]=496;
        // accomodations # in 33 places, 4 items. (0.1212 vs 0.1212)
        accnum[33][4]=40920;
        single[33][4]=4960;
        // accomodations # in 33 places, 5 items. (0.1515 vs 0.1515)
        accnum[33][5]=237336;
        single[33][5]=35960;
        // accomodations # in 33 places, 6 items. (0.1818 vs 0.1818)
        accnum[33][6]=1107568;
        single[33][6]=201376;
        // accomodations # in 33 places, 7 items. (0.2121 vs 0.2121)
        accnum[33][7]=4272048;
        single[33][7]=906192;
        // accomodations # in 33 places, 8 items. (0.2424 vs 0.2424)
        accnum[33][8]=13884156;
        single[33][8]=3365856;
        // accomodations # in 33 places, 9 items. (0.2727 vs 0.2727)
        accnum[33][9]=38567100;
        single[33][9]=10518300;
        // accomodations # in 33 places, 10 items. (0.3030 vs 0.3030)
        accnum[33][10]=92561040;
        single[33][10]=28048800;
        // accomodations # in 33 places, 11 items. (0.3333 vs 0.3333)
        accnum[33][11]=193536720;
        single[33][11]=64512240;
        // accomodations # in 34 places, 0 items. (0.0000 vs 0.0000)
        accnum[34][0]=0;
        single[34][0]=0;
        // accomodations # in 34 places, 1 items. (0.0294 vs 0.0294)
        accnum[34][1]=34;
        single[34][1]=1;
        // accomodations # in 34 places, 2 items. (0.0588 vs 0.0588)
        accnum[34][2]=561;
        single[34][2]=33;
        // accomodations # in 34 places, 3 items. (0.0882 vs 0.0882)
        accnum[34][3]=5984;
        single[34][3]=528;
        // accomodations # in 34 places, 4 items. (0.1176 vs 0.1176)
        accnum[34][4]=46376;
        single[34][4]=5456;
        // accomodations # in 34 places, 5 items. (0.1471 vs 0.1471)
        accnum[34][5]=278256;
        single[34][5]=40920;
        // accomodations # in 34 places, 6 items. (0.1765 vs 0.1765)
        accnum[34][6]=1344904;
        single[34][6]=237336;
        // accomodations # in 34 places, 7 items. (0.2059 vs 0.2059)
        accnum[34][7]=5379616;
        single[34][7]=1107568;
        // accomodations # in 34 places, 8 items. (0.2353 vs 0.2353)
        accnum[34][8]=18156204;
        single[34][8]=4272048;
        // accomodations # in 34 places, 9 items. (0.2647 vs 0.2647)
        accnum[34][9]=52451256;
        single[34][9]=13884156;
        // accomodations # in 34 places, 10 items. (0.2941 vs 0.2941)
        accnum[34][10]=131128140;
        single[34][10]=38567100;
        // accomodations # in 34 places, 11 items. (0.3235 vs 0.3235)
        accnum[34][11]=286097760;
        single[34][11]=92561040;
        // accomodations # in 35 places, 0 items. (0.0000 vs 0.0000)
        accnum[35][0]=0;
        single[35][0]=0;
        // accomodations # in 35 places, 1 items. (0.0286 vs 0.0286)
        accnum[35][1]=35;
        single[35][1]=1;
        // accomodations # in 35 places, 2 items. (0.0571 vs 0.0571)
        accnum[35][2]=595;
        single[35][2]=34;
        // accomodations # in 35 places, 3 items. (0.0857 vs 0.0857)
        accnum[35][3]=6545;
        single[35][3]=561;
        // accomodations # in 35 places, 4 items. (0.1143 vs 0.1143)
        accnum[35][4]=52360;
        single[35][4]=5984;
        // accomodations # in 35 places, 5 items. (0.1429 vs 0.1429)
        accnum[35][5]=324632;
        single[35][5]=46376;
        // accomodations # in 35 places, 6 items. (0.1714 vs 0.1714)
        accnum[35][6]=1623160;
        single[35][6]=278256;
        // accomodations # in 35 places, 7 items. (0.2000 vs 0.2000)
        accnum[35][7]=6724520;
        single[35][7]=1344904;
        // accomodations # in 35 places, 8 items. (0.2286 vs 0.2286)
        accnum[35][8]=23535820;
        single[35][8]=5379616;
        // accomodations # in 35 places, 9 items. (0.2571 vs 0.2571)
        accnum[35][9]=70607460;
        single[35][9]=18156204;
        // accomodations # in 35 places, 10 items. (0.2857 vs 0.2857)
        accnum[35][10]=183579396;
        single[35][10]=52451256;
        // accomodations # in 35 places, 11 items. (0.3143 vs 0.3143)
        accnum[35][11]=417225900;
        single[35][11]=131128140;
        // accomodations # in 36 places, 0 items. (0.0000 vs 0.0000)
        accnum[36][0]=0;
        single[36][0]=0;
        // accomodations # in 36 places, 1 items. (0.0278 vs 0.0278)
        accnum[36][1]=36;
        single[36][1]=1;
        // accomodations # in 36 places, 2 items. (0.0556 vs 0.0556)
        accnum[36][2]=630;
        single[36][2]=35;
        // accomodations # in 36 places, 3 items. (0.0833 vs 0.0833)
        accnum[36][3]=7140;
        single[36][3]=595;
        // accomodations # in 36 places, 4 items. (0.1111 vs 0.1111)
        accnum[36][4]=58905;
        single[36][4]=6545;
        // accomodations # in 36 places, 5 items. (0.1389 vs 0.1389)
        accnum[36][5]=376992;
        single[36][5]=52360;
        // accomodations # in 36 places, 6 items. (0.1667 vs 0.1667)
        accnum[36][6]=1947792;
        single[36][6]=324632;
        // accomodations # in 36 places, 7 items. (0.1944 vs 0.1944)
        accnum[36][7]=8347680;
        single[36][7]=1623160;
        // accomodations # in 36 places, 8 items. (0.2222 vs 0.2222)
        accnum[36][8]=30260340;
        single[36][8]=6724520;
        // accomodations # in 36 places, 9 items. (0.2500 vs 0.2500)
        accnum[36][9]=94143280;
        single[36][9]=23535820;
        // accomodations # in 36 places, 10 items. (0.2778 vs 0.2778)
        accnum[36][10]=254186856;
        single[36][10]=70607460;
        // accomodations # in 36 places, 11 items. (0.3056 vs 0.3056)
        accnum[36][11]=600805296;
        single[36][11]=183579396;
        // accomodations # in 37 places, 0 items. (0.0000 vs 0.0000)
        accnum[37][0]=0;
        single[37][0]=0;
        // accomodations # in 37 places, 1 items. (0.0270 vs 0.0270)
        accnum[37][1]=37;
        single[37][1]=1;
        // accomodations # in 37 places, 2 items. (0.0541 vs 0.0541)
        accnum[37][2]=666;
        single[37][2]=36;
        // accomodations # in 37 places, 3 items. (0.0811 vs 0.0811)
        accnum[37][3]=7770;
        single[37][3]=630;
        // accomodations # in 37 places, 4 items. (0.1081 vs 0.1081)
        accnum[37][4]=66045;
        single[37][4]=7140;
        // accomodations # in 37 places, 5 items. (0.1351 vs 0.1351)
        accnum[37][5]=435897;
        single[37][5]=58905;
        // accomodations # in 37 places, 6 items. (0.1622 vs 0.1622)
        accnum[37][6]=2324784;
        single[37][6]=376992;
        // accomodations # in 37 places, 7 items. (0.1892 vs 0.1892)
        accnum[37][7]=10295472;
        single[37][7]=1947792;
        // accomodations # in 37 places, 8 items. (0.2162 vs 0.2162)
        accnum[37][8]=38608020;
        single[37][8]=8347680;
        // accomodations # in 37 places, 9 items. (0.2432 vs 0.2432)
        accnum[37][9]=124403620;
        single[37][9]=30260340;
        // accomodations # in 37 places, 10 items. (0.2703 vs 0.2703)
        accnum[37][10]=348330136;
        single[37][10]=94143280;
        // accomodations # in 37 places, 11 items. (0.2973 vs 0.2973)
        accnum[37][11]=854992152;
        single[37][11]=254186856;
        // accomodations # in 38 places, 0 items. (0.0000 vs 0.0000)
        accnum[38][0]=0;
        single[38][0]=0;
        // accomodations # in 38 places, 1 items. (0.0263 vs 0.0263)
        accnum[38][1]=38;
        single[38][1]=1;
        // accomodations # in 38 places, 2 items. (0.0526 vs 0.0526)
        accnum[38][2]=703;
        single[38][2]=37;
        // accomodations # in 38 places, 3 items. (0.0789 vs 0.0789)
        accnum[38][3]=8436;
        single[38][3]=666;
        // accomodations # in 38 places, 4 items. (0.1053 vs 0.1053)
        accnum[38][4]=73815;
        single[38][4]=7770;
        // accomodations # in 38 places, 5 items. (0.1316 vs 0.1316)
        accnum[38][5]=501942;
        single[38][5]=66045;
        // accomodations # in 38 places, 6 items. (0.1579 vs 0.1579)
        accnum[38][6]=2760681;
        single[38][6]=435897;
        // accomodations # in 38 places, 7 items. (0.1842 vs 0.1842)
        accnum[38][7]=12620256;
        single[38][7]=2324784;
        // accomodations # in 38 places, 8 items. (0.2105 vs 0.2105)
        accnum[38][8]=48903492;
        single[38][8]=10295472;
        // accomodations # in 38 places, 9 items. (0.2368 vs 0.2368)
        accnum[38][9]=163011640;
        single[38][9]=38608020;
        // accomodations # in 38 places, 10 items. (0.2632 vs 0.2632)
        accnum[38][10]=472733756;
        single[38][10]=124403620;
        // accomodations # in 38 places, 11 items. (0.2895 vs 0.2895)
        accnum[38][11]=1203322288;
        single[38][11]=348330136;
        // accomodations # in 39 places, 0 items. (0.0000 vs 0.0000)
        accnum[39][0]=0;
        single[39][0]=0;
        // accomodations # in 39 places, 1 items. (0.0256 vs 0.0256)
        accnum[39][1]=39;
        single[39][1]=1;
        // accomodations # in 39 places, 2 items. (0.0513 vs 0.0513)
        accnum[39][2]=741;
        single[39][2]=38;
        // accomodations # in 39 places, 3 items. (0.0769 vs 0.0769)
        accnum[39][3]=9139;
        single[39][3]=703;
        // accomodations # in 39 places, 4 items. (0.1026 vs 0.1026)
        accnum[39][4]=82251;
        single[39][4]=8436;
        // accomodations # in 39 places, 5 items. (0.1282 vs 0.1282)
        accnum[39][5]=575757;
        single[39][5]=73815;
        // accomodations # in 39 places, 6 items. (0.1538 vs 0.1538)
        accnum[39][6]=3262623;
        single[39][6]=501942;
        // accomodations # in 39 places, 7 items. (0.1795 vs 0.1795)
        accnum[39][7]=15380937;
        single[39][7]=2760681;
        // accomodations # in 39 places, 8 items. (0.2051 vs 0.2051)
        accnum[39][8]=61523748;
        single[39][8]=12620256;
        // accomodations # in 39 places, 9 items. (0.2308 vs 0.2308)
        accnum[39][9]=211915132;
        single[39][9]=48903492;
        // accomodations # in 39 places, 10 items. (0.2564 vs 0.2564)
        accnum[39][10]=635745396;
        single[39][10]=163011640;
        // accomodations # in 39 places, 11 items. (0.2821 vs 0.2821)
        accnum[39][11]=1676056044;
        single[39][11]=472733756;
        // accomodations # in 40 places, 0 items. (0.0000 vs 0.0000)
        accnum[40][0]=0;
        single[40][0]=0;
        // accomodations # in 40 places, 1 items. (0.0250 vs 0.0250)
        accnum[40][1]=40;
        single[40][1]=1;
        // accomodations # in 40 places, 2 items. (0.0500 vs 0.0500)
        accnum[40][2]=780;
        single[40][2]=39;
        // accomodations # in 40 places, 3 items. (0.0750 vs 0.0750)
        accnum[40][3]=9880;
        single[40][3]=741;
        // accomodations # in 40 places, 4 items. (0.1000 vs 0.1000)
        accnum[40][4]=91390;
        single[40][4]=9139;
        // accomodations # in 40 places, 5 items. (0.1250 vs 0.1250)
        accnum[40][5]=658008;
        single[40][5]=82251;
        // accomodations # in 40 places, 6 items. (0.1500 vs 0.1500)
        accnum[40][6]=3838380;
        single[40][6]=575757;
        // accomodations # in 40 places, 7 items. (0.1750 vs 0.1750)
        accnum[40][7]=18643560;
        single[40][7]=3262623;
        // accomodations # in 40 places, 8 items. (0.2000 vs 0.2000)
        accnum[40][8]=76904685;
        single[40][8]=15380937;
        // accomodations # in 40 places, 9 items. (0.2250 vs 0.2250)
        accnum[40][9]=273438880;
        single[40][9]=61523748;
        // accomodations # in 40 places, 10 items. (0.2500 vs 0.2500)
        accnum[40][10]=847660528;
        single[40][10]=211915132;
        // accomodations # in 40 places, 11 items. (0.2750 vs 0.2750)
        accnum[40][11]=2311801440;
        single[40][11]=635745396;
        // accomodations # in 41 places, 0 items. (0.0000 vs 0.0000)
        accnum[41][0]=0;
        single[41][0]=0;
        // accomodations # in 41 places, 1 items. (0.0244 vs 0.0244)
        accnum[41][1]=41;
        single[41][1]=1;
        // accomodations # in 41 places, 2 items. (0.0488 vs 0.0488)
        accnum[41][2]=820;
        single[41][2]=40;
        // accomodations # in 41 places, 3 items. (0.0732 vs 0.0732)
        accnum[41][3]=10660;
        single[41][3]=780;
        // accomodations # in 41 places, 4 items. (0.0976 vs 0.0976)
        accnum[41][4]=101270;
        single[41][4]=9880;
        // accomodations # in 41 places, 5 items. (0.1220 vs 0.1220)
        accnum[41][5]=749398;
        single[41][5]=91390;
        // accomodations # in 41 places, 6 items. (0.1463 vs 0.1463)
        accnum[41][6]=4496388;
        single[41][6]=658008;
        // accomodations # in 41 places, 7 items. (0.1707 vs 0.1707)
        accnum[41][7]=22481940;
        single[41][7]=3838380;
        // accomodations # in 41 places, 8 items. (0.1951 vs 0.1951)
        accnum[41][8]=95548245;
        single[41][8]=18643560;
        // accomodations # in 41 places, 9 items. (0.2195 vs 0.2195)
        accnum[41][9]=350343565;
        single[41][9]=76904685;
        // accomodations # in 41 places, 10 items. (0.2439 vs 0.2439)
        accnum[41][10]=1121099408;
        single[41][10]=273438880;
        // accomodations # in 41 places, 11 items. (0.2683 vs 0.2683)
        accnum[41][11]=3159461968;
        single[41][11]=847660528;
        // accomodations # in 42 places, 0 items. (0.0000 vs 0.0000)
        accnum[42][0]=0;
        single[42][0]=0;
        // accomodations # in 42 places, 1 items. (0.0238 vs 0.0238)
        accnum[42][1]=42;
        single[42][1]=1;
        // accomodations # in 42 places, 2 items. (0.0476 vs 0.0476)
        accnum[42][2]=861;
        single[42][2]=41;
        // accomodations # in 42 places, 3 items. (0.0714 vs 0.0714)
        accnum[42][3]=11480;
        single[42][3]=820;
        // accomodations # in 42 places, 4 items. (0.0952 vs 0.0952)
        accnum[42][4]=111930;
        single[42][4]=10660;
        // accomodations # in 42 places, 5 items. (0.1190 vs 0.1190)
        accnum[42][5]=850668;
        single[42][5]=101270;
        // accomodations # in 42 places, 6 items. (0.1429 vs 0.1429)
        accnum[42][6]=5245786;
        single[42][6]=749398;
        // accomodations # in 42 places, 7 items. (0.1667 vs 0.1667)
        accnum[42][7]=26978328;
        single[42][7]=4496388;
        // accomodations # in 42 places, 8 items. (0.1905 vs 0.1905)
        accnum[42][8]=118030185;
        single[42][8]=22481940;
        // accomodations # in 42 places, 9 items. (0.2143 vs 0.2143)
        accnum[42][9]=445891810;
        single[42][9]=95548245;
        // accomodations # in 42 places, 10 items. (0.2381 vs 0.2381)
        accnum[42][10]=1471442973;
        single[42][10]=350343565;
        // accomodations # in 42 places, 11 items. (0.2619 vs 0.2619)
        accnum[42][11]=4280561376;
        single[42][11]=1121099408;
        // accomodations # in 43 places, 0 items. (0.0000 vs 0.0000)
        accnum[43][0]=0;
        single[43][0]=0;
        // accomodations # in 43 places, 1 items. (0.0233 vs 0.0233)
        accnum[43][1]=43;
        single[43][1]=1;
        // accomodations # in 43 places, 2 items. (0.0465 vs 0.0465)
        accnum[43][2]=903;
        single[43][2]=42;
        // accomodations # in 43 places, 3 items. (0.0698 vs 0.0698)
        accnum[43][3]=12341;
        single[43][3]=861;
        // accomodations # in 43 places, 4 items. (0.0930 vs 0.0930)
        accnum[43][4]=123410;
        single[43][4]=11480;
        // accomodations # in 43 places, 5 items. (0.1163 vs 0.1163)
        accnum[43][5]=962598;
        single[43][5]=111930;
        // accomodations # in 43 places, 6 items. (0.1395 vs 0.1395)
        accnum[43][6]=6096454;
        single[43][6]=850668;
        // accomodations # in 43 places, 7 items. (0.1628 vs 0.1628)
        accnum[43][7]=32224114;
        single[43][7]=5245786;
        // accomodations # in 43 places, 8 items. (0.1860 vs 0.1860)
        accnum[43][8]=145008513;
        single[43][8]=26978328;
        // accomodations # in 43 places, 9 items. (0.2093 vs 0.2093)
        accnum[43][9]=563921995;
        single[43][9]=118030185;
        // accomodations # in 43 places, 10 items. (0.2326 vs 0.2326)
        accnum[43][10]=1917334783;
        single[43][10]=445891810;
        // accomodations # in 43 places, 11 items. (0.2558 vs 0.2558)
        accnum[43][11]=5752004349;
        single[43][11]=1471442973;
        // accomodations # in 44 places, 0 items. (0.0000 vs 0.0000)
        accnum[44][0]=0;
        single[44][0]=0;
        // accomodations # in 44 places, 1 items. (0.0227 vs 0.0227)
        accnum[44][1]=44;
        single[44][1]=1;
        // accomodations # in 44 places, 2 items. (0.0455 vs 0.0455)
        accnum[44][2]=946;
        single[44][2]=43;
        // accomodations # in 44 places, 3 items. (0.0682 vs 0.0682)
        accnum[44][3]=13244;
        single[44][3]=903;
        // accomodations # in 44 places, 4 items. (0.0909 vs 0.0909)
        accnum[44][4]=135751;
        single[44][4]=12341;
        // accomodations # in 44 places, 5 items. (0.1136 vs 0.1136)
        accnum[44][5]=1086008;
        single[44][5]=123410;
        // accomodations # in 44 places, 6 items. (0.1364 vs 0.1364)
        accnum[44][6]=7059052;
        single[44][6]=962598;
        // accomodations # in 44 places, 7 items. (0.1591 vs 0.1591)
        accnum[44][7]=38320568;
        single[44][7]=6096454;
        // accomodations # in 44 places, 8 items. (0.1818 vs 0.1818)
        accnum[44][8]=177232627;
        single[44][8]=32224114;
        // accomodations # in 44 places, 9 items. (0.2045 vs 0.2045)
        accnum[44][9]=708930508;
        single[44][9]=145008513;
        // accomodations # in 44 places, 10 items. (0.2273 vs 0.2273)
        accnum[44][10]=2481256778;
        single[44][10]=563921995;
        // accomodations # in 44 places, 11 items. (0.2500 vs 0.2500)
        accnum[44][11]=7669339132;
        single[44][11]=1917334783;
        // accomodations # in 45 places, 0 items. (0.0000 vs 0.0000)
        accnum[45][0]=0;
        single[45][0]=0;
        // accomodations # in 45 places, 1 items. (0.0222 vs 0.0222)
        accnum[45][1]=45;
        single[45][1]=1;
        // accomodations # in 45 places, 2 items. (0.0444 vs 0.0444)
        accnum[45][2]=990;
        single[45][2]=44;
        // accomodations # in 45 places, 3 items. (0.0667 vs 0.0667)
        accnum[45][3]=14190;
        single[45][3]=946;
        // accomodations # in 45 places, 4 items. (0.0889 vs 0.0889)
        accnum[45][4]=148995;
        single[45][4]=13244;
        // accomodations # in 45 places, 5 items. (0.1111 vs 0.1111)
        accnum[45][5]=1221759;
        single[45][5]=135751;
        // accomodations # in 45 places, 6 items. (0.1333 vs 0.1333)
        accnum[45][6]=8145060;
        single[45][6]=1086008;
        // accomodations # in 45 places, 7 items. (0.1556 vs 0.1556)
        accnum[45][7]=45379620;
        single[45][7]=7059052;
        // accomodations # in 45 places, 8 items. (0.1778 vs 0.1778)
        accnum[45][8]=215553195;
        single[45][8]=38320568;
        // accomodations # in 45 places, 9 items. (0.2000 vs 0.2000)
        accnum[45][9]=886163135;
        single[45][9]=177232627;
        // accomodations # in 45 places, 10 items. (0.2222 vs 0.2222)
        accnum[45][10]=3190187286;
        single[45][10]=708930508;
        // accomodations # in 45 places, 11 items. (0.2444 vs 0.2444)
        accnum[45][11]=10150595910;
        single[45][11]=2481256778;
        // accomodations # in 46 places, 0 items. (0.0000 vs 0.0000)
        accnum[46][0]=0;
        single[46][0]=0;
        // accomodations # in 46 places, 1 items. (0.0217 vs 0.0217)
        accnum[46][1]=46;
        single[46][1]=1;
        // accomodations # in 46 places, 2 items. (0.0435 vs 0.0435)
        accnum[46][2]=1035;
        single[46][2]=45;
        // accomodations # in 46 places, 3 items. (0.0652 vs 0.0652)
        accnum[46][3]=15180;
        single[46][3]=990;
        // accomodations # in 46 places, 4 items. (0.0870 vs 0.0870)
        accnum[46][4]=163185;
        single[46][4]=14190;
        // accomodations # in 46 places, 5 items. (0.1087 vs 0.1087)
        accnum[46][5]=1370754;
        single[46][5]=148995;
        // accomodations # in 46 places, 6 items. (0.1304 vs 0.1304)
        accnum[46][6]=9366819;
        single[46][6]=1221759;
        // accomodations # in 46 places, 7 items. (0.1522 vs 0.1522)
        accnum[46][7]=53524680;
        single[46][7]=8145060;
        // accomodations # in 46 places, 8 items. (0.1739 vs 0.1739)
        accnum[46][8]=260932815;
        single[46][8]=45379620;
        // accomodations # in 46 places, 9 items. (0.1957 vs 0.1957)
        accnum[46][9]=1101716330;
        single[46][9]=215553195;
        // accomodations # in 46 places, 10 items. (0.2174 vs 0.2174)
        accnum[46][10]=4076350421;
        single[46][10]=886163135;
        // accomodations # in 46 places, 11 items. (0.2391 vs 0.2391)
        accnum[46][11]=13340783196;
        single[46][11]=3190187286;
        // accomodations # in 47 places, 0 items. (0.0000 vs 0.0000)
        accnum[47][0]=0;
        single[47][0]=0;
        // accomodations # in 47 places, 1 items. (0.0213 vs 0.0213)
        accnum[47][1]=47;
        single[47][1]=1;
        // accomodations # in 47 places, 2 items. (0.0426 vs 0.0426)
        accnum[47][2]=1081;
        single[47][2]=46;
        // accomodations # in 47 places, 3 items. (0.0638 vs 0.0638)
        accnum[47][3]=16215;
        single[47][3]=1035;
        // accomodations # in 47 places, 4 items. (0.0851 vs 0.0851)
        accnum[47][4]=178365;
        single[47][4]=15180;
        // accomodations # in 47 places, 5 items. (0.1064 vs 0.1064)
        accnum[47][5]=1533939;
        single[47][5]=163185;
        // accomodations # in 47 places, 6 items. (0.1277 vs 0.1277)
        accnum[47][6]=10737573;
        single[47][6]=1370754;
        // accomodations # in 47 places, 7 items. (0.1489 vs 0.1489)
        accnum[47][7]=62891499;
        single[47][7]=9366819;
        // accomodations # in 47 places, 8 items. (0.1702 vs 0.1702)
        accnum[47][8]=314457495;
        single[47][8]=53524680;
        // accomodations # in 47 places, 9 items. (0.1915 vs 0.1915)
        accnum[47][9]=1362649145;
        single[47][9]=260932815;
        // accomodations # in 47 places, 10 items. (0.2128 vs 0.2128)
        accnum[47][10]=5178066751;
        single[47][10]=1101716330;
        // accomodations # in 47 places, 11 items. (0.2340 vs 0.2340)
        accnum[47][11]=17417133617;
        single[47][11]=4076350421;
        // accomodations # in 48 places, 0 items. (0.0000 vs 0.0000)
        accnum[48][0]=0;
        single[48][0]=0;
        // accomodations # in 48 places, 1 items. (0.0208 vs 0.0208)
        accnum[48][1]=48;
        single[48][1]=1;
        // accomodations # in 48 places, 2 items. (0.0417 vs 0.0417)
        accnum[48][2]=1128;
        single[48][2]=47;
        // accomodations # in 48 places, 3 items. (0.0625 vs 0.0625)
        accnum[48][3]=17296;
        single[48][3]=1081;
        // accomodations # in 48 places, 4 items. (0.0833 vs 0.0833)
        accnum[48][4]=194580;
        single[48][4]=16215;
        // accomodations # in 48 places, 5 items. (0.1042 vs 0.1042)
        accnum[48][5]=1712304;
        single[48][5]=178365;
        // accomodations # in 48 places, 6 items. (0.1250 vs 0.1250)
        accnum[48][6]=12271512;
        single[48][6]=1533939;
        // accomodations # in 48 places, 7 items. (0.1458 vs 0.1458)
        accnum[48][7]=73629072;
        single[48][7]=10737573;
        // accomodations # in 48 places, 8 items. (0.1667 vs 0.1667)
        accnum[48][8]=377348994;
        single[48][8]=62891499;
        // accomodations # in 48 places, 9 items. (0.1875 vs 0.1875)
        accnum[48][9]=1677106640;
        single[48][9]=314457495;
        // accomodations # in 48 places, 10 items. (0.2083 vs 0.2083)
        accnum[48][10]=6540715896;
        single[48][10]=1362649145;
        // accomodations # in 48 places, 11 items. (0.2292 vs 0.2292)
        accnum[48][11]=22595200368;
        single[48][11]=5178066751;
        // accomodations # in 49 places, 0 items. (0.0000 vs 0.0000)
        accnum[49][0]=0;
        single[49][0]=0;
        // accomodations # in 49 places, 1 items. (0.0204 vs 0.0204)
        accnum[49][1]=49;
        single[49][1]=1;
        // accomodations # in 49 places, 2 items. (0.0408 vs 0.0408)
        accnum[49][2]=1176;
        single[49][2]=48;
        // accomodations # in 49 places, 3 items. (0.0612 vs 0.0612)
        accnum[49][3]=18424;
        single[49][3]=1128;
        // accomodations # in 49 places, 4 items. (0.0816 vs 0.0816)
        accnum[49][4]=211876;
        single[49][4]=17296;
        // accomodations # in 49 places, 5 items. (0.1020 vs 0.1020)
        accnum[49][5]=1906884;
        single[49][5]=194580;
        // accomodations # in 49 places, 6 items. (0.1224 vs 0.1224)
        accnum[49][6]=13983816;
        single[49][6]=1712304;
        // accomodations # in 49 places, 7 items. (0.1429 vs 0.1429)
        accnum[49][7]=85900584;
        single[49][7]=12271512;
        // accomodations # in 49 places, 8 items. (0.1633 vs 0.1633)
        accnum[49][8]=450978066;
        single[49][8]=73629072;
        // accomodations # in 49 places, 9 items. (0.1837 vs 0.1837)
        accnum[49][9]=2054455634;
        single[49][9]=377348994;
        // accomodations # in 49 places, 10 items. (0.2041 vs 0.2041)
        accnum[49][10]=8217822536;
        single[49][10]=1677106640;
        // accomodations # in 49 places, 11 items. (0.2245 vs 0.2245)
        accnum[49][11]=29135916264;
        single[49][11]=6540715896;
        // accomodations # in 50 places, 0 items. (0.0000 vs 0.0000)
        accnum[50][0]=0;
        single[50][0]=0;
        // accomodations # in 50 places, 1 items. (0.0200 vs 0.0200)
        accnum[50][1]=50;
        single[50][1]=1;
        // accomodations # in 50 places, 2 items. (0.0400 vs 0.0400)
        accnum[50][2]=1225;
        single[50][2]=49;
        // accomodations # in 50 places, 3 items. (0.0600 vs 0.0600)
        accnum[50][3]=19600;
        single[50][3]=1176;
        // accomodations # in 50 places, 4 items. (0.0800 vs 0.0800)
        accnum[50][4]=230300;
        single[50][4]=18424;
        // accomodations # in 50 places, 5 items. (0.1000 vs 0.1000)
        accnum[50][5]=2118760;
        single[50][5]=211876;
        // accomodations # in 50 places, 6 items. (0.1200 vs 0.1200)
        accnum[50][6]=15890700;
        single[50][6]=1906884;
        // accomodations # in 50 places, 7 items. (0.1400 vs 0.1400)
        accnum[50][7]=99884400;
        single[50][7]=13983816;
        // accomodations # in 50 places, 8 items. (0.1600 vs 0.1600)
        accnum[50][8]=536878650;
        single[50][8]=85900584;
        // accomodations # in 50 places, 9 items. (0.1800 vs 0.1800)
        accnum[50][9]=2505433700;
        single[50][9]=450978066;
        // accomodations # in 50 places, 10 items. (0.2000 vs 0.2000)
        accnum[50][10]=10272278170;
        single[50][10]=2054455634;
        // accomodations # in 50 places, 11 items. (0.2200 vs 0.2200)
        accnum[50][11]=37353738800;
        single[50][11]=8217822536;
        // accomodations # in 51 places, 0 items. (0.0000 vs 0.0000)
        accnum[51][0]=0;
        single[51][0]=0;
        // accomodations # in 51 places, 1 items. (0.0196 vs 0.0196)
        accnum[51][1]=51;
        single[51][1]=1;
        // accomodations # in 51 places, 2 items. (0.0392 vs 0.0392)
        accnum[51][2]=1275;
        single[51][2]=50;
        // accomodations # in 51 places, 3 items. (0.0588 vs 0.0588)
        accnum[51][3]=20825;
        single[51][3]=1225;
        // accomodations # in 51 places, 4 items. (0.0784 vs 0.0784)
        accnum[51][4]=249900;
        single[51][4]=19600;
        // accomodations # in 51 places, 5 items. (0.0980 vs 0.0980)
        accnum[51][5]=2349060;
        single[51][5]=230300;
        // accomodations # in 51 places, 6 items. (0.1176 vs 0.1176)
        accnum[51][6]=18009460;
        single[51][6]=2118760;
        // accomodations # in 51 places, 7 items. (0.1373 vs 0.1373)
        accnum[51][7]=115775100;
        single[51][7]=15890700;
        // accomodations # in 51 places, 8 items. (0.1569 vs 0.1569)
        accnum[51][8]=636763050;
        single[51][8]=99884400;
        // accomodations # in 51 places, 9 items. (0.1765 vs 0.1765)
        accnum[51][9]=3042312350;
        single[51][9]=536878650;
        // accomodations # in 51 places, 10 items. (0.1961 vs 0.1961)
        accnum[51][10]=12777711870;
        single[51][10]=2505433700;
        // accomodations # in 51 places, 11 items. (0.2157 vs 0.2157)
        accnum[51][11]=47626016970;
        single[51][11]=10272278170;
        // accomodations # in 52 places, 0 items. (0.0000 vs 0.0000)
        accnum[52][0]=0;
        single[52][0]=0;
        // accomodations # in 52 places, 1 items. (0.0192 vs 0.0192)
        accnum[52][1]=52;
        single[52][1]=1;
        // accomodations # in 52 places, 2 items. (0.0385 vs 0.0385)
        accnum[52][2]=1326;
        single[52][2]=51;
        // accomodations # in 52 places, 3 items. (0.0577 vs 0.0577)
        accnum[52][3]=22100;
        single[52][3]=1275;
        // accomodations # in 52 places, 4 items. (0.0769 vs 0.0769)
        accnum[52][4]=270725;
        single[52][4]=20825;
        // accomodations # in 52 places, 5 items. (0.0962 vs 0.0962)
        accnum[52][5]=2598960;
        single[52][5]=249900;
        // accomodations # in 52 places, 6 items. (0.1154 vs 0.1154)
        accnum[52][6]=20358520;
        single[52][6]=2349060;
        // accomodations # in 52 places, 7 items. (0.1346 vs 0.1346)
        accnum[52][7]=133784560;
        single[52][7]=18009460;
        // accomodations # in 52 places, 8 items. (0.1538 vs 0.1538)
        accnum[52][8]=752538150;
        single[52][8]=115775100;
        // accomodations # in 52 places, 9 items. (0.1731 vs 0.1731)
        accnum[52][9]=3679075400;
        single[52][9]=636763050;
        // accomodations # in 52 places, 10 items. (0.1923 vs 0.1923)
        accnum[52][10]=15820024220;
        single[52][10]=3042312350;
        // accomodations # in 52 places, 11 items. (0.2115 vs 0.2115)
        accnum[52][11]=60403728840;
        single[52][11]=12777711870;
        // accomodations # in 53 places, 0 items. (0.0000 vs 0.0000)
        accnum[53][0]=0;
        single[53][0]=0;
        // accomodations # in 53 places, 1 items. (0.0189 vs 0.0189)
        accnum[53][1]=53;
        single[53][1]=1;
        // accomodations # in 53 places, 2 items. (0.0377 vs 0.0377)
        accnum[53][2]=1378;
        single[53][2]=52;
        // accomodations # in 53 places, 3 items. (0.0566 vs 0.0566)
        accnum[53][3]=23426;
        single[53][3]=1326;
        // accomodations # in 53 places, 4 items. (0.0755 vs 0.0755)
        accnum[53][4]=292825;
        single[53][4]=22100;
        // accomodations # in 53 places, 5 items. (0.0943 vs 0.0943)
        accnum[53][5]=2869685;
        single[53][5]=270725;
        // accomodations # in 53 places, 6 items. (0.1132 vs 0.1132)
        accnum[53][6]=22957480;
        single[53][6]=2598960;
        // accomodations # in 53 places, 7 items. (0.1321 vs 0.1321)
        accnum[53][7]=154143080;
        single[53][7]=20358520;
        // accomodations # in 53 places, 8 items. (0.1509 vs 0.1509)
        accnum[53][8]=886322710;
        single[53][8]=133784560;
        // accomodations # in 53 places, 9 items. (0.1698 vs 0.1698)
        accnum[53][9]=4431613550;
        single[53][9]=752538150;
        // accomodations # in 53 places, 10 items. (0.1887 vs 0.1887)
        accnum[53][10]=19499099620;
        single[53][10]=3679075400;
        // accomodations # in 53 places, 11 items. (0.2075 vs 0.2075)
        accnum[53][11]=76223753060;
        single[53][11]=15820024220;
        // accomodations # in 54 places, 0 items. (0.0000 vs 0.0000)
        accnum[54][0]=0;
        single[54][0]=0;
        // accomodations # in 54 places, 1 items. (0.0185 vs 0.0185)
        accnum[54][1]=54;
        single[54][1]=1;
        // accomodations # in 54 places, 2 items. (0.0370 vs 0.0370)
        accnum[54][2]=1431;
        single[54][2]=53;
        // accomodations # in 54 places, 3 items. (0.0556 vs 0.0556)
        accnum[54][3]=24804;
        single[54][3]=1378;
        // accomodations # in 54 places, 4 items. (0.0741 vs 0.0741)
        accnum[54][4]=316251;
        single[54][4]=23426;
        // accomodations # in 54 places, 5 items. (0.0926 vs 0.0926)
        accnum[54][5]=3162510;
        single[54][5]=292825;
        // accomodations # in 54 places, 6 items. (0.1111 vs 0.1111)
        accnum[54][6]=25827165;
        single[54][6]=2869685;
        // accomodations # in 54 places, 7 items. (0.1296 vs 0.1296)
        accnum[54][7]=177100560;
        single[54][7]=22957480;
        // accomodations # in 54 places, 8 items. (0.1481 vs 0.1481)
        accnum[54][8]=1040465790;
        single[54][8]=154143080;
        // accomodations # in 54 places, 9 items. (0.1667 vs 0.1667)
        accnum[54][9]=5317936260;
        single[54][9]=886322710;
        // accomodations # in 54 places, 10 items. (0.1852 vs 0.1852)
        accnum[54][10]=23930713170;
        single[54][10]=4431613550;
        // accomodations # in 54 places, 11 items. (0.2037 vs 0.2037)
        accnum[54][11]=95722852680;
        single[54][11]=19499099620;
        // accomodations # in 55 places, 0 items. (0.0000 vs 0.0000)
        accnum[55][0]=0;
        single[55][0]=0;
        // accomodations # in 55 places, 1 items. (0.0182 vs 0.0182)
        accnum[55][1]=55;
        single[55][1]=1;
        // accomodations # in 55 places, 2 items. (0.0364 vs 0.0364)
        accnum[55][2]=1485;
        single[55][2]=54;
        // accomodations # in 55 places, 3 items. (0.0545 vs 0.0545)
        accnum[55][3]=26235;
        single[55][3]=1431;
        // accomodations # in 55 places, 4 items. (0.0727 vs 0.0727)
        accnum[55][4]=341055;
        single[55][4]=24804;
        // accomodations # in 55 places, 5 items. (0.0909 vs 0.0909)
        accnum[55][5]=3478761;
        single[55][5]=316251;
        // accomodations # in 55 places, 6 items. (0.1091 vs 0.1091)
        accnum[55][6]=28989675;
        single[55][6]=3162510;
        // accomodations # in 55 places, 7 items. (0.1273 vs 0.1273)
        accnum[55][7]=202927725;
        single[55][7]=25827165;
        // accomodations # in 55 places, 8 items. (0.1455 vs 0.1455)
        accnum[55][8]=1217566350;
        single[55][8]=177100560;
        // accomodations # in 55 places, 9 items. (0.1636 vs 0.1636)
        accnum[55][9]=6358402050;
        single[55][9]=1040465790;
        // accomodations # in 55 places, 10 items. (0.1818 vs 0.1818)
        accnum[55][10]=29248649430;
        single[55][10]=5317936260;
        // accomodations # in 55 places, 11 items. (0.2000 vs 0.2000)
        accnum[55][11]=119653565850;
        single[55][11]=23930713170;
        // accomodations # in 56 places, 0 items. (0.0000 vs 0.0000)
        accnum[56][0]=0;
        single[56][0]=0;
        // accomodations # in 56 places, 1 items. (0.0179 vs 0.0179)
        accnum[56][1]=56;
        single[56][1]=1;
        // accomodations # in 56 places, 2 items. (0.0357 vs 0.0357)
        accnum[56][2]=1540;
        single[56][2]=55;
        // accomodations # in 56 places, 3 items. (0.0536 vs 0.0536)
        accnum[56][3]=27720;
        single[56][3]=1485;
        // accomodations # in 56 places, 4 items. (0.0714 vs 0.0714)
        accnum[56][4]=367290;
        single[56][4]=26235;
        // accomodations # in 56 places, 5 items. (0.0893 vs 0.0893)
        accnum[56][5]=3819816;
        single[56][5]=341055;
        // accomodations # in 56 places, 6 items. (0.1071 vs 0.1071)
        accnum[56][6]=32468436;
        single[56][6]=3478761;
        // accomodations # in 56 places, 7 items. (0.1250 vs 0.1250)
        accnum[56][7]=231917400;
        single[56][7]=28989675;
        // accomodations # in 56 places, 8 items. (0.1429 vs 0.1429)
        accnum[56][8]=1420494075;
        single[56][8]=202927725;
        // accomodations # in 56 places, 9 items. (0.1607 vs 0.1607)
        accnum[56][9]=7575968400;
        single[56][9]=1217566350;
        // accomodations # in 56 places, 10 items. (0.1786 vs 0.1786)
        accnum[56][10]=35607051480;
        single[56][10]=6358402050;
        // accomodations # in 56 places, 11 items. (0.1964 vs 0.1964)
        accnum[56][11]=148902215280;
        single[56][11]=29248649430;
        // accomodations # in 57 places, 0 items. (0.0000 vs 0.0000)
        accnum[57][0]=0;
        single[57][0]=0;
        // accomodations # in 57 places, 1 items. (0.0175 vs 0.0175)
        accnum[57][1]=57;
        single[57][1]=1;
        // accomodations # in 57 places, 2 items. (0.0351 vs 0.0351)
        accnum[57][2]=1596;
        single[57][2]=56;
        // accomodations # in 57 places, 3 items. (0.0526 vs 0.0526)
        accnum[57][3]=29260;
        single[57][3]=1540;
        // accomodations # in 57 places, 4 items. (0.0702 vs 0.0702)
        accnum[57][4]=395010;
        single[57][4]=27720;
        // accomodations # in 57 places, 5 items. (0.0877 vs 0.0877)
        accnum[57][5]=4187106;
        single[57][5]=367290;
        // accomodations # in 57 places, 6 items. (0.1053 vs 0.1053)
        accnum[57][6]=36288252;
        single[57][6]=3819816;
        // accomodations # in 57 places, 7 items. (0.1228 vs 0.1228)
        accnum[57][7]=264385836;
        single[57][7]=32468436;
        // accomodations # in 57 places, 8 items. (0.1404 vs 0.1404)
        accnum[57][8]=1652411475;
        single[57][8]=231917400;
        // accomodations # in 57 places, 9 items. (0.1579 vs 0.1579)
        accnum[57][9]=8996462475;
        single[57][9]=1420494075;
        // accomodations # in 57 places, 10 items. (0.1754 vs 0.1754)
        accnum[57][10]=43183019880;
        single[57][10]=7575968400;
        // accomodations # in 57 places, 11 items. (0.1930 vs 0.1930)
        accnum[57][11]=184509266760;
        single[57][11]=35607051480;
        // accomodations # in 58 places, 0 items. (0.0000 vs 0.0000)
        accnum[58][0]=0;
        single[58][0]=0;
        // accomodations # in 58 places, 1 items. (0.0172 vs 0.0172)
        accnum[58][1]=58;
        single[58][1]=1;
        // accomodations # in 58 places, 2 items. (0.0345 vs 0.0345)
        accnum[58][2]=1653;
        single[58][2]=57;
        // accomodations # in 58 places, 3 items. (0.0517 vs 0.0517)
        accnum[58][3]=30856;
        single[58][3]=1596;
        // accomodations # in 58 places, 4 items. (0.0690 vs 0.0690)
        accnum[58][4]=424270;
        single[58][4]=29260;
        // accomodations # in 58 places, 5 items. (0.0862 vs 0.0862)
        accnum[58][5]=4582116;
        single[58][5]=395010;
        // accomodations # in 58 places, 6 items. (0.1034 vs 0.1034)
        accnum[58][6]=40475358;
        single[58][6]=4187106;
        // accomodations # in 58 places, 7 items. (0.1207 vs 0.1207)
        accnum[58][7]=300674088;
        single[58][7]=36288252;
        // accomodations # in 58 places, 8 items. (0.1379 vs 0.1379)
        accnum[58][8]=1916797311;
        single[58][8]=264385836;
        // accomodations # in 58 places, 9 items. (0.1552 vs 0.1552)
        accnum[58][9]=10648873950;
        single[58][9]=1652411475;
        // accomodations # in 58 places, 10 items. (0.1724 vs 0.1724)
        accnum[58][10]=52179482355;
        single[58][10]=8996462475;
        // accomodations # in 58 places, 11 items. (0.1897 vs 0.1897)
        accnum[58][11]=227692286640;
        single[58][11]=43183019880;
        // accomodations # in 59 places, 0 items. (0.0000 vs 0.0000)
        accnum[59][0]=0;
        single[59][0]=0;
        // accomodations # in 59 places, 1 items. (0.0169 vs 0.0169)
        accnum[59][1]=59;
        single[59][1]=1;
        // accomodations # in 59 places, 2 items. (0.0339 vs 0.0339)
        accnum[59][2]=1711;
        single[59][2]=58;
        // accomodations # in 59 places, 3 items. (0.0508 vs 0.0508)
        accnum[59][3]=32509;
        single[59][3]=1653;
        // accomodations # in 59 places, 4 items. (0.0678 vs 0.0678)
        accnum[59][4]=455126;
        single[59][4]=30856;
        // accomodations # in 59 places, 5 items. (0.0847 vs 0.0847)
        accnum[59][5]=5006386;
        single[59][5]=424270;
        // accomodations # in 59 places, 6 items. (0.1017 vs 0.1017)
        accnum[59][6]=45057474;
        single[59][6]=4582116;
        // accomodations # in 59 places, 7 items. (0.1186 vs 0.1186)
        accnum[59][7]=341149446;
        single[59][7]=40475358;
        // accomodations # in 59 places, 8 items. (0.1356 vs 0.1356)
        accnum[59][8]=2217471399;
        single[59][8]=300674088;
        // accomodations # in 59 places, 9 items. (0.1525 vs 0.1525)
        accnum[59][9]=12565671261;
        single[59][9]=1916797311;
        // accomodations # in 59 places, 10 items. (0.1695 vs 0.1695)
        accnum[59][10]=62828356305;
        single[59][10]=10648873950;
        // accomodations # in 59 places, 11 items. (0.1864 vs 0.1864)
        accnum[59][11]=279871768995;
        single[59][11]=52179482355;
        // accomodations # in 60 places, 0 items. (0.0000 vs 0.0000)
        accnum[60][0]=0;
        single[60][0]=0;
        // accomodations # in 60 places, 1 items. (0.0167 vs 0.0167)
        accnum[60][1]=60;
        single[60][1]=1;
        // accomodations # in 60 places, 2 items. (0.0333 vs 0.0333)
        accnum[60][2]=1770;
        single[60][2]=59;
        // accomodations # in 60 places, 3 items. (0.0500 vs 0.0500)
        accnum[60][3]=34220;
        single[60][3]=1711;
        // accomodations # in 60 places, 4 items. (0.0667 vs 0.0667)
        accnum[60][4]=487635;
        single[60][4]=32509;
        // accomodations # in 60 places, 5 items. (0.0833 vs 0.0833)
        accnum[60][5]=5461512;
        single[60][5]=455126;
        // accomodations # in 60 places, 6 items. (0.1000 vs 0.1000)
        accnum[60][6]=50063860;
        single[60][6]=5006386;
        // accomodations # in 60 places, 7 items. (0.1167 vs 0.1167)
        accnum[60][7]=386206920;
        single[60][7]=45057474;
        // accomodations # in 60 places, 8 items. (0.1333 vs 0.1333)
        accnum[60][8]=2558620845;
        single[60][8]=341149446;
        // accomodations # in 60 places, 9 items. (0.1500 vs 0.1500)
        accnum[60][9]=14783142660;
        single[60][9]=2217471399;
        // accomodations # in 60 places, 10 items. (0.1667 vs 0.1667)
        accnum[60][10]=75394027566;
        single[60][10]=12565671261;
        // accomodations # in 60 places, 11 items. (0.1833 vs 0.1833)
        accnum[60][11]=342700125300;
        single[60][11]=62828356305;
        // accomodations # in 61 places, 0 items. (0.0000 vs 0.0000)
        accnum[61][0]=0;
        single[61][0]=0;
        // accomodations # in 61 places, 1 items. (0.0164 vs 0.0164)
        accnum[61][1]=61;
        single[61][1]=1;
        // accomodations # in 61 places, 2 items. (0.0328 vs 0.0328)
        accnum[61][2]=1830;
        single[61][2]=60;
        // accomodations # in 61 places, 3 items. (0.0492 vs 0.0492)
        accnum[61][3]=35990;
        single[61][3]=1770;
        // accomodations # in 61 places, 4 items. (0.0656 vs 0.0656)
        accnum[61][4]=521855;
        single[61][4]=34220;
        // accomodations # in 61 places, 5 items. (0.0820 vs 0.0820)
        accnum[61][5]=5949147;
        single[61][5]=487635;
        // accomodations # in 61 places, 6 items. (0.0984 vs 0.0984)
        accnum[61][6]=55525372;
        single[61][6]=5461512;
        // accomodations # in 61 places, 7 items. (0.1148 vs 0.1148)
        accnum[61][7]=436270780;
        single[61][7]=50063860;
        // accomodations # in 61 places, 8 items. (0.1311 vs 0.1311)
        accnum[61][8]=2944827765;
        single[61][8]=386206920;
        // accomodations # in 61 places, 9 items. (0.1475 vs 0.1475)
        accnum[61][9]=17341763505;
        single[61][9]=2558620845;
        // accomodations # in 61 places, 10 items. (0.1639 vs 0.1639)
        accnum[61][10]=90177170226;
        single[61][10]=14783142660;
        // accomodations # in 61 places, 11 items. (0.1803 vs 0.1803)
        accnum[61][11]=418094152866;
        single[61][11]=75394027566;
        // accomodations # in 62 places, 0 items. (0.0000 vs 0.0000)
        accnum[62][0]=0;
        single[62][0]=0;
        // accomodations # in 62 places, 1 items. (0.0161 vs 0.0161)
        accnum[62][1]=62;
        single[62][1]=1;
        // accomodations # in 62 places, 2 items. (0.0323 vs 0.0323)
        accnum[62][2]=1891;
        single[62][2]=61;
        // accomodations # in 62 places, 3 items. (0.0484 vs 0.0484)
        accnum[62][3]=37820;
        single[62][3]=1830;
        // accomodations # in 62 places, 4 items. (0.0645 vs 0.0645)
        accnum[62][4]=557845;
        single[62][4]=35990;
        // accomodations # in 62 places, 5 items. (0.0806 vs 0.0806)
        accnum[62][5]=6471002;
        single[62][5]=521855;
        // accomodations # in 62 places, 6 items. (0.0968 vs 0.0968)
        accnum[62][6]=61474519;
        single[62][6]=5949147;
        // accomodations # in 62 places, 7 items. (0.1129 vs 0.1129)
        accnum[62][7]=491796152;
        single[62][7]=55525372;
        // accomodations # in 62 places, 8 items. (0.1290 vs 0.1290)
        accnum[62][8]=3381098545;
        single[62][8]=436270780;
        // accomodations # in 62 places, 9 items. (0.1452 vs 0.1452)
        accnum[62][9]=20286591270;
        single[62][9]=2944827765;
        // accomodations # in 62 places, 10 items. (0.1613 vs 0.1613)
        accnum[62][10]=107518933731;
        single[62][10]=17341763505;
        // accomodations # in 62 places, 11 items. (0.1774 vs 0.1774)
        accnum[62][11]=508271323092;
        single[62][11]=90177170226;
        // accomodations # in 63 places, 0 items. (0.0000 vs 0.0000)
        accnum[63][0]=0;
        single[63][0]=0;
        // accomodations # in 63 places, 1 items. (0.0159 vs 0.0159)
        accnum[63][1]=63;
        single[63][1]=1;
        // accomodations # in 63 places, 2 items. (0.0317 vs 0.0317)
        accnum[63][2]=1953;
        single[63][2]=62;
        // accomodations # in 63 places, 3 items. (0.0476 vs 0.0476)
        accnum[63][3]=39711;
        single[63][3]=1891;
        // accomodations # in 63 places, 4 items. (0.0635 vs 0.0635)
        accnum[63][4]=595665;
        single[63][4]=37820;
        // accomodations # in 63 places, 5 items. (0.0794 vs 0.0794)
        accnum[63][5]=7028847;
        single[63][5]=557845;
        // accomodations # in 63 places, 6 items. (0.0952 vs 0.0952)
        accnum[63][6]=67945521;
        single[63][6]=6471002;
        // accomodations # in 63 places, 7 items. (0.1111 vs 0.1111)
        accnum[63][7]=553270671;
        single[63][7]=61474519;
        // accomodations # in 63 places, 8 items. (0.1270 vs 0.1270)
        accnum[63][8]=3872894697;
        single[63][8]=491796152;
        // accomodations # in 63 places, 9 items. (0.1429 vs 0.1429)
        accnum[63][9]=23667689815;
        single[63][9]=3381098545;
        // accomodations # in 63 places, 10 items. (0.1587 vs 0.1587)
        accnum[63][10]=127805525001;
        single[63][10]=20286591270;
        // accomodations # in 63 places, 11 items. (0.1746 vs 0.1746)
        accnum[63][11]=615790256823;
        single[63][11]=107518933731;
        // accomodations # in 64 places, 0 items. (0.0000 vs 0.0000)
        accnum[64][0]=0;
        single[64][0]=0;
        // accomodations # in 64 places, 1 items. (0.0156 vs 0.0156)
        accnum[64][1]=64;
        single[64][1]=1;
        // accomodations # in 64 places, 2 items. (0.0313 vs 0.0313)
        accnum[64][2]=2016;
        single[64][2]=63;
        // accomodations # in 64 places, 3 items. (0.0469 vs 0.0469)
        accnum[64][3]=41664;
        single[64][3]=1953;
        // accomodations # in 64 places, 4 items. (0.0625 vs 0.0625)
        accnum[64][4]=635376;
        single[64][4]=39711;
        // accomodations # in 64 places, 5 items. (0.0781 vs 0.0781)
        accnum[64][5]=7624512;
        single[64][5]=595665;
        // accomodations # in 64 places, 6 items. (0.0938 vs 0.0938)
        accnum[64][6]=74974368;
        single[64][6]=7028847;
        // accomodations # in 64 places, 7 items. (0.1094 vs 0.1094)
        accnum[64][7]=621216192;
        single[64][7]=67945521;
        // accomodations # in 64 places, 8 items. (0.1250 vs 0.1250)
        accnum[64][8]=4426165368;
        single[64][8]=553270671;
        // accomodations # in 64 places, 9 items. (0.1406 vs 0.1406)
        accnum[64][9]=27540584512;
        single[64][9]=3872894697;
        // accomodations # in 64 places, 10 items. (0.1563 vs 0.1563)
        accnum[64][10]=151473214816;
        single[64][10]=23667689815;
