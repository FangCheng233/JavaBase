package com.fc.base.lambda;

import java.util.*;

/**
 * @ClassName LambdaTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/5 2:35 下午
 * @Version 1.0
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        String[] array = {"123","234","345","456","567","678","789"};
        List<String> stringList = Arrays.asList(array);
        Map map = new HashMap();
        stringList.forEach(System.out::println);

    }
}
