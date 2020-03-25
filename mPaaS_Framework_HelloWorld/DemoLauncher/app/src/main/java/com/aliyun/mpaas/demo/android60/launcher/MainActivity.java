package com.aliyun.mpaas.demo.android60.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.aliyun.mpaas.demo.android60.launcher.R.layout.main);
        tvLog = findViewById(R.id.tvLog);
    }

    public void button1Clicked(View view)
    {
        Util.log(this,tvLog,"Hello mPaaS 10.1.60");
    }
}
