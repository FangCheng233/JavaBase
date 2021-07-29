package com.fc.base.thread.lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName AtomicIntegerTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/19 8:47 下午
 * @Version 1.0
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int value = atomicInteger.getAndIncrement();
    }
}
