package March;

import java.util.HashMap;
import java.util.Map;

// Length of Longest subarray with atmost K frequency
public class Problem_28 {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        int left = 0, right = 0;
        int maxLen = 0;
        while(right < nums.length){
            if(!freq.containsKey(nums[right])){
                freq.put(nums[right],0);
            }
            freq.put(nums[right],freq.get(nums[right])+1);
            while(left <= right && freq.get(nums[right]) > k){
                int leftNum = nums[left];
                freq.put(leftNum, freq.get(leftNum) - 1);
                left += 1;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;

    }
}
