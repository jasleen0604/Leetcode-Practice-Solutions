class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<stones.length; i++)
            pq.add(stones[i]);
        
        while(pq.size() > 1)
        {
            int a = pq.remove();
            int b = pq.remove();
            pq.add(a-b);
        }
        return pq.remove();
    }
}