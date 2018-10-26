package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kimdong on 2018/10/12.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
