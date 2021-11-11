package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Zuichangzichuan {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        //记录字符上一次出现的位置
        int[] last = new int[128];
        int n = s.length();

        int res = 0;
        //窗口开始位置
        int start = 0;
        for(int i = 0;i < n; i++){
            int index = s.charAt(i);
            start = Math.max(start, last[index]);
            res = Math.max(res, i - start + 1);
            last[index] = i + 1;
        }
        return res;
    }
}
