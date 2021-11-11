package com.pro.test;

import com.pro.utils.FileUtil;
import lombok.SneakyThrows;

import java.io.*;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */

public class DatFileEdit {

    @SneakyThrows
    public static void main(String[] args) {
        datFileEdit();
    }


    public static void datFileEdit() throws Exception{
        File file1 = new File("11.ok");
        File file2 = new File("22.ok");
        System.out.println(FileUtil.readString(file1));
        FileUtil.copy("11.ok", "22.ok");

        FileWriter fstream = new FileWriter(file2, false);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write("something");
        out.close();

//        System.out.println(FileUtil.readString(file2));
    }
}
