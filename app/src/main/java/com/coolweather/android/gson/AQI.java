package com.coolweather.android.gson;

/**
 * Created by kimdong on 2018/10/12.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
