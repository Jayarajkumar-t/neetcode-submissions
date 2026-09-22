class Solution {
    public int[] findBuildings(int[] heights) {
        int max=-1;
        List<Integer> res=new ArrayList<>();
        int i=heights.length-1;
        while(i>=0)
        {
            if(heights[i]>max){res.add(0,i);}
            max=Math.max(max,heights[i]);
            i--;
        }
        return res.stream().mapToInt(j->j).toArray();
    }
}