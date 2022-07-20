package com.masum.robo.framework.game_interface;

public interface Music {
    void play();
    void stop();
    void pause();
    void setLooping(boolean isLooping);
    void setVolume(float volume);
    void isPlaying();
    void isStopped();
    void isLooping();
    void dispose();
    void seekBegin();
}
