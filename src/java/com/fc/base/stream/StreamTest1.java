package com.fc.base.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/11 9:19 上午
 * @Version 1.0
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        Stream<String> stream1 = Stream.of();

    }
}
