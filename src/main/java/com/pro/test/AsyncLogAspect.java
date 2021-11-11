package com.pro.test;

import com.alibaba.excel.util.DateUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
@Aspect
@Component
public class AsyncLogAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger("asyncLog");

    public static void main(String[] args) {
        String yyyYmmdd = DateUtils.format(new Date(), "yyyyMMdd");
        System.out.println("123131\n123132" + yyyYmmdd);
    }
}
