package com.fc.base.control;

/**
 * @ClassName ProgramControl
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/11 4:01 下午
 * @Version 1.0
 */
public class ProgramControl {
    private static final int VALUE = 8;
    /**
     * From on Java 8
     *
     */

    public static void main(String[] args) {
//
        new ProgramControl().judgement1();
//        常用for循环
        new ProgramControl().fori();
        new ProgramControl().forInInt();
//

    }
    private void judgement1(){
        if(true){
            System.out.println(VALUE);
        }
    }

    private void fori(){

    }
    private void forInInt() {
        for(char c : "This is a test statement.".toCharArray()){
            System.out.print(c + "_");
        }
    }
}
