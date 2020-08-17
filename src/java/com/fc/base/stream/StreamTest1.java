package com.fc.base.stream;

import com.fc.base.abstractclass.User;

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
        List<User> emps = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            User user = new User();
            user.setAge(i);
            emps.add(user);
        }
        emps.stream()
                .map(e -> e.getAge())
                // 需要流中的元素重写hashCode和equals方法
                .forEach(System.out::println);

    }
}
