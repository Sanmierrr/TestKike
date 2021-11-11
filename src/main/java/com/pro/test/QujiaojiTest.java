package com.pro.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class QujiaojiTest {

    @Test
    public void GuavaTest(){
        List<String> pdfList = new ArrayList<>();
//        List<String> datList = new ArrayList<>();
        pdfList.add("1111");
        pdfList.add("2222");
        pdfList.add("3333");
        pdfList.add("111122");
//        System.out.println(pdfList);
//        datList.add("2");
//        datList.add("1");


//        Map<String, List<String>> hashMap = new HashMap<>();
//        for (String s : pdfList) {
//            String sss = s;
//            s = s.substring(0, 4);
//            List<String> list = hashMap.get(s);
//            if (list == null){
//                list = new ArrayList<>();
//            }
//            list.add(sss);
//            hashMap.put(s,list);
//        }
//        System.out.println(hashMap);


        String ss = "2";
        for (String s : pdfList) {
            ss += s + "\r\n";
        }
        System.out.println(ss);





        //        p>d
//        for (String p : pdfList) {
//            for (String d : datList) {
//                if (p.contains(d)) {
//                    System.out.println(p);
//                }else {
//                    System.out.println("-----------");
//                    System.out.println(p);
//                }
//            }
//        }
//        System.out.println(datList);
//        List<String> copyList = new ArrayList<>();
//        copyList.addAll(datList);
//        System.out.println(copyList);
//
//
//        boolean b1 = datList.retainAll(pdfList);
//        System.out.println(b1);
//        System.out.println(datList);
//        System.out.println(copyList);
//
//        pdfList.removeAll(datList);
//        System.out.println(pdfList);
//
//        boolean b = copyList.retainAll(datList);
//        System.out.println(b);
//        System.out.println(copyList);


    }
}
