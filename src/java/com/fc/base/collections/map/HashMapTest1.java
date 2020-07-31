package com.fc.base.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @ClassName HashMapTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 6:19 下午
 * @Version 1.0
 */
public class HashMapTest1 {
    public static void main(String[] args) {
        Map map = new HashMap<>(16);
        map.put("test", "test");
        map.put("test", "test1");
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r); // [1]
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
