package December;

// Maximum product difference between two pairs
public class Problem_18 {
    public int maxProductDifference(int[] nums) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        int smallest = Integer.MAX_VALUE, nextSmallest = Integer.MAX_VALUE;
        for(int i =0 ; i< nums.length; i++){
            if(nums[i] < smallest){
                nextSmallest = smallest;
                smallest = nums[i];
            }
            else if(nums[i] < nextSmallest){
                nextSmallest = nums[i];
            }
        }
        return (largest * secondLargest) - (smallest * nextSmallest);
    }
}
