package 剑指offer;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jiangyunxiong on 2018/5/1.
 */
public class HelloWorld {
    /**
     * 3. 数组中重复的数字
     * NowCoder
     * <p>
     * 题目描述
     * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。例如，如果输入长度为 7 的数组 {2, 3, 1, 0, 2, 5}，那么对应的输出是第一个重复的数字 2。
     * <p>
     * 要求复杂度为 O(N) + O(1)，也就是时间复杂度 O(N)，空间复杂度 O(1)。因此不能使用排序的方法，也不能使用额外的标记数组。牛客网讨论区这一题的首票答案使用 nums[i] + length 来将元素标记，这么做会有加法溢出问题。
     *
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        int[] arr = new int[length];
        int n = 0;
        for (int i = 0; i < length; i++) {
            arr[numbers[i]]++;
            if (arr[numbers[i]] > 1) {
                duplication[n] = numbers[i];
                n++;
                break;
            }
        }
        return n == 0 ? false : true;
    }

    /**
     * 二维数组中的查找
     * NowCoder
     * <p>
     * 题目描述
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        int length_x = array.length;
        int length_y = array[0].length;
        int i = 0, j = length_y - 1;
        while (i < length_x && j >= 0) {
            if (target == array[i][j])
                return true;
            if (target > array[i][j])
                i++;
            else
                j--;
        }
        return false;
    }

    /**
     * 替换空格
     * 题目描述
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        return str.toString().replaceAll(" ", "%20");
    }

    /**
     * 输入一个链表，从尾到头打印链表每个节点的值。
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(list);
        return list;
    }

    /**
     * 重建二叉树
     * <p>
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     *
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length-1);
        return root;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if(startPre > endPre || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i = startIn; i < endIn; i++){
            if (in[i] == pre[startPre]){
                root.left = reConstructBinaryTree(pre, startPre + 1,startPre+i-startIn,in ,startIn,i-1);
                root.right = reConstructBinaryTree(pre, i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
        }
        return root;
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
         return null;
    }

    public static void main(String[] args) {
        int[] str = {2, 1, 3, 0, 4};
        int[] arr = new int[str.length];
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.reConstructBinaryTree(pre, in));
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

 class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
