package com.example.davidchen.annotationsample;

import com.example.InterfaceExtractor;

/**
 * 测试注解
 * Created by DavidChen on 2017/7/20.
 */

@InterfaceExtractor("ITest")
public class Test {

    public Test(String s1) {

    }

    public String hello(String s2) {
        return s2;
    }

    public void say() {

    }

    public int says(int s3, float a) {
        return (int) (s3 + a);
    }

    public static String s1() {
        return null;
    }

    private String s2() {
        return null;
    }

}
