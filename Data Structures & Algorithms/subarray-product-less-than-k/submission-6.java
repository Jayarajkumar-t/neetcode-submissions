class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0,prod;
        for(int i=0;i<nums.length;i++)
        {
            prod=1;
            for(int j=i;j<nums.length;j++)
            {
                prod*=nums[j];
                if(prod<k)c++;
                else break;
            }
        }
        return c;
    }
}