package com.company;

/**
 * Created by em343 on 12/21/16.
 */
public class MatrixMult {
    public static int [][] mult(int[][] a, int [][]b){
        int arows = a.length;
        int acols = a[0].length;
        int brows = b.length;
        int bcols = b[0].length;
        int[][] c = new int[arows][bcols];
        for (int h = 0; h< arows; h++){
            for (int i = 0; i< bcols; i++){
                for (int j = 0; j < acols; j++){
                    c[h][i] = c[h][i] + (a[h][j] * b[j][i]);
                }
            }
        }
        return c;
    }
}
