package com.pro.test;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class CalenderTest {

    @Test
    public void addTest(){
        Calendar instance = Calendar.getInstance();
        instance.set(2021, 7, 31);
        System.out.println(instance.getTime());
        instance.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(instance.getTime());
        instance.add(Calendar.DATE,1);
        System.out.println(instance.getTime());
        instance.add(Calendar.DATE,7);
        System.out.println(instance.getTime());
        instance.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(instance.getTime());
        instance.add(Calendar.YEAR, 1);
        System.out.println(instance.getTime());
        instance.set(Calendar.DAY_OF_YEAR, 1);
        System.out.println(instance.getTime());
        instance.add(Calendar.MONTH, 3);
        instance.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(instance.getTime());

    }

    @Test
    public void test2(){
        Calendar instance = Calendar.getInstance();
        instance.set(2021,0,15);
        System.out.println(instance.getTime());
        instance.add(Calendar.MONTH,1);
        System.out.println(instance.getTime());
        instance.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(instance.getTime());
        instance.add(Calendar.MONTH,1);
        System.out.println(instance.getTime());
        System.out.println(instance.getTime());
        instance.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(instance.getTime());
        instance.add(Calendar.MONTH,1);
        System.out.println(instance.getTime());

    }
}
