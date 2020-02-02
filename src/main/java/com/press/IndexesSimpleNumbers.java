package com.press;

//  55. Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?
//  Если да, то вывести номера этих элементов.

class IndexesSimpleNumbers {
    int[] indexesSimpleNumbers(int[] arr) {
        if (arr == null) throw new NullPointerException();
        int max = 0;
        int finishLength = 0;
        int count = 0;
        for (int value : arr) {
            max = Math.max(value, max);
            //максимальный элемент массива
            // if (value > max) max = value;
        }
        int[] answer = new int[arr.length];
        for (int value : arr) {//ищем длину ответного массива
            if (value >= 2) {
                for (int j = 1; j <= max; j++) {
                    if ((value % j) == 0) count++;//count = сколько раз число делилось на j
                }
                if (count == 2) {  // у простых всегда 2
                    answer[finishLength++] = value;
                }
                count = 0;// простые числа не меньше 2
            }
        }
        int[] result = new int[finishLength];
        System.arraycopy(answer, 0, result, 0, finishLength);
        return result;
    }
}

