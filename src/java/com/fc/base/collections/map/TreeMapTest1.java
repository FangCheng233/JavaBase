package com.fc.base.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TreeMapTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/21 2:15 下午
 * @Version 1.0
 */
public class TreeMapTest1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
//        map.put("a", 7);
//        map.put("d", 4);
//        map.put("b", 6);
//        map.put("e", 3);
//        map.put("g", 1);
//        map.put("c", 5);
//        map.put("f", 2);
        Integer aname = 1;
        {
            Integer bname = 8;
            Integer bnamef = aname;
        }

        Integer ccc = aname;
//        Integer a = map.putIfAbsent("gg",2);
//        System.out.println("aaa" + a);
        Map map1 = new TreeMap(map);
//        Iterator iterator = map1.keySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
