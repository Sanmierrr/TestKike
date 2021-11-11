package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Zuidazixuhe {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    /**
     * 设置一个int值  每次记录最大值   如果为正数则加  负数则进行赋值
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            res = Math.max(res, sum);
        }
        System.out.println(res);
        return res;
    }

}
