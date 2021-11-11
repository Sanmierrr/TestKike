package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Sousuocharuweizhi {
    public static void main(String[] args) {
        int[] nums = {-1,3,5,6};
        int target = -5;
        searchInsert(nums,target);
    }

    public static int searchInsert(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (target <= num){
                System.out.println(count);
                break;
            }
            count ++;
        }
        return nums.length;
    }
}
