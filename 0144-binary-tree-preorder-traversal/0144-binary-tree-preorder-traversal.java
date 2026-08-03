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
        List<Integer> list = new ArrayList<>();
        pot(list , root);
        return list;

    }
    void pot(List<Integer> list , TreeNode root){
        if(root == null){
            return;
        }
        //Root , Left , Right
        list.add(root.val);
        pot(list ,root.left);
        pot(list,root.right);
    }
}