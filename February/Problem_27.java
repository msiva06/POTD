package February;

// Diameter of binary tree
public class Problem_27 {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        findLongestDiameter(root,diameter);
        return diameter[0];
    }

    public int findLongestDiameter(TreeNode root,int[] diameter){
        if(root == null)
            return 0;
        int leftHeight = findLongestDiameter(root.left,diameter);
        int rightHeight = findLongestDiameter(root.right,diameter);
        diameter[0] = Math.max(diameter[0],leftHeight+rightHeight);
        return 1 + Math.max(leftHeight,rightHeight);
    }
}
