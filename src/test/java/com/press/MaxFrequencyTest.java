package com.press;

import org.junit.Assert;
import org.junit.Test;

public class MaxFrequencyTest {

    private MaxFrequency myTest = new MaxFrequency();

    @Test
    public void maxFrequencyTest() {
        int[] arr = {1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = {1, 4};
        int[] actual = myTest.maxFrequency(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void doubleMaxFrequencyTest() {
        int[] arr = {1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9};
        int[] result = {1, 4};
        int[] actual = myTest.maxFrequency(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void sameNumbersTest() {
        int[] arr = {3, 3, 3, 3, 3, 3, 3, 3};
        int[] result = {3, 8};
        int[] actual = myTest.maxFrequency(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test(expected = NullPointerException.class)
    public void isValidTest(){ myTest.maxFrequency(null);}

}
