package com.press;

import org.junit.Assert;
import org.junit.Test;

public class From0to2Test {

    private From0to2 f = new From0to2();

    @Test
    public void from0to2() {
        int[] arr = {0, 2, 1, 2, 0, 0, 1, 2, 2, 2, 0};

        int[] result = {0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 2};
        int[] actual = f.from0to2(arr);
        Assert.assertArrayEquals(result, actual);

    }

    @Test(expected = NullPointerException.class)
    public void isValidTest() {f.from0to2(null);}
}
