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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;

    }
    private void preorder(TreeNode node,ArrayList<Integer> res){
        if(node==null){
            return;
        }
        res.add(node.val);
        preorder(node.left,res);
        preorder(node.right,res);
    }
}