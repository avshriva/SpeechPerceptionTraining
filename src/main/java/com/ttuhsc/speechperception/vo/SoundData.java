/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttuhsc.speechperception.vo;

/**
 *
 * @author Lab
 */
public class SoundData {
    
    private String soundFile;
    private String imageFile;
    private String actualResponse;
    private String userResponse;

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getActualResponse() {
        return actualResponse;
    }

    public void setActualResponse(String actualResponse) {
        this.actualResponse = actualResponse;
    }

    public String getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(String userResponse) {
        this.userResponse = userResponse;
    }
    
    
}
