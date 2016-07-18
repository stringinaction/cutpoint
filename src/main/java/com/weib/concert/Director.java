/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert;

import com.weib.concert.beans.Performance;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author zhangjingwei
 */
public class Director {
    
    private Performance performance;
    
    @Autowired
    public void setPerformance(Performance performance){
        this.performance = performance;
    }
    
    public void perform(){
        this.performance.perform();
    }
}
