package com.pro.leetcode;

import java.util.HashMap;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 * 一、两数之和
 */
public class Liangshuzhihe {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(ints);
    }

    public static int[] twoSum(int[] nums, int target){
        int[] indexs = new int[2];
         //建立 k-v ， --对应的哈希表
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key 为补数， value 为下标
            hash.put(target-nums[i],i);
        }
        System.out.println(indexs);
        return indexs;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hash1 = new HashMap<>();
        //双重循环  循环极限为（n^2-n）/2
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j < 1; j++) {
                if (nums[i] + nums[j] == target) {
                    indexs[0] = i;
                    indexs[1] = j;
                    System.out.println(indexs);
                    return indexs;
                }
            }
        }
        System.out.println(indexs);
        return indexs;
    }
}
