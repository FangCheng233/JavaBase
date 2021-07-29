package com.fc.base.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ThreadTest8
 * @Description TODO 实现线程的交替执行
 * @Author fangcheng
 * @Date 2020/11/26 9:18 上午
 * @Version 1.0
 */
public class ThreadTest8 {
    static Thread t1,t2;
    // 加synchronized 锁的方式
    static Object lock = new Object();
    // lock接口的方式
    static Lock l = new ReentrantLock();
    static Condition conditionT1 = l.newCondition();
    static Condition conditionT2 = l.newCondition();
    static char[] c1 = "123456".toCharArray();
    static char[] c2 = "ABCDEF".toCharArray();
    static char[] c3 = "ABCDEF".toCharArray();
    static char[] c4 = "ABCDEF".toCharArray();
    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
    }
    public static void method1(){
        t1 = new Thread(()->{
            for (char c: c1) {
                System.out.println(c);
                // 阻塞
                LockSupport.unpark(t2);
                LockSupport.park(t1);
            }
        });
        t2 = new Thread(()->{
            for (char c: c2) {
                LockSupport.unpark(t1);
                System.out.println(c);
                LockSupport.park(t2);
            }
        });
        t2.start();
        t1.start();
    }
    public static void method2() {
        t1 = new Thread(()->{
            synchronized (lock){
                try {
                    for (char c: c1) {
                        System.out.println(c);
                        // 阻塞
                        lock.notify();
                        lock.wait();
                    }
                }catch (InterruptedException e){

                }
                lock.notify();
            }
        });
        t2 = new Thread(()->{
            synchronized (lock){
                try {
                    for (char c: c2) {
                        System.out.println(c);
                        // 阻塞
                        lock.notify();
                        lock.wait();
                    }
                }catch (InterruptedException e){

                }
                lock.notify();
            }
        });
        t1.start();
        t2.start();
    }
    public static void method3(){
        t1 = new Thread(()->{
            l.lock();
            try {
                for (char c: c1){
                    System.out.println(c);
                    conditionT2.signal();
                    conditionT1.await();
                }
                conditionT2.signal();
            }catch (InterruptedException e){

            }finally {
                l.unlock();
            }

        });
        t2 = new Thread(()->{
            l.lock();
            try {
                for (char c: c2){
                    System.out.println(c);
                    conditionT1.signal();
                    conditionT2.await();
                }
                conditionT2.signal();
            }catch (InterruptedException e){

            }finally {
                l.unlock();
            }

        });
        t1.start();
        t2.start();
    }
    public static void method4(){
        t1 = new Thread(()->{

        });
        t2 = new Thread(()->{

        });
    }
}
