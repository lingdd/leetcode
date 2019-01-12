package com.lingdd.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // 简单暴力的双重for循环
    public int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};

                }

            }

        }

        throw new IllegalArgumentException();
    }

    // 使用Hash表存储
    public int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer complement = target - nums[i];

            if (hashMap.containsKey(complement)) {

                return new int[]{hashMap.get(complement), i};

            } else {

                hashMap.put(nums[i], i);

            }

        }

        throw new IllegalArgumentException();

    }

}
