package com.fc.base.designpatterns.danli;

/**
 * @ClassName Singleton
 * @Description 静态内部类实现-类加载机制 只会被加载一次 对象较大需要延迟加载时使用
 * @Author fangcheng
 * @Date 2020/9/10 6:43 下午
 * @Version 1.0
 */
public class Singleton3 {
    /**
     * @Description
     */
    private Singleton3(){

    }
    private static class Factory {
        //被外部类使用时才会加载
        private static final Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return Factory.instance;
    }
}
