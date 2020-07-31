package com.fc.base.test;

/**
 * @ClassName ArrayTest
 * @Description TODO 外观数列，数组简读 如 112211 可读作 212221
 * @Author fangcheng
 * @Date 2020/6/28 10:37 下午
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        /***
         * 1 <= n <=30
         */
        int n = 2;
        System.out.println(countAndSay(n));
    }
    /**
     *
     * @Description n=1 输出 1 n=2 时输出 11 n=3时 输出21
     * @Author fangcheng
     * @param n :
     * @return java.lang.String
     * @throws
     * @Date 2020/6/28 10:41 下午
     */
    public static String countAndSay(int n) {
        String exprBefore = "1";
        String exprAfter = "";
        for (int i = 1; i < n; i++) {
            int num = 0;
            char tempValue = ' ';
            for (int j = 0; j < exprBefore.length(); j++) {
                if(tempValue != exprBefore.charAt(j)){
                    num = 1;
                    exprAfter = exprAfter + num + tempValue;
                    tempValue = exprBefore.charAt(j);
                }else {
                    num++;
                }
            }
            System.out.println(exprAfter);
        }
        System.out.println(exprAfter);
        return "";
    }
}
