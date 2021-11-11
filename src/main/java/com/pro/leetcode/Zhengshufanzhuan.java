package com.pro.leetcode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Zhengshufanzhuan {

    public static void main(String[] args) {
        reverse(123);
    }

    public static int reverse(int x){
        int result = 0;
        while(x != 0) {
            int tmp = result; // 保存计算之前的结果
            result = (result * 10) + (x % 10);
            x /= 10;
            // 将计算之后的结果 / 10，判断是否与计算之前相同，如果不同，证明发生溢出，返回0
            if (result / 10 != tmp){
                return 0;
            }
        }
        System.out.println(result);
        return result;

    }
}
