package com.pro.test;

import org.aspectj.weaver.ast.Var;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class MapPutTest {

    @Test
    public void test1(){
//        Map<String, Object> map = new HashMap<>();
//        List<Map<String, Object>> maps = new ArrayList<>();
//        map.put("1",1);
//        map.put("1",2);
//
//        maps.add(map);
        String s = "1";
        s += "3123123123123,";
        s=s.substring(0,s.length()-1);
        System.out.println(s);
    }

}
