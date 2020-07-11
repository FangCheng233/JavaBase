package com.fc.base.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 6:19 下午
 * @Version 1.0
 */
public class HashMapTest1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(16);
        for(int i = 0; i < 100000000; i++){
            map.put("key" + i, "value" + i);
        }
        System.out.println(map.size());
        map.put("test", "test");
    }
}
