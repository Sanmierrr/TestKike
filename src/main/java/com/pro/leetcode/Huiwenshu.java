package com.pro.leetcode;

import java.time.chrono.IsoChronology;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Huiwenshu {

    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        int result = 0;
        int y = x;
        while (y != 0) {
            int tem = result;
            result = (result * 10) + (y % 10);
            y = y / 10;
        }
        if (result == x) {
            System.out.println(result);
            return true;
        }
        return false;
    }
}
