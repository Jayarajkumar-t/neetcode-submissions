class Solution {
    public void reverseWords(char[] s) {
        int i=0,j=s.length-1;
        char temp;
        reverse(s,0,s.length-1);
        int st=0;
        while(i<s.length)
        {
            if(s[i]==' '){ reverse(s,st,i-1);st=i+1;}
            i++;
        }
        reverse(s,st,i-1);
    }
    void reverse(char[] s,int i,int j)
    {
         char temp;
        while(i<j)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
