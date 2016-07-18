/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author zhangjingwei
 */
@Aspect
public class AnotherAudience {
    @Pointcut("execution(* com.weib.concert.beans.Performance.perform(..))")
    public void performance(){}
    
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("================Silencing cell phones");
            System.out.println("================Take seats");
            jp.proceed();
            System.out.println("================CLAP CLAP CLAP");
        }catch(Throwable e){
            System.out.println("================Demanding a refund");
        }
    }
}
