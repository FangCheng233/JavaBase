package com.fc.base.test;

/**
 * @ClassName StringTest2
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/6/29 2:52 下午
 * @Version 1.0
 */
public class StringTest2 {
    public static void main(String[] args) {
        String haystack = "akjdakjdajkbjasgasd";
        String needle = "jda";
        strStr(haystack, needle);
    }
    public static int strStr(String haystack, String needle) {
        if("".equals(needle) || "".equals(haystack)){
            return 0;
        }
        int start = haystack.indexOf(needle, 0);
        System.out.println(start);
        return 0;
    }
}
