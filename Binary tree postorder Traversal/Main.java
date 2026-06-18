class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        preorder(root);
        return ans;
    }

        public void preorder(TreeNode root){
            if(root==null){
                return;
            }
            
            preorder(root.left);
            preorder(root.right);
            ans.add(root.val);

        }
        
    }
