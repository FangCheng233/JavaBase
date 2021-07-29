package com.fc.base.designpatterns.shipeiqi;

/**
 * @ClassName AdapterTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:41 上午
 * @Version 1.0
 */
public class AdapterTest {

    public static void main(String[] args) {
//        Targetable target = new Adapter();
//        target.method1();
//        target.method2();

        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
