/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 *
 * @author zhangjingwei
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value="com.weib.concert.beans.Performance+",   //要扩展的接口
            defaultImpl=PerformanceEncoreable.class)            //扩展的实现
    public static Encoreable encoreable;
}
