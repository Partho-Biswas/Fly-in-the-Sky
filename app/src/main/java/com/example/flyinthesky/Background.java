package com.example.flyinthesky;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {
    int x = 0, y = 0;
    Bitmap background;
    Background (int scteenX, int screenY, Resources res) {
        background = BitmapFactory.decodeResource(res, R.drawable.bg2);
        background = Bitmap.createScaledBitmap(background, scteenX, screenY, false);
    }
}
