package com.fc.base.designpatterns.jianzaozhe;

/**
 * @ClassName Test
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:13 上午
 * @Version 1.0
 */
/**
 * Test.java
 *  测试类
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        Product create = director.create(builder);
        System.out.println(create.toString());
    }
}
