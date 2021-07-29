package com.fc.base.collections.sort;

import java.util.Arrays;

/**
 * @ClassName InsertSort 插入排序算法
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/15 2:44 下午
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = (int) Math.floor(Math.random()*5+1);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }

    private static void sort(int[] array) {
//        从第2个元素开始遍历 前部为有序 后续插入有序队列
        for(int i = 1; i < array.length; i++){
            int j;
            for( j = i - 1; j >= 0; ){
                if(array[i] >= array[j]){
                    break;
                }else if(j > 0){
                    j--;
                }
            }
            if(i - j > 1){
                int temp = array[i];
                for(int k = i; k > j; k--){
                    array[k] = array[k -1];
                }
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
