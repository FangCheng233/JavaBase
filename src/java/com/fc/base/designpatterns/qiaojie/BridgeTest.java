package com.fc.base.designpatterns.qiaojie;

/**
 * @ClassName BridgeTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 12:05 下午
 * @Version 1.0
 */
public class BridgeTest {
    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
//        bridge.setSource(source1);
//        bridge.method();
        source1.method();

        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
//        bridge.setSource(source2);
//        bridge.method();
    }
}
