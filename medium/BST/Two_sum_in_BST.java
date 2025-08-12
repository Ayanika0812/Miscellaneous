public class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();
    private boolean reverse;   //if true -> before() , false -> next()

    public BSTIterator(TreeNode root, boolean isReverse) {
        this.reverse = isReverse;
        pushAll(root);
    }
    
    public int next() {
        TreeNode tmpNode = stack.pop();
        if (!reverse) {
            pushAll(tmpNode.right);  // forward iterator
        } else {
            pushAll(tmpNode.left);   // reverse iterator
        }
        return tmpNode.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            if (reverse) {
                node = node.right;  // reverse → go right first
            } else {
                node = node.left;   // forward → go left first
            }
        }
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        BSTIterator l = new BSTIterator(root, false); // smallest first
        BSTIterator r = new BSTIterator(root, true);  // largest first

        int i = l.next();
        int j = r.next();

        while (i < j) {
            if (i + j == k) return true;
            else if (i + j < k) i = l.next();
            else j = r.next();
        }
        return false;
    }
}
