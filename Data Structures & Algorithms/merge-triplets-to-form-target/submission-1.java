class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean s1=false,s2=false,s3=false;
        for(int i=0;i<triplets.length;i++)
        {
            if(triplets[i][0]>target[0])continue;
            if(triplets[i][1]>target[1])continue;
            if(triplets[i][2]>target[2])continue;
            if(triplets[i][0]==target[0])s1=true;
            if(triplets[i][1]==target[1])s2=true;
            if(triplets[i][2]==target[2])s3=true;
        }
        return s1&&s2&&s3;
    }
}
