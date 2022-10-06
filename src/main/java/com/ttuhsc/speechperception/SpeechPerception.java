/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.ttuhsc.speechperception;

import com.ttuhsc.speechperception.gui.WelcomeScreen;
import java.awt.EventQueue;

/**
 *
 * @author Lab
 */
public class SpeechPerception {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                WelcomeScreen welcome = new WelcomeScreen();
                welcome.setExtendedState(welcome.MAXIMIZED_BOTH);
                welcome.setVisible(true);

            }

        });

    }

}
