class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rowSoldiers[][] = new int[mat.length][2];
        
        for(int i=0; i<mat.length; i++)
        {
            int rcount = 0;
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j] == 0)
                    break;
                rcount++;
            }
            rowSoldiers[i][0] = i;
            rowSoldiers[i][1] = rcount;
        }
        Arrays.sort(rowSoldiers, (a, b) -> a[1] - b[1]);
        int res[] = new int[k];
        
        for(int i=0; i<k; i++)
            res[i] = rowSoldiers[i][0];
        
        return res;
    }
}