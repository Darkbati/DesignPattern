package com.gilbert.designpattern.AdapterPattern;

import com.gilbert.designpattern.AdapterPattern.base.MEDIA_TYPE;
import com.gilbert.designpattern.AdapterPattern.player.AudioPlayer;

public class main {
    public static void main(String[] args) throws Exception {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(MEDIA_TYPE.MP3, "beyond the horizon.mp3");
        audioPlayer.play(MEDIA_TYPE.MP4, "alone.mp4");
        audioPlayer.play(MEDIA_TYPE.VLC, "far far away.vlc");
        audioPlayer.play(MEDIA_TYPE.AVI, "mind me.avi");
    }
}
