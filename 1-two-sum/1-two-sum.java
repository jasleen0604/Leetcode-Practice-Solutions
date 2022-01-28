class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res[] = new int[2];
        
        for(int i=0; i<nums.length; i++)
        {
            int comple = target - nums[i];
            if(hm.containsKey(comple)){
                res[0] = hm.get(comple);
                res[1] = i;
                return res;
            }
            hm.put(nums[i], i);
        }
        // Set<Integer> keys = hm.keySet();
        // for(Integer key : keys)
        //     System.out.println(key);
        return res;
    }
}