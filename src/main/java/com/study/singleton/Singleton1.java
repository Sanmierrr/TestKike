package com.study.singleton;

/**
 * @author Sanmier
 * @version 1.0
 * @date 2021/11/3
 * 饿汉式：
 *  直接进行创建实例，不管你是否需要
 * 1、构造器私有化
 * 2、自行创建，并且用静态变量保存
 * 3、向外提供这个实例
 * 4、强调这是个单例 可以用final进行修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1 (){
    }
}
