package com.fc.base.jvm.load;

/**
 * @ClassName ClassB
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/1/4 11:29 下午
 * @Version 1.0
 */
public class ClassB {

    /**
     * 定义Class B
     */
    static {
        System.out.println("ClassB----我被加载了");
    }
    private ClassA classA;

    public void myName() {
        System.out.println("B方法---开始");
        classA= new ClassA();
        System.out.println("B方法---打印A的成员变量值："+classA.getName());
        System.out.println("B方法---结束");
    }
}
