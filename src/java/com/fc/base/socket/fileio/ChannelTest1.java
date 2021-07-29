package com.fc.base.socket.fileio;


import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Stream;

/**
 * @ClassName ChannelTest1
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/25 11:17 上午
 * @Version 1.0
 */
public class ChannelTest1 {

    public void test4() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/fangcheng/Desktop/CentOS-7-x86_64-DVD-2009.iso", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        ByteBuffer buffer1 = ByteBuffer.allocate(1024);
        ByteBuffer buffer2 = ByteBuffer.allocate(1024);

        ByteBuffer[] buffers = {buffer1, buffer2};

        fileChannel.read(buffers);

        for(Buffer buffer:buffers){

        }

    }


    public void test3(){
        Map<String, Charset> map = Charset.availableCharsets();
        Set<Map.Entry<String, Charset>> set = map.entrySet();
        set.stream().forEach(System.out::println);
        List<String> list = new ArrayList<>();
    }
    public static void test2() throws Exception {
        long start = System.currentTimeMillis();
        FileChannel inChannel = FileChannel.open(Paths.get("/Users/fangcheng/Desktop/CentOS-7-x86_64-DVD-2009.iso"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("/Users/fangcheng/Desktop/3.mov"), StandardOpenOption.WRITE,StandardOpenOption.CREATE);
//      内存映射文件
        MappedByteBuffer inMapBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
////        没有主动关闭的方法，等待垃圾回收
        MappedByteBuffer outMapBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        outChannel.transferFrom(inChannel, 0, inChannel.size());
        inChannel.transferTo(0, inChannel.size(), outChannel);
//
        byte[] dst = new byte[inMapBuffer.limit()];
        inMapBuffer.get(dst);
        outMapBuffer.put(dst);

//        inChannel.close();
//        outChannel.close();
        long end = System.currentTimeMillis();
        System.out.println("耗费时间为：" + (end - start));
    }
    /**
     * @Description 消耗时间19199ms 16286ms 16054ms
     */
    public void test1() {
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/Users/fangcheng/Desktop/CentOS-7-x86_64-DVD-2009.iso");
            fos = new FileOutputStream("/Users/fangcheng/Desktop/2.iso");

        }catch (FileNotFoundException e) {

        }

        //1⃣️获取通道
        FileChannel inChannel = fis.getChannel();
        FileChannel outChannel = fos.getChannel();
        //FileChannel fileChannel = FileChannel.open(Paths.get(""),StandardOpenOption.READ);

        //2⃣️分配指定大小缓冲区
        ByteBuffer buf = ByteBuffer.allocate(4096);

        //3⃣️将通道中的数据写入缓冲区
        try {
            while (inChannel.read(buf) != -1){
                buf.flip();
                //4⃣️将缓冲区的数据写入通道
                outChannel.write(buf);
                buf.clear();
            }
        }catch (IOException e){

        }finally {
            try {
                outChannel.close();
                inChannel.close();
                fos.close();
                fis.close();
            }catch (IOException e){

            }
        }


        long end = System.currentTimeMillis();
        System.out.println("耗费时间为：" + (end - start));
    }
    public static void test(){
        Long start = System.currentTimeMillis();
        InputStream input = null;
        OutputStream output = null;
        File source = new File("/Users/fangcheng/Desktop/CentOS-7-x86_64-DVD-2009.iso");
        File dest = new File("/Users/fangcheng/Desktop/3.iso");
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } catch (FileNotFoundException e){

        } catch (IOException e) {

        }finally {
            try {
                input.close();
                output.close();
            }catch (IOException e){

            }
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void main(String[] args) throws Exception {
        test2();
    }
}

