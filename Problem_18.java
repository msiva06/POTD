// Frequency of the most frequent element
public class Problem_18 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        int curr = 0, left = 0;
        
        for(int right = 0; right < nums.length; right++){
            int target = nums[right];
            curr += target;
            while((right - left + 1) * target - curr > k)
            {
                curr -= nums[left];
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
