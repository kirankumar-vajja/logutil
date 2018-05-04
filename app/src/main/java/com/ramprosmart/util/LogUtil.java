package com.ramprosmart.util;

import android.util.Log;

public class LogUtil
{
    private static String TAG = "SUPER_AWESOME_APP";

    public static void d(String msg) {
        Log.d(TAG, msg);
    }
}
