package December;

// Maximum average subtree
public class Problem_11 {
    public double maximumAverageSubtree(TreeNode root) {
        double[] res =  avg(root);
        return res[2];
    }

    public double[] avg(TreeNode root){
        if(root == null){
            return new double[]{0,0,Double.MIN_VALUE};
        }
        double[] lt = avg(root.left);
        double[] rt = avg(root.right);
        double sum = lt[0] + rt[0] + root.val;
        double count = 1 + lt[1] + rt[1];
        double average = sum/count;
        double maxi = Math.max(lt[2],rt[2]);
        maxi = Math.max(average,maxi);
        return new double[]{sum,count,maxi};
    }

}
