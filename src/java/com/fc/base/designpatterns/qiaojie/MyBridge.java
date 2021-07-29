package com.fc.base.designpatterns.qiaojie;

/**
 * @ClassName MyBridge
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 12:05 下午
 * @Version 1.0
 */
public class MyBridge extends Bridge {
    @Override
    public void method(){
        getSource().method();
    }
}
