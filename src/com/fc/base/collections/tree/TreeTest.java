package com.fc.base.collections.tree;

import java.util.Stack;

/**
 * @ClassName TreeTest
 * @Description TODO 遍历二叉树
 * @Author fangcheng
 * @Date 2020/7/3 12:31 上午
 * @Version 1.0
 */
public class TreeTest {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode("根结点");
        TreeNode left1 = new TreeNode("左一");
        TreeNode right1 = new TreeNode("右一");
        TreeNode left2 = new TreeNode("左一左二");
        TreeNode right2 = new TreeNode("左一右二");
        TreeNode left3 = new TreeNode("右一左三");
        TreeNode right3 = new TreeNode("右一右三");
        TreeNode left4 = new TreeNode("左一左二左三");
        TreeNode right4 = new TreeNode("左一右二右三");
        right2.setRightChild(right4);
        left2.setLeftChild(left4);
        right1.setRightChild(right3);
        right1.setLeftChild(left3);
        left1.setLeftChild(left2);
        left1.setRightChild(right2);
        treeNode.setRightChild(right1);
        treeNode.setLeftChild(left1);
//        preOrderTraverse1(treeNode);
        preOrderTraverse2(treeNode);
    }
    /**
     *
     * @Description 递归方式前序遍历
     * @Author fangcheng
     * @param root :
     * @return void
     * @throws
     * @Date 2020/7/3 12:36 上午
     */
    private static void preOrderTraverse1(TreeNode root){
        if(root != null){
            System.out.println(root.toString());
            preOrderTraverse1(root.leftChild);
            preOrderTraverse1(root.rightChild);
        }
    }

    private static void preOrderTraverse2(TreeNode root){
        Stack<TreeNode> treeNodes = new Stack<>();
        /** 判断root为空是否需要遍历 */
        while(root != null || !treeNodes.empty()){
            if(root != null){
                System.out.println("当前节点为：" + root.nodeValue);
                treeNodes.push(root);
                root = root.leftChild;
            }else {
                root = treeNodes.pop().rightChild;
            }
        }

    }
}