package com.fc.base.thread.lock.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName SynchronizedTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/19 8:46 下午
 * @Version 1.0
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        final Object lock = new Object();
        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread A is waiting to get lock");
                synchronized (lock) {
                    try {
                        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
                        System.out.println("thread A get lock");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("thread A do wait method");
                        lock.wait();
                        System.out.println("wait end");
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread AA is waiting to get lock");
                synchronized (lock) {
                    try {
                        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
                        System.out.println(lock.hashCode());
                        System.out.println("thread AA get lock");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("thread AA do wait method");
                        lock.wait();
                        System.out.println("wait end");
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread AAA is waiting to get lock");
                synchronized (lock) {
                    try {
                        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
                        System.out.println("thread AAA get lock");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("thread AAA do wait method");
                        lock.wait();
                        System.out.println("wait end");
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread B is waiting to get lock");
                synchronized (lock) {
                    System.out.println("thread B get lock");
                    try {
                        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
                        lock.notify();
                        lock.notify();
                        lock.notify();
                        lock.notify();
                        lock.notify();
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    System.out.println("thread B do notify method");
                }
            }
        }).start();
    }
}
