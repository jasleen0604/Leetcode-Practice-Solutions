class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int rightPointer = n+m-1;
        int firstPointer = m-1;
        int secondPointer = n-1;
        
        while(firstPointer >= 0 && secondPointer >= 0)
        {
            int e1 = nums1[firstPointer];
            int e2 = nums2[secondPointer];
            
            if(e1 > e2)
            {
                nums1[rightPointer] = e1;
                firstPointer--;
                 rightPointer--;
            }  
            else if(e2 > e1)
            {
                nums1[rightPointer] = e2;
                secondPointer--;
                 rightPointer--;
            }
            else
            {
                nums1[rightPointer--] = e2;
                nums1[rightPointer--] = e1;
                firstPointer--;
                secondPointer--;
            }
        }
         while(secondPointer >= 0)
         {
             nums1[rightPointer] = nums2[secondPointer];
             secondPointer--;
             rightPointer--;
         }
    }
}