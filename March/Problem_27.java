package March;

// Subarray product less than k
public class Problem_27 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0,right = 0;
        int prod = 1;
        int len = 0;

        if(k == 0)
            return 0;
        
        while(right < nums.length){
            prod *= nums[right];
            while(left <= right && prod >= k){
                prod /= nums[left];
                left += 1;
            }
            len += right - left +1;
            right++;
        }
        return len;
    }
}
