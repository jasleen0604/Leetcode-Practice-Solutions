class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ele = nums[0];
        
        for(int i=0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        Set<Integer> keys = hm.keySet();
        
        for(Integer key : keys)
        {
            if(hm.get(key) > nums.length/2)
            {
                ele = key;
            }
        }
        return ele;
    }
}