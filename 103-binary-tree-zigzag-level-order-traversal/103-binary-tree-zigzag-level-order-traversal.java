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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Stack<TreeNode> ms = new Stack<>();
        Stack<TreeNode> cs = new Stack<>();
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> innerlist = new ArrayList<>();
        
        if(root == null)
            return res;
        
        int level = 0;
        
        ms.add(root);
        while(ms.size() > 0)
        {
            TreeNode curr = ms.pop();
            innerlist.add(curr.val);
            
            if(level % 2 == 0)
            {
                if(curr.left != null)
                cs.push(curr.left);
                if(curr.right != null)
                cs.push(curr.right);
            }
            else
            {
                if(curr.right != null)
                cs.push(curr.right);
                if(curr.left != null)
                cs.push(curr.left);
            }
            if(ms.size() == 0)
            {
                ms = cs;
                cs = new Stack<>();
                res.add(innerlist);
                innerlist = new ArrayList<>();
                level++;
            }
        }
        return res;
    }
}