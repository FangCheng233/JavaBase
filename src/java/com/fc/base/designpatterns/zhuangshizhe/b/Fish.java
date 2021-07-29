package com.fc.base.designpatterns.zhuangshizhe.b;

/**
 * @ClassName Fish
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 10:18 上午
 * @Version 1.0
 */
public class Fish extends Change implements Runnable{

    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        super.move();
        System.out.println("Fish Move");
    }


    @Override
    public void run() {
        System.out.println(123);
    }
}
