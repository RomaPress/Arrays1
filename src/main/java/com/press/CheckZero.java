package com.press;

//62. Дан массив А. Найти длину самой длинной последовательности
//подряд идущих элементов массива, равных нулю.

public class CheckZero {
    public int checkZero(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count++;
            if (max < count) max = count;
            if (arr[i] != 0) count = 0;
        }
        return max;
    }
}