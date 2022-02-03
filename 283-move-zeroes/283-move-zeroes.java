class Solution {
    public void moveZeroes(int[] nums) {
        int digitPointer = 0;
        int zeroPointer = 0;
        
        while(digitPointer < nums.length && zeroPointer < nums.length)
        {
            // System.out.println(zeroPointer);
            if(nums[digitPointer] != 0)
            {
                digitPointer++;
                zeroPointer++;
                continue;
            }
            else
            {
                while(zeroPointer < nums.length)
                {
                    
                    if(nums[zeroPointer] != 0)
                    {
                        
                        nums[digitPointer] = nums[zeroPointer];
                        nums[zeroPointer] = 0;
                        digitPointer++;
                        zeroPointer++;
                        break;
                    }
                    
                    zeroPointer++;
                }  
            }
        }
    }
}