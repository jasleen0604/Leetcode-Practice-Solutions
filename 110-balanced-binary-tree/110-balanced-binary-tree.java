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
    static boolean isBal;
    public int isBalancedHelper(TreeNode node)
      {
        if(node == null)
        return 0;

        int lres = isBalancedHelper(node.left);
        int rres = isBalancedHelper(node.right);

        int myres = Math.max(lres, rres) + 1;

        if(Math.abs(lres-rres) > 1)
        isBal = false;

        return myres;
      }
    
    public boolean isBalanced(TreeNode root) {
        isBal = true;
        
        isBalancedHelper(root);
        
        return isBal;
    }
}