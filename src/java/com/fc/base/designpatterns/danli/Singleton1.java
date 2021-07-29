package com.fc.base.designpatterns.danli;

/**
 * @ClassName Singleton
 * @Description 饿汉式单例-类被加载时初始化
 * @Author fangcheng
 * @Date 2020/9/10 6:43 下午
 * @Version 1.0
 */
public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return instance;
    }
}
