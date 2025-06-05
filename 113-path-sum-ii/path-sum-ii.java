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
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        pathList(res, list, root, targetSum);
        return res;
    }

    public void pathList(List<List<Integer>> res, List<Integer> list, TreeNode root, int targetSum) {
        if (root == null) return;

        list.add(root.val);

        if (root.left == null && root.right == null && targetSum-root.val == 0) {
            res.add(new ArrayList<>(list));
        } else {
            pathList(res, list, root.left, targetSum-root.val);
            pathList(res, list, root.right, targetSum-root.val);
        }

        list.remove(list.size()-1);
    }
}