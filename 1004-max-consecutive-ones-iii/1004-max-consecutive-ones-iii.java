class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=0;
        int currCount = 0, maxCount = 0;
        int zCount = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                zCount++;
                if(zCount <= k)
                {
                    currCount++;
                    maxCount = Math.max(maxCount, currCount);
                }
                else
                {
                    if(nums[j] == 0)
                        j++;
                    else
                    {
                        while(j < nums.length)
                        {
                            j++;
                            currCount--;
                            if(nums[j] == 0)
                                break;
                        }
                        j++;
                    }
                    
                    zCount--;
                    
                }
                    
            }
            else
            {
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            }
        }
        return maxCount;
    }
}