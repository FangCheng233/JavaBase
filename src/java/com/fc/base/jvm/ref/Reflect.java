package com.fc.base.jvm.ref;

/**
 * @ClassName Reflect
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/4 1:55 下午
 * @Version 1.0
 */
public class Reflect {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.fc.base.jvm.ref.Person");
        Person person = (Person) clazz.newInstance();
//        person.test();
        System.out.println(person);
    }
}
