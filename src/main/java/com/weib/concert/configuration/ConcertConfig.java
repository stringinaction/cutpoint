/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.configuration;

import com.weib.concert.Director;
import com.weib.concert.pointcut.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author zhangjingwei
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.weib.concert.beans"})
public class ConcertConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
    
    @Bean
    public Director director(){
        return new Director();
    }
}
