/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert;

import com.weib.concert.beans.Performance;
import com.weib.concert.configuration.CDConfig;
import com.weib.concert.configuration.ConcertConfig;
import com.weib.concert.pointcut.Encoreable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author zhangjingwei
 */
public class ConcertMain {
    
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
//        Director director = context.getBean(Director.class);
//        director.perform();
        Performance concert = (Performance) context.getBean("concert"); //仍然可以直接调用Bean 与Qualifier无关
        concert.perform();
        
        Performance play = (Performance) context.getBean("play"); //仍然可以直接调用Bean 
        play.perform();
        
        /**
         * public class EncoreableIntroducer {
         *       @DeclareParents(value="com.weib.concert.beans.Performance+",   //要扩展的接口
         *               defaultImpl=PerformanceEncoreable.class)            //扩展的实现
         *       public static Encoreable encoreable;
         * }
         */
        Encoreable encoreablePlay = (Encoreable)play;   //强转成扩展接口(当Performance同时有其他切面时，此时的play实际上是proxy对象，但这时也不影响使用扩展)
        encoreablePlay.performEncore();                 //调用扩展方法
        
        context.close();
        
        AnnotationConfigApplicationContext cdContext = new AnnotationConfigApplicationContext(CDConfig.class);
        CDPlayer cdplayer = cdContext.getBean(CDPlayer.class);
        cdplayer.playAll();
        cdplayer.playShuffle();
        
        cdContext.close();
    }
}
