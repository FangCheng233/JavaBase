package com.fc.base.thread.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadLocalExample
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/3 6:44 上午
 * @Version 1.0
 */
public class ThreadLocalExample {
    private static ThreadLocal<Integer> local = new ThreadLocal<>();

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.execute(() -> {
                int key = (int) (Math.random() * 10);
                local.set(key);
                System.out.println(Thread.currentThread().getName() + ":" + key);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {}
                System.out.println(Thread.currentThread().getName() + ":" + local.get());
            });
        }
    }
}
