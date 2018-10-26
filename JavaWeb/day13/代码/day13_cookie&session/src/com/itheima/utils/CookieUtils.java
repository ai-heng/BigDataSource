package com.itheima.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {
    /**
     * 根据指定的Cookie名, 从指定的Cookie数组中获取参数.
     * @param cookies  要操作的Cookie数组
     * @param name     要查询的指定的Cookie名.
     * @return         查询后的结果.
     */
    public static Cookie getCookieByName(Cookie[] cookies, String name) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName()))
                    return cookie;
            }
        }
        return null;
    }
}
