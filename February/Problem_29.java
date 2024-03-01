package February;

import java.util.LinkedList;
import java.util.Queue;

// Even odd tree
public class Problem_29 {
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null){
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int prev = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                int curr = node.val;
                if(level % 2 == 0){
                    if(node.val % 2 == 0){
                        return false;
                    }
                    if(curr <= prev){
                        return false;
                    }  
                }
                else{
                    if(node.val % 2 != 0){
                        return false;
                    }
                    if(curr >= prev){
                        return false;
                    }
                }

                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
                prev = curr; 
            }
            level++;
        }
        return true;
    }
}
