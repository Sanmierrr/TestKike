package com.pro.test;

import org.junit.jupiter.api.Test;

import javax.xml.transform.Source;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.rmi.server.ExportException;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ZhuanyiTest {

    @Test
    public void test1(){
        String s = new String("1"+"\n"+"2");
        System.out.println(s);
    }

    @Test
    public void test2() throws IOException {
        File file = new File("1.dat");
        FileReader fileReader = new FileReader("1.dat");
        int read = fileReader.read();
        System.out.println(read);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        long length = randomAccessFile.length();
        file.delete();
        randomAccessFile.write("1233123".getBytes());

        PrintStream stream=null;
        try {
            stream=new PrintStream(file);//写入的文件path
            stream.print(444444);//写入的字符串
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
