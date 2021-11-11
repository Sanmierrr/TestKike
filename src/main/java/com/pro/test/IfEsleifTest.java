package com.pro.test;

import org.junit.jupiter.api.Test;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class IfEsleifTest {

    @Test
    public void test1(){
        String ss = "0";

        if (ss.contains("1")){
            System.out.println("ss包含1");
        }
        if (ss.contains("2")){
            System.out.println("ss包含2");
        }
        if (ss.contains("3")){
            System.out.println("ss包含3");
        }
        if (ss.contains("4")){
            System.out.println("ss包含4");
        }
        else {
            System.out.println("ss啥也不是");
        }
    }
}
