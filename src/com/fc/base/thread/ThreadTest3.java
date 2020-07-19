package com.fc.base.thread;

/**
 * @ClassName ThreadTest3
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/16 11:14 上午
 * @Version 1.0
 */
public class ThreadTest3 {
    static int x = 0, y = 0;
    static int a = 0, b = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                a = 1;
                x = b;
            }
        });

        Thread other = new Thread(new Runnable() {
            @Override
            public void run() {
                b = 1;
                y = a;
            }
        });
        one.start();other.start();
        one.join();other.join();
        System.out.println("(x=" + x + ",y=" + y + ")");
    }
}
