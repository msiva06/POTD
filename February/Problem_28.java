package February;

import java.util.LinkedList;
import java.util.Queue;

// Find Bottom Left Tree value
public class Problem_28 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return 0;
        }

        q.offer(root);
        int level = 0;
        int leftMost = -1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(i == 0){
                    leftMost = node.val;
                }
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            level++;
        }
        return leftMost;
    }
}
