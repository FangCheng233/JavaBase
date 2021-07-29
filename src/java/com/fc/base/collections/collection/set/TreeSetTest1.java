package com.fc.base.collections.collection.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @ClassName TreeSet1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/21 5:33 下午
 * @Version 1.0
 */
public class TreeSetTest1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
//        set.add("casda");
//        set.add("casdv");
//        set.add("asdac");
//        set.add("sdf");
//        set.add("asddasdac");
//        int aaa =12312313;
//        String bb = String.valueOf(aaa).substring(7,8);
//        System.out.println(bb);
//        set.add("asddsfsac");
        set.add(2);
        String ss = "";
        Arrays.sort(ss.toCharArray());

        set.add(2);
        set.add(2);
        System.out.println(set);
        int va = 1+3*5+3*7-3/8;
        String version1 = "1.1.2.3";
        String version2 = "1.1.2.4";
        int[] v1 = Arrays.asList(version1.split(".")).stream().mapToInt(Integer::parseInt).toArray();
        int[] v2 = Arrays.asList(version2.split(".")).stream().mapToInt(Integer::parseInt).toArray();
    }

}
