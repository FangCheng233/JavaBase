package com.fc.base.thread.lock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName RedissionLock
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/19 8:48 下午
 * @Version 1.0
 */
public class RedissionLockTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            Integer length = sc.nextInt();
            length = length>1000?1000:length;
            delete(length);
        }
    }


    public static int delete(int n){
        int[] a = new int[n];
        int sum = 0;
        int index = 2;
        while (sum != n){
            // 从
            if(a[index%n] == 0){
                // 删除数据并自增
                a[index%n] = 1;
                System.out.println(index);
                sum++;
                // 后移两位
                int incr = 0;
                while (incr != 3 && sum < n){
                    index++;
                    if(a[index%n] == 0){
                        incr ++;
                    }
                }
            }
        }
        return  index%n;
    }
}
