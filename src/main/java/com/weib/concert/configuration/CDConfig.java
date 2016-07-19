/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.concert.configuration;

import com.weib.concert.CDPlayer;
import com.weib.concert.beans.cd.BlankDisc;
import com.weib.concert.beans.cd.CD;
import com.weib.concert.pointcut.TrackCounter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author zhangjingwei
 */
@Configuration
@EnableAspectJAutoProxy
public class CDConfig {
    
    @Bean
    public CD blankDisc(){
        BlankDisc cd =  new BlankDisc();
        cd.setTitle("The fianlly");
        cd.setArtist("Yanni");
        
        List<String> tracks = new ArrayList<String>();
        tracks.add("Track 01");
        tracks.add("Track 02");
        tracks.add("Track 03");
        tracks.add("Track 04");
        tracks.add("Track 05");
        tracks.add("Track 06");
        tracks.add("Track 07");
        tracks.add("Track 08");
        tracks.add("Track 09");
        tracks.add("Track 10");
        
        cd.setTracks(tracks);
        
        return cd;
    }
    
    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
    
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer();
    }
}
