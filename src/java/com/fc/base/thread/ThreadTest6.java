package com.fc.base.thread;

/**
 * @ClassName ThreadTest6
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/19 3:40 下午
 * @Version 1.0
 */
public class ThreadTest6 extends Thread {
    public static void main(String[] args) {
        ThreadTest6 threadTest6 = new ThreadTest6();
        threadTest6.start();
    }

    @Override
    public void run() {
        System.out.println(123);
    }
}
