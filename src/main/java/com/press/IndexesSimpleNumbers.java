package com.press;

//  55. Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?
//  Если да, то вывести номера этих элементов.

public class IndexesSimpleNumbers {
    public int[] indexesSimpleNumbers(int arr[]) {
        if (arr == null) throw new NullPointerException();
        int max = 0;
        int finishLength = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) { //максимальный элемент массива
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {//ищем длинну ответного массива
            if (arr[i] < 2) { // простые числа не меньше 2
            } else {
                for (int j = 1; j <= max; j++) {
                    if ((arr[i] % j) == 0) count++;//count = сколько раз число делилось на j
                }
                if (count == 2) {  // у простых всегда 2
                    finishLength++;
                }
                count = 0;
            }
        }
        int[] answer = new int[finishLength];
        finishLength = 0;
        for (int i = 0; i < arr.length; i++) {// заполняем ответный массив
            if (arr[i] < 2) {
            } else {
                for (int j = 1; j <= max; j++) {
                    if ((arr[i] % j) == 0) count++;
                }
                if (count == 2) {
                    answer[finishLength] = arr[i];
                    finishLength++;
                }
                count = 0;
            }
        }
        return answer;
    }
}

