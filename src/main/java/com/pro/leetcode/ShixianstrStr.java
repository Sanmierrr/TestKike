package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ShixianstrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        //就你妈离谱
//        return haystack.indexOf(needle);
        if (needle.equals("")){
            return 0;
        }
        int i = 0;
        if (haystack.contains(needle)){
            haystack = haystack.replace(needle,"?");
            i = haystack.indexOf("?");
        }else{
            return -1;
        }
        return i;
    }
}
