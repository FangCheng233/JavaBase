package com.fc.base.collections.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName MyArrayListTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/16 4:13 下午
 * @Version 1.0
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("" + i);
            if (i%4 == 0) {
                list.add(null);
            }
        }
        List<String> list1 = list.stream()
                .parallel()
                .filter(item -> item != null && "4" != item)
                .map(item -> item + item)
                .collect(Collectors.toList());
        System.out.println(list1);

        String string = "";

    }
}
