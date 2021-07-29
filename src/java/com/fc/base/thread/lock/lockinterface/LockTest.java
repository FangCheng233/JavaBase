package com.fc.base.thread.lock.lockinterface;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName LockTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/11 4:56 下午
 * @Version 1.0
 */
public class LockTest {
    private static final ReentrantLock lock = new ReentrantLock();
    private static Integer value = 0;
    private static final int num = 10000;
    public static void main(String[] args) throws InterruptedException{
            new LockTest().test1();
    }
    public void test1() {
        for (int i = 0; i < num; i++) {


            lock.lock();
            try {
                new MyLockThread().start();
            }finally {
                lock.unlock();
            }
        }
        System.out.println(num + "次自增结果为：" + value);
    }

    public void test2() {
        for (int i = 0; i < num; i++) {
            lock.tryLock();
            try {
                new MyLockThread().start();
            }finally {
                lock.unlock();
            }
        }
        System.out.println(num + "次自增结果为：" + value);
    }
    public void test3() {
        for (int i = 0; i < num; i++) {
            lock.tryLock();
            try {

                new MyLockThread().start();
            }finally {
                lock.unlock();
            }


        }
        System.out.println(num + "次自增结果为：" + value);
    }
    class MyLockThread extends Thread {
        @Override
        public void run() {
            value++;
            System.out.println(lock.getHoldCount());
        }
    }
}
