class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root) != -1;
    }
    int dfsheight(TreeNode root){
        if(root == null) return 0;

        int lefth = dfsheight(root.left);
        if(lefth == -1){
            return -1;
        }
        int righth = dfsheight(root.right);
        if(righth == -1){
            return -1;
        }

        if(Math.abs(lefth - righth) > 1) return -1;

        return Math.max(lefth, righth) + 1;
    }
}
