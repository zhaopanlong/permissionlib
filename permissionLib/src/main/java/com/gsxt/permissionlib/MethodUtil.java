package com.gsxt.permissionlib;

import java.lang.reflect.Method;

/**
 * @author zhaopanlong
 * @createtime：2021/6/15 4:04 下午
 */
public class MethodUtil {
    public static void makeAccessible(Method method){
        method.setAccessible(true);
    }
} 