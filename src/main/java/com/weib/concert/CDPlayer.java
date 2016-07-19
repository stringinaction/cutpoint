/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert;

import com.weib.concert.beans.cd.CD;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author zhangjingwei
 */
public class CDPlayer {
    private CD cd;
    
    @Autowired
    public void setCD(CD cd){
        this.cd = cd;
    }
    
    public void playAll(){
        this.cd.pull();
        this.cd.play();
        this.cd.push();
    }
    
    public void playShuffle(){
        this.cd.pull();
        for(int i = 0; i < 20; i++){
            int index = (int)Math.floor(Math.random() * (double)this.cd.getTrackNumber());
            this.cd.play(index);
        }
        this.cd.push();
    }
}
