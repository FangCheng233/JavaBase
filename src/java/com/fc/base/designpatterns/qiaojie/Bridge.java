package com.fc.base.designpatterns.qiaojie;

/**
 * @ClassName Bridge
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 12:04 下午
 * @Version 1.0
 */
public abstract class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
