/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
@Component
@Qualifier("concert")
public class Concert implements Performance {

    @Override
    public void perform() {
        System.out.println("+++++++++++++++perform()+++++++++++++++++");
    }
    
}
