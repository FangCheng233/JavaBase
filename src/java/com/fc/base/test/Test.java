package com.fc.base.test;

/**
 * @ClassName Test
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/6/23 4:29 下午
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }
    public void test(){
        char a = '±';
        System.out.println(a);
        System.out.println("动态加载，反射");
    }

    @Override
    public String toString() {
        return "Test{}";
    }
}
