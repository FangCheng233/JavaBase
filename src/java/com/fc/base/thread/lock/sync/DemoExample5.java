package com.fc.base.thread.lock.sync;

import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName DemoExample5
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/30 11:53 上午
 * @Version 1.0
 */
public class DemoExample5 {
    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    /**
     * 仅证明批量重偏向
     * @throws InterruptedException
     */
    public  static  void test1() throws InterruptedException {
        List<TestDemo> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new TestDemo());
        }
        Thread t1 = new Thread(()->{
            System.out.println("加锁前 get(0) 应该是无锁可偏向 "+ ClassLayout.parseInstance(list.get(0)).toPrintable());
            for (TestDemo a:list  ) {
                synchronized (a){
                    System.out.print("加锁 >");
                }
            }
            System.out.println();
            System.out.println("加锁后 get(0) 应该是偏向锁"+ClassLayout.parseInstance(list.get(0)).toPrintable());
            try {
                TimeUnit.SECONDS.sleep(1000);//这里不让线程死，防止线程ID复用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        TimeUnit.SECONDS.sleep(5);
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 40; i++) {
                TestDemo a = list.get(i);
                synchronized (a){
                    System.out.print("加锁 >");
                }
                if (i==18){
                    System.out.println();
                    System.out.println("加锁后 get(18) 应该是无锁（轻量级锁释放） "+ClassLayout.parseInstance(list.get(i)).toPrintable());
                }
                if (i==19){ //开始重偏向
                    System.out.println();
                    System.out.println("加锁后 get(19) 应该是偏向锁 "+ClassLayout.parseInstance(list.get(i)).toPrintable());
                    System.out.println("加锁后 get(0) 应该是无锁（轻量级锁释放） "+ClassLayout.parseInstance(list.get(0)).toPrintable());
                    System.out.println("加锁后 get(99) 应该是偏向锁 偏向t1 "+ClassLayout.parseInstance(list.get(99)).toPrintable());
                }
                if (i==20){
                    System.out.println();
                    System.out.println("加锁后 get(20) 应该是偏向锁 "+ClassLayout.parseInstance(list.get(i)).toPrintable());
                }
            }
        });
        t2.start();
    }
}
