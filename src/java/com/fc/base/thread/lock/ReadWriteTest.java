package com.fc.base.thread.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName ReadWriteTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/20 12:37 下午
 * @Version 1.0
 */
public class ReadWriteTest {
    private static String test = "123";
    public static void main(String[] args) {
        test = "456";
        String value = test + "789";
    }
}
