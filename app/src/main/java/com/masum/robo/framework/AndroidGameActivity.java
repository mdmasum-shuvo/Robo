package com.masum.robo.framework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.masum.robo.R;
import com.masum.robo.framework.game_interface.Audio;
import com.masum.robo.framework.game_interface.FileIO;
import com.masum.robo.framework.game_interface.Game;
import com.masum.robo.framework.game_interface.Graphics;
import com.masum.robo.framework.game_interface.Input;
import com.masum.robo.framework.game_interface.Screen;

public abstract class AndroidGameActivity extends AppCompatActivity implements Game {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public Audio getAudio() {
        return null;
    }

    @Override
    public Input getInput() {
        return null;
    }

    @Override
    public FileIO getFileIO() {
        return null;
    }

    @Override
    public Graphics getGraphics() {
        return null;
    }

    @Override
    public void setScreen(Screen screen) {

    }

    @Override
    public Screen getCurrentScreen() {
        return null;
    }

    @Override
    public Screen getInitScreen() {
        return null;
    }
}