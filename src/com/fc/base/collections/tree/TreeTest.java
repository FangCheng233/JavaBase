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
        TreeNode root = new TreeNode("root");
        TreeNode left1 = new TreeNode("left1");
        TreeNode left2 = new TreeNode("left2");

        TreeNode left1right1 = new TreeNode("left1right1");
        TreeNode left1right1left3 = new TreeNode("left1right1left3");

        TreeNode right1 = new TreeNode("right1");
        TreeNode right2 = new TreeNode("right2");
        TreeNode right3 = new TreeNode("right3");

        root.leftChild = left1;
        left1.leftChild = left2;
        left1.rightChild = left1right1;
        left1right1.leftChild = left1right1left3;

        root.rightChild = right1;
        right1.rightChild = right2;
        right2.rightChild = right3;

//        preOrderTraverse1(treeNode);
//        preOrderTraverse2(treeNode);
//        midOrderTraverse1(root);
//        midOrderTraverse2(root);
        revOrderTraverse2(root);
    }
    /**
     *
     * @Description 递归方式前序遍历 根左右
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
    /**
     *
     * @Description
     * @Author fangcheng 中序遍历 左根右
     * @param root :
     * @return void
     * @throws
     * @Date 2020/7/14 3:40 下午
     */
    private static void midOrderTraverse1(TreeNode root){
        if(root != null){
            midOrderTraverse1(root.leftChild);
            System.out.println(root.nodeValue.toString());
            midOrderTraverse1(root.rightChild);
        }
    }
    /**
      * @Description 通过栈结构先进后出的方式遍历树 前序 根左右
      * @Author fangcheng
      * @Date 2020/7/14 2:15 下午
      */
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
    /**
     * @Description 通过栈结构先进后出的方式遍历树 中序 左根右
     * @Author fangcheng
     * @Date 2020/7/14 2:15 下午
     */
    private static void midOrderTraverse2(TreeNode root){
        Stack<TreeNode> treeNodes = new Stack<>();
        /** 判断root为空是否需要遍历 */
        TreeNode temproot = null;
        while(root != null || !treeNodes.empty()){
            if(root != null){
                treeNodes.push(root);
                root = root.leftChild;
            }else {
                temproot = treeNodes.peek();
                root = treeNodes.pop().rightChild;
                System.out.println("当前节点为：" + temproot.nodeValue);

            }
        }
    }
    /**
     *
     * @Description 后序遍历 左右根 递归算法
     * @Author fangcheng
     * @param root :
     * @return void
     * @throws
     * @Date 2020/7/14 5:06 下午
     */
    private static void revOrderTraverse1(TreeNode root){

            if(root.leftChild != null) {
                revOrderTraverse1(root.leftChild);
            }
            if(root.rightChild != null) {
                revOrderTraverse1(root.rightChild);
            }
            System.out.println("当前节点为：" + root.nodeValue);
    }
    /**
     *
     * @Description 后序遍历 非递归算法 左右根 实现逻辑  根据前序算法  根左右->根右左 逆序输出
     * @Author fangcheng
     * @param root :
     * @return void
     * @throws
     * @Date 2020/7/14 5:06 下午
     */
    private static void revOrderTraverse2(TreeNode root) {
        Stack<TreeNode> treeNodes = new Stack<>();
        Stack<TreeNode> treeNodes2 = new Stack<>();
        /** 判断root为空是否需要遍历 */
        while (root != null || !treeNodes.empty()) {
            if (root != null) {
                treeNodes2.push(root);
                treeNodes.push(root);
                root = root.rightChild;
            } else {
                root = treeNodes.pop().leftChild;
            }
        }
        while (!treeNodes2.empty()){
            System.out.println(treeNodes2.pop().nodeValue);
        }
    }
}