class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<String>();
        int[] ch=new int[26];
        for(int i=0;i<words[0].length();i++)
        {
            ch[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++)
        {
            int[] ch1=new int[26];
            for(int j=0;j<words[i].length();j++)
            {
                ch1[words[i].charAt(j)-'a']++;
            }
            for(int k=0;k<26;k++)
            ch[k]=Math.min(ch[k],ch1[k]);
        }
        for(int i=0;i<26;i++)
        while(ch[i]>0){
        res.add(String.valueOf((char)(i+'a')));
        ch[i]--;
        }
        return res;
    }
}