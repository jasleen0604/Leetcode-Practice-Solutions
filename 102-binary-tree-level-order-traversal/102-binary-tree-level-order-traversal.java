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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        
        Queue<TreeNode> mq = new ArrayDeque<>();
        Queue<TreeNode> cq = new ArrayDeque<>();
        
        List<Integer> innerlist = new ArrayList<>();
        res.add(innerlist);
        
        int c = 0;
        mq.add(root);

        while(mq.size() > 0)
        {
          TreeNode curr = mq.remove();
          res.get(c).add(curr.val);

          if(curr.left != null)
          cq.add(curr.left);

          if(curr.right != null)
          cq.add(curr.right);

          if(mq.size() == 0)
          {
            c++;
              if(cq.size() > 0)
              {
                  List<Integer> inlist = new ArrayList<>();
                  res.add(inlist);
              }
            mq = cq;
            cq = new ArrayDeque<>();
          }

        }
        return res;
    }
}