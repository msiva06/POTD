package February;

import java.util.Arrays;

// Missing number
public class Problem_19 {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i = 0; i < nums.length; i++){
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
