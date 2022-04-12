class Solution {
    public int countNeighbours(int board[][], int r, int c)
    {
        int count = 0;
        //checking all directions
        if(r > 0)
        {
            if(board[r-1][c] == 1 || board[r-1][c] == 2) // left
            count++;
        }
        
        if(r < board.length-1)
        {
          if(board[r+1][c] == 1 || board[r+1][c] == 2)//right
            count++;  
        }
          
        if(c > 0) 
        {
            if(board[r][c-1] == 1 || board[r][c-1] == 2)//top
            count++;
        }
        
        if(c < board[0].length-1)
        {
            if(board[r][c+1] == 1 || board[r][c+1] == 2)//bottom
            count++;  
        }
            
        if(r > 0 && c > 0)
        {
          if(board[r-1][c-1] == 1 || board[r-1][c-1] == 2)//top left
            count++;  
        }
        
        if(r > 0 && c < board[0].length-1)
        {
          if(board[r-1][c+1] == 1 || board[r-1][c+1] == 2)//top right
            count++;  
        }
            
        if(r < board.length-1 && c > 0)
        {
          if(board[r+1][c-1] == 1 || board[r+1][c-1] == 2)//bottom left
            count++;  
        }
            
        if(r < board.length-1 && c < board[0].length-1)
        {
          if(board[r+1][c+1] == 1 || board[r+1][c+1] == 2)//bottom right
            count++;  
        }
        
        return count;
    }
    public void gameOfLife(int[][] board) {
        int x = 2, y = 3;
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                int n = countNeighbours(board, i, j);
                if(board[i][j] == 1)
                {
                    if(n < 2 || n > 3)
                        board[i][j] = x;
                }
                else
                {
                   if(n == 3)
                       board[i][j] = y;
                }
            }
        }
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j] == x)
                    board[i][j] = 0;
                if(board[i][j] == y)
                    board[i][j] = 1;
            }
        }
    }
}