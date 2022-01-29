class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm  = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
            hm.put(nums[i], true);
        
        for(int i=0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]-1))
                hm.put(nums[i], false);
        }
        int len = 0;
        for(int i=0; i<nums.length; i++)
        {
            int currVal = nums[i];
            if(hm.get(currVal) == true)
            {
                int c = 0;
                while(hm.containsKey(currVal))
                {
                    c++;
                    currVal++;
                }
                if(c > len)
                    len = c;
            }
        }
        return len;
    }
}