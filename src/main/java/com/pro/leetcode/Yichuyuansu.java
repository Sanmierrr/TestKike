package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Yichuyuansu {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int i = removeElement(nums, val);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val){
                nums[index++] = num;
            }
        }
        return index;
    }
}
