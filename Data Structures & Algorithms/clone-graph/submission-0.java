/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
       if (node == null) return null;
        HashMap<Integer,Node> sh=new HashMap<>();
        HashSet<Integer> s=new HashSet<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        sh.put(node.val, new Node(node.val));
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int k=0;k<size;k++)
            {
                Node temp=q.poll();
                if(s.contains(temp.val))continue;
                s.add(temp.val);
                List<Node> res=new ArrayList<>();
                for(int i=0;i<temp.neighbors.size();i++)
                {
                    q.add(temp.neighbors.get(i));
                   if (!sh.containsKey(temp.neighbors.get(i).val)) {
                  Node t = new Node(temp.neighbors.get(i).val);
                  sh.put(temp.neighbors.get(i).val, t);
                    }
                res.add(sh.get(temp.neighbors.get(i).val)); 
                }
                if(!sh.containsKey(temp.val))
                {
                    Node t=new Node(temp.val);
                    sh.put(temp.val,t);
                }
                Node r=sh.get(temp.val);
                r.neighbors=res;
            }
        }
        return sh.get(node.val);
    }
}