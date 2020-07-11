package com.fc.base.test;

import java.util.Arrays;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/6/27 10:00 下午
 * @Version 1.0
 */
public class StringTest1 {
    public static void main(String[] args) {
        String[] strs = {};
        Arrays.sort(strs);
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder pubstr = new StringBuilder();
        if(strs == null || strs.length == 0){
            return "";
        }
        int length = strs[0].length();
        for (int i = 0; i < length; i ++){
            char flag = strs[0].charAt(i);
            for(String str: strs){
                if(flag == str.charAt(i)){
                    continue;
                }else {
                    return pubstr.toString();
                }
            }
            pubstr.append(flag);
        }
        return pubstr.toString();
    }
}
