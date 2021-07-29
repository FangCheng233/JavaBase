package com.fc.base.thread;

/**
 * @ClassName ThreadTest6
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/19 3:40 下午
 * @Version 1.0
 */
public class ThreadTest6 extends Thread {
    public static void main(String[] args) throws InterruptedException{
        ThreadTest6 threadTest6 = new ThreadTest6();
        Thread thread1 = new Thread(threadTest6, "T1");
        Thread thread2 = new Thread(threadTest6, "T2");
        Thread thread3 = new Thread(threadTest6, "T3");
        thread1.start();
//        thread2.start();
//        thread3.start();
        // 0110
        // 0011
//        System.out.println(8|1);
//        System.out.println((-1)<<2);
//        System.out.println(-1>>2);
//        System.out.println(-1<<2);
        ;
        System.out.println(Integer.toBinaryString(-1<<Integer.SIZE - 3));
        System.out.println(Integer.toBinaryString(1<<Integer.SIZE - 3));
        System.out.println(Integer.toBinaryString(2<<Integer.SIZE - 3));
        System.out.println(Integer.toBinaryString(3<<Integer.SIZE - 3));
    }
    static int a = 50;
    @Override
    public void run() {

        while (a>0){
            synchronized (this){
                a--;
                System.out.println(Thread.currentThread().getName() + "  " + a);
            }
        }
    }
}
