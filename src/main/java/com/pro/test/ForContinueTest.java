package com.pro.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ForContinueTest {

    @Test
    public void test1(){
        List<String> strings = new ArrayList<>();
        strings.add("11");
        strings.add("22");
        strings.add("33");
        strings.add("44");
        strings.add("22");
        strings.add("66");

        for (String string : strings) {
            if ("22".equals(string)){
                continue;
            }
            System.out.println(string);
        }
    }
}
