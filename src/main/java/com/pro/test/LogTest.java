package com.pro.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class LogTest {
    public static Log log = LogFactory.getLog(LogTest.class);
    public static void main(String[] argv) {
        String test="sdibt";
        log.info("this is info:"+test);
        log.error("this is error:"+test);
        log.debug("this is debug:"+test);
    }
}
