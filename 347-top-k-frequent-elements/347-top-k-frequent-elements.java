class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue <Integer> pq = new PriorityQueue<>(
        (n1, n2) -> freqMap.get(n1) - freqMap.get(n2));
        
        for(int ele : freqMap.keySet())
        {
            
            if(pq.size() == k)
            {
                
                if(freqMap.get(ele) > freqMap.get(pq.peek()))
                {
                    pq.remove();
                    pq.add(ele);
                }
            }
            else
                pq.add(ele);
        }
        int res[] = new int[k];
        for(int i=k-1; i>=0; i--)
        {
            res[i] = pq.remove();
        }
        return res;
    }
}