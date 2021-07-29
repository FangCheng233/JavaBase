package com.fc.base.designpatterns.zhuangshizhe.b;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName Client
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 10:19 上午
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法  单层装饰
        TheGreatestSage bird = new Bird(sage);
//        TheGreatestSage fish = new Fish(bird);
        // 第二种写法 双层装饰
        TheGreatestSage fish = new Fish(new Bird(sage));
        ((Change)fish).move();

    }
}
