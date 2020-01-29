package com.press;

import org.junit.Assert;
import org.junit.Test;

public class CheckZeroTest {

    private CheckZero c = new CheckZero();

    @Test
    public void checkZeroTest(){
        int[] arr = {1,0,9,8,0,0,4,3,2,0,0,0,0,0,5};
        int result = 5;
        int actual = c.checkZero(arr);
        Assert.assertEquals(result,actual);
    }

    @Test
    public void allZeroTest(){
        int[] arr = {0,0,0,0,0,0,0};
        int result = 7;
        int actual = c.checkZero(arr);
        Assert.assertEquals(result,actual);
    }

    @Test
    public void nonZeroTest(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int result = 0;
        int actual = c.checkZero(arr);
        Assert.assertEquals(result,actual);
    }

    @Test(expected = NullPointerException.class)
    public void isValid(){c.checkZero(null);}
}
