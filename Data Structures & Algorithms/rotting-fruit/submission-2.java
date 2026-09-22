class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<int[]>();
        int l=0,o=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)o++;
                if(grid[i][j]==2)q.add(new int[]{i,j});
            }
        }
        if(o==0)return 0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int[] temp=q.poll();
                visited[temp[0]][temp[1]]=true;
                if(grid[temp[0]][temp[1]]==1)o--;
                int[][] dir={{-1,0},{0,-1},{0,1},{1,0}};
                for(int k=0;k<4;k++)
                {
                    int nx=dir[k][0]+temp[0];
                    int ny=dir[k][1]+temp[1];
                    if(nx>=0&&ny<grid[0].length&&ny>=0&&nx<grid.length&&visited[nx][ny]==false&&grid[nx][ny]==1){
                    q.add(new int[]{nx,ny});
                    visited[nx][ny]=true;
                    }
                }
            }
            l++;
        }
        return o==0?l-1:-1;
    }
}
