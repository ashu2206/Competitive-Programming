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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null||notContainsOne(root))
            return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }
    
    private boolean notContainsOne(TreeNode root)
    {
        if(root==null)
            return true;
        if(root.val==1)
            return false;
        return notContainsOne(root.left) && notContainsOne(root.right);
    }
 }
   