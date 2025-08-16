class Solution {
    private TreeNode first;
    private TreeNode middle;
    private TreeNode prev;
    private TreeNode last;

    private void inorder(TreeNode root){
        if(root == null) return ;
        
        inorder(root.left);

        //violation check
        if(prev != null && (root.val < prev.val)){
            //1st violation
            if(first == null){
                first = prev;
                middle = root;
            }
            else{
                last = root;
            }
        }
        // mark node as prev
        prev= root;
        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {
        first = last = middle = null;
        prev = new TreeNode(Integer.MIN_VALUE);

        inorder(root);

        //Either 2 violation
        if(first != null && last != null){
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }//or 1
        else if(first != null && middle != null){
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }
}
