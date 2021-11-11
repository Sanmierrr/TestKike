package com.test;
import com.study.singleton.Singleton1;

/**
 * @author Sanmier
 * @version 1.0
 * @date 2021/11/3
 */
public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.INSTANCE;
        System.out.println(s);
    }
}
