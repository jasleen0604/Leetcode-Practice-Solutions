class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int si = 0, ei = 0;
        int len = 0;
        while(ei < nums.length)
        {
            sum+= nums[ei++];
            while(sum >= target && si <= ei)
            {
              min = Math.min(min, ei-si);
              sum -= nums[si];
              si++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
        
    }
}