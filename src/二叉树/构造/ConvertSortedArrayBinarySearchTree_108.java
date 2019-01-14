package 二叉树.构造;

/**
 * @Auther: Jesper
 * @Date: 2019/1/14 15:17
 * @Description: 把一个有序数组转换成一颗二分查找树
 */
public class ConvertSortedArrayBinarySearchTree_108 {


    /**
     * 思路：树的遍历 + 二分查找
     * 把中间元素转化为根，然后递归构造左右子树
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int l, int r) {
        if (l > r) return null;
        int m = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(nums, l, m - 1);
        root.right = helper(nums, m + 1, r);
        return root;
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
