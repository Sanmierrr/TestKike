package com.test;

import com.study.singleton.Singleton3;

/**
 * @author Sanmier
 * @version 1.0
 * @date 2021/11/3
 */
public class TestSingleton3 {
    public static void main(String[] args) {
        Singleton3 sss = Singleton3.INSTANCE;
        System.out.println(sss);
    }
}
