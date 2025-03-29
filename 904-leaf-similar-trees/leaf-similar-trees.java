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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        LinkedList<Integer> leafSeq1 = new LinkedList<>(), leafSeq2 = new LinkedList<>();
        leafSeq1 = getLeafSequence(root1, leafSeq1);
        leafSeq2 = getLeafSequence(root2, leafSeq2);

        if (leafSeq1.size() != leafSeq2.size()) return false;

        for (int i = 0; i < leafSeq1.size(); i++) {
            if (!leafSeq1.get(i).equals(leafSeq2.get(i))) return false;
        }

        return true;
    }

    public LinkedList<Integer> getLeafSequence(TreeNode root, LinkedList<Integer> leafSeq) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                leafSeq.add(root.val);
            }
            getLeafSequence(root.left, leafSeq);
            getLeafSequence(root.right, leafSeq);
        }
        return leafSeq;
    }
}