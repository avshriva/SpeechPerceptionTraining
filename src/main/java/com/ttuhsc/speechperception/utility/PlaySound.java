/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttuhsc.speechperception.utility;

import com.ttuhsc.speechperception.SpeechPerception;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Lab
 */
public class PlaySound {
    
        public void playSound(String filePath){
     
        
        File file = new File(filePath);
         try {
                 AudioInputStream ais = AudioSystem.getAudioInputStream(file);
        
                    Clip clip = AudioSystem.getClip();
                    clip.open(ais);
                    clip.start();
                    System.out.println("Testing Sound");
    }   catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(SpeechPerception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
