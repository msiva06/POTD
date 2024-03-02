package March;

// Squares of a sorted array
public class Problem_02 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0, right = n-1;
        int idx = n-1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[idx] = nums[left] * nums[left];
                left++;
                idx--;
            }
            else {
                res[idx] = nums[right] * nums[right];
                right--;
                idx--;
            }
        }

        return res;

    }
}
