package March;

// Binary subarrays with sum
public class Problem_14 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0, right = 0, sum = 0, count = 0;
        int prefixZero = 0;
        while(right < nums.length){
            sum += nums[right];
            
            while(left < right && (nums[left] == 0 || sum > goal)){
                if(nums[left] == 0){
                    prefixZero++;
                }
                else{
                    prefixZero = 0;
                }
                sum -= nums[left];
                left++;
            }
            if(sum == goal){
                count += 1 + prefixZero;
            }
            right++;
        }
        return count;
    }
}
