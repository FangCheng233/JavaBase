package com.fc.base.jvm.base;

import java.lang.reflect.Field;

/**
 * @ClassName Test
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/20 4:34 下午
 * @Version 1.0
 */
public class Test {
    // 1 Java 虚拟机启动时首先加载并解析虚拟机参数 设置虚拟机参数
    // 2 设置合理的虚拟机参数 确定线程栈大小
    // 3 通过ContinueInNewThread方法创建新线程
    // 4 创建新的虚拟机实例  类似于创建类的实例
    // 5.1  使用jar 方式启动 寻找META-INF/MANIFEST.MF文件指定的Main-Class的主类名
    // 5.2 使用.class方法启动
    // 6. 类加载
        // 6.1 将class文件以二进制数据流的方式读取到jvm当中
        // 6.2 根据class文件生成class对象保存在堆内存（方法区）当中
        // 6.2.1 将final型常量放在方法区中

        // 6.3 验证 文件格式验证，元数据验证，字节码验证，符号引用验证
            // 6.3.1 class文件开头的版本号确定了文件是否可以被执行

        // 6.2 准备 为非final修饰的 static 类变量分配内存 赋0值 静态变量放在方法区 final 类型会被直接赋真实值 使用final值时可以
        private static final Long MAX_VALUE = 1000L;

        private static Integer MIN_VALUE = 2000;
        static String value = "adnjahsbdsajdsabdhbasj";

    // 6.2 解析 JVM 针对类或接口、字段、类方法、接口方法、方法类型、方法句柄和调用点限定符 7 类引用进行解析。这个阶段的主要任务是将其在常量池中的符号引用替换成直接其在内存中的直接引用。
            //
        // 6.2 初始化 访问静态方法时, new关键字调用构造方法 反射获取对象时进行初始化 虚拟机启动主类  main方法 触发
        // 7 调用方法 创建线程虚拟机栈 本地方法栈 程序计数器
        // 7.1 入栈
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,IllegalAccessException{
        // 8 创建一个新的对象
            // 8.1 new
            // 8.1.1 实际过程为 Test test； 声明一个变量
            // 8.1.2 test = new Test(); new 关键字创建一个对象并将对象的引用传递给test 变量
                // 8.1.2.1 从jvm中寻找Test 类信息 已加载 则根据类信息确定对象大小
                    // 未加载 则启动类加载
                // 8.1.2.2 根据对象的大小申请一块大小合适的内存空间
                // 8.1.2.3 为申请的内存分配内存地址 指针碰撞（GC整理算法，已分配和未分配的空间相互隔离）或者空闲列表
                // 8.1.2.4 将申请到的内存地址传递给变量  持有强引用
                Test test1 = new Test();
                // test1 包含了类属性的信息
            Test test2 = new Test();

//        Class<?> clazz = Class.forName("com.fc.base.jvm.base.Test");

//        Field field1 = clazz.getDeclaredField("MAX_VALUE");
//        Field field2 = clazz.getDeclaredField("MIN_VALUE");
//        System.out.println(field1.get(Long.class));
//        System.out.println(field2.get(Long.class));
//        int value1 = 100;
//        int value2 = 200;
//        int value3 = value1 +value2;
//        System.out.println(value3);
//        String str2 = "adnjahsbdsajdsabdhbasj";
//        System.out.println(value == Singleton.str);
//        System.out.println(str2 == Singleton.str);
//        System.out.println(Singleton.counter3);
        System.out.println(Singleton.counter3);
        System.out.println(Singleton.counter2);
//        System.out.println(Singleton.getInstance());
//        System.out.println(Singleton.counter2);


    }

    public Test() {
        /*
        *  代码块
        * */
        MIN_VALUE = 3000;
    }
}
class Parent {
    static Integer VALUE = 10;
}
class Singleton extends Parent {
    public static String str = "adnjahsbdsajdsabdhbasj";
    public static int counter1 = 2;
    public static final int counter3 = 4;
    public static int counter2 = 0;
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println(123);
    }


    public static Singleton getInstance() {
        return singleton;
    }
}
class MyThread extends Thread {
    static Integer VALUE = 10;
    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            VALUE--;
        }
    }
}
class MyLoad extends ClassLoader {

    private ClassLoader parent;
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 可通过任意形式获取class文件
        byte[] clazz = new byte[1024];
        return defineClass(name, clazz, 0, clazz.length);

    }
}