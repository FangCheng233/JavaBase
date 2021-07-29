package com.fc.base.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName ThreadTest2
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 10:54 上午
 * @Version 1.0
 */
public class ThreadTest2 implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        Thread.sleep(2000);
        Thread.currentThread().setName("96533");
        System.out.println(Thread.currentThread().getName() + " is running");
        return Thread.currentThread().getId();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException ,Exception{
        FutureTask<Long> task = new FutureTask<>(new ThreadTest2());
        new Thread(task).start();
        System.out.println("等待完成任务");
        Long result = task.get();
        System.out.println("任务结果:" + result);

    }
}
