package com.pro.leetcode;

import java.util.Stack;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Youxiaokuohao {

    public static void main(String[] args) {
//        String s = "({{{{}}}))";
//        String s = "()[]{}";
//        String s = "[]";
//        String s = "[";
//        String s = "([)";
        String s = "{}[{}]((){})(){}";
        System.out.println("大傻子：" + isValid(s));
        System.out.println("大触：" + isValid2(s));
    }


    //大傻子解法
    public static boolean isValid(String s) {
        if (s.equals("") || s == null || s.length() % 2 == 1){
            return false;
        }
        while (s.contains("()")||s.contains("[]")||s.contains("{}")){
            s = s.replace("()","").replace("[]","").replace("{}","").trim();
        }
        if (s.equals("") || s == null){
            return true;
        }
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            if (bracketsType(s.charAt(i)) + bracketsType(s.charAt(s.length() - 1 - i)) != 7 || bracketsType(s.charAt(i)) > bracketsType(s.charAt(s.length() - 1 - i))){
                return false;
            }
        }
        return true;
    }

    public static int bracketsType(char c){
        switch (c){
            case '(': return 1;
            case '[': return 2;
            case '{': return 3;
            case '}': return 4;
            case ']': return 5;
            case ')': return 6;
        }
        return 0;
    }

    //大触解法
    public static boolean isValid2(String s){
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(') {
                characters.push(')');
            }else if (c == '['){
                characters.push(']');
            }else if (c == '{'){
                characters.push('}');
            }else if (characters.isEmpty() || c != characters.pop()){
                return false;
            }
        }
        return characters.isEmpty();
    }
}
