package com.press;

//  56. Дан одномерный массив чисел. Найти количество различных чисел этого массива

public class DifferentNumbers {

    public int differentNumbers(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int count = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                count--;
            }

        }
        System.out.print("Count = " + count);
        return count;
    }
}
