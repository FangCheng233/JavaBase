package com.fc.base.thread.threadpool;


import java.util.concurrent.*;

/**
 * @ClassName ThreadPool1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 10:52 上午
 * @Version 1.0
 */
public class ThreadPool1 {
    public static void main(String[] args) {
        // 任务队列长度为Integer.MAX_VALUE 容易oom
        ExecutorService pool1 = Executors.newFixedThreadPool(200);
        // 任务队列长度为Integer.MAX_VALUE 容易oom
        ExecutorService pool3 = Executors.newSingleThreadExecutor();
        // 最大线程数为Integer.MAX_VALUE
        ExecutorService pool2 = Executors.newCachedThreadPool();
        ScheduledExecutorService pool5 = Executors.newScheduledThreadPool(200);

        ExecutorService pool4 = Executors.newWorkStealingPool(200);
//        pool2.submit();
        pool1.isShutdown();
        pool1.shutdown();
        pool1.shutdownNow();
        pool5.schedule(new Runnable(){
            @Override
            public void run(){

            }
        },3,TimeUnit.MILLISECONDS);
        System.out.println(Integer.toBinaryString((-1)<<29));
        // 固定线程池


    }
}