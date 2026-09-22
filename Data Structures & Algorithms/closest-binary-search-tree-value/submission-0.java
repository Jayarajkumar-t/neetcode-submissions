/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int val;
    double diff=Double.MAX_VALUE;
    public int closestValue(TreeNode root, double target){
        help(root,target);
        return val; 
    }
    void help(TreeNode root,double target)
    {
        if(root!=null)
        {
            double temp=Math.abs((double)root.val-target);
            if(temp<diff)
            {
                diff=temp;
                val=root.val;
            }
            if(temp==diff&&root.val<val)
            {
                val=root.val;
            }
            help(root.left,target);
            help(root.right,target);
        }
    }
}
