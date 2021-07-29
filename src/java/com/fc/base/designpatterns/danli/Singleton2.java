package com.fc.base.designpatterns.danli;

/**
 * @ClassName Singleton
 * @Description 使用加锁实现
 * @Author fangcheng
 * @Date 2020/9/10 6:43 下午
 * @Version 1.0
 */
public class Singleton2 {
    private static volatile Singleton2 instance = null;
    private Singleton2(){

    }
    /**
     * TODO
     * @Description 获取单例实例
     * @Author fangcheng
     * @return com.fc.base.designpatterns.danli.Singleton2
     * @throws
     * @Date 2021/4/18 3:23 下午
     */
    public static Singleton2 getInstance(){

        if(instance == null){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
    //同步方法锁 每次获取对象需要加锁，效率低
    public static synchronized Singleton2 getInstance_(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
