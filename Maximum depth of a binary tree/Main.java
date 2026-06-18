class Solution {
    public int maxDepth(TreeNode root) {
        return depth(root);

    }

    public int depth(TreeNode end) {
        if (end == null) 
            return 0;

            int left = depth(end.left);
            int right = depth(end.right);
            return Math.max(left, right) + 1;
        
    }
}
