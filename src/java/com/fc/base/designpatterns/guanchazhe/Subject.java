package com.fc.base.designpatterns.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/14 3:15 下午
 * @Version 1.0
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    /**
     * TODO
     * @Description
     * @Author fangcheng 注册通知的方法
     * @param observer :
     * @return void
     * @throws
     * @Date 2020/12/6 11:19 上午
     */
    public void add(Observer observer) {
        observers.add(observer);
    }
    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    /**
     * @Description 通知观察者方法
     * @Author fangcheng
     * @return
     * @throws
     * @Date 2020/12/6 11:14 上午
     */
    public abstract void notifyObserver();
}
