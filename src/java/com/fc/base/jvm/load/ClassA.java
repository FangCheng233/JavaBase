package com.fc.base.jvm.load;

/**
 * @ClassName ClassA
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/1/4 11:29 下午
 * @Version 1.0
 */
public class ClassA {

    //静态初始化块
    static {
        System.out.println("ClassA----我被加载了");
    }

    public static String TEST = "TEST";
    public ClassA() {
        System.out.println("ClassA----初始化");
    }

    private  static int age = 20;
    private  String name="xiaowang";

    public static int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
