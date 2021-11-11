package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Zuichanggonggongqianzhui {

    public static void main(String[] args) {
//        String[] strs = new String[]{"flower","flow","flight"};
//        String[] strs = new String[]{};
        String[] strs = new String[]{"strsin","aipost","strshz","aiget"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
       if (strs.length == 0){
           return "无字符串";
       }
       //选定任意一个当作公共前缀
       String s = strs[0];
       for (String ss: strs){
           while (!ss.startsWith(s)){
               if (s.length() == 0){
                   return "无公共前缀";
               }
               s = s.substring(0,s.length()-1);
           }
       }
       return s;
    }
}
