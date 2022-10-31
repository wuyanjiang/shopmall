package com.yanjiang.admin.common.utils;

/**
 * Redis所有Keys
 *
 * @author yj wuyanjiang321@163.com
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
