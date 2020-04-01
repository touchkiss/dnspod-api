package com.touchkiss.dnspod.utils;

import com.google.gson.Gson;

/**
 * Created on 2020/03/18 17:27
 *
 * @author Touchkiss
 */
public class GsonUtil {
    private final static Gson GSON = new Gson();

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return GSON.fromJson(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }
}
