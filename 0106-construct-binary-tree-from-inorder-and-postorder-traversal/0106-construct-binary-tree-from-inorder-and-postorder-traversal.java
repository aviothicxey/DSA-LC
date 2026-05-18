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
    int postIndex = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length -1;
        return rec(inorder,postorder , 0 , postorder.length -1);
    }
    TreeNode rec(int[] in , int[] pos , int start , int end){
        if(start > end)return null;
        int rootVal = pos[postIndex--];
        TreeNode root  = new TreeNode(rootVal);
        int index = 0;
        for(int i = start ; i <=end ; i++){
            if(in[i] == rootVal ){
                index = i;
                break;
            }
        }
        root.right = rec(in ,pos , index +1 , end);
        root.left = rec(in , pos , start , index -1);
        return root;
    }
}