package com.lingdd.leetcode.easy;

import com.lingdd.leetcode.domain.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TwoSum4 {

    // 思路一：二叉查找树是一颗有序树，节点左边值 < 中间的节点 < 节点右边值
    // 可以考虑把二叉查找树序列化成一个有序数组，然后使用twoSum中hashtable的解法
    public boolean findTarget(TreeNode root, int k) {

        List<Integer> integers = new ArrayList<>();

        toArray(root, integers);

        return twoSum(integers, k);

    }

    // 使用Hash表存储
    public boolean twoSum(List<Integer> nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {

            Integer complement = target - nums.get(i);

            if (hashMap.containsKey(complement)) {

                return true;

            } else {

                hashMap.put(nums.get(i), i);

            }

        }

        return false;

    }

    public void toArray(TreeNode root, List<Integer> treeList) {

        if (null != root) {

            treeList.add(root.val);

            if (null != root.left) {

                toArray(root.left, treeList);

            }

            if (null != root.right) {
                toArray(root.right, treeList);
            }

        }

    }

    public static void main(String[] args) {

        TreeNode rootNode = new TreeNode(5);
        TreeNode leftNode = new TreeNode(3);
        TreeNode rightNode = new TreeNode(6);
        TreeNode leftNode1 = new TreeNode(2);
        TreeNode rightNode1= new TreeNode(4);
        TreeNode rightNode2 = new TreeNode(7);

        rootNode.left = leftNode;
        rootNode.right = rightNode;

        leftNode.left = leftNode1;
        leftNode.right = rightNode1;

        rightNode.right = rightNode2;

        TwoSum4 twoSum4 = new TwoSum4();

        System.out.println(twoSum4.findTarget(rootNode, 0));

    }

}
