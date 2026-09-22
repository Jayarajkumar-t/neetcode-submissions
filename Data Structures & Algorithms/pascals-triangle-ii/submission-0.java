class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> res1=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==i||j==0)res1.add(1);
                else res1.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            res.add(res1);
        }
        return res.get(rowIndex);
    }
}