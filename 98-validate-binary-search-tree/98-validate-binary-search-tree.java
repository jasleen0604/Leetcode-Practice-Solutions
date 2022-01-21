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
    public static class BSTPair{
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean isbst = true;
    }
    public static BSTPair isBST(TreeNode node)
    {
        if(node == null)
        {
          BSTPair base = new BSTPair();
          return base;
        }
        // if(node.left == null && node.right == null)
        // {
        //   BSTPair base = new BSTPair();
        //   base.min = node.val;
        //   base.max = node.val;
        //   base.isbst = true;
        //   return base;
        // }

        BSTPair lp = isBST(node.left);
        BSTPair rp = isBST(node.right);

        BSTPair mypair = new BSTPair();
        mypair.min = Math.min(Math.min(lp.min,rp.min),node.val);
        mypair.max = Math.max(Math.max(lp.max,rp.max),node.val);

        if(lp.isbst == true && rp.isbst == true){
            if(node.left == null && node.right == null)
                mypair.isbst = true;
            else if(node.left == null)
                mypair.isbst = node.val < rp.min;
            else if(node.right == null)
                mypair.isbst = node.val > lp.max;
            else
               mypair.isbst = node.val > lp.max && node.val < rp.min;
        }
        else{
          mypair.isbst = false;
        }

        return mypair;
      }
    public boolean isValidBST(TreeNode root) {        
        BSTPair ans = new BSTPair();
        ans = isBST(root);
        return ans.isbst;
    }
}