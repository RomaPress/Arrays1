package com.press;

import org.junit.Assert;
import org.junit.Test;

public class GrowingDiagonalsTest {
    private GrowingDiagonals g = new GrowingDiagonals();

    @Test
    public void growingdDagonalsTest(){
        int[][] result = {{1,2,3,4,5},
                          {0,1,2,3,4},
                          {0,0,1,2,3},
                          {0,0,0,1,2},
                          {0,0,0,0,1}};
        int[][] actual = g.growingDiagonals(5);
        Assert.assertArrayEquals(result, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void isValid(){g.growingDiagonals(-3);}


}
