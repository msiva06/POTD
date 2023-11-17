// Minimize maximum pair sum in array
public class Problem_17 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        int max = Integer.MIN_VALUE;
        
        while(start < end){
            int sum = nums[start] + nums[end];
            max = Math.max(sum,max);
            start++;
            end--;
        }
        return max;
    }
}
