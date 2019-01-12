package com.lingdd.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    // twosum的代码也能AC，还有种解决方法是根据数组有序的特点，拿两个指针来操作
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            if (hashMap.containsKey(complement)) {

                return new int[]{hashMap.get(complement) + 1, i + 1};

            } else {

                hashMap.put(numbers[i], i);

            }

        }

        throw new IllegalArgumentException();

    }

}
