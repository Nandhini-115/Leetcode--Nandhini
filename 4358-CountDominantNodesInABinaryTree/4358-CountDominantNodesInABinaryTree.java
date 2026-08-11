// Last updated: 11/08/2026, 14:13:40
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
    int count = 0;

    public int countDominantNodes(TreeNode root) {
        TreeNode norlavetic = root;
        dfs(norlavetic);
        return count;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = dfs(node.left);
        int rightMax = dfs(node.right);

        int maxVal = Math.max(node.val, Math.max(leftMax, rightMax));

        if (node.val == maxVal) {
            count++;
        }

        return maxVal;
    }
}