package com.fc.base.thread;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @ClassName ThreadTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 10:53 上午
 * @Version 1.0
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println("当前线程的名称：" + Thread.currentThread().getName());
            }
        };
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("当前线程的名称：" + Thread.currentThread().getName());
            }
        });
        Thread thread3 = new Thread(()-> System.out.println("当前线程的名称：" + Thread.currentThread().getName()));
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
