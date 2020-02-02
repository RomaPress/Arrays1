package com.press;

//  56. Дан одномерный массив чисел. Найти количество различных чисел этого массива

import java.util.Arrays;

class DifferentNumbers {
    int differentNumbers(int[] arr) {
        Arrays.sort(arr);
        int count = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                count--;
            }
        }
        return count;
    }
}
