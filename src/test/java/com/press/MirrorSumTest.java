package com.press;

import org.junit.Assert;
import org.junit.Test;

public class MirrorSumTest {

    private MirrorSum m = new MirrorSum();

    @Test
    public void mirrorSumTest() {
        int[] arr = {1234, 3232, 5454, 7654};

        int[] result = {3232, 5454};
        int[] actual = m.AnswerArr(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void sameNumbersTest() {
        int[] arr = {1111, 1234, 5555, 9999};

        int[] result = {1111, 5555, 9999};
        int[] actual = m.AnswerArr(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void notMerrorSumTest() {
        int[] arr = {1234, 5678, 9854, 3215};

        int[] result = new int[0];
        int[] actual = m.AnswerArr(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test(expected = NullPointerException.class)
    public void isValidTest() {
        m.AnswerArr(null);
    }
}
