package com.lingdd.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum2Test {

    @Test
    public void twoSum() {

        TwoSum2 twoSum2 = new TwoSum2();

        int[] testcase1 = new int[]{2,7,11,15};

        int[] result = twoSum2.twoSum(testcase1, 22);

        Assert.assertEquals(2, result[0]);
        Assert.assertEquals(4, result[1]);

    }
}