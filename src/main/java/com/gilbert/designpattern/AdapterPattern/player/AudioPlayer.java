package com.gilbert.designpattern.AdapterPattern.player;

import com.gilbert.designpattern.AdapterPattern.MediaAdapter;
import com.gilbert.designpattern.AdapterPattern.base.MEDIA_TYPE;
import com.gilbert.designpattern.AdapterPattern.base.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(MEDIA_TYPE type, String fileName) throws Exception {
        switch (type) {
            case MP3:
            case MP4:
            case VLC:
            case AVI:
                mediaAdapter = new MediaAdapter(type);
                mediaAdapter.play(type, fileName);
                break;

            default:
                System.out.println("Invalid media. " + type.getValue() + " format not supported");
                break;
        }
    }
}
