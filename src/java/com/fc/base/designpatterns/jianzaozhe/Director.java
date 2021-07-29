package com.fc.base.designpatterns.jianzaozhe;

/**
 * @ClassName Director
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:13 上午
 * @Version 1.0
 */
/**
 * Director.java
 *  指挥者
 */
public class Director {
    //指挥工人按顺序造房
    public Product create(Builder builder) {
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        return builder.getProduct();
    }
}
