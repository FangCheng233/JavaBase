package com.fc.base.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadPool1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 10:52 上午
 * @Version 1.0
 */
public class ThreadPool1 {
    public static void main(String[] args) {
        ExecutorService pool1 = Executors.newFixedThreadPool(200);
        ExecutorService pool2 = Executors.newCachedThreadPool();
        ExecutorService pool3 = Executors.newScheduledThreadPool(200);
        ExecutorService pool4 = Executors.newWorkStealingPool(200);
        ExecutorService pool5 = Executors.newSingleThreadExecutor();
//        ExecutorService pool5 = Executors.newSingleThreadScheduledExecutor();
//        ExecutorService pool5 = Executors.unconfigurableExecutorService();
//        ExecutorService pool5 = Executors.privilegedCallableUsingCurrentClassLoader();

    }
}
