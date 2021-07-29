package com.fc.base.thread;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;

/**
 * @ClassName ThreadTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 10:53 上午
 * @Version 1.0
 */
public class ThreadTest1 {
    public static volatile HashMap<Integer, String> map = new HashMap<>(16);
    public static void main(String[] args) throws Exception{
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i <10000; i++){ map.put(map.size(),Thread.currentThread().getName()); }
            }
        };
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i <10000; i++){ map.put(map.size(),Thread.currentThread().getName()); }
            }
        });
        Thread thread3 = new Thread(()->{
            for(int i = 0; i <10000; i++){ map.put(map.size(),Thread.currentThread().getName()); }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread3.join(10000L);


        System.out.println(map.size());
    }
}
