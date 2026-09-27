class Solution {
    int c=0;
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i]; 
        }
        int[][] dp=new int[nums.length][2*sum+1];
         for(int i=0;i<nums.length;i++)
        {
            Arrays.fill(dp[i],-1); 
        }
        return helper(dp,nums,target,0,0,sum);
    }
    int helper(int[][] dp,int[] nums,int target,int i,int sum,int e)
    {
        if(i==nums.length)
        {
            if(sum==target)return 1;
            return 0;
        }
        if(dp[i][e+sum]!=-1)
        return dp[i][e+sum];
        return dp[i][e+sum]=helper(dp,nums,target,i+1,sum+nums[i],e)+helper(dp,nums,target,i+1,sum-nums[i],e);
    }
}
