package com.david.jumper.elements;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.david.jumper.graphic.Colors;

/**
 * Created by david on 08/06/2017.
 */

public class Bird {

    private static final float X = 100;
    private static final float radius = 100;
    private static final Paint RED = Colors.getBirdColor();
    private float height;

    public Bird() {
        this.height = 100;
    }

    public void drawIn(Canvas canvas) {
        canvas.drawCircle(X, height, radius, RED);
    }

    public void fall() {
        this.height += 5;
    }

}
