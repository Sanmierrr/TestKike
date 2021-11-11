package com.pro.test;

import com.pro.entity.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class StrSplitTest {

    @Test
    public void StrSplitTest(){

        Person p1 = new Person();
        p1.setName("张三");
        Person p2 = new Person();
        p2.setName("李四");
        Person p3 = new Person();
        p3.setName("王五");
        List<Person> ss = new ArrayList<>();
        ss.add(p1);
        ss.add(p2);
        ss.add(p3);

//        //拼接方式一
//        String ns = new String();
//        int count = 1;
//        for(Person s : ss){
//            if (count == ss.size()){
//                ns = ns.concat(s.getName());
//
//            }
//            if (count < ss.size()){
//                ns = ns.concat(s.getName() + ",");
//            }
//            count++;
//        }
//        System.out.println(ns.trim());

        //拼接方式二
        StringBuffer sb = new StringBuffer();
        for(Person s : ss){
            sb = sb.append(s.getName()).append(",");
        }
        System.out.println(sb.deleteCharAt(sb.length()-1));
    }

    @Test
    public void nullStr(){
        String str = "abcdef";
        str = str.replace("b","");
        //acdef
        System.out.println(str);
        //acf
        str = str.replace("de","");
        System.out.println(str);

        str = str.replace("a","c");
        System.out.println(str);
    }
}
