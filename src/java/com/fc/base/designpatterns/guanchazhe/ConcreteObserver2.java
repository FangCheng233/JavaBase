package com.fc.base.designpatterns.guanchazhe;

/**
 * @ClassName ConcreteObserver2
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/14 3:17 下午
 * @Version 1.0
 */
//具体观察者1
class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
