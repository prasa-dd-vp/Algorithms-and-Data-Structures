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
    int preIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        if (preorder.length == 1) return new TreeNode(preorder[0]);
        
        return buildTreeHelper(preorder, inorder, 0, preorder.length-1);
    }
    
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) return null;
        
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int currIndex = getIndex(inorder, root.val);
        
        root.left = buildTreeHelper(preorder, inorder, start, currIndex-1);
        root.right = buildTreeHelper(preorder, inorder, currIndex+1, end);
        
        return root;
    }
    
    private int getIndex(int[] array, int value) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}