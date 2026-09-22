class Solution {
    List<List<Integer>> r=new ArrayList<List<Integer>>();
    public List<List<Integer>> getFactors(int n) {
        if(n<=3) return r;
        helper(n, 2, new ArrayList<>());
        return r;
    }
    void helper(int n, int start, ArrayList<Integer> res)
    {
        for (int i = start; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                res.add(n / i);
                r.add(new ArrayList<Integer>(res));
                res.remove(res.size() - 1);
                helper(n / i, i, res);
                res.remove(res.size() - 1);
            }
        }
    }
}