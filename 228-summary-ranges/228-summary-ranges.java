class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int start = -1;
        int end = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(start == -1)
                start = i;
            if((i+1) < nums.length && nums[i+1] == nums[i] + 1)
            {
                end++;
            }
            else
            {
                if(start == end)
                    res.add(nums[start]+"");
                else
                {
                    String curr = nums[start] + "->" + nums[end];
                    res.add(curr);
                }
                end = i+1;
                start = -1;
            }
        }
        return res;
    }
}