package com.fc.base.designpatterns.guanchazhe;

/**
 * @ClassName ConcreteSubject
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/14 3:16 下午
 * @Version 1.0
 */
class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for(Object obs:observers) {
            ((Observer)obs).response();
        }

    }
}