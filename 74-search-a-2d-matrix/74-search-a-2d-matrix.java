class Solution {
    public int getPossibleRowIndex(int mat[][], int target)
    {
        int low = 0;
        int high = mat.length-1;
        
        while(low < high)
        {
            int mid = (low + high)/2;
            if(mat[mid][0] == target)
                return mid;
            else if(mat[mid][0] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowNo = getPossibleRowIndex(matrix, target);
        if(matrix[rowNo][0] > target && rowNo > 0)
            rowNo--;
        
        System.out.println(rowNo);
        
        int low = 0, high = matrix[0].length-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(matrix[rowNo][mid] == target)
                return true;
            
            else if(matrix[rowNo][mid] < target)
                low = mid+1;
            
            else
                high = mid-1;
        }
        return false;
    }
}