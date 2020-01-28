package com.press;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Assert;
import org.junit.Test;

public class IndexesSimpleNumbersTest {

    private IndexesSimpleNumbers i = new IndexesSimpleNumbers();

    @Test
    public void indexesSimpleNumbersTest() {
        int[] arr = {3, 4, 5};
        int[] result = {3, 5};
        int[] actual = i.indexesSimpleNumbers(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void simpleNumbersWithZeroTest() {
        int[] arr = {0, 4, 5};
        int[] result = {5};
        int[] actual = i.indexesSimpleNumbers(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void simpleNumbersWithNegativeTest() {
        int[] arr = {-1, 4, 7, -18, 11};
        int[] result = {7, 11};
        int[] actual = i.indexesSimpleNumbers(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test(expected = NullPointerException.class)
    public void isValidTest() {
        i.indexesSimpleNumbers(null);
    }
}