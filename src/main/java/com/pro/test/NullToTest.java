package com.pro.test;

import org.junit.jupiter.api.Test;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class NullToTest {
    @Test
    public void test4(){
        String s = null;
        System.out.println(s);
        if (s == null){
            s = "";
        }
        System.out.println(s);
    }
}
