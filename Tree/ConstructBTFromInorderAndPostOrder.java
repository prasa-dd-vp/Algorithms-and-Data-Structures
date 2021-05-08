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
    int postIndex;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        if (postorder.length == 0) {
            return null;
        }
        if (postorder.length == 1){
            return new TreeNode(postorder[0]);
        }
        
        return buildTreeHelper(0, postorder.length-1, inorder, postorder);
    }
    
    private TreeNode buildTreeHelper(int iStart, int iEnd, int[] inorder, int[] postorder) {
        if (iStart > iEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postIndex--]);
        int currIndex = getIndex(inorder, root.val);
        
        root.right = buildTreeHelper(currIndex+1, iEnd, inorder, postorder);
        root.left = buildTreeHelper(iStart, currIndex-1, inorder, postorder);
        
        return root;
    }
    
    private int getIndex(int[] array, int value) {
        int index;
        for (int i=0; i<array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}