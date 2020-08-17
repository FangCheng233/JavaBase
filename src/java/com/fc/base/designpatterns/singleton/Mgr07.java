package com.fc.base.designpatterns.singleton;

/**
 * @ClassName Mgr07 静态内部类实现
 * @Description
 * @Author fangcheng
 * @Date 2020/8/16 12:06 下午
 * @Version 1.0
 */
public class Mgr07 {

    private Mgr07(){

    }
    public static Mgr07 getInstance(){
        return Mgr07Handler.INSTANCE;
    }
    private static class Mgr07Handler{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
