class Solution {
     public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return root;
        }
        
        //find the target
        if(root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        } else if(root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        
        //No child or only one child
        if(root.left == null && root.right == null) {
            return null;
        } else if(root.left == null) {
            return root.right;
        } else if(root.right == null) {
            return root.left;
        }
        
        //Two children
        if(root.right.left == null) {
            root.right.left = root.left;
            return root.right;
        } else {
            TreeNode smallest = deleteSmallest(root.right);
            smallest.left = root.left;
            smallest.right = root.right;
            return smallest;
        }
    }
    
    private TreeNode deleteSmallest(TreeNode root) {
        TreeNode cur = root.left;
        TreeNode pre = root;
        while(cur.left != null) {
            pre = cur;
            cur = cur.left;
        }
        pre.left = cur.right;
        return cur;
    }
}