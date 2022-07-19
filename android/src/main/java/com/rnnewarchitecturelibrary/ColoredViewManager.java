package com.rnnewarchitecturelibrary;

import androidx.annotation.Nullable;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.bridge.ReactApplicationContext;
import android.graphics.Color;
import java.util.Map;
import java.util.HashMap;

public class ColoredViewManager extends SimpleViewManager<ColoredView> {

    public static final String NAME = "ColoredView";
    ReactApplicationContext mCallerContext;

    public ColoredViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public ColoredView createViewInstance(ThemedReactContext context) {
        return new ColoredView(context);
    }

    @ReactProp(name = "color")
    public void setColor(ColoredView view, String color) {
        view.setBackgroundColor(Color.parseColor(color));
    }

}