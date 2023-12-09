package December;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Inorder Traversal
public class Problem_09 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;

        }
        // inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        TreeNode node = root;
        if(node == null)
            return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
