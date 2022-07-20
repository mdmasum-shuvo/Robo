package com.masum.robo.framework;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import com.masum.robo.framework.game_interface.Graphics;
import com.masum.robo.framework.game_interface.Image;

import java.io.IOException;
import java.io.InputStream;

public class AndroidGraphics implements Graphics {
    private AssetManager assets;
    private Bitmap frameBuffer;
    private Canvas canvas;
    private Paint paint;
    private Rect srcRect = new Rect();
    private Rect dstRect = new Rect();

    public AndroidGraphics(AssetManager assets, Bitmap frameBuffer) {
        this.assets = assets;
        this.frameBuffer = frameBuffer;
        this.canvas = new Canvas(frameBuffer);
        this.paint = new Paint();
    }


    @Override
    public Image newImage(String fileName, ImageFormat format) {
        Bitmap.Config config = null;
        if (format == ImageFormat.RGB565)
            config = Bitmap.Config.RGB_565;
        else if (format == ImageFormat.ARGB4444)
            config = Bitmap.Config.ARGB_4444;
        else
            config = Bitmap.Config.ARGB_8888;

        BitmapFactory.Options options=new BitmapFactory.Options();
        options.inPreferredConfig=config;
        InputStream in=null;
        Bitmap bitmap=null;
        try {
            in= assets.open(fileName);
            bitmap=BitmapFactory.decodeStream(in,null,options);
            if (bitmap==null){
                throw  new RuntimeException("Could not load bitmap from asset :"+fileName);
            }
        } catch (IOException e) {
            throw new RuntimeException("Couldn't load bitmap from asset '"
                    + fileName + "'");
        }

        finally {
            if (in !=null){
                try {
                    in.close();
                }
                catch (IOException e){

                }
            }
        }
        if (bitmap.getConfig() == Bitmap.Config.RGB_565)
            format = ImageFormat.RGB565;
        else if (bitmap.getConfig() == Bitmap.Config.ARGB_4444)
            format = ImageFormat.ARGB4444;
        else
            format = ImageFormat.ARGB8888;

        return new AndroidImage(bitmap,format);
    }

    @Override
    public void clearScreen(int color) {

    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2, int color) {

    }

    @Override
    public void drawReact(int x, int y, int width, int height, int color) {

    }

    @Override
    public void drawImage(Image image, int x, int y, int srcX, int srcY, int srcWidth, int srcHeight) {

    }

    @Override
    public void drawImage(Image image, int x, int y) {

    }


    @Override
    public void drawScreen(String text, int x, int y, Paint paint) {

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void drawARGB(int i, int j, int k, int l) {

    }
}
