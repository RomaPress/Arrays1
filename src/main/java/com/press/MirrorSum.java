package com.press;

public class MirrorSum {
    public int[] AnswerArr(int[] arr) {

        if (arr == null) throw new NullPointerException();
        int thousands;
        int hundreds;
        int tens;
        int units;
        int i = -1;
        int countAnswer = 0;
        for (int value : arr) {
            thousands = value / 1000;
            hundreds = value / 100 - thousands * 10;
            tens = value / 10 - (thousands * 100 + hundreds * 10);
            units = value - (thousands * 1000 + hundreds * 100 + tens * 10);
            if (thousands + hundreds == tens + units) {
                countAnswer++;
            }
        }
        int[] answer = new int[countAnswer];
        for (int value : arr) {
            thousands = value / 1000;
            hundreds = value / 100 - thousands * 10;
            tens = value / 10 - (thousands * 100 + hundreds * 10);
            units = value - (thousands * 1000 + hundreds * 100 + tens * 10);
            if (thousands + hundreds == tens + units) {
                i++;
                answer[i] = value;
            }
        }
        return answer;
    }
}