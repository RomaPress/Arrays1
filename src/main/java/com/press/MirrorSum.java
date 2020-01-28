package com.press;

public class MirrorSum {
    public int[] AnswerArr(int[] arr) {

        if (arr == null) throw new NullPointerException();
        int thousands = 0;
        int hundreds = 0;
        int tens = 0;
        int units = 0;
        int i = -1;
        int countAnswer = 0;
        for (int z = 0; z < arr.length; z++) {
            thousands = arr[z] / 1000;
            hundreds = arr[z] / 100 - thousands * 10;
            tens = arr[z] / 10 - (thousands * 100 + hundreds * 10);
            units = arr[z] - (thousands * 1000 + hundreds * 100 + tens * 10);
            if (thousands + hundreds == tens + units) {
                countAnswer++;
            }
        }
        int[] answer = new int[countAnswer];
        for (int z = 0; z < arr.length; z++) {
            thousands = arr[z] / 1000;
            hundreds = arr[z] / 100 - thousands * 10;
            tens = arr[z] / 10 - (thousands * 100 + hundreds * 10);
            units = arr[z] - (thousands * 1000 + hundreds * 100 + tens * 10);
            if (thousands + hundreds == tens + units) {
                i++;
                answer[i] = arr[z];
            }
        }
        return answer;
    }
}