class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String,Integer> sh=new HashMap<>();
       for(int i=0;i<strs.length;i++)
       {
            for(int j=0;j<strs[i].length();j++)
            {
                sh.put(strs[i].substring(0,j+1),sh.getOrDefault(strs[i].substring(0,j+1),0)+1);
            }
       } 
       String res="";
       for(Map.Entry<String,Integer> s:sh.entrySet())
       {
        if(s.getValue()==strs.length)
        {
        if(res.length()<=s.getKey().length())
            res=s.getKey();
        }
       }
       return res;
    }
}