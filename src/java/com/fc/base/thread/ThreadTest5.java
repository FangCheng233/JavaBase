package com.fc.base.thread;

/**
 * @ClassName ThreadTest5
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/18 3:25 下午
 * @Version 1.0
 */
public class ThreadTest5 {
    int a = 0;
    private volatile boolean flag;
    static ThreadTest5 threadTest5 = new ThreadTest5();
    public static void main(String[] args) throws Exception{
        testfor();
    }
    public void write(){
        for(int i = 0; i < 10000; i++){
            flag = true;
            System.out.println("write" + i + flag);
            change1();
        }
    }
    public void read(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("read" + i + flag);
            if(flag){
                change2();
                flag = false;
            }
        }
    }
    public static void testfor() throws Exception{
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest5.write();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest5.read();
            }
        });
        thread1.start();
        thread2.start();
//        thread1.join();
//        thread2.join();
        threadTest5.print();
    }
    private synchronized void change1(){
        a--;
    }
    private synchronized void change2(){
        a++;
    }
    private void print(){
        System.out.println("aaaaa " + a);
    }
}
