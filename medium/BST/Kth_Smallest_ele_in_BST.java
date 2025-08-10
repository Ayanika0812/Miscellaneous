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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode cur =  root;
        int count = 0;
        int ans = -1;
        while(cur != null){
            if(cur.left == null){
                count++;
                if(count == k){
                    ans = cur.val;
                    break;
                }
                cur = cur.right;
            }else{
                TreeNode prev = cur.left;
                while(prev.right != null && prev.right != cur){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                }else{
                    prev.right = null;
                    count++;
                    if(count == k){
                        ans = cur.val;
                        break;
                    }
                    cur = cur.right;
                }
            }
        }
        return ans;
    }
}
