package com.masum.robo.framework;

import android.graphics.Bitmap;

import com.masum.robo.framework.game_interface.Graphics.ImageFormat;
import com.masum.robo.framework.game_interface.Image;

public class AndroidImage implements Image {
    private final Bitmap bitmap;
    private final ImageFormat format;

    public AndroidImage(Bitmap bitmap, ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public ImageFormat getFormat() {
        return format;
    }


    @Override
    public void dispose() {
        bitmap.recycle();

    }
}
