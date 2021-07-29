package com.fc.base.designpatterns.zhuangshizhe.b;

/**
 * @ClassName Change
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 10:18 上午
 * @Version 1.0
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }
    @Override
    public void move() {
        // 代码
        sage.move();
    }
}
