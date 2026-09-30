class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> sh=new HashMap<>();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            sh.put(arr[i],sh.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(sh.get(arr[i])==1)
            c++;
            if(c==k)
            return arr[i];
        }
        return "";
    }
}