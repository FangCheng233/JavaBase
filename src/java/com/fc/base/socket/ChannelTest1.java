package com.fc.base.socket;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;

/**
 * @ClassName ChannelTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/25 11:17 上午
 * @Version 1.0
 */
public class ChannelTest1 {
    @Test
    public void test3(){
        Map<String, Charset> map = Charset.availableCharsets();

    }
    @Test
    public void test2() throws Exception{
        long start = System.currentTimeMillis();
        FileChannel inChannel = FileChannel.open(Paths.get("/Users/fangcheng/Desktop/2020-07-19-8.15.51.mov"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("/Users/fangcheng/Desktop/2020-07-19-8.15.52.mov"), StandardOpenOption.WRITE,StandardOpenOption.CREATE);
//      内存映射文件
//        MappedByteBuffer inMapBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
////        没有主动关闭的方法，等待垃圾回收
//        MappedByteBuffer outMapBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());
        outChannel.transferFrom(inChannel, 0, inChannel.size());
//
//        byte[] dst = new byte[inMapBuffer.limit()];
//        inMapBuffer.get(dst);
//        outMapBuffer.put(dst);

        inChannel.close();
        outChannel.close();
        long end = System.currentTimeMillis();
        System.out.println("耗费时间为：" + (end - start));
    }
    @Test //19199 16286 16054
    public void test1() throws FileNotFoundException, IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("/Users/fangcheng/Desktop/2020-07-19-8.15.51.mov");
        FileOutputStream fos = new FileOutputStream("/Users/fangcheng/Desktop/2020-07-19-8.15.52.mov");

//        1⃣️获取通道
        FileChannel inChannel = fis.getChannel();
        FileChannel outChannel = fos.getChannel();

//        2⃣️分配指定大小缓冲区
        ByteBuffer buf = ByteBuffer.allocate(3072);

//        3⃣️将通道中的数据写入缓冲区
        while (inChannel.read(buf) != -1){
            buf.flip();
//        4⃣️将缓冲区的数据写入通道
            outChannel.write(buf);
            buf.clear();
        }
        outChannel.close();
        inChannel.close();
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("耗费时间为：" + (end - start));
    }
}

