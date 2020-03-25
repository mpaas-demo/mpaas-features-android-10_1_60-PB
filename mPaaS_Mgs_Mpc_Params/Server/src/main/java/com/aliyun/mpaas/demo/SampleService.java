package com.aliyun.mpaas.demo;

import com.alipay.gateway.adapterservice.annotation.OperationType;

public interface SampleService {
    @OperationType(value="op_mPaaS_Mgs_Mpc_Params" ,name="ApiName_mPaaS_Mgs_Mpc",desc = "mpc demo")
    String api1(String str1);
}
