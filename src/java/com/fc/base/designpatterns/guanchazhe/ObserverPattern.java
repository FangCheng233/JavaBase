package com.fc.base.designpatterns.guanchazhe;

import java.lang.reflect.Method;

/**
 * @ClassName ObserverPattern
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/14 3:15 下午
 * @Version 1.0
 */
public class ObserverPattern {
    public static void main(String[] args) throws Exception {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        Observer observer = new Observer() {
        };
        observer.response();
        subject.notifyObserver();
        Subject subject1 = new Subject() {
            @Override
            public void notifyObserver() {

            }
        };
//        Class<?> objectClass = Class.forName("com.fc.base.thread.ThreadTest2");
//        Method[] method = objectClass.getMethods();
//        System.out.println();
    }
}
