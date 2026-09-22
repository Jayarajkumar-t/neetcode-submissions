class Solution {
    public int smallestCommonElement(int[][] mat) {
        HashMap<Integer,Integer> sh=new HashMap<>();
        for(int i=0;i<mat[0].length;i++)
        {
            sh.put(mat[0][i],1);
        }
        for(int i=1;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(sh.containsKey(mat[i][j]))
                {
                    sh.put(mat[i][j],sh.get(mat[i][j])+1);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> s:sh.entrySet())
        {
            if(s.getValue()==mat.length)
            {
                min=Math.min(min,s.getKey());
            }
        }
        return min;
    }
}
