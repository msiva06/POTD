package January;

// Range sum of BST
public class Problem_07 {
    int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        lowBST(low,high,root);
        return ans;
    }

    public void lowBST(int low, int high,TreeNode root){
        if(root == null)
            return;
        if(root.val >= low && root.val <= high)
            ans += root.val;
        if(root.val >= low)
            lowBST(low, high, root.left);
        if(root.val <= high)
            lowBST(low,high,root.right);
        
        
    }
}
