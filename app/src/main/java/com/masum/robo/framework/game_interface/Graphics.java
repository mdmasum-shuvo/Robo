package com.masum.robo.framework.game_interface;

import android.graphics.Paint;

public interface Graphics {
    enum ImageFormat {
        ARGB8888, ARGB4444, RGB565
    }

    Image newImage(String filename, ImageFormat format);

    void clearScreen(int color);

    void drawLine(int x1, int y1, int x2, int y2, int color);

    void drawReact(int x, int y, int width, int height, int color);

    void drawImage(Image image, int x, int y, int srcX, int srcY, int srcWidth, int srcHeight);

    void drawImage(Image image, int x, int y);

    void drawScreen(String text, int x, int y, Paint paint);

    int getWidth();

    int getHeight();

    void drawARGB(int i, int j, int k, int l);

}
