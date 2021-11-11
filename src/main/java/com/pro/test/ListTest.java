package com.pro.test;

import org.junit.jupiter.api.Test;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ListTest {

    @Test
    public void listTest() {
        List<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);

        List<String> strings = new ArrayList<>();
        strings.addAll(list);
        System.out.println(strings);
    }
}
