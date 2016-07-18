/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert;

import com.weib.concert.beans.Performance;
import com.weib.concert.configuration.ConcertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author zhangjingwei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
public class ConcertTest {
    @Autowired
    private Performance performance;
    
    @Test
    public void testPerformance(){
        performance.perform();
    }
}
