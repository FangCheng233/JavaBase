package com.fc.base.test;

/**
 * @ClassName SynDemo
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/19 6:53 下午
 * @Version 1.0
 */
public class SynDemo {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (SynDemo.class) {
                    System.out.println("真的有所谓的类锁？");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    answer();
                }
            }
        }).start();

        Thread.sleep(500);
//        answer();
    }

    synchronized static void answer () {
        System.out.println("答案清楚了吗");
        synchronized (SynDemo.class){
            answer();
        };
    }
}
