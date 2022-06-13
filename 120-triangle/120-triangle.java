class Solution {
    public int helper(List<List<Integer>> triangle, int idx1, int idx2, int[][] dp)
    {
        if(idx1 == triangle.size())
            return dp[idx1][idx2] = 0; 
        
        if(dp[idx1][idx2] != -1)
            return dp[idx1][idx2];
        
        int sum1  = triangle.get(idx1).get(idx2) + helper(triangle, idx1+1, idx2, dp);
        int sum2  = triangle.get(idx1).get(idx2) + helper(triangle, idx1+1,idx2+1, dp);
        return dp[idx1][idx2] = Math.min(sum1, sum2);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int[triangle.size()+1][triangle.size()+1];
            
        for(int i=0; i<dp.length; i++)
            Arrays.fill(dp[i],-1);
        
        return helper(triangle, 0, 0, dp);
    }
}