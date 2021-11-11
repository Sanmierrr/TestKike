package com.pro.test;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class FileTest {

    //文件写入
    @Test
    public void testFileWriter(){
        FileWriter fw = null;
        try {
            //1、提供File类的对象，指明写出到的文件
            File file = new File("test.txt");
            //2、提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file, false);
            //3、写出的操作
            fw.write("I'm king of the world!!\n");
            fw.write("you are prince!!!");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.流资源的关闭
            if (fw != null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    //文件复制
    @Test
    public void testFileReaderFileWriter(){
        FileWriter fw = null;
        FileReader fr = null;

        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("test.txt");
            File destFile = new File("copy.txt");
            //不能使用字符流来处理图片等字节数据
            //File srcFile = new File("爱情与友情.jpg");
            //File destFile = new File("爱情与友情1.jpg");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3、数据的读入和写入操作
            char[] cbuf = new char[5];
            //记录每次读入到cbuf数组中的字符的个数
            int len;

            while ((len = fr.read(cbuf)) != -1){
                //每次写出len的个数
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流资源
            //方式一
//            try {
//                if (fw != null){
//                    fw.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (fr != null){
//                        fr.close();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            //方式二
            try {
                if (fw != null ){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fr !=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
