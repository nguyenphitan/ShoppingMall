package com.nguyenphitan.utils;

/**
 * StringUtils
 */
public class StringUtils {

    /**
     * Check empty String
     *
     * @param value
     * @return
     */
    public static boolean isEmptyOrBlank(String value) {
        if (value == null || "".equals(value.trim())) {
            return true;
        }
        return false;
    }

}
