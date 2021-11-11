package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Zuihouyigedancidechangdu {
    public static void main(String[] args) {
        String s = "Hello World";
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {
        if (s.contains(" ")) {
            String substring = s.trim().substring(s.lastIndexOf(" "), s.length() - 1);
            return substring.length();
        } else {
            return s.length();
        }
    }
}
