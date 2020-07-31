package com.fc.base.sort;

import java.util.Arrays;

/**
 * @ClassName SelectSort 选择排序算法 记录未排序部分的最小值位置和未排序第一位交换
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/15 11:52 上午
 * @Version 1.0
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[40];
        for(int i = 0; i < 40; i++){
            arr[i] = (int) Math.floor(Math.random()*40+1);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
    private static void sort(int[] array){
        int size = array.length;
        int temp = 0;
        for(int i = 0; i <= size - 1 ;i++){
            int minIndex = size - 1;
            for(int j = i ; j <= size - 1; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
