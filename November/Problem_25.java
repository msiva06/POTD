package November;
// Sum of absolute differences in sorted array
public class Problem_25 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
            suffix[n-1-i] = suffix[n-i] + nums[n-i-1];
        }
        
        for(int i = 0; i < n; i++){
            int leftsum = (nums[i] * i) - prefix[i];
            int rightsum = (suffix[i] - (nums[i] * (n-1-i)));
            ans[i] = leftsum + rightsum;
        }
        return ans;
    }
}
