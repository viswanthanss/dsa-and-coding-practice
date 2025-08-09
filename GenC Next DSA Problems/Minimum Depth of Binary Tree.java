class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0; // No nodes in tree
        }

        // If left child is null, go right
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right child is null, go left
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // If both children exist, take min depth
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}



/*
/**
 * Definition for a binary tree node.
 * public class TreeNode 
 {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}

 *     TreeNode(int val) { 
            this.val = val; 
    }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0; // No nodes in tree
        }

        // If left child is null, go right
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right child is null, go left
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // If both children exist, take min depth
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

*/
