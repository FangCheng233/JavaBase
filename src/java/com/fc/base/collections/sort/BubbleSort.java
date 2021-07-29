package com.fc.base.collections.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort 每次从最后一个元素开始比较，将小的元素前移
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/15 9:04 上午
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i <10; i++){
            arr[i] = (int) Math.floor(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);


    }
    private static void sort(int[] array){
        int size = array.length;
        int temp = array[size - 1];
        for(int i = 0; i <= size - 1 ;i++){
            for(int j = size - 1; j >= i +1; j--){
                if(array[j] < array[j-1]){
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
