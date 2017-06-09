package com.david.jumper.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.david.jumper.elements.Bird;

/**
 * Created by david on 08/06/2017.
 */

public class Game extends SurfaceView implements Runnable{

    private boolean isRunning = true;
    private SurfaceHolder holder = getHolder();
    private Bird bird;

    public Game(Context context) {
        super(context);

        initializeElements();
    }

    private void initializeElements() {
        bird = new Bird();
    }

    @Override
    public void run() {
        while(isRunning) {
            if(!holder.getSurface().isValid()) continue;
            Canvas canvas = holder.lockCanvas();

            bird.drawIn(canvas);
            bird.fall();

            holder.unlockCanvasAndPost(canvas);
        }
    }

    public void start() {
        isRunning = true;
    }

    public void pause() {
        isRunning = false;
    }
}
