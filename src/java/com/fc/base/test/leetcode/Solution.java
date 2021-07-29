package com.fc.base.test.leetcode;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/6/24 9:59 上午
 * @Version 1.0
 */

public class Solution {
    TreeNode lastInList;

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
        Solution solution = new Solution();
        System.out.println(solution.Convert(root));

    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        lastInList = null;
        if(pRootOfTree == null){
            return null;
        }
        ConvertNode(pRootOfTree);
        TreeNode headOfList = lastInList;
        while(headOfList!=null && headOfList.leftChild != null){
            headOfList = headOfList.leftChild;
        }
        return headOfList;
    }

    private void ConvertNode(TreeNode pRoot) {
        // TODO Auto-generated method stub
        //从树的最左下角开始向双向链表中添加，因为最左下角最小
        if(pRoot == null){
            return;
        }
        TreeNode current = pRoot;
        if(current.leftChild != null){
            ConvertNode(current.leftChild);
        }
        current.leftChild = lastInList;
        if(lastInList!=null){
            lastInList.rightChild = current;
        }
        lastInList = current; //此步中lastInList的引用转移为
        //current，一定要将lastInList设为全局变量，保证其全局统一
        if(current.rightChild != null){
            ConvertNode(current.rightChild);
        }
    }
}
class TreeNode{
    TreeNode leftChild;
    Object nodeValue;
    TreeNode rightChild;

    public TreeNode(Object nodeValue) {
        this.leftChild = leftChild;
        this.nodeValue = nodeValue;
        this.rightChild = rightChild;
    }
    Integer i = 0;
    @Override
    public String toString() {
        System.out.println(i++);
        return "TreeNode{" +
                "leftChild=" + leftChild +
                ", nodeValue=" + nodeValue +
                ", rightChild=" + rightChild +
                '}';
    }
}