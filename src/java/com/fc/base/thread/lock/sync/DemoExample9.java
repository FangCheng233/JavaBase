package com.fc.base.thread.lock.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * @ClassName DemoExample9
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/30 12:11 下午
 * @Version 1.0
 */
public class DemoExample9 {
    public static void main(String[] args) throws Exception {
        TestDemo testDemo = new TestDemo();

        //子线程
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (testDemo){
                    System.out.println("t1 lock ing");
                    System.out.println(ClassLayout.parseInstance(testDemo).toPrintable());
                }
            }
        };
        t1.start();


        //主线程
        synchronized (testDemo){
            System.out.println("main lock ing");
            System.out.println(ClassLayout.parseInstance(testDemo).toPrintable());
        }

    }
}
