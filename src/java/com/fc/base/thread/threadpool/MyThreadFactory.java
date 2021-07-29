package com.fc.base.thread.threadpool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyThreadFactory
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/16 11:04 上午
 * @Version 1.0
 */
public class MyThreadFactory implements ThreadFactory {
    private final AtomicInteger threadNumber = new AtomicInteger(0);
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("MyThreadFactory-pool-thread" + threadNumber.getAndIncrement());
        t.setDaemon(false);
        return t;
    }
}
