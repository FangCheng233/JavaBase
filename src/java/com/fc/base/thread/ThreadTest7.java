package com.fc.base.thread;

import org.apache.zookeeper.server.quorum.QuorumCnxManager;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName ThreadTest7
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/2 3:59 下午
 * @Version 1.0
 */
public class ThreadTest7 {
    private AtomicInteger atomicInteger1 = new AtomicInteger(2);
    private AtomicInteger atomicInteger2 = new AtomicInteger(2);
    private AtomicInteger atomicInteger3 = new AtomicInteger(2);
    private AtomicInteger atomicInteger4 = new AtomicInteger(2);
    private AtomicInteger atomicInteger5 = new AtomicInteger(2);

    public static void main(String[] args) {
        while(true){
            System.out.println(1);
            break;
        }
        System.out.println(2);
//        new ThreadTest7().incr();
    }
    public void incr(){
        atomicInteger1.getAndAdd(2);
        System.out.println(atomicInteger1);
        atomicInteger2.getAndSet(2);
        System.out.println(atomicInteger2);
        atomicInteger3.addAndGet(1);
        System.out.println(atomicInteger3);
        atomicInteger4.getAndIncrement();
        System.out.println(atomicInteger4);
    }
}
