package com.fc.base.designpatterns.shipeiqi;

/**
 * @ClassName WrapperTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:51 上午
 * @Version 1.0
 */
public class WrapperTest {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }

}
