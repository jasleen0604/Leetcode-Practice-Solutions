class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        for(int i=0; i<n; i++)
        {
            int curr = Math.abs(nums[i]);
            if(curr == n)
                continue;
            
            nums[curr] = -1 * nums[curr]; 
        }
        for(int i=0; i<n; i++)
        {
            if(nums[i] == 0)
            {
                int c = 0;
                for(int j=0; j<n; j++)
                {
                    if(Math.abs(nums[j]) == i)
                        c++;
                }
                if(c == 0)
                return i;
            }
            if(nums[i] > 0)
            {
                return i;
            }
        }
        return n;
    }
}