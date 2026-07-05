class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
         int newmat[][]=new int[r][c];
        if(m*n!=r*c)
        return mat;
        else{
           
            int a=0,b=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    newmat[a][b]=mat[i][j];
                    if(b==c-1)
                    {
                         a++;
                         b=0;

                    }
                   
                    else
                    {
                        b++;
                    }
                    
                }
            }
             return newmat;
        }
       
    }
}