package com.fc.base.designpatterns.singleton;

/**
 * @ClassName Mgr08  枚举单例   没有构造方法，无法被反序列化
 * @Description 防止反序列化，避免反射
 * @Author fangcheng
 * @Date 2020/8/16 12:01 下午
 * @Version 1.0
 */
public enum  Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
