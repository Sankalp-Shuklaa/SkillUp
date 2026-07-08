class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int newar[][]=new int[image.length][image[0].length];
        int a=0,b=0;
        for(int i=0;i<image.length;i++)
        {
            b=0;
            for(int j=(image.length-1);j>=0;j--)
            {
                if(image[i][j]==0)
                newar[a][b]=1;
                else
                newar[a][b]=0;
                b++;
            }
            a++;
        }
        return newar;
    }
}