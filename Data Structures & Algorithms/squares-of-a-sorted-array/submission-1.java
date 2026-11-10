class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int i=0,r=nums.length-1,k=nums.length-1;
        while(i<=r)
        {
            if(nums[i]*nums[i]>=nums[r]*nums[r])
            {
                res[k--]=nums[i]*nums[i];
                i++;
            }
            else
            {
                res[k--]=nums[r]*nums[r];
                r--;
            }
        }
        return res;
    }
}