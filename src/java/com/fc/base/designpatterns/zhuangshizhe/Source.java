package com.fc.base.designpatterns.zhuangshizhe;

/**
 * @ClassName Source
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:58 上午
 * @Version 1.0
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}