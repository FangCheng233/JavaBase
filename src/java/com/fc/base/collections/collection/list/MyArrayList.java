package com.fc.base.collections.collection.list;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;


/**
 * @ClassName MyArrayList
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/17 5:18 下午
 * @Version 1.0
 */
public class MyArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable {

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public MyArrayList() {
    }
}
