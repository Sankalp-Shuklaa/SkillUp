class Solution {
    public int islandPerimeter(int[][] grid) {
        int countL=0, countCL=0;

         for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {

                if(grid[i][j] == 1) {

                    countL++;

                 
                    if(j+1 < grid[i].length && grid[i][j+1] == 1)
                        countCL++;

                    
                    if(i+1 < grid.length && grid[i+1][j] == 1)
                        countCL++;
                }
            }
        }
         return countL*4 - 2*countCL;
    }

}