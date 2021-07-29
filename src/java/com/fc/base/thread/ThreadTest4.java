package com.fc.base.thread;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ThreadTest3
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/16 2:31 下午
 * @Version 1.0
 */
public class ThreadTest4 {
    private static String value = "";
    static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i = 0; i<10; i++){
                    incr();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void  run() {
                for(int i = 0; i<100; i++){
                    incr();
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void  run() {
                for(int i = 0; i<10; i++){
                    incr();
                }
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void  run() {
                for(int i = 0; i<10; i++){
                    incr();
                }
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void  run() {
                for(int i = 0; i<10; i++){
                    incr();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        System.out.println("value = " + value);
    }
    private static synchronized void incr(){
        String value1 = value;
        value1 = "1";
        System.out.println(Thread.currentThread().getName());
    }
    private static synchronized void incr2(){
        String value2 = value;
        value2 = "1";
        System.out.println(Thread.currentThread().getName());
    }
    private static synchronized void incr3(){
        String value3 = value;
        value3 = "1";
        System.out.println(Thread.currentThread().getName());
    }
    private static synchronized void incr4(){
        String value4 = value;
        value4 = "1";
        System.out.println(Thread.currentThread().getName());
    }
}
