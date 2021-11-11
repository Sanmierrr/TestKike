package com.pro.test;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class RandomAccessFileTest {

    @Test
    public void RandomAccessFile(){

        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;

        try {
            raf1 = new RandomAccessFile(new File("莫里亚蒂.jpg"), "r");
            raf2 = new RandomAccessFile(new File("莫里亚蒂1.jpg"),"rw");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1){
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
    *使用RandomAccessFile实现数据的插入效果
    */
    @Test
    public void RandomAccessFileTest2() throws IOException{
        RandomAccessFile raf1 = new RandomAccessFile("莫里亚蒂.jpg", "rw");

        //将指针调到角标为3的位置
        //保存指针3后面的所数据到StringBuilder中
        raf1.seek(3);
        StringBuilder stringBuilder = new StringBuilder((int) new File("莫里亚蒂.txt").length());
        byte[] bytes = new byte[20];
        int len;
        while ((len = raf1.read(bytes)) != -1){
            stringBuilder.append(new String(bytes, 0, len));
        }
        //调回指针，写入“xyz”
        raf1.seek(3);
        raf1.write("xyz".getBytes());

        //将StringBuilder中的数据写入到文件中
        raf1.write(stringBuilder.toString().getBytes());
        raf1.close();
    }
}
