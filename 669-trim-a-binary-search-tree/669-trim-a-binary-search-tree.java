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
    public TreeNode getMaxNode(TreeNode root)
    {
        TreeNode temp = root;
        while(temp.right != null)
        {
            temp = temp.right;
        }
        root.val = temp.val;
        temp = null;
        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null)
            return null;
        
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right, low,high);
        
         if(root.val < low || root.val > high)
         {
             if(root.left == null && root.right == null)
                 return null;
             else if(root.left == null && root.right != null)
                 return root.right;
             else if(root.left != null && root.right == null)
                 return root.left;
             else
                 return getMaxNode(root);
         }
        
        return root;
    }
}