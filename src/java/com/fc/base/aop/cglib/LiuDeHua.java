package com.fc.base.aop.cglib;

import com.fc.base.aop.cglib.Star;

/**
 * @ClassName LiuDeHua
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/12 2:00 下午
 * @Version 1.0
 */

//public class LiuDeHua implements Star
public class LiuDeHua {
//    @Override
    public String sing(String name) {
        System.out.println("给我一杯忘情水");

        return "唱完" ;
    }

//    @Override
    public String dance(String name) {
        System.out.println("开心的马骝");

        return "跳完" ;
    }
}
