class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        HashSet <Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i]))
            {
                res = true;
                break;
            }
            else
                hs.add(nums[i]);
        }
        return res;
    }
}