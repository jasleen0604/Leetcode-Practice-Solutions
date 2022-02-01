class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currMax = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(currMax < 0)
                currMax = nums[i];
            else
                currMax = currMax + nums[i]; 
            
            maxSum = Math.max(maxSum, currMax);
        }
        return maxSum;
    }
}