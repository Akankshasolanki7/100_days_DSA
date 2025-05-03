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
    
    // Helper function to count total nodes in the tree
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // DFS function to verify if tree satisfies complete binary tree index conditions
    public boolean dfs(TreeNode root, int index, int totalNodes) {
        if (root == null)
            return true;

        if (index > totalNodes)
            return false;

        return dfs(root.left, 2 * index, totalNodes) &&
               dfs(root.right, 2 * index + 1, totalNodes);
    }

    // Main function to check if tree is complete
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);
        return dfs(root, 1, totalNodes);
    }
}
