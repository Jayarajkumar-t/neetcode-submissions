class Solution {
    public int countOdds(int low, int high) {
        boolean b=false,f=false;
        if(low%2==1)b=true;
        if(high%2==1)f=true;
        if(b==true&&f==true)
        {
            return (high-low)/2+1;
        }
        else if(b==true&&f==false)
        {
            return (high-low)/2+1;
        }
        else if(b==false&&f==true)
        {
            return (high-low)/2+1;
        }
        else
        {
            return (high-low)/2;
        }
    }
}