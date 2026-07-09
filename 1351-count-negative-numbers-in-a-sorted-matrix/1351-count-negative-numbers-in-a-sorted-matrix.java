class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int col=grid[0].length;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]<0 && j<=col-1)
                {
                    c=c+(col-j);
                    break;
                }
            }
        }
        return c;
    }
}