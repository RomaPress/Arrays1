package com.press;

//61. В массиве А каждый элемент равен 0, 1, 2. Переставить элементы массива так, чтобы
//    сначала располагались все нули, затем все единицы, и, наконец все двойки

import java.util.Arrays;

public class From0to2 {
    public int[] from0to2(int[] arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            if (arr[i] == 1) count1++;
            if (arr[i] == 2) count2++;
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0+count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0+count1; i < count0+count1+count2; i++) {
            arr[i] = 2;
        }
        return arr;
 /*
        Arrays.sort(arr);
        return arr;
 */
    }
}


