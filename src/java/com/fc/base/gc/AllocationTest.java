package com.fc.base.gc;

/**
 * @ClassName AllocationTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/2 2:09 下午
 * @Version 1.0
 */
public class AllocationTest {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM 参数： -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
     */
    public static void main(String[] args) throws Exception{
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
        Thread.sleep(1000000);
    }
}
