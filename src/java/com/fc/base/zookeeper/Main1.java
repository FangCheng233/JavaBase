package com.fc.base.zookeeper;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * @ClassName Main1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/27 10:08 下午
 * @Version 1.0
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        System.out.println(new Main1().Probability(5));

    }
    public String Probability (int n) {
        // write code here
//        return String.format("%.2f",1/Math.pow(2,n-1));
        return String.format("%.2f",2/(double)(1 << n));
    }
}
