package com.press;

class SpiralArray {

    int[][] spiralArray(int n) {

        if (n == 0)  return null;

        int[][] arr = new int[n][n];
        int countElements = 0;
        for (int i = 1; i <= n / 2; i++) {
            for (int Rx = i - 1; Rx < n - i; Rx++) {//1
                countElements++;
                arr[i - 1][Rx] = countElements;
            }
            for (int Dy = i - 1; Dy < n  -i; Dy++) {//2
                countElements++;
                arr[Dy][n - i ] = countElements;
            }
            for (int Lx = n - i + 1; Lx > i; Lx--) {//3
                countElements++;
                arr[n - i ][Lx-1] = countElements;
            }
            for (int Uy = n - i + 1; Uy > i; Uy--) {//4
                countElements++;
                arr[Uy-1][i - 1] = countElements;
           }
           if (n % 2 != 0) arr[n / 2][n / 2] = (int) (Math.pow(n, 2));
        }
/*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
*/
        return arr;
    }
}



