class Solution {
    public int findDuplicate(int[] nums) {
        
        while(true)
        {
            int idx = nums[0];
            if(idx == nums[idx])
                return idx;
            
            nums[0] = nums[idx];
            nums[idx] = idx;
        }
    }
}