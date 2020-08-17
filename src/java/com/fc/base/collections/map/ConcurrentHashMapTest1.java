package com.fc.base.collections.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ConcurrentHashMapTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/10 6:25 上午
 * @Version 1.0
 */
public class ConcurrentHashMapTest1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>(1);
        ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<>(1,0.88f);
        map.put("adas", "");

    }
}
