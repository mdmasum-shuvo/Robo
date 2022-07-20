package com.masum.robo.framework.game_interface;

import java.util.List;

public interface Input {
    public static class TouchEvent{
        static final int TOUCH_DOWN=0;
        static final int TOUCH_UP=1;
        static final int TOUCH_DRAGGED=2;
        static final int TOUCH_HOLD=3;

        int type,x,y,pointer;
    }

    boolean isTouchDown(int pointer);
    int getTouchX(int pointer);
    int getTouchY(int pointer);
    List<TouchEvent> getTouchEvent();

}
