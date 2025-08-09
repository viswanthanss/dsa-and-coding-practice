class Solution {
    public boolean isSymmetric(TreeNode root) {
        // A tree is symmetric if its left and right subtrees are mirror images
        return isMirror(root.left, root.right);
    }

    // Helper function to compare two nodes
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both are null, they match
        if (t1 == null && t2 == null) return true;

        // If only one is null, they don't match
        if (t1 == null || t2 == null) return false;

        // Values must be equal, and their subtrees must be mirror images
        return (t1.val == t2.val) &&
               isMirror(t1.left, t2.right) &&
               isMirror(t1.right, t2.left);
    }
}
