package January;

// Max diff b/w node and ancestor
public class Problem_10 {
    public int maxAncestorDiff(TreeNode root) {
        if(root == null)
            return 0;
        return maxAncestor(root,root.val,root.val);
    }

    public int maxAncestor(TreeNode root,int low,int high){
        if(root == null){
            return high - low;
        }
        low = Math.min(low,root.val);
        high = Math.max(high,root.val);
        int left = maxAncestor(root.left,low,high);
        int right = maxAncestor(root.right,low,high);
        return Math.max(left,right); 
    }
}
