package com.fc.base.collections.map;

import java.util.WeakHashMap;

/**
 * @ClassName CacheMap
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/2 2:11 下午
 * @Version 1.0
 */
public class CacheMap {
    public static void main(String[] args) {
        WeakHashMap<String, CacheMap> weakHashMap = new WeakHashMap();
        int i = 0;
        while (true){
            weakHashMap.put(String.valueOf(i++) ,new CacheMap());
        }
    }
}
