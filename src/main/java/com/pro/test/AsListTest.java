package com.pro.test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class AsListTest {

    public static void main(String[] args) {

        //1、展示list
        List<String> list = Arrays.asList(new String[]{"123","456"});
        System.out.println(list);
        //[123, 456]

        //2、判断数组长度
        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1.size());
        //1

        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2.size());
        //2
    }
}
