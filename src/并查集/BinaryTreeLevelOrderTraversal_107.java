package 并查集;


import java.util.LinkedList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/31 下午3:19
 *
 * 二叉树的层序遍历(从下到上)
 */
public class BinaryTreeLevelOrderTraversal_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    private void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) return;
        if (level >= list.size())
            list.add(0, new LinkedList<Integer>());
        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
