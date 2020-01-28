package com.press;


import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class DifferentNumbersTest {

    private DifferentNumbers d = new DifferentNumbers();

    @Test
    public void differentNumbersTest(){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int result = 10;
        int actual = d.differentNumbers(arr);
        Assert.assertEquals(result, actual);
    }

    @Test
    public void sameNumbersTest(){
        int[] arr = {1,1,1,1,1,1,1,1,1};
        int result = 1;
        int actual = d.differentNumbers(arr);
        Assert.assertEquals(result, actual);
    }

    @Test
    public void withNegativeNumbersTest(){
        int[] arr = {-1,-3,-23,0,543,-14, -3};
        int result = 6;
        int actual = d.differentNumbers(arr);
        Assert.assertEquals(result, actual);
    }

    @Test(expected = NullPointerException.class)
    public void isValidTest(){d.differentNumbers(null);}
}
