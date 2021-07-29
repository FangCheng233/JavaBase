package com.fc.base.jvm.base;

/**
 * @ClassName HelloWorld
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/28 12:39 下午
 * @Version 1.0
 */
public class HelloWorld {
    private int a = 1;
    private String name = "hello world!";
    private static int b = 2;
    private static String des = "java";
    private final int c = 8;
    private final String value = "1.8";
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.demo();
    }
    public void demo(){
        System.out.println(a);
    }
}
