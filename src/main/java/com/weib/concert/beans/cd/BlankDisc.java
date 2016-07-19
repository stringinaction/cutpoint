/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.beans.cd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhangjingwei
 */
public class BlankDisc implements CD {

    private String title;
    private String artist;
    
    private List<String> tracks = new ArrayList<String>();
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public void setTracks(List<String> tracks){
        this.tracks = tracks;
    }
    
    @Override
    public int getTrackNumber(){
        if(this.tracks != null){
            return this.tracks.size();
        }
        return 0;
    }
    
    @Override
    public void play() {
        System.out.println("Start playing [" + title + "] by " + artist);
        for(String track : tracks){
            System.out.println("============" + track);
        }
    }

    @Override
    public void play(int index) {
        if(index >= tracks.size()){
            return;
        }
        System.out.println("Playing [" + index + "]============" + tracks.get(index));
    }

    @Override
    public void pull() {
        System.out.println("---->Pull [" + this.title + "] In");
    }

    @Override
    public void push() {
        System.out.println("<----Push [" + this.title + "] Out");
    }

}
