/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return root;
        
        Node parent = root;
        Node childHead = new Node(0);
        Node child = childHead;
        
        while(parent != null){
            while (parent != null){
                if (parent.left != null){
                    child.next = parent.left;
                    child = child.next;
                }
                if (parent.right != null){
                    child.next = parent.right;
                    child = child.next;
                }
                parent = parent.next;
            }
            parent = childHead.next;
            childHead.next = null;
            child = childHead;
        }
            
        return root;
    }
}