package com.pro.test;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class IteratorTest {

    /**
     * List常用的方法有
     * 增 ： add(Object obj)
     * 删 ： remove(int index) / remove(Object obj)
     * 改 ： set(int index, Object ele)
     * 查 ： get（int index）
     * 插 ： add（int index, Object ele）
     * 长度 ： size()
     * 遍历 ： （1）Iterator  迭代器方式
     *        （2）增强for循环
     *        （3）普通的循环
     *
     * Map常用的方法
     * 添加：put(Object key,Object value)
     * 删除：remove(Object key)
     * 修改：put(Object key,Object value)
     * 查询：get(Object key)
     * 长度：size()
     * 遍历：keySet() / values() / entrySet()
     */

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        System.out.println(coll);  //[123, 456, Tom, false]

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            if ("Tom".equals(next)){
                iterator.remove();
            }
        }
        System.out.println(coll);  //[123, 456, false]

        iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            /**
             * 123
             * 456
             * false
             */
        }
    }
}
