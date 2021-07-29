package com.fc.base.thread.lock.lockinterface;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName RerntrantLockTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/19 8:46 下午
 * @Version 1.0
 */
public class RerntrantLockTest {
    static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            try {
                lock.lockInterruptibly();
                try {
                    while (true){
                        System.out.println(1);
                    }
                }catch (Exception e){
                    System.out.println("sssss" +e.getMessage());
                }finally {
                    lock.unlock();
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        });
        t.start();
        new Thread(()->{
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            t.interrupt();
        }).start();

    }
}
