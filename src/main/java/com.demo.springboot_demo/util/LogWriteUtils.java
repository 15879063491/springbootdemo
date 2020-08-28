package com.demo.springboot_demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class LogWriteUtils {
    public static String getJsonStr(Object o) {
        JSONArray.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONArray.toJSONString(o, new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
    }
}
