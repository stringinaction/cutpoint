/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.pointcut;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author zhangjingwei
 */
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
    
    @Pointcut("execution(* com.weib.concert.beans.cd.CD.play(int)) && args(index)")
    public void play(int index){};
    
    @Pointcut("execution(* com.weib.concert.beans.cd.CD.pull())")
    public void pull(){}
    
    @Pointcut("execution(* com.weib.concert.beans.cd.CD.push())")
    public void push(){}
    
    @Before("play(index)")
    public void countTrack(int index){
        if(counter.containsKey(index)){
            counter.put(index, counter.get(index) + 1);
        }else{
            counter.put(index, 1);
        }
    }
    
    @AfterReturning("pull()")
    public void clearTrackCounter(){
        System.out.println("*************clear counter***********");
        counter.clear();
    }
    
    @AfterReturning("push()")
    public void outputTrackCounter(){
        System.out.println("*************output counter***********");
        Iterator iter = counter.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println(key + "----------------" + value);
        }
    }
}
