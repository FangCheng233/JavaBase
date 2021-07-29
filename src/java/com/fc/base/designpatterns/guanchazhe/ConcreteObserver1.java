package com.fc.base.designpatterns.guanchazhe;

/**
 * @ClassName ConcreteObserver1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/14 3:16 下午
 * @Version 1.0
 */
//具体观察者1
class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}