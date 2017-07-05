package com.youdu.application;

import android.app.Application;

import com.youdu.core.AdSDKManager;
import com.youdu.share.ShareManager;

import cn.jpush.android.api.JPushInterface;


/**
 * 整个程序的入口、第三方sdk的初始化工作、为整个应用的其他模块提供上下文
 */
public class ImoocApplication extends Application {

    private static ImoocApplication mApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        initShareSDK();
        initJPush();
        initAdSDK();
    }

    public static ImoocApplication getInstance() {
        return mApplication;
    }

    public void initShareSDK() {
        ShareManager.initSDK(this);
    }

    private void initJPush() {
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }

    private void initAdSDK() {
        AdSDKManager.init(this);
    }
}