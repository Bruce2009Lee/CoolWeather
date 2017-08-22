package com.app.coolweather.util;

/**
 * Created by Administrator on 2017/8/22.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
