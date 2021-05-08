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

//Breadth First Search
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for (int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                level.add(currentNode.val);
                
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            
            result.add(level);
        }
        
        return result;
        
    }
}

//Depth First Search
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        levelOrderTraverse(result, root, 0);
        
        return result;
        
    }
    
    private void levelOrderTraverse(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level >= result.size()) {
            result.add(new ArrayList<>());
        }
        
        result.get(level).add(root.val);
        
        levelOrderTraverse(result, root.left, level+1);
        levelOrderTraverse(result, root.right, level+1);
    }
    
}