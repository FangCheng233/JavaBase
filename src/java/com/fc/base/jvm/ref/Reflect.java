package com.fc.base.jvm.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ClassName Reflect
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/4 1:55 下午
 * @Version 1.0
 */
public class Reflect {
    public static void main(String[] args) throws Exception {
        // 直接调用class 对象的newInstance方法
        Class clazz = Class.forName("com.fc.base.jvm.ref.Person", false, Person.class.getClassLoader());
        Person person = (Person) clazz.newInstance();

        // 构造器函数有参反射
        Constructor constructor = clazz.getDeclaredConstructor(int.class);
        Person person1 = (Person)constructor.newInstance(2);

        Method method = clazz.getDeclaredMethod("test");
        method.setAccessible(true);
        method.invoke(person1);

    }
}
