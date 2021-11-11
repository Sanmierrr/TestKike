package com.pro.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Shanchuyouxushuzudechonggfuxiang {
    public static void main(String[] args) {
        int[] ints = new int[]{1,1,2};
        removeDuplicates(ints);
    }

    public static int removeDuplicates(int[] nums) {
        IntStream distinct = Arrays.stream(nums).distinct();
        int[] ints = distinct.toArray();
        System.out.println(ints);
        int length = ints.length;
        return length;
    }
}
