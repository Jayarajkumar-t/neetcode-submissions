class Solution {
    public double averageWaitingTime(int[][] customers) {
        long sum=customers[0][0],res=0;
        for(int i=0;i<customers.length;i++)
        {
            if(customers[i][0]>sum){
            sum=customers[i][0]+customers[i][1];
            res+=customers[i][1];
            continue;
            }
            sum+=customers[i][1];
            res+=sum-customers[i][0];
        }
        return (double)res/customers.length;
    }
}