package com.sunxu.kotlin;

import org.springframework.util.StringUtils;

/**
 * @Author 孙许
 * @Date 2019/12/01 14:09
 * @Description
 */
public class A {
    public static String format(String string) {
        return StringUtils.isEmpty(string) ? null : string;
    }
}
