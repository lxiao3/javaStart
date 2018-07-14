package com.lxiao.springmvc.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
public class IndexAspect {
    public static Logger logger = LoggerFactory.getLogger(IndexAspect.class);

    @Pointcut("execution(public * com.lxiao.springmvc.controller.IntexController.*(..))")
    public void performance(){}

    @Before("performance()")
    public void before() {
        logger.info("--------------- " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " start -----------------");
    }
    @After("performance()")
    public void after() {
        logger.info("--------------- " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " end -----------------");
    }

}
