package com.pro.test;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class DateTest {

    @Test
    public void dateTest(){
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
    }
}
