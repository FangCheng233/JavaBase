package com.fc.base.thread;

/**
 * @ClassName CyclicBarrierDemo
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/3/3 10:11 上午
 * @Version 1.0
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {
    //定义商品总数
    static int HWMate30 = 10000;

    //定义需要等待的线程数（并发量），以及线程等待完成后执行的方法
    static CyclicBarrier barrier = new CyclicBarrier(2000,new Runnable() {

        @Override
        public void run() {
            System.out.println("2000人准备完毕，开始抢购>>>>>>>>>>>>>>>>");
            System.out.println(HWMate30);
        }
    });


    // 使用同步方法，保证线程安全
    public static synchronized void buy() {
        System.out.println(Thread.currentThread().getName()+"开始抢购...");
        //模拟抢购的数量，1~10台
        int i  = (int)(Math.random() * 9) + 1;
        if(HWMate30 >= i) {
            HWMate30 -= i;
            System.out.println(Thread.currentThread().getName()+":抢购成功"+i+"台，华为mate30还剩"+HWMate30+"台!");
        }else if (HWMate30 > 0 && HWMate30 < i) {
            System.out.println(Thread.currentThread().getName()+":华为mate30还剩"+HWMate30+"台,不够"+i+"台，请重新选择数量!");
        }else {
            System.out.println(Thread.currentThread().getName()+":华为mate30已卖完！");
        }
    }

    public static void main(String[] args) {
        //定义固定大小的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(6000);
        for(int i = 0;i < 6000;i++) {
            //启动线程
            executorService.submit(new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

//                        System.out.println(Thread.currentThread().getName()+":准备好了！");
                        //等待线程数量达到指定的数量才放行
                        barrier.await();
                    } catch (InterruptedException | BrokenBarrierException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    //调用抢购的方法
                    buy();
                }
            }));
        }
        //关闭线程池
        executorService.shutdown();
    }
}



