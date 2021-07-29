package com.fc.base.collections.collection.queue;

import java.util.concurrent.SynchronousQueue;

/**
 * @ClassName SynchronousQueueTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/17 1:38 下午
 * @Version 1.0
 */
public class SynchronousQueueTest {
    public static SynchronousQueue synchronousQueue = new SynchronousQueue();
    public static void main(String[] args) {
        test();

    }
    public static void test(){
        new Thread(()->{
            try {
                synchronousQueue.take();

            }catch (InterruptedException e) {

            }
        }).start();
        new Thread(()->{
            try {
                synchronousQueue.take();

            }catch (InterruptedException e) {

            }
        }).start();
        new Thread(()->{
            try {
                synchronousQueue.take();

            }catch (InterruptedException e) {

            }
        }).start();
        new Thread(()->{
            try {

                synchronousQueue.put(new Object());
                synchronousQueue.put(new Object());
                synchronousQueue.put(new Object());

            }catch (InterruptedException e) {

            }
        }).start();
    }
}
