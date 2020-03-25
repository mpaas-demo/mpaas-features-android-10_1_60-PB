package com.aliyun.mpaas.demo.android60.launcher;

import com.alipay.mobile.framework.service.ext.annotation.CheckLogin;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;


public interface SampleService {
    @SignCheck
    @OperationType("op_mPaaS_Mgs_Mpc")
    public String api1();
}