class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length-1;
        int max = 0;
        
        while(low < high)
        {
            int currArea = (high-low) * Math.min(height[low],height[high]);
            max = Math.max(max, currArea);
            
            if(height[low] < height[high])
                low++;
            else if(height[low] > height[high])
                high--;
            else
            {
                low++;
                high--;
            }
        }
        return max;
    }
}