package com.fc.base.socket;

import org.junit.Test;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName NIOTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/24 2:51 下午
 * @Version 1.0
 */
public class NIOTest {
    public static void main(String[] args) throws Exception{
        RandomAccessFile aFile = new RandomAccessFile("/Users/fangcheng/project/java/JavaBase/src/resource/data/nio-data.txt","rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf);
        while(bytesRead != -1) {

            System.out.println("Read" + bytesRead);
            buf.flip();

            while (buf.hasRemaining()) {
                System.out.print((char)buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
    @Test
    public void test1(){

    }
}
