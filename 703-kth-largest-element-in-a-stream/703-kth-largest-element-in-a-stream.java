class KthLargest {
    
    PriorityQueue <Integer> pq = new PriorityQueue<>();
    int k;
    int nums[];
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        for(int i=0; i<nums.length; i++)
        {
            if(i<k)
            pq.add(nums[i]);
            else
            {
                if(nums[i] > pq.peek())
                {
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
    }
    
    public int add(int val) {
        if(pq.size() < k)
            pq.add(val);
        
        else if(pq.peek() < val )
        {
            pq.remove();
            pq.add(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */