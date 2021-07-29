package com.fc.base.collections.map;

import java.util.Collections;
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
        map.put(null, "test");
        System.out.println(map.putIfAbsent("test",new Object()));
        map.put("test", "test1");
        Random rand = new Random(47);
//        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
//            int r = rand.nextInt(20);
//            Integer freq = m.get(r); // [1]
//            map.put(r, freq == null ? 1 : freq + 1);
            map.put("value" +i,"value");
        }
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
//            int r = rand.nextInt(20);
//            Integer freq = m.get(r); // [1]
//            map.put(r, freq == null ? 1 : freq + 1);
            map.remove("value" +i,"value");
        }
        System.out.println(map.size());
        System.out.println(map.get(null));

        map = Collections.synchronizedMap(map);
//        map.put("","");
        System.out.println(map.putIfAbsent("test",new Object()));
        System.out.println(map.put("1","1"));
        map.remove("");
//        map.va

    }
}
