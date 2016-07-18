/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.pointcut;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author zhangjingwei
 */
@Aspect
public class Audience {
    
    @Pointcut("execution(* com.weib.concert.beans.Performance.perform(..))")
    public void performance(){}
    
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("================Silencing cell phones");
    }
    
    @Before("performance()")
    public void takeSeats(){
        System.out.println("================Take seats");
    }
    
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("================CLAP CLAP CLAP");
    }
    
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("================Demanding a refund");
    }
}
