package com.muwawy.interview.math;

import java.util.Arrays;

public class MatrixDotProduct {

    public static void main(String[] args) {
        int[][] a = new int[][] { new int[] {1, 3}, new int[] {2, 4} };
        int[][] b = new int[][] { new int[] {-1, 1}, new int[] {0, 2} };

        int[][] c = dotProduct(a, b);

        System.out.printf("'%s' X '%s' --> %s%n",
                Arrays.deepToString(a), Arrays.deepToString(b), Arrays.deepToString(c));
    }

    public static int[][] dotProduct(int[][] a, int[][] b) {
        int x = a.length;
        int y = a[0].length;
        int z = b.length;

        int[][] c = new int[x][z];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = 0;
                for (int k = 0; k < z; k++) {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }

        return c;
    }
}
