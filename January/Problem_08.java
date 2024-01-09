package January;

import java.util.ArrayList;
import java.util.List;

// Leaf-similar trees
public class Problem_08 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1Leaf = new ArrayList<>();
        List<Integer> root2Leaf = new ArrayList<>();
        getLeafNodes(root1,root1Leaf);
        getLeafNodes(root2,root2Leaf);
        if(root1Leaf.size() != root2Leaf.size())    
            return false;
        for(int i = 0; i < root1Leaf.size(); i++){
            if(root1Leaf.get(i) != root2Leaf.get(i))
                return false;
        }
        return true;
    }

    public void getLeafNodes(TreeNode root,List<Integer> leaves){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            leaves.add(root.val);
            return;
        }
        getLeafNodes(root.left,leaves);
        getLeafNodes(root.right,leaves);
    }
}
