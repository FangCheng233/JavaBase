package com.fc.base.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName CountDownLatchTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/5 10:27 下午
 * @Version 1.0
 */
public class CountDownLatchTest {
    CountDownLatch countDownLatch = new CountDownLatch(1);
    CountDownLatch countDownLatch2 = new CountDownLatch(5);
    public static void main(String[] args) throws InterruptedException{
        CountDownLatchTest count = new CountDownLatchTest();
//        count.first();
        count.second();
    }
    public void first() throws InterruptedException {
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (Exception e){

            }
            countDownLatch.countDown();
            System.out.println(System.currentTimeMillis() + "   " + 123);
        }).start();
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(5);
            }catch (Exception e){

            }
            countDownLatch.countDown();
            System.out.println(System.currentTimeMillis() + "   " + 456);
        }).start();
        countDownLatch.await();

    }
    public void second() throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(50);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        for(int i = 0; i< 50;i++){
            new Thread( new MyRunnable(countDownLatch,countDownLatch2)).start();
        }
        countDownLatch.await();
        countDownLatch2.countDown();
    }
    class MyRunnable implements Runnable{
        // a等待
        private CountDownLatch a;
        // b计数
        private CountDownLatch b;

        public MyRunnable(CountDownLatch a, CountDownLatch b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run(){
            try {
                a.countDown();
                b.await();
                // do something
                System.out.println("线程：" + Thread.currentThread().getName() + "开始" + " " + System.currentTimeMillis());
            }catch (Exception e){

            }
        }
    }
}
