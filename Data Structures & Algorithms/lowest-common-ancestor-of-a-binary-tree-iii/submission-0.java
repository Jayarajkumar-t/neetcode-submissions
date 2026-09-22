/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    Node e=null;
    public Node lowestCommonAncestor(Node p, Node q) {
        Node temp=p,prev=null;
        while(temp!=null)
        {
            prev=temp;
            temp=temp.parent;
        }
        return helper(prev,p,q);
    }
    Node helper(Node d,Node p,Node q)
    {
        if(d==null||d.val==p.val||d.val==q.val)
        return d;
        Node left=helper(d.left,p,q);
        Node right=helper(d.right,p,q);
        if(left!=null&&right!=null) return d;
        if(left!=null) return left;
        if(right!=null) return right;
        return null;
    }
    }
