package November;
// Count nodes equal to average of subtree
public class Problem_02 {
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
      postOrder(root);
      return count;  
    }

    public Pair<Integer,Integer> postOrder(TreeNode node){
        if(node == null)
            return new Pair(0,0);
        Pair<Integer,Integer> left = postOrder(node.left);
        Pair<Integer,Integer> right = postOrder(node.right);
        int nSum = node.val + left.getKey() + right.getKey();
        int nCount = 1 + left.getValue() + right.getValue();
        if(node.val == (nSum/nCount))
            count++;
        return new Pair(nSum,nCount);
    }
}
