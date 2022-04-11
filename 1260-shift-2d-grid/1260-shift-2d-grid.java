class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
                list.add(grid[i][j]);
        } 
        k = k % list.size();
        for(int i=1; i<=k; i++)
        {
            int last = list.remove(list.size()-1);
            list.add(0, last);
        }
        List<List<Integer>> result = new ArrayList<>();
        int idx = 0;
        for(int i=0; i<grid.length; i++)
        { 
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<grid[0].length; j++)
            {
                temp.add(list.get(idx));
                idx++;
            }
            result.add(temp);
        }
        return result;
    }
}