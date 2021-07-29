package com.fc.base.thread.lock;

/**
 * @ClassName AlternateDemo
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/29 12:07 下午
 * @Version 1.0
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AlternateDemo {
    //标志当前由哪一个线程输出，1代表A，2代表B，3代表C
    private static int number = 1;

    private static final Lock lock = new ReentrantLock();

    //Condition的强大之处在于它可以为多个线程间建立不同的Condition
    private static final Condition condition1 = lock.newCondition();
    private static final Condition condition2 = lock.newCondition();
    private static final Condition condition3 = lock.newCondition();
    private static final Object object1 = new Object();
    private static final Object object2 = new Object();
    private static final Object object3 = new Object();
    // loopNum:当前循环轮数
    public void loopA(int loopNum) {
        //上锁
        lock.lock();
        try {
            while (number != 1) {
                //等待
                condition1.await();
                System.out.println(1);
            }

            System.out.println(Thread.currentThread().getName() + ", currentLoopNum is " + loopNum);
            number = 2;
            //唤醒
            condition2.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //确保释放锁
            lock.unlock();
        }
    }

    public void loopB(int loopNum) {
        lock.lock();
        try {
            while (number != 2) {
                condition2.await();
            }

            System.out.println(Thread.currentThread().getName() + ", currentLoopNum is " + loopNum);
            number = 3;
            condition3.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void loopC(int loopNum) {
        lock.lock();
        try {
            while (number != 3) {
                condition3.await();
            }

            System.out.println(Thread.currentThread().getName() + ", currentLoopNum is " + loopNum);
            number = 1;
            condition1.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


