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
    int sum = 0;
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return (Math.max(lh,rh) + 1);
    }
    public void deepestSumHelper(TreeNode root, int currHeight, int height)
    {
        if(root == null)
            return;
        
        if(height == currHeight)
            sum += root.val;
        
        deepestSumHelper(root.left, currHeight + 1, height);
        deepestSumHelper(root.right, currHeight + 1, height);
        
    }
    public int deepestLeavesSum(TreeNode root) {
        
        int height = height(root);
        deepestSumHelper(root, 1, height);
        return sum;
    }
}