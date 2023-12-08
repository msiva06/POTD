package December;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

// Construct String from Binary Tree
public class Problem_08 {
    public String tree2str(TreeNode root) {
        // StringBuilder sb = new StringBuilder();
        // generate(root,sb);
        // return sb.toString();
        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Set<TreeNode> visited = new HashSet<TreeNode>();
        if(root == null)
            return "";
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(visited.contains(node)){
                stack.pop();
                sb.append(")");
            }
            else{
                visited.add(node);
                sb.append("(");
                sb.append(node.val);
                if(node.left == null && node.right != null){
                    sb.append("()");
                }
                if(node.right != null){
                    stack.push(node.right);
                }
                if(node.left != null){
                    stack.push(node.left);
                }
            }
        }
        return sb.substring(1,sb.length()-1);
    }

    public void generate(TreeNode root,StringBuilder sb){
        if(root == null)
            return;
        TreeNode node = root;
        sb.append(node.val);
        if(node.left == null && node.right == null)
            return;
        sb.append("(");
        generate(root.left,sb);
        sb.append(")");
        if(node.right != null){
            sb.append("(");
            generate(root.right,sb);
            sb.append(")");
        }
        
    }
}
