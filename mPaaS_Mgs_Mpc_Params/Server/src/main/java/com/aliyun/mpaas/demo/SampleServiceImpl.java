package com.aliyun.mpaas.demo;

/**
 * Created by bianzheng.bz on 2018/6/7.
 */
public class SampleServiceImpl implements SampleService {
    public String api1(String str1) {
        return "Hello "+str1;
    }

}
