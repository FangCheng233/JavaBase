package com.fc.base.collections.tree;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/3 12:17 上午
 * @Version 1.0
 */
public class TreeNode {
    protected Object nodeValue;
    protected TreeNode leftChild;
    protected TreeNode rightChild;

    public TreeNode() {
    }

    public TreeNode(Object nodeValue) {
        this.nodeValue = nodeValue;
    }

    public TreeNode(Object nodeValue, TreeNode leftChild, TreeNode rightChild) {
        this.nodeValue = nodeValue;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * Sets the leftChild. *
     * <p>You can use getLeftChild() to get the value of leftChild</p>
     * * @param leftChild leftChild
     */
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Sets the rightChild. *
     * <p>You can use getRightChild() to get the value of rightChild</p>
     * * @param rightChild rightChild
     */
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "nodeValue=" + nodeValue +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
