package com.pro.test;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class OosTest {

    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("test.dat"));
            oos.writeObject(new String("一既是全, 全既是一"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("test.dat"));
            Object o = ois.readObject();
            String os = (String) o;
            System.out.println(os);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
