package com.fc.base.collections.collection.set;

import java.util.HashSet;

/**
 * @ClassName HashSetTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/21 3:41 下午
 * @Version 1.0
 */
public class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);
    }
}
