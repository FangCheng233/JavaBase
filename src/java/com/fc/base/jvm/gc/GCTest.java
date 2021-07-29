package com.fc.base.jvm.gc;

import java.nio.ByteBuffer;

/**
 * @ClassName GCTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/15 10:52 下午
 * @Version 1.0
 */
public class GCTest {

    public static void main(String[] args) {
//         -Xmx64M
//        ByteBuffer.allocateDirect(1024*1024*100); // 100MB

//         -Xmx200M
//         -Xmx64M -XX:MaxDirectMemorySize=200M

//        -XX:+PrintGC，
        ByteBuffer.allocateDirect(1024*1024*1024*49);  //100K

    }

}
