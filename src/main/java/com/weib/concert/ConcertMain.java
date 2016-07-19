/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert;

import com.weib.concert.configuration.CDConfig;
import com.weib.concert.configuration.ConcertConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author zhangjingwei
 */
public class ConcertMain {
    
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Director director = context.getBean(Director.class);
        director.perform();
        context.close();
        
        AnnotationConfigApplicationContext cdContext = new AnnotationConfigApplicationContext(CDConfig.class);
        CDPlayer cdplayer = cdContext.getBean(CDPlayer.class);
        cdplayer.playAll();
        cdplayer.playShuffle();
        cdContext.close();
    }
}
