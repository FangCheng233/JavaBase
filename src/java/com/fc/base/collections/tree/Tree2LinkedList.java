package com.fc.base.collections.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Tree2LinkedList
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/11/4 8:40 上午
 * @Version 1.0
 */
public class Tree2LinkedList {
    TreeNode parent = null;
    public static void main(String[] args) {
        TreeNode root = new TreeNode("1");

        TreeNode leftChild = new TreeNode("2");
        TreeNode rightChild = new TreeNode("3");

        TreeNode leftChildleftChild = new TreeNode("4");
        TreeNode leftChildrightChild = new TreeNode("5");
        TreeNode rightChildleftChild = new TreeNode("6");
        TreeNode rightChildrightChild = new TreeNode("7");

        TreeNode leftChildleftChildleftChild = new TreeNode("8");
        TreeNode leftChildleftChildrightChild = new TreeNode("9");
        TreeNode leftChildrightChildleftChild = new TreeNode("10");
        TreeNode leftChildrightChildrightChild = new TreeNode("11");
        TreeNode rightChildleftChildleftChild = new TreeNode("12");
        TreeNode rightChildleftChildrightChild = new TreeNode("13");
        TreeNode rightChildrightChildleftChild = new TreeNode("14");
        TreeNode rightChildrightChildrightChild = new TreeNode("15");

        root.leftChild = leftChild;//2
        root.rightChild = rightChild;// 3

        leftChild.leftChild = leftChildleftChild;// 4
        leftChild.rightChild = leftChildrightChild;//5
        rightChild.leftChild = rightChildleftChild;//6
        rightChild.rightChild = rightChildrightChild;//7

        leftChildleftChild.leftChild = leftChildleftChildleftChild;//8
        leftChildleftChild.rightChild = leftChildleftChildrightChild;//9
        leftChildrightChild.leftChild = leftChildrightChildleftChild;// 10
        leftChildrightChild.rightChild = leftChildrightChildrightChild;//11
        rightChildleftChild.leftChild = rightChildleftChildleftChild;
        rightChildleftChild.rightChild = rightChildleftChildrightChild;
        rightChildrightChild.leftChild = rightChildrightChildleftChild;
        rightChildrightChild.rightChild = rightChildrightChildrightChild;
        Tree2LinkedList linkedList = new Tree2LinkedList();

        System.out.println(linkedList.Convert(root));
    }

    List<TreeNode> list = new ArrayList<>(20);
    int i = 0;
    public TreeNode Convert(TreeNode pRootOfTree) {
        i++;
        if( pRootOfTree!=null) {
            Convert(pRootOfTree.leftChild);
            list.add(pRootOfTree);
            Convert(pRootOfTree.rightChild);
        }
        i--;
        return i == 0&&pRootOfTree!=null ? Tree2List(list) : null;
    }
    public TreeNode Tree2List(List<TreeNode> nodeList){
        for(int index = 0; index < nodeList.size(); index++){
            nodeList.get(index).leftChild = index==0?null:nodeList.get(index-1);
            nodeList.get(index).rightChild = nodeList.size()>index+1?nodeList.get(index+1):null;
        }
        return nodeList.get(0);
    }
}