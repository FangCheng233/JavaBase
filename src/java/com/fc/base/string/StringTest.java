package com.fc.base.string;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/30 5:08 下午
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String str = new String("1");
        StringBuffer stringBuffer = new StringBuffer("1");
        stringBuffer.append("");
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        while (stringBuffer.length()<Integer.MAX_VALUE){
            stringBuffer.append(stringBuffer);
            System.out.println(stringBuffer.length());
            System.gc();
            System.gc();
            System.gc();
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (Exception E)
            {

            }
            System.gc();
            System.out.println(i+=stringBuffer.length());
        }
//        21 4748 3647 5 3687 0912
        // 1073741823
        // 1073741823
        // 2147483646

        System.out.println(Integer.MAX_VALUE);
    }
}



