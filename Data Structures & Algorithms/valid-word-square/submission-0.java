class Solution {
    public boolean validWordSquare(List<String> words) {
        for(int i=0;i<words.size();i++)
        {
            String temp=getstring(i,words);
            if(!temp.equals(words.get(i)))
            return false;
        }
        return true;
    }
    String getstring(int i,List<String> words)
    {
        StringBuilder sb=new StringBuilder();
        int t=0;
        while(t<words.size())
        {
            if(words.get(t).length()<=i){t++;continue;}
            sb.append(words.get(t).charAt(i));
            t++;
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
