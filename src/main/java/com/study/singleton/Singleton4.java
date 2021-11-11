package com.study.singleton;

/**
 * @author Sanmier
 * @version 1.0
 * @date 2021/11/3
 * 1、构造器私有化
 * 2、用一个静态变量保存这个唯一实例
 */
public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        if (instance == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton4();
        }
        return instance;
    }
}
