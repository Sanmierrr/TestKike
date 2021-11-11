package com.pro.leetcode;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Luomashuzizhuanzhengshu {

    public static void main(String[] args) {
        romanToInt("XXX");
    }

    public static int romanToInt(String s) {
        s = s.replace("IV", "4");
        s = s.replace("IX","9");
        s = s.replace("XL","40");
        s = s.replace("XC","90");
        s = s.replace("CD","400");
        s = s.replace("CM","900");
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += getValue(s.charAt(i));
        }
        System.out.println(res);
        return res;
    }


    public static int getValue(char c){
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            case 'a': return 4;
            case 'b': return 9;
            case 'c': return 40;
            case 'd': return 90;
            case 'e': return 400;
            case 'f': return 900;
        }
        return 0;
    }

}
