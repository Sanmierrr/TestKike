package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Shanchuyouxushuzuzhongdechongfuxiang {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }


    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
//        if (length == 0){
//            return 0;
//        }
//        int fast = 1, slow = 1;
//        while (fast < length){
//            if (nums[fast] != nums[fast -1]){
//                nums[slow] = nums[fast];
//                ++slow;
//            }
//            ++fast;
//        }
        int t = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0 ||nums[i] != nums[i - 1]){
                nums[t++] = nums[i];
            }
        }
        return t;
    }
}
