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
    boolean flag = false;
    static ThreadTest5 threadTest5 = new ThreadTest5();
    public static void main(String[] args){
        for(int i = 0; i < 1000000; i++){
        testfor();
        }
    }
    public void write(){
        flag = true;
        a = 1;
        System.out.println(flag);
    }
    public void read(){
        if(flag){
            a = a * a;
            System.out.println(a);
            flag = false;
            System.out.println(flag);
        }
    }
    public static void testfor(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest5.write();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest5.read();
            }
        }).start() ;
    }
}
