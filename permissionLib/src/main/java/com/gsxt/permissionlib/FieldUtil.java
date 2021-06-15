package com.gsxt.permissionlib;

import java.lang.reflect.Field;

/**
 * @author zhaopanlong
 * @createtime：2021/6/15 4:04 下午
 */
public class FieldUtil {
    public static void makeAccessible(Field field){
        field.setAccessible(true);
    }
} 