package com.pro.leetcode;

import java.nio.charset.StandardCharsets;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Jiayi {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        String s = "";
        for (int digit : digits) {
            s += String.valueOf(digit);
        }
        //124
        s = String.valueOf(Integer.valueOf(s) + 1);
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        int[] ii = new int[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            ii[i] = bytes[i];
        }
        return ii;
    }
}
