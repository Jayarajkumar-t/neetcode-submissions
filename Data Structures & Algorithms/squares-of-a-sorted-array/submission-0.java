class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int l=0,r=nums.length-1;
        int k=nums.length-1;
        while(l<=r)
        {
            if(nums[l]*nums[l]<nums[r]*nums[r]){
            res[k--]=nums[r]*nums[r];
            r--;}
            else{
            res[k--]=nums[l]*nums[l];
            l++;
            }
        }
        return res;
    }
}