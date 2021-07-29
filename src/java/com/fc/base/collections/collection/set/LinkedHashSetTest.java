package com.fc.base.collections.collection.set;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @ClassName LinkedHashSet
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/8/17 4:22 下午
 * @Version 1.0
 */
public class LinkedHashSetTest {
    static String method = "^[\\+\\-\\*\\/]+$";
    static String method2 = "^![\\+\\-\\*\\/0-9]+$";
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("1");
        linkedHashSet.add(null);
        if(!linkedHashSet.add(null)){
            return;
        }
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String value = sc.next();
            String regex = "^[0-9\\(\\)\\+\\-\\*\\{\\}\\[\\]\\/]+$";

            if(!value.matches(regex)){
                System.out.println("请重新输入");
                continue;
            }//3+2*{1+2*[-4/(-8 -6*8/4 +12) +7]}

            String regexStart = "[\\[\\{\\(]";
            String regexEnd = "[\\]\\}\\)]";
            LinkedList<String> stack = new LinkedList<>();
            for(int i=0;i<value.length();i++){
                String curr = value.substring(i,i+1);
                boolean end = curr.matches(regexEnd);
                // 入栈操作
                stack.addLast(curr);
                if(end){
                    // 出栈操作 直到对应关闭
                    boolean ok = true;
                    curr = stack.removeLast();
                    String temp = "";
                    while (ok){
                        // 优化 提炼代码
                        if(curr.matches(regexEnd)){
                            // 计算当前括号内的数据
                            temp = temp + stack.getLast();
                            stack.removeLast();
                            if( stack.getLast().matches(regexStart)){
                                stack.removeLast();
                                // 停止遍历 3+2*{1+2*[-4/(8-6)+7]}
                                ok = false;
                                StringBuffer sb = new StringBuffer(temp);
                                temp = sb.reverse().toString();
                                stack.addLast(String.valueOf(calculate(temp)));
                            }
                        }
                    }
                    // 将计算好的结果重新压入栈中
                }
            }
            StringBuffer sb = new StringBuffer();
            while (!stack.isEmpty()){
                sb.append(stack.removeFirst());
            }
            System.out.println(calculate(sb.toString()));
        }
    }
    public static int calculate(String expr){
        LinkedList<String> stack = new LinkedList<>();
        String caozuo = "";
        for(int i = 0;i<expr.length();i++){
            String vv = expr.substring(i, i + 1);
            if(vv.matches(method)){
                if(!caozuo.equals("")){
                    stack.addLast(caozuo);
                }
                caozuo = "";
                stack.addLast(vv);
                continue;
            }
            caozuo = caozuo + vv;
        }
        stack.addLast(caozuo);
        while (!stack.isEmpty()){

            String first = stack.getFirst();
            stack.removeFirst();
            if(first.equals("-") ){
                first = first + stack.getFirst();
                stack.removeFirst();
            }
            // 操作数
            String jisuan = "";
            if(stack.isEmpty()){
                return Integer.parseInt(first);
            }
             jisuan = stack.getFirst();
            stack.removeFirst();

            String second = stack.getFirst();
            stack.removeFirst();

            String next = "";
            if(!stack.isEmpty()){
                next = stack.getFirst();
            }
            try {
                Integer.parseInt(first);
                Integer.parseInt(second);

            }catch (Exception e){

            }finally {
                try {
                    throw new Exception();
                }catch (Exception E){
                }
            }
            if(jisuan.equals("*")){
                stack.addFirst(String.valueOf(Integer.parseInt(first)*Integer.parseInt(second)));
                continue;
            }
            if(jisuan.equals("/")){
                stack.addFirst(String.valueOf(Integer.parseInt(first)/Integer.parseInt(second)));
                continue;
            }
            switch (next){
                case "":
                case "+":
                case "-": {
                    if(jisuan.equals("*")){
                        stack.addFirst(String.valueOf(Integer.parseInt(first)*Integer.parseInt(second)));
                    }
                    if(jisuan.equals("/")){
                        stack.addFirst(String.valueOf(Integer.parseInt(first)/Integer.parseInt(second)));
                    }
                    if(jisuan.equals("+")){
                        stack.addFirst(String.valueOf(Integer.parseInt(first)+Integer.parseInt(second)));
                    }
                    if(jisuan.equals("-")){
                        stack.addFirst(String.valueOf(Integer.parseInt(first)-Integer.parseInt(second)));
                    }
                }
                break;
                case "*":
                case "/":{
                    stack.addLast("+");
                    stack.addLast(first);
                    stack.addFirst(second);
                }
                    break;
            }
        }
        return 0;
    }
}
