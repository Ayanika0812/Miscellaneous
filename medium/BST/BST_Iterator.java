/**
-> BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
-> boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
-> int next() Moves the pointer to the right, then returns the number at the pointer.
 */
class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode tmpNode = stack.pop();    // get smallest node
        pushAll(tmpNode.right);            // push its right subtree
        return tmpNode.val;                // return value
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();           // still nodes to visit?
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;              // go as left as possible
        }
    }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
