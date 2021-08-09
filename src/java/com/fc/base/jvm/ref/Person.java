package com.fc.base.jvm.ref;

/**
 * @ClassName Person
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/4 1:56 下午
 * @Version 1.0
 */
public class Person {
    private int num;
    private void test(){
        System.out.println("私有方法");
    }
    public Person() {
        System.out.println("初始化");
    }
    public Person(int num) {
        System.out.println("初始化" + num);
    }
}
