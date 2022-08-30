package com.gilbert.designpattern.AdapterPattern;

import com.gilbert.designpattern.AdapterPattern.base.AdvancedMediaPlayer;
import com.gilbert.designpattern.AdapterPattern.base.MEDIA_TYPE;
import com.gilbert.designpattern.AdapterPattern.base.MediaPlayer;
import com.gilbert.designpattern.AdapterPattern.player.Mp4Player;
import com.gilbert.designpattern.AdapterPattern.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(MEDIA_TYPE type) throws Exception {
        switch (type) {
            case MP4:
                advancedMusicPlayer = new Mp4Player();
                break;

            case VLC:
                advancedMusicPlayer = new VlcPlayer();
                break;

            default:
                throw new Exception();
        }
    }

    @Override
    public void play(MEDIA_TYPE type, String fileName) {
        advancedMusicPlayer.play(type, fileName);
    }
}
