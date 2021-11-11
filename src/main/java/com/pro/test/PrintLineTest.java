package com.pro.test;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class PrintLineTest {

//    @Test
//    public void test1() throws IOException {
//        String s = testRead();
//        System.out.println(s);
//    }

    @Test
    public void toArrayByFileReader1() {
        // 使用ArrayList来存储每行读取到的字符串
        ArrayList<String> arrayList = new ArrayList<>();
        String ss = "";
        try {
            FileReader fr1 = new FileReader("D:/code/testcode/TestKike/dat/1.dat");
            FileWriter fr2 = new FileWriter("D:/code/testcode/TestKike/dat/2.dat");
            BufferedReader bf1 = new BufferedReader(fr1);
            String str = "";
            // 按行读取字符串
            while ((str = bf1.readLine()) != null) {
                arrayList.add(str);
            }
            // 对ArrayList中存储的字符串进行处理
//            for (String s : arrayList) {
//                ss += s + "\r\n";
//            }
            ss = arrayList.toString();
            System.out.println(ss);
            bf1.close();
            fr1.close();
            fr2.write(ss);
            fr2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
