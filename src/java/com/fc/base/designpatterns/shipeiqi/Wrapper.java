package com.fc.base.designpatterns.shipeiqi;

/**
 * @ClassName Wrapper
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:44 上午
 * @Version 1.0
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
//        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }


}
