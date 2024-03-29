package com.fc.base.designpatterns.daili;

/**
 * @ClassName StaticProxyTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/3/2 12:40 下午
 * @Version 1.0
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //被代理的学生林浅，他的作业上交有代理对象monitor完成
        Person linqian = new Student("林浅");

        //生成代理对象，并将林浅传给代理对象
        Person monitor = new StudentsProxy(linqian);

        //班长代理交作业
        monitor.giveTask();
    }
}
