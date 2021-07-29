package com.fc.base.thread.lock.lockinterface;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/16 3:05 下午
 * @Version 1.0
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    //Lock lock=new ReentrantLock(true);//公平锁 //Lock lock=new ReentrantLock(false);//非公平锁
    private Condition condition=lock.newCondition();//创建 Condition
    public void testMethod() {
        lock.lock();//lock 加锁 //1:wait 方法等待:
        try {
            //System.out.println("开始 wait");
            condition.await();
            //通过创建 Condition 对象来使线程 wait，必须先执行 lock.lock 方法获得锁
            //:2:signal 方法唤醒
            condition.signal();//condition 对象的 signal 方法可以唤醒 wait 线程
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName()+ (" " + (i + 1)));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        new MyService().testMethod();
    }
}
