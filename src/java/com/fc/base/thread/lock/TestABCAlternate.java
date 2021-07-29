package com.fc.base.thread.lock;

/**
 * @ClassName TestABCAlternate
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/29 12:08 下午
 * @Version 1.0
 */
public class TestABCAlternate {

    public static void main(String[] args) {
        AlternateDemo ad = new AlternateDemo();
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    ad.loopA(i);
            }
        }, "A").start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    ad.loopB(i);
            }
        }, "B").start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    ad.loopC(i);
            }
        }, "C").start();
    }
}
