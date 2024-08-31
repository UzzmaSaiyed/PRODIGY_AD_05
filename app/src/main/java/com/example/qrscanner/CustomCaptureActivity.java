package com.example.qrscanner;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.journeyapps.barcodescanner.CaptureActivity;

public class CustomCaptureActivity extends CaptureActivity {

    public int getDesiredOrientation(Context context) {
        return ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
    }
}