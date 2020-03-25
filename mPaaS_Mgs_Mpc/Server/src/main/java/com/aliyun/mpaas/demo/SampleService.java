package com.aliyun.mpaas.demo;

import com.alipay.gateway.adapterservice.annotation.OperationType;

public interface SampleService {
    @OperationType(value="op_mPaaS_Mgs_Mpc" ,name="ApiName_mPaaS_Mgs_Mpc",desc = "mpc demo")
    String api1();
}
