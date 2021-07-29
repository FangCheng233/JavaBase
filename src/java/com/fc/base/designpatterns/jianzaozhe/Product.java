package com.fc.base.designpatterns.jianzaozhe;

/**
 * @ClassName Product
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/9/11 9:13 上午
 * @Version 1.0
 */
/**
 * Product.java
 *  产品（房子）
 */
public class Product {
    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;
    public String getBuildA() {
        return buildA;
    }
    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }
    public String getBuildB() {
        return buildB;
    }
    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }
    public String getBuildC() {
        return buildC;
    }
    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }
    public String getBuildD() {
        return buildD;
    }
    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }
    @Override
    public String toString() {
        return buildA+"\n"+buildB+"\n"+buildC+"\n"+buildD+"\n"+"房子验收完成";
    }
}
