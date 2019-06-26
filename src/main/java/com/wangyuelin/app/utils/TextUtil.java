package com.wangyuelin.app.utils;

/**
 * 描述:
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午4:04
 */
public class TextUtil {

    public static boolean isEmpty(CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }

}