/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, root.val);
    }

    public int countGoodNodes(TreeNode root, int min) {
        if (root == null) return 0;

        int curr_max = Math.max(min, root.val), count = 0;

        if (root.val >= min) count++;

        return count += countGoodNodes(root.left, curr_max) + countGoodNodes(root.right, curr_max);
    }
}