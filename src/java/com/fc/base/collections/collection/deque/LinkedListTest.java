package com.fc.base.collections.collection.deque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName LinkedListTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/9 11:13 下午
 * @Version 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(null);
            linkedList.add("我是第" + i + "个元素");
            linkedList.addFirst("我是第" + i + "个元素");
            linkedList.addLast("我是第" + i + "个元素");
        }

        System.out.println(linkedList.peek());
        System.out.println(linkedList);

    }
}
