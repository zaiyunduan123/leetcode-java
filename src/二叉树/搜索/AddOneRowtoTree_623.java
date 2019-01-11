package 二叉树.搜索;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午8:42
 *
 * 在二叉树中增加一行
 *
 * 给定一个二叉树，根节点为第1层，深度为 1。在其第 d 层追加一行值为 v 的节点。
 */
public class AddOneRowtoTree_623 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 思路：层序遍历，每遍历完一行，d减一，当d==1时，就到了需要增加行的深度位置，
     * 然后新建值为v的左右子结点，作为原结点的新左右子结点，将原有的左子结点连到新建的左子结点的左子结点上，将原有的右子结点连到新建的右子结点的右子结点
     */
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(root == null) return null;
        if(d == 1){
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            //检测d为0时，直接返回，因为添加操作已经完成，没必要遍历剩下的结点
            if(--d == 0) return root;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                //当d == 1时，需要插入该行
                if(d == 1){
                    TreeNode left = new TreeNode(v);
                    left.left = node.left;
                    node.left = left;
                    TreeNode right = new TreeNode(v);
                    right.right = node.right;
                    node.right = right;
                }else{
                    // 如果 d 不为 1，那么就是层序遍历原有的入队操作
                    if(node.left != null) queue.offer(node.left);
                    if(node.right != null) queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
