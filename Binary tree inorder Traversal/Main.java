class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
     preorder(root);
        return ans;
    }

        public void preorder(TreeNode root){
            if(root==null){
                return;
            }
            
            preorder(root.left);
              ans.add(root.val);
            preorder(root.right);
            

        }
        
    }