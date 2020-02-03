package com.press;

class GrowingDiagonals {
    int[][] growingDiagonals(int n) {
        if (n < 1) throw new IllegalArgumentException();
        int[][] arr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count++;
                arr[i][j] = count;
            }
            count = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}
