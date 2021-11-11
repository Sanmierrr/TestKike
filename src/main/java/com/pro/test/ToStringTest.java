package com.pro.test;

import org.junit.jupiter.api.Test;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ToStringTest {

    @Test
    public void ToStringTest(){
        String s = "Hello World!!";
        System.out.println(s);
        //当做反斜线时  需要用反斜线修饰反斜线
        s = s.replace("l","\\");
        System.out.println(s);
    }

    @Test
    public void test2(){
        StringBuilder stringBuilder = new StringBuilder("我要成为万能药~");
        StringBuilder sb = stringBuilder.replace(0, 0, "乔巴：");
        System.out.println(sb);

    }
}
