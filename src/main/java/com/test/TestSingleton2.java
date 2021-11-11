package com.test;

import com.study.singleton.Singleton2;

/**
 * @author Sanmier
 * @version 1.0
 * @date 2021/11/3
 */
public class TestSingleton2 {
    public static void main(String[] args) {
        Singleton2 ss = Singleton2.INSTANCE;
        System.out.println(ss);
    }
}
