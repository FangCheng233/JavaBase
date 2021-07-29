package com.fc.base.jvm.load;

/**
 * @ClassName Test
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/1/4 11:30 下午
 * @Version 1.0
 */

public class Test {
    /**
     * 定义Class D
     */
    static {
//        System.out.println("Test----我被初始化");
    }
    //程序入口：
    public static void main(String[] args) throws Exception{
        Class.forName("com.fc.base.jvm.load.ClassA",false, Class.class.getClassLoader());
        Class.forName("com.fc.base.jvm.load.ClassB");
        new Test().getClass().getClassLoader().loadClass("com.fc.base.jvm.load.ClassA");
        new Test().getClass().getClassLoader().loadClass("com.fc.base.jvm.load.ClassB");
//        String test = ClassA.TEST;
//        System.out.println(test);

//        ClassB classB = new ClassB();
//        ClassC classC = new ClassC();
//        classB.myName();
//        classC.myName();
    }
}
