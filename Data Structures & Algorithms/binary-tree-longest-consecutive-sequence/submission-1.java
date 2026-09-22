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
    int maxlength=0;
    public int longestConsecutive(TreeNode root) {
        int res=helper(root);
        return maxlength;
    }
    int helper(TreeNode root)
    {
        if(root==null) return 0;
        
        int l=helper(root.left);
        int r=helper(root.right);
        if(root.left!=null&&root.val+1!=root.left.val)
        l=1;
        else
        l=l+1;
        if(root.right!=null&&root.val+1!=root.right.val)
        r=1;
        else
        r=r+1;
        int length=Math.max(r,l);
        maxlength=Math.max(maxlength,length);
        return length;
    }
}
