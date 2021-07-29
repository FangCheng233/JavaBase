package com.fc.base.designpatterns.daili;

/**
 * @ClassName StudentsProxy
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/3/2 12:39 下午
 * @Version 1.0
 */
/**
 * 学生代理类，也实现了Person接口，保存一个学生实体，这样就可以代理学生产生行为
 */
public class StudentsProxy implements Person{
    //被代理的学生
    Student stu;

    public StudentsProxy(Person stu) {
        // 只代理学生对象
        if(stu.getClass() == Student.class) {
            this.stu = (Student)stu;
        }
    }

    //代理交作业，调用被代理学生的交作业的行为
    @Override
    public void giveTask() {
        stu.giveTask();
    }
}
