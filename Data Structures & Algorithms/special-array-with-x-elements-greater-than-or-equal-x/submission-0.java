class Solution {
    public static int fun(int[] nums,int k)
    {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        if(nums[i]>=k)cnt++;
        return cnt;
    }
    public int specialArray(int[] nums) {
        int l=1,r=1000;
        while(l<=r)
        {
            int mid=(l+r)/2;
            int count=fun(nums,mid);
            if(count==mid)return mid;
            if(count>mid)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;
    }
}