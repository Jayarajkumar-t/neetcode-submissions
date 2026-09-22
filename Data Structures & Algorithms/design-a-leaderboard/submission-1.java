class Leaderboard {
    PriorityQueue<Integer> pq;
    HashMap<Integer,Integer> s;
    public Leaderboard() {
       pq=new PriorityQueue<>(Collections.reverseOrder());
       s=new HashMap<>(); 
    }
    
    public void addScore(int playerId, int score) {
        if(s.getOrDefault(playerId,0)==0){
        s.put(playerId,score);
        pq.add(score);
        }
        else{
        pq.remove(s.get(playerId));
        s.put(playerId,s.get(playerId)+score);
        pq.add(s.get(playerId));}
    }
    
    public int top(int K) {
        ArrayList<Integer> t=new ArrayList<>();
        int temp=0,sum=0;
        while(K!=0&&!pq.isEmpty())
        {
            temp=pq.poll();
            sum+=temp;
            t.add(temp);
            K--;
        }
        for(int i=0;i<t.size();i++)
        {
            pq.add(t.get(i));
        }
        return sum;
    }
    
    public void reset(int playerId) {
        if(s.containsKey(playerId)){
        pq.remove(s.get(playerId));
        s.remove(playerId);}
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */
