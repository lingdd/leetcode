package com.lingdd.leetcode.easy;

import org.junit.Assert;

public class TwoSumTest {

    @org.junit.Test
    public void twoSum1() {

        TwoSum twoSum = new TwoSum();

        int[] testcase1 = new int[]{2, 7, 11, 15};

        int[] result = twoSum.twoSum1(testcase1, 9);

        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);

        result = twoSum.twoSum2(testcase1, 9);

        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);

    }

    @org.junit.Test
    public void twoSum2() {

        TwoSum twoSum = new TwoSum();

        int[] testcase2 = new int[]{3, 1, 5};

        int[] result = twoSum.twoSum1(testcase2, 6);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);

        result = twoSum.twoSum2(testcase2, 6);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);

    }
}