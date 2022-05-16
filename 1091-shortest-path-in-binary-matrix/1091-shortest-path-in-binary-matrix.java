class Solution {
    int[][] dirs = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0] == 1) return -1;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});
        
        int ans = 0;
        while(q.size() > 0) {
            int size = q.size();
            
            while(size-- > 0) {
                int[] rem = q.remove();
                int r = rem[0];
                int c = rem[1];
                
                if(r == n - 1 && c == m - 1) { 
                    return ans + 1;
                }
                
                for(int[] dir: dirs) {
                    int rdash = r + dir[0];
                    int cdash = c + dir[1];
                    
                    if(rdash < 0 || rdash >= n || cdash < 0 || cdash >= m || grid[rdash][cdash] == 1) {
                        continue;
                    }

                    q.add(new int[]{rdash, cdash});
                    grid[rdash][cdash] = 1;
                }
            }
            ans++;
        }
        return -1;
    }
}