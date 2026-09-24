class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sh=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            sh.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i],count=0;
            if(sh.contains(n-1))continue;
            while(sh.contains(n))
            {
                n=n+1;
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
