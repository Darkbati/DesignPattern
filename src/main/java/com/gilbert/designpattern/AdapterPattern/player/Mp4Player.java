package com.gilbert.designpattern.AdapterPattern.player;

import com.gilbert.designpattern.AdapterPattern.base.AdvancedMediaPlayer;
import com.gilbert.designpattern.AdapterPattern.base.MEDIA_TYPE;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void play(MEDIA_TYPE type, String fileName) {
        System.out.printf("Playing {} file. Name: {}", type.getValue(), fileName);
    }
}
