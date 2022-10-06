/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttuhsc.speechperception.utility;
import com.ttuhsc.speechperception.gui.Ready;
import com.ttuhsc.speechperception.gui.ShowImage;
import com.ttuhsc.speechperception.vo.UserData;
import java.util.List;

/**
 *
 * @author Lab
 */
public class RunSoundProcedures {

     
   public void runFirstProc(List<String> sounds,UserData ud){
    
       String s = sounds.get(0);
     
    switch(s){
    
         case "B": 
         ShowImage smb = new ShowImage(sounds,ud,"B",0);
         smb.setExtendedState(smb.MAXIMIZED_BOTH);  
         smb.setVisible(true);
             break;
             
         case "P":
            ShowImage smp = new ShowImage(sounds,ud,"P",1);
            smp.setExtendedState(smp.MAXIMIZED_BOTH); 
            smp.setVisible(true);
             break; 
             
          case "T":
            ShowImage smt = new ShowImage(sounds,ud,"T",2);
            smt.setExtendedState(smt.MAXIMIZED_BOTH); 
            smt.setVisible(true);
             break;
             
          case "D":
            ShowImage smd = new ShowImage(sounds,ud,"D",3);
            smd.setExtendedState(smd.MAXIMIZED_BOTH); 
            smd.setVisible(true);
             break;
             
          case "K":
            ShowImage smk = new ShowImage(sounds,ud,"K",4);
            smk.setExtendedState(smk.MAXIMIZED_BOTH);
            smk.setVisible(true);
            break;
          
        case "G":
            ShowImage smg = new ShowImage(sounds,ud,"G",5);
            smg.setExtendedState(smg.MAXIMIZED_BOTH);
            smg.setVisible(true);
            break;
         
         case "F":
            ShowImage smf = new ShowImage(sounds,ud,"F",6);
            smf.setExtendedState(smf.MAXIMIZED_BOTH);
            smf.setVisible(true);
            break;
            
            
        case "V":
            ShowImage smv = new ShowImage(sounds,ud,"V",7);
            smv.setExtendedState(smv.MAXIMIZED_BOTH);
            smv.setVisible(true);
            break;
            
        case "S":
            ShowImage sms = new ShowImage(sounds,ud,"S",8);
            sms.setExtendedState(sms.MAXIMIZED_BOTH);
            sms.setVisible(true);
            break;            
 
        case "Z":
            ShowImage smz = new ShowImage(sounds,ud,"Z",9);
            smz.setExtendedState(smz.MAXIMIZED_BOTH);
            smz.setVisible(true);
            break;

        case "TH":
            ShowImage smth = new ShowImage(sounds,ud,"TH",10);
            smth.setExtendedState(smth.MAXIMIZED_BOTH);
            smth.setVisible(true);
            break;

        case "SH":
            ShowImage smsh = new ShowImage(sounds,ud,"SH",11);
            smsh.setExtendedState(smsh.MAXIMIZED_BOTH);
            smsh.setVisible(true);
            break;  
            
        case "CH":
            ShowImage smch = new ShowImage(sounds,ud,"CH",12);
            smch.setExtendedState(smch.MAXIMIZED_BOTH);
            smch.setVisible(true);
            break;

    
        case "J":
            ShowImage smj = new ShowImage(sounds,ud,"J",13);
            smj.setExtendedState(smj.MAXIMIZED_BOTH);
            smj.setVisible(true);
            break;            
    
        case "L":
            ShowImage sml = new ShowImage(sounds,ud,"L",14);
            sml.setExtendedState(sml.MAXIMIZED_BOTH);
            sml.setVisible(true);
            break;

        case "R":
            ShowImage smr = new ShowImage(sounds,ud,"R",15);
            smr.setExtendedState(smr.MAXIMIZED_BOTH);
            smr.setVisible(true);
            break;             
    }
    
    
    } 
    

    public void runNextProc(String s, List<String> sounds,UserData ud){
    
       Ready rd = new Ready(null, true);
       rd.setVisible(true);
        
    switch(s){
    
          case "B": 
         ShowImage smb = new ShowImage(sounds,ud,"B",0);
         smb.setExtendedState(smb.MAXIMIZED_BOTH);  
         smb.setVisible(true);
             break;
             
         case "P":
            ShowImage smp = new ShowImage(sounds,ud,"P",1);
            smp.setExtendedState(smp.MAXIMIZED_BOTH); 
            smp.setVisible(true);
             break; 
             
          case "T":
            ShowImage smt = new ShowImage(sounds,ud,"T",2);
            smt.setExtendedState(smt.MAXIMIZED_BOTH); 
            smt.setVisible(true);
             break;
             
          case "D":
            ShowImage smd = new ShowImage(sounds,ud,"D",3);
            smd.setExtendedState(smd.MAXIMIZED_BOTH); 
            smd.setVisible(true);
             break;
             
          case "K":
            ShowImage smk = new ShowImage(sounds,ud,"K",4);
            smk.setExtendedState(smk.MAXIMIZED_BOTH);
            smk.setVisible(true);
            break;
          
        case "G":
            ShowImage smg = new ShowImage(sounds,ud,"G",5);
            smg.setExtendedState(smg.MAXIMIZED_BOTH);
            smg.setVisible(true);
            break;
         
         case "F":
            ShowImage smf = new ShowImage(sounds,ud,"F",6);
            smf.setExtendedState(smf.MAXIMIZED_BOTH);
            smf.setVisible(true);
            break;
            
            
        case "V":
            ShowImage smv = new ShowImage(sounds,ud,"V",7);
            smv.setExtendedState(smv.MAXIMIZED_BOTH);
            smv.setVisible(true);
            break;
            
        case "S":
            ShowImage sms = new ShowImage(sounds,ud,"S",8);
            sms.setExtendedState(sms.MAXIMIZED_BOTH);
            sms.setVisible(true);
            break;            
 
        case "Z":
            ShowImage smz = new ShowImage(sounds,ud,"Z",9);
            smz.setExtendedState(smz.MAXIMIZED_BOTH);
            smz.setVisible(true);
            break;

        case "TH":
            ShowImage smth = new ShowImage(sounds,ud,"TH",10);
            smth.setExtendedState(smth.MAXIMIZED_BOTH);
            smth.setVisible(true);
            break;

        case "SH":
            ShowImage smsh = new ShowImage(sounds,ud,"SH",11);
            smsh.setExtendedState(smsh.MAXIMIZED_BOTH);
            smsh.setVisible(true);
            break;  
            
        case "CH":
            ShowImage smch = new ShowImage(sounds,ud,"CH",12);
            smch.setExtendedState(smch.MAXIMIZED_BOTH);
            smch.setVisible(true);
            break;

    
        case "J":
            ShowImage smj = new ShowImage(sounds,ud,"J",13);
            smj.setExtendedState(smj.MAXIMIZED_BOTH);
            smj.setVisible(true);
            break;            
    
        case "L":
            ShowImage sml = new ShowImage(sounds,ud,"L",14);
            sml.setExtendedState(sml.MAXIMIZED_BOTH);
            sml.setVisible(true);
            break;

        case "R":
            ShowImage smr = new ShowImage(sounds,ud,"R",15);
            smr.setExtendedState(smr.MAXIMIZED_BOTH);
            smr.setVisible(true);
            break; 

    }
    
    
    }
    
    
    
}
