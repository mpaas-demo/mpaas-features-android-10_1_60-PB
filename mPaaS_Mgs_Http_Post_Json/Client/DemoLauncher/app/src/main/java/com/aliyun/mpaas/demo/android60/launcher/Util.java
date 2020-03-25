package com.aliyun.mpaas.demo.android60.launcher;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;

public class Util {
    public static void log(Activity activity, final TextView tvLog, final String strLog)
    {
        Log.e("mPaaSDemoLog",strLog);
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvLog.append(strLog+ "\n");
            }
        });
    }

}
