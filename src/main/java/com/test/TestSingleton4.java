package com.test;

import com.study.singleton.Singleton4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.*;

/**
 * @author Sanmier
 * @version 1.0
 * @date 2021/11/3
 */
public class TestSingleton4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton4 s1 = Singleton4.getInstance();
//        Singleton4 s2 = Singleton4.getInstance();
//
//        System.out.println(s1 == s2);
//        System.out.println(s1);
//        System.out.println(s2);

        String s = "123123123123.dat";
        String ss = s.substring(0,s.lastIndexOf(".")) + ".xml";
        System.out.println(ss);

        Calendar instance = Calendar.getInstance();
        String s1 = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(instance.getTime());
        System.out.println(s1);

//        Callable<Singleton4> c = new Callable<Singleton4>() {
//            @Override
//            public Singleton4 call() throws Exception {
//                return Singleton4.getInstance();
//            }
//        };
//        ExecutorService es = Executors.newFixedThreadPool(2);
//        Future<Singleton4> f1 = es.submit(c);
//        Future<Singleton4> f2 = es.submit(c);
//
//        Singleton4 s1 = f1.get();
//        Singleton4 s2 = f2.get();
//
//        System.out.println(s1 == s2);
//        System.out.println(s1);
//        System.out.println(s2);
//
//        es.shutdown();
    }
}
