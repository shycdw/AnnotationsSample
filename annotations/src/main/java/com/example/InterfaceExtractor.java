package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 接口提取注解
 * Created by DavidChen on 2017/7/20.
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface InterfaceExtractor {
    String value();
}
