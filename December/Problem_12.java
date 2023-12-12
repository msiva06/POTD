package December;

// Maximum product of two elements in array
public class Problem_12 {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int last = nums[nums.length-1] - 1;
        // int prevLast = nums[nums.length-2] - 1;
        // return last * prevLast;
        int biggest = -1, secondBiggest = -2;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > biggest){
                secondBiggest = biggest;
                biggest = nums[i];
            }
            else if(nums[i] > secondBiggest){
                secondBiggest = nums[i];
            }
        }
        return (biggest - 1) * (secondBiggest -1);
    }
}
