package com.press;

class MirrorSum {
    int[] AnswerArr(int[] arr) {

        if (arr == null) throw new NullPointerException();
        int finishLength = 0;
        int thousands;
        int hundreds;
        int tens;
        int units;
        int n = -1;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            thousands = arr[i] / 1000;
            hundreds = arr[i] / 100 - thousands * 10;
            tens = arr[i] / 10 - (thousands * 100 + hundreds * 10);
            units = arr[i] - (thousands * 1000 + hundreds * 100 + tens * 10);
            if (thousands + hundreds == tens + units) {
                finishLength++;
                n++;
                newArr[n] = arr[i];
            }
        }
        int[] finalArr = new int[finishLength];
        System.arraycopy(newArr, 0, finalArr, 0, finishLength);

        return finalArr;
    }
}