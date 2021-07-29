package com.fc.base.jvm.load;

/**
 * @ClassName ClassC
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/1/4 11:30 下午
 * @Version 1.0
 */
public class ClassC {

    /**
     * 定义Class B
     */

    static {
        System.out.println("ClassC----我被加载了");
    }

    public ClassC() {
        System.out.println("ClassC----初始化完成");
    }

    private ClassA classA= new ClassA();

    public void myName() {
        System.out.println("C方法---开始");
        System.out.println("C方法---打印A的成员变量值："+classA.getName());
        System.out.println("C方法---结束");
    }
}
