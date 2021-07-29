package com.fc.base.designpatterns.daili;

/**
 * @ClassName Student
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/3/2 12:39 下午
 * @Version 1.0
 */
public class Student implements Person {
    private String name;
    public Student(String name) {
        this.name = name;
    }

    public void giveTask() {
        System.out.println(name + "交语文作业");
    }
}
