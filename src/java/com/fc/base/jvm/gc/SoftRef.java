package com.fc.base.jvm.gc;


import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName SoftRef
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/5 1:54 下午
 * @Version 1.0
 */
public class SoftRef {
    public static void main(String[] args) {
        SoftRef softRef = new SoftRef();
        SoftReference<SoftRef> softReference = new SoftReference<>(softRef);
        WeakReference<SoftRef> weakReference = new WeakReference<>(softRef);
        PhantomReference<SoftRef> phantomReference = new PhantomReference<>(softRef,new ReferenceQueue<>());
        try {
            TimeUnit.SECONDS.sleep(10);
        }catch (Exception e){

        }
        System.out.println(softReference.get());;
        System.out.println(weakReference.get());;
        System.out.println(phantomReference.get());;
    }
}
