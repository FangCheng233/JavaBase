package com.fc.base.collections.collection.list;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> stringList = new ArrayList<>();
//        ArrayList<String> stringList1 = new ArrayList<String>(18);
        for (int i = 0; i < 10; i++) {
            stringList.add(i);
            stringList.add(i%3);
        }
        System.out.println(stringList);
        List<Integer> list = stringList.stream().sorted(Comparator.comparing(stringList::get)).collect(Collectors.toList());
        System.out.println(list);
//        Arrays.sort(stringList.toArray());
//        Collections.synchronizedList(stringList);
//        ListIterator<String> listIterator = stringList.listIterator();
//        while(listIterator.hasPrevious() || listIterator.hasNext()){
//            System.out.println("Previous" + listIterator.previous());
//            System.out.println("Next" + listIterator.next());
//        }
//        t();
    }
    public static String t(){
        try {
            System.out.println(3);
        } catch (Exception e){

        }finally {
            System.out.println(1);
        }
        System.out.println(2);
        return "";
    }
}
