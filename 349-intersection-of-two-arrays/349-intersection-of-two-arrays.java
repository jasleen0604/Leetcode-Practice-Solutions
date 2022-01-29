class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++)
            hs.add(nums1[i]);
        
        for(int i=0; i<nums2.length; i++)
        {
            if(hs.contains(nums2[i]))
            {
                res.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }
        int intersect[] = new int[res.size()];
        int idx = res.size()-1;
        while(res.size() > 0)
            intersect[idx] = res.remove(idx--);
        
        return intersect;
    }
}