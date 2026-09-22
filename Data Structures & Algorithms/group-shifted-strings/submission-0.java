class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap<String,List<String>> sh=new HashMap<>();
        for(String s:strings)
        {
            String key=getkey(s);
            sh.putIfAbsent(key,new ArrayList<String>());
            sh.get(key).add(s);
        }
        return new ArrayList<>(sh.values());
    }
    String getkey(String s)
    {
        if(s.length()==1) return "Single";
        int diff;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++)
        {
            diff=s.charAt(i)-s.charAt(i-1);
            diff=(diff+26)%26;
            sb.append(diff).append(",");
        }
        return sb.toString();
    }
}
