package com.thefinestartist.helpers;

import android.util.TypedValue;

/**
 * Created by TheFinestArtist on 1/25/16.
 */
public class TypedValueHelper {

    public static int complexToDimensionPixelSize(int data) {
        return TypedValue.complexToDimensionPixelSize(data, Base.getContext().getResources().getDisplayMetrics());
    }
}
