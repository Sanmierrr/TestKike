package com.pro.test;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class FileReadWrite {

    @Test
    public void test10() throws IOException {
        int count = 10;
        String reading = reading() == null? "0":reading();
        System.out.println("--------"+reading);
//        String sum = String.valueOf(Integer.parseInt(reading) + count);
//        System.out.println(sum);
//        writing(sum);
    }

    private String reading() throws IOException {
        File file = new File("D:/code/testcode/TestKike/src/11111.dat");
        BufferedReader br = null;
        String data = "";
        try {
            br = new BufferedReader(new FileReader(file));
            data = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return data;
    }

    private void writing(String sum) throws IOException {
//        File file = new File(System.getProperty("user.dir") + "/dat/11111.dat");
//        BufferedWriter bw = null;
//        try {
//            bw = new BufferedWriter(new FileWriter(file));
//            bw.write("");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (bw != null){
//                try {
//                    bw.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
