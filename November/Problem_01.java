package November;
// Find mode in binary search tree
public class Problem_01 {
    public int[] findMode(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        int currNum = 0, currStreak = 0;
        int maxStreak = 0;
        while(curr != null){
            if(curr.left != null){
                TreeNode friendNode = curr.left;
                while(friendNode.right != null){
                    friendNode = friendNode.right;
                }
                friendNode.right = curr;
                TreeNode left = curr.left;
                curr.left = null;
                curr = left;
            }
            else{
                int num = curr.val;
                if(num == currNum){
                    currStreak++;
                }
                else{
                    currNum = num;
                    currStreak = 1;
                }
                if(currStreak > maxStreak){
                    maxStreak = currStreak;
                    ans = new ArrayList<>();
                }
                if(currStreak == maxStreak){
                    ans.add(currNum);
                }
                curr = curr.right;
            }

        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
