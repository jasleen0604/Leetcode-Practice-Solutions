class Solution {
    static Integer[][] lip;
    static int[][] matrix;
    static int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
    static int dfs(int row,int col){
        lip[row][col] = 1;
        int longestPath = Integer.MIN_VALUE;
        
        for(int[] dir: dirs){
            int pathLength = 1;
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if(newRow>=0
              &&newCol>=0
              &&newRow<lip.length
              &&newCol<lip[0].length
              &&matrix[newRow][newCol] < matrix[row][col])
            {
                if(lip[newRow][newCol]==null)
                    pathLength = dfs(newRow,newCol)+1;
                else
                    pathLength = lip[newRow][newCol] + 1;
            }
            longestPath = Math.max(longestPath,pathLength);
        }
        
        lip[row][col] = longestPath;
        return longestPath;
    }
    
    public int longestIncreasingPath(int[][] matrix) {
        lip = new Integer[matrix.length][matrix[0].length];
        this.matrix = matrix;
        int max = Integer.MIN_VALUE;
        for(int row=0; row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(lip[row][col] == null){
                    int temp = dfs(row,col);
                    max = Math.max(temp,max);
                }
            }
        }
        return max;
    }
}