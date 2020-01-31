package com.press;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class SpiralArrayTest {

    private SpiralArray s = new SpiralArray();

    @Test
    public void oddSpiralArrayTest(){
        int n = 5;
        int[][] result = {{ 1, 2, 3, 4, 5},
                          {16,17,18,19, 6},
                          {15,24,25,20, 7},
                          {14,23,22,21, 8},
                          {13,12,11,10, 9}};
        int[][] actual = s.spiralArray(n);
        Assert.assertArrayEquals(result,actual);
    }

    @Test
    public void evenSpiralArrayTest(){
        int n = 6;
        int[][] result = {{ 1, 2, 3, 4,5,6},
                {20,21,22,23,24,7},
                {19,32,33,34,25,8},
                {18,31,36,35,26,9},
                {17,30,29,28,27,10},
                {16,15,14,13,12,11}};
        int[][] actual = s.spiralArray(n);
        Assert.assertArrayEquals(result,actual);
    }

//    @Test(expected = InvalidArgumentException .class)
//    public void isValidTest(){s.spiralArray(0);}
}
