package com.fc.base.thread.threadpool;

import java.util.concurrent.*;

/**
 * @ClassName FixedThreadPoolTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/12 3:23 下午
 * @Version 1.0
 */
public class FixedThreadPoolTest {
    public static void main(String[] args) {
        int corePoolSize = 1;
        int maximumPoolSize = 1;
        Long keepAliveTime = 0L;
        TimeUnit unit = TimeUnit.SECONDS;
        // 队列的最大长度Integer.MAX_VALUE
        // 阻塞队列 单个线程
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        // 动态线程池
        SynchronousQueue<Runnable> CachedworkQueue = new SynchronousQueue<Runnable>();
        //
        // 有界队列
        BlockingQueue<Runnable> delworkQueue = new ArrayBlockingQueue<>(200);


        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        // 直接抛出异常-默认
        RejectedExecutionHandler handler1 = new ThreadPoolExecutor.AbortPolicy();
        // 直接在调用线程中执行该任务。
        RejectedExecutionHandler handler2 = new ThreadPoolExecutor.CallerRunsPolicy();
        // 丢弃最老的未被执行的任务，并重复入队操作
        RejectedExecutionHandler handler3 = new ThreadPoolExecutor.DiscardOldestPolicy();
        // 直接将该任务丢弃
        RejectedExecutionHandler handler4 = new ThreadPoolExecutor.DiscardPolicy();
        // 固定线程数
        ThreadPoolExecutor pool1 = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,threadFactory, handler1);
        // 动态线程池
        ThreadPoolExecutor pool2 = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, CachedworkQueue,threadFactory, handler1);
        // 单个线程
        ThreadPoolExecutor pool3 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(),threadFactory, handler1);
        // 定时线程
        ThreadPoolExecutor pool4 = new ThreadPoolExecutor(corePoolSize, 0, keepAliveTime, unit, workQueue,threadFactory, handler1){
            @Override
            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("开始执行了");
            }
        };

        pool4.execute(()->{
            System.out.println("线程");
        });

        System.out.println(pool4.getActiveCount());
        System.out.println(pool4.getActiveCount());
        System.out.println(pool4.getActiveCount());
        System.out.println(pool4.getActiveCount());
        pool4.shutdown();
    }
}
