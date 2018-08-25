package com.lxiao.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * leetCode 题目 1.
 * 输入一个数组，和 一个目标数字
 * 搜索出数组中 两个数 相加之和等于目标数字，返回这两个数字在数组中的索引数组。
 */
public class twoNum {
    // 最简单暴露破解法
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i< nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (nums[i] + nums [j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
    // 2-pass hash-table 破解法
    public int[] twoSum2(int[] nums, int target) {
        // 个人感觉，这种方式虽然看起来时间复杂度是O(n),但是 map.containsKey 也是通过循环查找的，没有变化
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i< nums.length; i++) {
            int y = target - nums[i];
            if (map.containsKey(y) && map.get(y) != i) {
                return new int[]{i, map.get(y)};
            }
        }

        throw new IllegalArgumentException();
    }

    // 1-pass hash-table
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new WeakHashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if (map.containsKey(y) && map.get(y) != i) {
                return new int[]{i, map.get(y)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static void main(String [] args) {
        int nums[] = new int[]{1, 3, 4, 6};
        int target = 9;
        twoNum twoNum = new twoNum();
//        int[] result = twoNum.twoSum(nums, target);
        int[] result = twoNum.twoSum2(nums, target);
        for (int i = 0; i< result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
