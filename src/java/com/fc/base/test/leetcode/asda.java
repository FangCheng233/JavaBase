package com.fc.base.test.leetcode;

import java.util.Arrays;

/**
 * @ClassName asda
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/14 3:56 下午
 * @Version 1.0
 */
public class asda {
    public static void main(String[] args) {
        int a = new asda().compareVersion("1.0", "1.0.1");
        System.out.println(a);
    }
    public int compareVersion(String version1, String version2) {
        // 版本号按照 ‘.’ 分割并转为int 数组
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        // 按照版本号长度开始比较
        for(int i=0; i<(v1.length >= v2.length ? v1.length:v2.length); i++){
            // 值相同时继续向后一位比较
            int value1 = i < v1.length? Integer.parseInt(v1[i]) : 0;
            int value2 = i < v2.length? Integer.parseInt(v2[i]) : 0;
            System.out.println("v1 =    " + value1 + ", v2 =    " + value2);
            if(value1 == value2){
                continue;
            } else {
                return value1 > value2 ? 1:-1;
            }
        }
        return 0;
    }
}
