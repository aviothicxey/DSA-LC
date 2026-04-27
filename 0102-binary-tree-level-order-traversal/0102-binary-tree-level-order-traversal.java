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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        bsf(root);
        return ans;
    }
    public void bsf(TreeNode root){
        Queue<TreeNode> q= new LinkedList<>();
        if(root == null)return;
        q.offer(root);
        while(!q.isEmpty()){
           int size = q.size();
           List<Integer> sublist = new ArrayList<>();
           for(int i = 0 ; i < size ; i++){
            TreeNode node = q.poll();
            sublist.add(node.val);
            
            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
           }
           ans.add(sublist);
        }
    }
}