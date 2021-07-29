package com.fc.base.designpatterns.zhuangshizhe;

/**
 * @ClassName Decorator
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:59 上午
 * @Version 1.0
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
