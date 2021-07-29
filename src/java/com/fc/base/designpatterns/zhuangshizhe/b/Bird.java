package com.fc.base.designpatterns.zhuangshizhe.b;

/**
 * @ClassName Bird
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 10:18 上午
 * @Version 1.0
 */
public class Bird extends Change implements Runnable{

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        super.move();
        System.out.println("Bird Move");
    }

    @Override
    public void run() {
        System.out.println(2);
    }
}
