package com.aliyun.mpaas.demo.android60.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alipay.mobile.framework.service.common.RpcService;
import com.aliyun.mpaas.demo.android60.launcher.model.User;
import com.aliyun.mpaas.demo.android60.launcher.request.PathMpaasMgsHttpPostEncryptrequestbodyRsaPostReq;
import com.mpaas.framework.adapter.api.MPFramework;

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
        new Thread(new Runnable() {
            @Override
            public void run() {
                User user = new User();
                user.name="ZhangSan";
                user.age = 17;
                RpcService rpcService = MPFramework.getExternalService(RpcService.class.getName());
                Demo_BackendServerClient client = rpcService.getRpcProxy(Demo_BackendServerClient.class);
                PathMpaasMgsHttpPostEncryptrequestbodyRsaPostReq req = new PathMpaasMgsHttpPostEncryptrequestbodyRsaPostReq();
                req._requestBody = user;
                String result = client.pathMpaasMgsHttpPostEncryptrequestbodyRsaPost(req);
                Util.log(MainActivity.this,tvLog,result);
            }
        }).start();
    }
}
