class Solution {
    public int findLonelyPixel(char[][] picture) {
        int[] row=new int[picture.length];
        int[] col=new int[picture[0].length];
        int count=0;
        for(int i=0;i<picture.length;i++)
        {
            count=0;
            for(int j=0;j<picture[i].length;j++)
            {
                if(picture[i][j]=='B')count++;
            }
            row[i]=count;
        }
        int j=0;
        for(int i=0;i<picture[0].length;i++)
        {
            count=0;
            for(j=0;j<picture.length;j++)
            {
                if(picture[j][i]=='B')count++;
            }
            col[i]=count;
        }
        count=0;
        for(int i=0;i<picture.length;i++)
        {
            for(j=0;j<picture[i].length;j++)
            {
                if(picture[i][j]=='B'&&row[i]==1&&col[j]==1)count++;
            }  
        }
        return count;
    }
}
