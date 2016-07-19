/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.beans.cd;

/**
 *
 * @author zhangjingwei
 */
public interface CD {
    void pull();
    void push();
    void play();
    void play(int index);
    int getTrackNumber();
}
