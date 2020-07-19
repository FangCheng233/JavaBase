package com.fc.base.thread;

/**
 * @ClassName VolatileDemo
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/18 4:39 下午
 * @Version 1.0
 */

/**
 * volatile关键字学习
 *
 *
 * 缓存一致性协议
 * 每个处理器通过嗅探在总线上传播的数据来检查自己缓存的值是不是过期
 *
 *
 * 1、Lock前缀的指令会引起处理器缓存写回内存；
 2、一个处理器的缓存回写到内存会导致其他处理器的缓存失效；
 3、当处理器发现本地缓存失效后，就会从内存中重读该变量数据，即可以获取当前最新值。


 在每个volatile写操作的前面插入一个StoreStore屏障；
 在每个volatile写操作的后面插入一个StoreLoad屏障；
 在每个volatile读操作的后面插入一个LoadLoad屏障；
 在每个volatile读操作的后面插入一个LoadStore屏障。
 需要注意的是：volatile写是在前面和后面分别插入内存屏障，而volatile读操作是在后面插入两个内存屏障
 StoreStore屏障：禁止上面的普通写和下面的volatile写重排序；
 StoreLoad屏障：防止上面的volatile写与下面可能有的volatile读/写重排序
 LoadLoad屏障：禁止下面所有的普通读操作和上面的volatile读重排序
 LoadStore屏障：禁止下面所有的普通写操作和上面的volatile读重排序


 * @author
 * @create 2018-05-27 下午10:06
 **/
public class VolatileDemo {

    public String message = "000";

    public void test(){

    }

    /**
     * synchronized: 具有原子性，有序性和可见性； volatile：具有有序性和可见性
     */
//    private volatile static VolatileDemo volatileDemo;
//
//    public VolatileDemo(){
//        if(volatileDemo ==null){
//            synchronized (VolatileDemo.class){
//                if(volatileDemo == null){
//                    volatileDemo = new VolatileDemo();
//                }
//            }
//        }
//    }

    public volatile static int count = 0;

    /**
     * volatile不能保证原子型
     * @param args
     */
    public static void main(String[] args) throws InterruptedException{
        for (int i = 0;i < 10000; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i= 0;i < 1000;i++){
                        count++;
                    }
                }
            });
            thread.start();
        }
        System.out.println(count);
    }
}
