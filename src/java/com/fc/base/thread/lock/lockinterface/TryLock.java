package com.fc.base.thread.lock.lockinterface;

/**
 * @ClassName TryLock
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/3/2 10:18 上午
 * @Version 1.0
 */

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jc
 *
 */
public class TryLock {
    // 实例化Lock对象
    Lock lock = new ReentrantLock();

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        // 实例化本类对象，目的是调用runThread方法
        TryLock tl = new TryLock();
        // 匿名对象创建线程1，并重写run方法，启动线程
        Thread t0 = new Thread() {
            public void run() {

                tl.runThread(Thread.currentThread());
            }
        };
        // 匿名对象创建线程2，并重写run方法，启动线程
        Thread t1 = new Thread() {
            public void run() {

                tl.runThread(Thread.currentThread());
            }
        };
        System.out.println("请输入等待时间：");
        int time = in.nextInt();
        long timeL = time*1000;
        // 运行t0线程
        t0.start();
        // 等待1秒
        Thread.sleep(1000);
        // 运行t1
        t1.start();
        // 等待线程获锁时间
        Thread.sleep(timeL);
        // t1获取锁失败，中断t1
        t1.interrupt();

    }

    // 线程共同调用方法
    public void runThread(Thread t) {
        System.out.println("线程" + t.getName() + "尝试获取锁");
        // 尝试获取锁，被中断会进入中断异常处理块中
        // 这货没有时间限制的尝试获取锁，和synchronized一样，但是，这货能相应中断，这是synchronized没有的优点，这使得程序在另外的线程没有释放锁时能自定义退出程序。
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e1) {
            System.out.println("线程"+t.getName()+"被中断");
            return;
        }
        try {
            System.out.println(t.getName() + "获取锁成功");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.print(t.getName() + "输出：");
                System.out.println(i + "\t");
            }
        } catch (InterruptedException e) {
            System.out.println("线程"+t.getName()+"被中断");
            return;
        } finally {
            lock.unlock();
            System.out.println("线程" + t.getName() + "释放了锁");
        }

    }
}
/**
 * output
 * 请输入等待时间：
 * 2
 * 线程Thread-0尝试获取锁
 * Thread-0获取锁成功
 * 线程Thread-1尝试获取锁
 * Thread-0输出：0
 * Thread-0输出：1
 * 线程Thread-1被中断
 * Thread-0输出：2
 * Thread-0输出：3
 * Thread-0输出：4
 * 线程Thread-0释放了锁
 */


