package com.pro.test;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class DirExistTest {

    @Test
    public void test9() throws IOException {
        File file = new File(System.getProperty("user.dir") + "/dat/11111.dat");
        File parentFile = file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();
        }
        file.createNewFile();
    }
}
