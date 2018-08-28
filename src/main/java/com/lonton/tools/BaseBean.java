package com.lonton.tools;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 重写toString方法，打印所有属性值
 */
public class BaseBean {

    /**
     * 重写toString方法，打印所有属性值
     *
     * @return
     */
    /**
     * 利用fastJson框架
     *
     * @return
     */

    public String toString() {
        return JSON.toJSONString(this, new SerializerFeature[]{SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullNumberAsZero, SerializerFeature.WriteNullBooleanAsFalse,
                SerializerFeature.UseISO8601DateFormat});
    }
}
