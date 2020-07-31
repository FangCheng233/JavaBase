package com.fc.base.collections.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            stringList.add("key" + i);
        }
        ListIterator<String> listIterator = stringList.listIterator(50);
        while(listIterator.hasPrevious() || listIterator.hasNext()){
            System.out.println("Previous" + listIterator.previous());
            System.out.println("Next" + listIterator.next());
        }

    }
}
