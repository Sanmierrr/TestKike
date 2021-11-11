package com.pro.utils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 * 第一步：首先编写文件操作类FileUtil。
 * 1、编写写入文件内容的操作rewrite
 * 2、编写读取文件内容的操作readString
 * 3、具体实现代码如下所示
 */

public class FileUtil {

    public static void rewrite(File file, String data) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String readString(File file) {
        BufferedReader br = null;
        String data = "";
        try {
            br = new BufferedReader(new FileReader(file));
            for (String str = null; (str = br.readLine()) != null;) {
                data += (str+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }


    public static void copy(String url1, String url2) throws Exception {
        FileInputStream in = new FileInputStream(new File(url1));
        FileOutputStream out = new FileOutputStream(new File(url2));
        byte[] buff = new byte[512];
        int n = 0;
        System.out.println("复制文件：" + "\n" + "源路径：" + url1 + "\n" + "目标路径："
                                   + url2);
        while ((n = in.read(buff)) != -1) {
            out.write(buff, 0, n);
        }
        out.flush();
        in.close();
        out.close();
        System.out.println("复制完成");
    }

}

