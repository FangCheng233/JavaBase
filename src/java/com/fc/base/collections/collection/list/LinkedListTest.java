package com.fc.base.collections.collection.list;

import sun.tools.tree.Node;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName LinkedListTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/9 11:13 下午
 * @Version 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        Deque<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add("我是第" + i + "个元素");
            linkedList.addFirst("我是第" + i + "个元素");
            linkedList.addLast("我是第" + i + "个元素");
        }
        linkedList.add(null);
        linkedList.add(null);
        linkedList.remove();
        System.out.println(linkedList);
        Node node = new Node();//根结点
        node.value=1;
        int i  = 2;
        Node tmp = node;

        while (i < 7){
            tmp.next = new Node();
            tmp.next.value = i;
            tmp = tmp.next;
            i++;
        }
//        // 翻转链表--头节点开始
//        Node h = node;//当前节点
//        Node tail = null;
//        while (h!=null){
//            Node next = h.next;
//            h.next = tail;
//            tail = h;
//            h = next;
//        }

        Node rev = In_reverseList(node);
        System.out.println(rev.toString());
    }
    static Node In_reverseList(Node tail)
    {
        if (tail == null || tail.next == null)     {
            //链表为空直接返回，而H.next为空是递归基
            return tail;
        }
        Node newHead = In_reverseList(tail.next); //一直循环到链尾
        tail.next.next = tail;                       //翻转链表的指向  A⇋B  前后两个节点之间互相指向  断开一边连接 即可实现指针转向
        tail.next = null;                          //记得赋值NULL，防止链表错乱
        return newHead;                          //新链表头永远指向的是原链表的链尾
    }
    static Node setNext(Node node){

        return node.next;
    }
    static class Node{
        private  Object value;
        private  Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
