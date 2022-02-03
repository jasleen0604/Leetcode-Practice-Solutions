class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
        }
        for(int i=0; i<nums.length; i++)
        {
            sum -= nums[i];
            
            if(sum == leftsum)
                return i;
            
            leftsum += nums[i];
        }
        return -1;
        
//         int lsum = 0;
//         int rsum = 0;
//         int lp = 0;
//         int rp = nums.length-1;
        
//         while(lp <= rp)
//         {
//            if(lsum + nums[lp] < rsum + nums[rp])
//            {
//                lsum+=nums[lp];
//                lp++;
//            }
//             else if(lsum + nums[lp] > rsum + nums[rp])
//             {
//                 rsum+=nums[rp];
//                 rp--;
//             }
//             else
//             {
//                 if(lp == rp)
//                     return lp;
//                 else if(rp-lp == 2)
//                     return lp+1;
//                 else
//                 {
//                     lsum+= nums[lp++];
//                     rsum+= nums[rp--];
//                 }
//             }
//         }
//         return -1;
    }
}