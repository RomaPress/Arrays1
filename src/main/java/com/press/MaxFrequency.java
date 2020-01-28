package com.press;

//33. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//    Если  таких чисел несколько, то определить наименьшее из них.

public class MaxFrequency {
    public int[] maxFrequency(int[] arr) {
        if (arr == null) throw new NullPointerException();
        int count = 0;
        int value = 0;
        int tmpCount = 0;
        int tmpValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tmpCount > count) {
                count = tmpCount;
                value = tmpValue;
            }
            if (tmpCount == count) {
                if (value > tmpValue) value = tmpValue;
            }
            tmpCount = 0;
            for (int j = 0; j < arr.length; j++) {
                tmpValue = arr[i];
                if (arr[j] == tmpValue) tmpCount++;
            }
        }
        return new int[]{value, count};
    }
}
